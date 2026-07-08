package X;

import Y.ARunnableS1S0204000_20;
import Y.ARunnableS53S0300000_20;
import android.media.MediaCodec;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.ttlivestreamer.core.engine.AudioEncoder;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282630jTx extends AudioEncoder {
    public static final String LLJILJIL = C1282630jTx.class.getSimpleName();
    public SafeHandlerThread LL;
    public Handler LLILLJJLI;
    public RunnableC1282650jTz LLILLL;
    public MediaCodec LLILZ;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public final Queue<C1282690jU3> LLILZIL = new LinkedList();
    public final MediaCodec.BufferInfo LLILZLL = new MediaCodec.BufferInfo();
    public boolean LLJIJIL = true;

    public final C1282690jU3 LLIZ() {
        C1282690jU3 next;
        Iterator<C1282690jU3> it2 = this.LLILZIL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZLLL == 0) {
                    break;
                }
            } else {
                next = null;
                if (((LinkedList) this.LLILZIL).size() < 50) {
                    C1282690jU3 c1282690jU3 = new C1282690jU3(this);
                    ((LinkedList) this.LLILZIL).add(c1282690jU3);
                    return c1282690jU3;
                }
                int i = 0;
                int i2 = 0;
                for (C1282690jU3 c1282690jU32 : this.LLILZIL) {
                    if (c1282690jU32.LIZLLL == 1) {
                        i2++;
                        c1282690jU32.LIZLLL = 0;
                        if (next == null) {
                            next = c1282690jU32;
                        }
                    } else {
                        i++;
                    }
                }
                if (AVLog.enableLogToIODevice2()) {
                    String str = LLJILJIL;
                    if (next != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Buffer queue size ");
                        sbLIZ.append(((LinkedList) this.LLILZIL).size());
                        sbLIZ.append(", dropped ");
                        sbLIZ.append(i2);
                        sbLIZ.append(" audio frames.");
                        AVLog.logToIODevice2(5, str, C2188811AlT.LIZIZ(sbLIZ), null, 58, 10000);
                        return next;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Buffer queue size ");
                    sbLIZ2.append(((LinkedList) this.LLILZIL).size());
                    sbLIZ2.append(", ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(" frames are in use.");
                    AVLog.logToIODevice2(6, str, C2188811AlT.LIZIZ(sbLIZ2), null, 59, 10000);
                    return next;
                }
            }
        }
        return next;
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

    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoder
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

    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoder, com.ss.ttlivestreamer.core.engine.NativeObject
    public final void release() {
        Thread thread;
        Handler handler = this.LLILLJJLI;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(this.LLILLL);
        Object obj = new Object();
        boolean[] zArr = {true};
        C786410Ut5.LJJZZIII(this.LLILLJJLI, new ARunnableS53S0300000_20(obj, zArr, this, 49));
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
        C1273730jFb.LIZLLL(this.LL);
        this.LL = null;
        this.LLILLJJLI = null;
    }

    public C1282630jTx() {
        SafeHandlerThread safeHandlerThreadLIZIZ = C1273730jFb.LIZIZ(0, "AACHardwareEncodeThread");
        this.LL = safeHandlerThreadLIZIZ;
        safeHandlerThreadLIZIZ.start();
        this.LLILLJJLI = this.LL.getHandler();
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoder
    public final boolean InitEncoder(TEBundle tEBundle) {
        this.LLIZ = tEBundle.getInt("audio_sample");
        this.LLIZLLLIL = tEBundle.getInt("audio_channels");
        tEBundle.getInt("audio_bit_width");
        this.LLJ = tEBundle.getInt("audio_bit_rate");
        int i = tEBundle.getInt("audio_profileLevel");
        this.LLJI = i;
        boolean[] zArr = new boolean[1];
        C1283100jUi.LIZIZ(this.LLILLJJLI, new ARunnableS1S0204000_20(this, i, zArr, this.LLIZ, this.LLIZLLLIL, this.LLJ, 0));
        return zArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJ(boolean r22) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1282630jTx.LLJ(boolean):void");
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoder
    public final int SetBitrate(int i) {
        if (i >= 0 && this.LLJ != i && this.LLILZ != null) {
            int i2 = this.LLIZ;
            int i3 = this.LLIZLLLIL;
            boolean[] zArr = new boolean[1];
            C1283100jUi.LIZIZ(this.LLILLJJLI, new ARunnableS1S0204000_20(this, this.LLJI, zArr, i2, i3, i, 0));
            boolean z = zArr[0];
            if (C1268530j7D.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("try setAudioBitrate from ");
                sbLIZ.append(this.LLJ);
                sbLIZ.append(" to ");
                sbLIZ.append(i);
                sbLIZ.append("，returns ");
                sbLIZ.append(z);
                AVLog.iod("AACHWAudioEncoder", C2188811AlT.LIZIZ(sbLIZ));
            }
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

    /* JADX WARN: Type inference failed for: r0v62, types: [X.0jTz] */
    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoder
    public final int Encode(ByteBuffer byteBuffer, int i, int i2, int i3, long j) throws Throwable {
        boolean z;
        int iPosition;
        int iLimit;
        int iCapacity;
        int iPosition2;
        int iLimit2;
        String strJ4;
        String str;
        int iLogToIODevice2;
        int i4 = i2;
        if (i == this.LLIZ && i4 == this.LLIZLLLIL) {
            int i5 = i3 * i4 * 2;
            if (byteBuffer.remaining() != i5) {
                if (byteBuffer.remaining() > i5) {
                    byteBuffer.limit(byteBuffer.position() + i5);
                } else {
                    if (AVLog.enableLogToIODevice2()) {
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
                        AVLog.logToIODevice2(6, LLJILJIL, C2188811AlT.LIZIZ(sbLIZ), null, 51, 10000);
                        return -102;
                    }
                    return -102;
                }
            }
            try {
                try {
                    synchronized (this.LLILZIL) {
                        try {
                            C1282690jU3 c1282690jU3LLIZ = LLIZ();
                            if (c1282690jU3LLIZ != null) {
                                ByteBuffer byteBuffer2 = c1282690jU3LLIZ.LIZ;
                                if (byteBuffer2 != null && byteBuffer2.capacity() >= byteBuffer.capacity()) {
                                    z = false;
                                } else {
                                    c1282690jU3LLIZ.LIZ = ByteBuffer.allocateDirect(byteBuffer.capacity());
                                    z = true;
                                }
                                try {
                                    c1282690jU3LLIZ.LIZ.clear();
                                    iPosition = c1282690jU3LLIZ.LIZ.position();
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
                                        if (AVLog.enableLogToIODevice2() && (iLogToIODevice2 = AVLog.logToIODevice2(6, (str = LLJILJIL), (strJ4 = C786410Ut5.j4("Fill AudioFrameBuffer error: newAllocated %b, bufferPosition %d, bufferLimit %d, bufferCapacity %d, framePosition %d, frameLimit %d, frameCapacity %d", new Object[]{Boolean.valueOf(z), Integer.valueOf(iPosition), Integer.valueOf(iLimit), Integer.valueOf(iCapacity), Integer.valueOf(iPosition2), Integer.valueOf(iLimit2), Integer.valueOf(i4)})), e, 53, 10000)) > 0) {
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
                                    iLimit = c1282690jU3LLIZ.LIZ.limit();
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
                                    iCapacity = c1282690jU3LLIZ.LIZ.capacity();
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
                                        c1282690jU3LLIZ.LIZ.put(byteBuffer);
                                        c1282690jU3LLIZ.LIZ.flip();
                                        c1282690jU3LLIZ.LIZIZ = i3;
                                        c1282690jU3LLIZ.LIZJ = j;
                                        c1282690jU3LLIZ.LIZLLL = 1;
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
                        this.LLILLL = new Runnable() { // from class: X.0jTz
                            public final void LIZ() {
                                C1282690jU3 c1282690jU3;
                                int iDequeueInputBuffer;
                                String strLIZIZ;
                                if (this.LL.LLILZ == null) {
                                    return;
                                }
                                do {
                                    try {
                                        synchronized (this.LL.LLILZIL) {
                                            try {
                                                c1282690jU3 = null;
                                                for (C1282690jU3 c1282690jU32 : this.LL.LLILZIL) {
                                                    if (c1282690jU32.LIZLLL == 1 && (c1282690jU3 == null || c1282690jU3.LIZJ > c1282690jU32.LIZJ)) {
                                                        c1282690jU3 = c1282690jU32;
                                                    }
                                                }
                                                if (c1282690jU3 != null) {
                                                    iDequeueInputBuffer = this.LL.LLILZ.dequeueInputBuffer(0L);
                                                    if (iDequeueInputBuffer >= 0) {
                                                        c1282690jU3.LIZLLL = 2;
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
                                            int i6 = c1282690jU3.LIZIZ;
                                            C1282630jTx c1282630jTx = this.LL;
                                            int i7 = 2 * i6 * c1282630jTx.LLIZLLLIL;
                                            ByteBuffer inputBuffer = c1282630jTx.LLILZ.getInputBuffer(iDequeueInputBuffer);
                                            if (inputBuffer == null || inputBuffer.capacity() < i7) {
                                                c1282690jU3.LIZLLL = 1;
                                                this.LL.LLILZ.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 0);
                                                if (AVLog.enableLogToIODevice2()) {
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
                                                    AVLog.logToIODevice2(6, C1282630jTx.LLJILJIL, strLIZIZ, null, 54, 10000);
                                                }
                                            } else {
                                                inputBuffer.clear();
                                                inputBuffer.put(c1282690jU3.LIZ);
                                                inputBuffer.flip();
                                                this.LL.LLILZ.queueInputBuffer(iDequeueInputBuffer, 0, i7, c1282690jU3.LIZJ, 0);
                                                c1282690jU3.LIZ.clear();
                                                c1282690jU3.LIZLLL = 0;
                                            }
                                        } else if (iDequeueInputBuffer != -1 && iDequeueInputBuffer != -2 && AVLog.enableLogToIODevice2()) {
                                            String str2 = C1282630jTx.LLJILJIL;
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("dequeueInputBuffer failed: inputIndex ");
                                            sbLIZ5.append(iDequeueInputBuffer);
                                            AVLog.logToIODevice2(6, str2, C2188811AlT.LIZIZ(sbLIZ5), null, 55, 10000);
                                        }
                                        this.LL.LLJ(false);
                                    } catch (Exception e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        C1274070jG9 c1274070jG9 = C1274080jGA.LIZ;
                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                        String str3 = C1282630jTx.LLJILJIL;
                                        sbLIZ6.append(str3);
                                        sbLIZ6.append(".Encode");
                                        c1274070jG9.LIZ(C2188811AlT.LIZIZ(sbLIZ6), e2);
                                        if (C1274040jG6.LIZ()) {
                                            throw new AndroidRuntimeException(e2);
                                        }
                                        if (AVLog.enableLogToIODevice2()) {
                                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                            sbLIZ7.append("AACHWAudioEncoder.Encode exception. cause: ");
                                            sbLIZ7.append(e2.getCause());
                                            sbLIZ7.append(", message: ");
                                            sbLIZ7.append(e2.getMessage());
                                            sbLIZ7.append(", stack: ");
                                            sbLIZ7.append(Log.getStackTraceString(e2));
                                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
                                            int iLogToIODevice22 = AVLog.logToIODevice2(6, str3, strLIZIZ2, null, 56, 10000);
                                            if (iLogToIODevice22 > 0) {
                                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                                sbLIZ8.append("[repeat ");
                                                sbLIZ8.append(iLogToIODevice22);
                                                sbLIZ8.append(" times] ");
                                                sbLIZ8.append(strLIZIZ2);
                                                AVLog.logKibana(6, str3, C2188811AlT.LIZIZ(sbLIZ8), null);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                } while (iDequeueInputBuffer >= 0);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("AACHWAudioEncoder@9e69.Encode$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("AACHWAudioEncoder@9e69.Encode$1");
                            }
                        };
                    }
                    Handler handler = this.LLILLJJLI;
                    if (handler != null && C786410Ut5.LJJZZIII(handler, this.LLILLL)) {
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
            if (AVLog.enableLogToIODevice2()) {
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
                AVLog.logToIODevice2(6, LLJILJIL, C2188811AlT.LIZIZ(sbLIZ3), null, 52, 10000);
                return -101;
            }
            return -101;
        }
    }
}
