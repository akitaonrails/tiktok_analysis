package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0jYB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1285250jYB {
    void LIZ();

    MediaCodec LIZIZ();

    void LIZJ();

    BPEAHandler LIZLLL();

    void LJ(MediaFormat mediaFormat, Surface surface);

    boolean LJFF();

    void LJI(C1285260jYC c1285260jYC, C1285230jY9 c1285230jY9);

    int dequeueInputBuffer(long j);

    int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j);

    void flush();

    void queueInputBuffer(int i, int i2, int i3, long j, int i4);

    void release();

    void releaseOutputBuffer(int i, long j);

    void releaseOutputBuffer(int i, boolean z);

    void setOutputSurface(Surface surface);

    void start();

    void stop();
}
