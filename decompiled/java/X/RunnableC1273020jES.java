package X;

import android.media.AudioRecord;
import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0jES, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1273020jES implements Runnable {
    public final AudioRecord LL;
    public final SafeHandlerThread LLILLJJLI;
    public final ByteBuffer LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public int LLIZ;
    public InterfaceC1272460jDY LLJI;
    public volatile boolean LLILLL = true;
    public Deque<ByteBuffer> LLJ = new LinkedList();
    public final int LLIZLLLIL = 0;

    public final void LIZ() {
        int iLJJZZIII;
        AudioRecord audioRecord;
        Process.setThreadPriority(-19);
        long jNativeNanoTime = TimeUtils.nativeNanoTime() / 1000;
        while (this.LLILLL) {
            try {
                AudioRecord audioRecord2 = this.LL;
                ByteBuffer byteBuffer = this.LLILZ;
                iLJJZZIII = C2204961BRm.LJJZZIII(audioRecord2, byteBuffer, byteBuffer.capacity(), new C0WZX("dzBzEhEpEd7IWV43QAGQdGXVEhh91R8v3lLlByLUqUHO8bgQ2IoP7YOzy5biOzRt8Zqq0JjmlBRaMA==", null));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                iLJJZZIII = -3;
            }
            if (iLJJZZIII == this.LLILZ.capacity()) {
                InterfaceC1272460jDY interfaceC1272460jDY = this.LLJI;
                Deque<ByteBuffer> deque = this.LLJ;
                if (this.LLIZLLLIL > 0 && deque != null) {
                    ByteBuffer byteBuffer2 = this.LLILZ;
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer2.capacity());
                    byteBuffer2.rewind();
                    byteBufferAllocate.put(byteBuffer2);
                    byteBuffer2.rewind();
                    byteBufferAllocate.flip();
                    int i = this.LLIZ;
                    this.LLIZ = i + 1;
                    if (i < this.LLIZLLLIL) {
                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(this.LLILZ.capacity());
                        while (byteBufferAllocate2.hasRemaining()) {
                            byteBufferAllocate2.put((byte) 0);
                        }
                        byteBufferAllocate2.flip();
                        ((LinkedList) deque).addFirst(byteBufferAllocate2);
                    }
                    LinkedList linkedList = (LinkedList) deque;
                    linkedList.addLast(byteBufferAllocate);
                    this.LLILZ.rewind();
                    this.LLILZ.put((ByteBuffer) linkedList.poll());
                }
                if (interfaceC1272460jDY != null) {
                    ByteBuffer byteBuffer3 = this.LLILZ;
                    int i2 = this.LLILZLL;
                    interfaceC1272460jDY.LIZJ(byteBuffer3, i2 / 100, i2, this.LLILZIL, jNativeNanoTime);
                }
                jNativeNanoTime += 10000;
            } else {
                AVLog.e("AudioRecordThread", "AudioRecord.read failed: " + iLJJZZIII);
                if (iLJJZZIII == -3) {
                    this.LLILLL = false;
                    AVLog.e("AudioRecordThread", "AudioRecord read error, invalid operation");
                    InterfaceC1272460jDY interfaceC1272460jDY2 = this.LLJI;
                    if (interfaceC1272460jDY2 != null) {
                        interfaceC1272460jDY2.LIZ(new Exception("AudioRecord read error, invalid operation"));
                    }
                }
                if (AVLog.enableLogToIODevice2() && (audioRecord = this.LL) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AudioRecord read error (");
                    sbLIZ.append(iLJJZZIII);
                    sbLIZ.append(") stat ");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    try {
                        int state = audioRecord.getState();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append(state);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(strLIZIZ);
                        sbLIZ3.append("unknown");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    AVLog.logToIODevice2(4, "AudioRecordThread", strLIZIZ, null, 49, 10000);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AudioRecordThread@910b.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AudioRecordThread@910b.run");
    }

    public RunnableC1273020jES(AudioRecord audioRecord) {
        int channelCount = audioRecord.getChannelCount();
        this.LLILZIL = channelCount;
        int sampleRate = audioRecord.getSampleRate();
        this.LLILZLL = sampleRate;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(channelCount * 2 * (sampleRate / 100));
        this.LLILZ = byteBufferAllocateDirect;
        if (byteBufferAllocateDirect.hasArray()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("byteBuffer.capacity: ");
            sbLIZ.append(byteBufferAllocateDirect.capacity());
            sbLIZ.append(" mScreenAudioCaptureDelayMicPackage :");
            sbLIZ.append(0);
            AVLog.d("AudioRecordThread", C2188811AlT.LIZIZ(sbLIZ));
            this.LL = audioRecord;
            SafeHandlerThread safeHandlerThreadLIZIZ = C1273730jFb.LIZIZ(0, "AudioRecordJavaThread");
            this.LLILLJJLI = safeHandlerThreadLIZIZ;
            safeHandlerThreadLIZIZ.start();
            return;
        }
        AVLog.logKibana(6, "AudioRecordThread", "ByteBuffer does not have backing array.", null);
        throw new IllegalStateException("ByteBuffer does not have backing array.");
    }
}
