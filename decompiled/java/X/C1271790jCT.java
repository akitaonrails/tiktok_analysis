package X;

import com.ss.ttlivestreamer.core.buffer.VideoFrame;

/* JADX INFO: renamed from: X.0jCT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271790jCT extends C1275940jJA<VideoFrame> implements InterfaceC1272840jEA {
    @Override // X.InterfaceC1272840jEA
    public final void onRelease() {
    }

    public C1271790jCT(int i, InterfaceC1275950jJB interfaceC1275950jJB) {
        super(i, interfaceC1275950jJB, new InterfaceC1275740jIq<VideoFrame>() { // from class: X.0jCX
            @Override // X.InterfaceC1275740jIq
            public final VideoFrame LIZ(C1275940jJA<VideoFrame> c1275940jJA) {
                VideoFrame videoFrame = new VideoFrame();
                videoFrame.setOnFrameReleaseListener(new C1271840jCY(c1275940jJA, videoFrame));
                return videoFrame;
            }
        });
    }

    public final VideoFrame LIZLLL(VideoFrame.Buffer buffer, int i, long j) {
        VideoFrame videoFrameLIZ;
        if (buffer == null || (videoFrameLIZ = LIZ()) == null) {
            return null;
        }
        videoFrameLIZ.reuseVideoFrame(buffer, i, j);
        return videoFrameLIZ;
    }
}
