package X;

import Y.ARunnableS1S0204000_20;
import Y.ARunnableS53S0300000_20;
import android.media.MediaCodec;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.engine.AudioEncoder;
import com.ss.pusher.core.utils.AVLog;
import com.ss.pusher.core.utils.SafeHandlerThread;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282640jTy extends AudioEncoder {
    public static final String LLJILJIL = C1282640jTy.class.getSimpleName();
    public SafeHandlerThread LL;
    public SafeHandlerThread.SafeHandler LLILLJJLI;
    public RunnableC1282660jU0 LLILLL;
    public MediaCodec LLILZ;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public final Queue<C1282700jU4> LLILZIL = new LinkedList();
    public final MediaCodec.BufferInfo LLILZLL = new MediaCodec.BufferInfo();
    public boolean LLJIJIL = true;

    public final C1282700jU4 LLIZ() {
        for (C1282700jU4 c1282700jU4 : this.LLILZIL) {
            if (c1282700jU4.LIZLLL == 0) {
                return c1282700jU4;
            }
        }
        C1282700jU4 c1282700jU42 = null;
        if (((LinkedList) this.LLILZIL).size() < 50) {
            C1282700jU4 c1282700jU43 = new C1282700jU4(this);
            ((LinkedList) this.LLILZIL).add(c1282700jU43);
            return c1282700jU43;
        }
        int i = 0;
        int i2 = 0;
        for (C1282700jU4 c1282700jU44 : this.LLILZIL) {
            if (c1282700jU44.LIZLLL == 1) {
                i2++;
                c1282700jU44.LIZLLL = 0;
                if (c1282700jU42 == null) {
                    c1282700jU42 = c1282700jU44;
                }
            } else {
                i++;
            }
        }
        String str = LLJILJIL;
        if (c1282700jU42 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Buffer queue size ");
            sbLIZ.append(((LinkedList) this.LLILZIL).size());
            sbLIZ.append(", dropped ");
            sbLIZ.append(i2);
            sbLIZ.append(" audio frames.");
            AVLog.logToIODevice2(5, str, C2188811AlT.LIZIZ(sbLIZ), (Throwable) null, 58, 10000);
            return c1282700jU42;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Buffer queue size ");
        sbLIZ2.append(((LinkedList) this.LLILZIL).size());
        sbLIZ2.append(", ");
        sbLIZ2.append(i);
        sbLIZ2.append(" frames are in use.");
        AVLog.logToIODevice2(6, str, C2188811AlT.LIZIZ(sbLIZ2), (Throwable) null, 59, 10000);
        return c1282700jU42;
    }

    public final void LLIZLLLIL() {
        String str = LLJILJIL;
        MediaCodec mediaCodec = this.LLILZ;
        if (mediaCodec == null) {
            return;
        }
        try {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(1000000L);
            if (iDequeueInputBuffer >= 0) {
                ByteBuffer byteBuffer = this.LLILZ.getInputBuffers()[iDequeueInputBuffer];
                if (byteBuffer != null) {
                    byteBuffer.position(0);
                    byteBuffer.limit(0);
                }
                this.LLILZ.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
            } else {
                AVLog.ioe(str, "Failed to get an available input buffer in 1 second.");
            }
            LLJ(true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("signalEndOfInputStream failed\n");
            sbLIZ.append(e.getMessage());
            AVLog.ioe(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            MediaCodec mediaCodec2 = this.LLILZ;
            if (mediaCodec2 != null) {
                mediaCodec2.stop();
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Encoder stop failed. message: ");
            sbLIZ2.append(e2.getMessage());
            sbLIZ2.append(", cause: ");
            sbLIZ2.append(e2.getCause());
            sbLIZ2.append(", stack: ");
            sbLIZ2.append(Log.getStackTraceString(e2));
            AVLog.logKibana(6, str, C2188811AlT.LIZIZ(sbLIZ2), null);
        }
        try {
            MediaCodec mediaCodec3 = this.LLILZ;
            this.LLILZ = null;
            if (mediaCodec3 != null) {
                mediaCodec3.release();
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Encoder release failed. message: ");
            sbLIZ3.append(e3.getMessage());
            sbLIZ3.append(", cause: ");
            sbLIZ3.append(e3.getCause());
            sbLIZ3.append(", stack: ");
            sbLIZ3.append(Log.getStackTraceString(e3));
            AVLog.logKibana(6, str, C2188811AlT.LIZIZ(sbLIZ3), null);
        }
    }

    @Override // com.ss.pusher.core.engine.AudioEncoder
    public final String getEncoderInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaCodec mediaCodec = this.LLILZ;
            if (mediaCodec != null) {
                jSONObject.put("codec_name", mediaCodec.getName());
            }
            jSONObject.put("hardware", this.LLJIJIL);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // com.ss.pusher.core.engine.AudioEncoder, com.ss.pusher.core.engine.NativeObject, com.ss.ttlivestreamer.core.engine.NativeObject
    public final void release() {
        Thread thread;
        SafeHandlerThread.SafeHandler safeHandler = this.LLILLJJLI;
        if (safeHandler == null) {
            return;
        }
        safeHandler.removeCallbacks(this.LLILLL);
        Object obj = new Object();
        boolean[] zArr = {true};
        C786410Ut5.LJJZZIII(this.LLILLJJLI, new ARunnableS53S0300000_20(obj, zArr, this, 66));
        synchronized (obj) {
            try {
                try {
                    obj.wait(1000L);
                    if (zArr[0] && (thread = this.LLILLJJLI.getLooper().getThread()) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Thread \"");
                        sbLIZ.append(thread.getName());
                        sbLIZ.append("\" id: ");
                        sbLIZ.append(thread.getId());
                        sbLIZ.append(", status: ");
                        sbLIZ.append(ThreadMethodProxy.getState(thread));
                        sbLIZ.append(", stack: ");
                        sbLIZ.append(Arrays.toString(ThreadMethodProxy.getStackTrace(thread)));
                        AVLog.logKibana(6, LLJILJIL, C2188811AlT.LIZIZ(sbLIZ), null);
                    }
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        SafeHandlerThread safeHandlerThread = this.LL;
        if (safeHandlerThread != null) {
            safeHandlerThread.release();
        }
        this.LL = null;
        this.LLILLJJLI = null;
    }

    public C1282640jTy() {
        SafeHandlerThread safeHandlerThread = new SafeHandlerThread("AACHardwareEncodeThread");
        this.LL = safeHandlerThread;
        safeHandlerThread.start();
        this.LLILLJJLI = (SafeHandlerThread.SafeHandler) this.LL.getHandler();
    }

    @Override // com.ss.pusher.core.engine.AudioEncoder
    public final boolean InitEncoder(TEBundle tEBundle) {
        this.LLIZ = tEBundle.getInt("audio_sample");
        this.LLIZLLLIL = tEBundle.getInt("audio_channels");
        tEBundle.getInt("audio_bit_width");
        this.LLJ = tEBundle.getInt("audio_bit_rate");
        int i = tEBundle.getInt("audio_profileLevel");
        this.LLJI = i;
        boolean[] zArr = new boolean[1];
        C1283060jUe.LIZIZ(this.LLILLJJLI, new ARunnableS1S0204000_20(this, i, zArr, this.LLIZ, this.LLIZLLLIL, this.LLJ, 1));
        return zArr[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r5 >= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098 A[LOOP:0: B:6:0x0011->B:30:0x0098, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6 A[EDGE_INSN: B:43:0x00a6->B:33:0x00a6 BREAK  A[LOOP:0: B:6:0x0011->B:30:0x0098], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJ(boolean r22) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1282640jTy.LLJ(boolean):void");
    }

    @Override // com.ss.pusher.core.engine.AudioEncoder
    public final int SetBitrate(int i) {
        if (i >= 0 && this.LLJ != i && this.LLILZ != null) {
            int i2 = this.LLIZ;
            int i3 = this.LLIZLLLIL;
            boolean[] zArr = new boolean[1];
            C1283060jUe.LIZIZ(this.LLILLJJLI, new ARunnableS1S0204000_20(this, this.LLJI, zArr, i2, i3, i, 1));
            boolean z = zArr[0];
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("try setAudioBitrate from ");
            sbLIZ.append(this.LLJ);
            sbLIZ.append(" to ");
            sbLIZ.append(i);
            sbLIZ.append("，returns ");
            sbLIZ.append(z);
            AVLog.iod("AACHWAudioEncoder", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                this.LLJ = i;
                return 0;
            }
            return -1;
        }
        return -1;
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public final void setNativeObj(long j) {
        if (j == 0) {
            release();
        }
        super.setNativeObj(j);
    }

    /* JADX WARN: Type inference failed for: r0v58, types: [X.0jU0] */
    @Override // com.ss.pusher.core.engine.AudioEncoder
    public final int Encode(ByteBuffer byteBuffer, int i, int i2, int i3, long j) throws Throwable {
        boolean z;
        int iPosition;
        int iLimit;
        int iCapacity;
        int iPosition2;
        int iLimit2;
        int i4 = i2;
        if (i == this.LLIZ && i4 == this.LLIZLLLIL) {
            int i5 = i3 * i4 * 2;
            if (byteBuffer.remaining() != i5) {
                if (byteBuffer.remaining() > i5) {
                    byteBuffer.limit(byteBuffer.position() + i5);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("frame.position() ");
                    sbLIZ.append(byteBuffer.position());
                    sbLIZ.append(", frame.limit() ");
                    sbLIZ.append(byteBuffer.limit());
                    sbLIZ.append(", frame.capacity() ");
                    sbLIZ.append(byteBuffer.capacity());
                    sbLIZ.append("; samplesPerChannel ");
                    sbLIZ.append(i3);
                    sbLIZ.append(", channelCount ");
                    sbLIZ.append(i4);
                    AVLog.logToIODevice2(6, LLJILJIL, C2188811AlT.LIZIZ(sbLIZ), (Throwable) null, 51, 10000);
                    return -102;
                }
            }
            try {
                try {
                    synchronized (this.LLILZIL) {
                        try {
                            C1282700jU4 c1282700jU4LLIZ = LLIZ();
                            if (c1282700jU4LLIZ != null) {
                                ByteBuffer byteBuffer2 = c1282700jU4LLIZ.LIZ;
                                if (byteBuffer2 != null && byteBuffer2.capacity() >= byteBuffer.capacity()) {
                                    z = false;
                                } else {
                                    c1282700jU4LLIZ.LIZ = ByteBuffer.allocateDirect(byteBuffer.capacity());
                                    z = true;
                                }
                                try {
                                    c1282700jU4LLIZ.LIZ.clear();
                                    iPosition = c1282700jU4LLIZ.LIZ.position();
                                } catch (Throwable th) {
                                    th = th;
                                    iPosition = 0;
                                    iLimit = 0;
                                    iCapacity = 0;
                                    iPosition2 = 0;
                                    iLimit2 = 0;
                                    i4 = 0;
                                    TryCatchGuardChecker.doCheck(th);
                                    try {
                                        throw th;
                                    } catch (Exception e) {
                                        e = e;
                                        TryCatchGuardChecker.doCheck(e);
                                        String strJ4 = C786410Ut5.j4("Fill AudioFrameBuffer error: newAllocated %b, bufferPosition %d, bufferLimit %d, bufferCapacity %d, framePosition %d, frameLimit %d, frameCapacity %d", new Object[]{Boolean.valueOf(z), Integer.valueOf(iPosition), Integer.valueOf(iLimit), Integer.valueOf(iCapacity), Integer.valueOf(iPosition2), Integer.valueOf(iLimit2), Integer.valueOf(i4)});
                                        String str = LLJILJIL;
                                        int iLogToIODevice2 = AVLog.logToIODevice2(6, str, strJ4, e, 53, 10000);
                                        if (iLogToIODevice2 > 0) {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("[repeat ");
                                            sbLIZ2.append(iLogToIODevice2);
                                            sbLIZ2.append(" times] ");
                                            sbLIZ2.append(strJ4);
                                            AVLog.logKibana(6, str, C2188811AlT.LIZIZ(sbLIZ2), e);
                                            return -105;
                                        }
                                        return -105;
                                    }
                                }
                                try {
                                    iLimit = c1282700jU4LLIZ.LIZ.limit();
                                } catch (Throwable th2) {
                                    th = th2;
                                    iLimit = 0;
                                    iCapacity = 0;
                                    iPosition2 = 0;
                                    iLimit2 = 0;
                                    i4 = 0;
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                                try {
                                    iCapacity = c1282700jU4LLIZ.LIZ.capacity();
                                    try {
                                        iPosition2 = byteBuffer.position();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        iPosition2 = 0;
                                        iLimit2 = 0;
                                        i4 = 0;
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                    try {
                                        iLimit2 = byteBuffer.limit();
                                    } catch (Throwable th4) {
                                        th = th4;
                                        iLimit2 = 0;
                                        i4 = 0;
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                    try {
                                        byteBuffer.capacity();
                                        c1282700jU4LLIZ.LIZ.put(byteBuffer);
                                        c1282700jU4LLIZ.LIZ.flip();
                                        c1282700jU4LLIZ.LIZIZ = i3;
                                        c1282700jU4LLIZ.LIZJ = j;
                                        c1282700jU4LLIZ.LIZLLL = 1;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        i4 = 0;
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    iCapacity = 0;
                                    iPosition2 = 0;
                                    iLimit2 = 0;
                                    i4 = 0;
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            } else {
                                return -103;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            z = false;
                        }
                    }
                    if (this.LLILLL == null) {
                        this.LLILLL = new Runnable() { // from class: X.0jU0
                            public final void LIZ() {
                                C1282700jU4 c1282700jU4;
                                int iDequeueInputBuffer;
                                String strLIZIZ;
                                if (this.LL.LLILZ == null) {
                                    return;
                                }
                                do {
                                    try {
                                        synchronized (this.LL.LLILZIL) {
                                            try {
                                                c1282700jU4 = null;
                                                for (C1282700jU4 c1282700jU42 : this.LL.LLILZIL) {
                                                    if (c1282700jU42.LIZLLL == 1 && (c1282700jU4 == null || c1282700jU4.LIZJ > c1282700jU42.LIZJ)) {
                                                        c1282700jU4 = c1282700jU42;
                                                    }
                                                }
                                                if (c1282700jU4 != null) {
                                                    iDequeueInputBuffer = this.LL.LLILZ.dequeueInputBuffer(0L);
                                                    if (iDequeueInputBuffer >= 0) {
                                                        c1282700jU4.LIZLLL = 2;
                                                    }
                                                } else {
                                                    iDequeueInputBuffer = -1;
                                                }
                                            } catch (Throwable th8) {
                                                TryCatchGuardChecker.doCheck(th8);
                                                throw th8;
                                            }
                                        }
                                        if (iDequeueInputBuffer >= 0) {
                                            int i6 = c1282700jU4.LIZIZ;
                                            C1282640jTy c1282640jTy = this.LL;
                                            int i7 = 2 * i6 * c1282640jTy.LLIZLLLIL;
                                            ByteBuffer inputBuffer = c1282640jTy.LLILZ.getInputBuffer(iDequeueInputBuffer);
                                            if (inputBuffer == null || inputBuffer.capacity() < i7) {
                                                c1282700jU4.LIZLLL = 1;
                                                this.LL.LLILZ.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 0);
                                                if (inputBuffer == null) {
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append("mCodec.getInputBuffer(");
                                                    sbLIZ3.append(iDequeueInputBuffer);
                                                    sbLIZ3.append(") is null");
                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                                } else {
                                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                    sbLIZ4.append("mCodec.getInputBuffer(");
                                                    sbLIZ4.append(iDequeueInputBuffer);
                                                    sbLIZ4.append(").capacity() ");
                                                    sbLIZ4.append(inputBuffer.capacity());
                                                    sbLIZ4.append(" < audio frame size ");
                                                    sbLIZ4.append(i7);
                                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                                                }
                                                AVLog.logToIODevice2(6, C1282640jTy.LLJILJIL, strLIZIZ, (Throwable) null, 54, 10000);
                                            } else {
                                                inputBuffer.clear();
                                                inputBuffer.put(c1282700jU4.LIZ);
                                                inputBuffer.flip();
                                                this.LL.LLILZ.queueInputBuffer(iDequeueInputBuffer, 0, i7, c1282700jU4.LIZJ, 0);
                                                c1282700jU4.LIZ.clear();
                                                c1282700jU4.LIZLLL = 0;
                                            }
                                        } else if (iDequeueInputBuffer != -1 && iDequeueInputBuffer != -2) {
                                            String str2 = C1282640jTy.LLJILJIL;
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("dequeueInputBuffer failed: inputIndex ");
                                            sbLIZ5.append(iDequeueInputBuffer);
                                            AVLog.logToIODevice2(6, str2, C2188811AlT.LIZIZ(sbLIZ5), (Throwable) null, 55, 10000);
                                        }
                                        this.LL.LLJ(false);
                                    } catch (Exception e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                        sbLIZ6.append("AACHWAudioEncoder.Encode exception. cause: ");
                                        sbLIZ6.append(e2.getCause());
                                        sbLIZ6.append(", message: ");
                                        sbLIZ6.append(e2.getMessage());
                                        sbLIZ6.append(", stack: ");
                                        sbLIZ6.append(Log.getStackTraceString(e2));
                                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ6);
                                        String str3 = C1282640jTy.LLJILJIL;
                                        int iLogToIODevice22 = AVLog.logToIODevice2(6, str3, strLIZIZ2, (Throwable) null, 56, 10000);
                                        if (iLogToIODevice22 > 0) {
                                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                            sbLIZ7.append("[repeat ");
                                            sbLIZ7.append(iLogToIODevice22);
                                            sbLIZ7.append(" times] ");
                                            sbLIZ7.append(strLIZIZ2);
                                            AVLog.logKibana(6, str3, C2188811AlT.LIZIZ(sbLIZ7), null);
                                            return;
                                        }
                                        return;
                                    }
                                } while (iDequeueInputBuffer >= 0);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("AACHWAudioEncoder@beef.Encode$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("AACHWAudioEncoder@beef.Encode$1");
                            }
                        };
                    }
                    SafeHandlerThread.SafeHandler safeHandler = this.LLILLJJLI;
                    if (safeHandler != null && C786410Ut5.LJJZZIII(safeHandler, this.LLILLL)) {
                        return 0;
                    }
                    return -104;
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (Exception e2) {
                e = e2;
                z = false;
                iPosition = 0;
                iLimit = 0;
                iCapacity = 0;
                iPosition2 = 0;
                iLimit2 = 0;
                i4 = 0;
            }
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Target sample rate ");
            sbLIZ3.append(this.LLIZ);
            sbLIZ3.append("Hz, channel count ");
            sbLIZ3.append(this.LLIZLLLIL);
            sbLIZ3.append("; Actual sample rate ");
            sbLIZ3.append(i);
            sbLIZ3.append("Hz, channel count ");
            sbLIZ3.append(i4);
            sbLIZ3.append(e3.d);
            AVLog.logToIODevice2(6, LLJILJIL, C2188811AlT.LIZIZ(sbLIZ3), (Throwable) null, 52, 10000);
            return -101;
        }
    }
}
