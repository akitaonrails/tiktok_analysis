package X;

import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jGq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1274500jGq {
    VideoMixer.VideoMixerDescription LIZ();

    int LJIIJJI(long j, int i, int i2, int i3, float[] fArr, int i4, boolean z);

    int LJIIL(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, long j);

    void LJIILJJIL(VideoMixer.VideoMixerDescription videoMixerDescription);

    String name();

    void release();

    int start();

    int stop();
}
