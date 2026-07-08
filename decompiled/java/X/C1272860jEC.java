package X;

import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.render.ANativeWindowRenderDrawer;

/* JADX INFO: renamed from: X.0jEC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1272860jEC {
    public static boolean LIZ(ANativeWindowRenderDrawer aNativeWindowRenderDrawer, VideoFrame videoFrame) {
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        if (buffer.getBufferType() == 3) {
            C1271900jCe c1271900jCe = (C1271900jCe) buffer;
            return aNativeWindowRenderDrawer.drawRawYuv(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), c1271900jCe.getDataY(), c1271900jCe.getDataU(), c1271900jCe.getDataV(), c1271900jCe.LJFF, c1271900jCe.LJI, c1271900jCe.LJII);
        }
        if (buffer.getBufferType() == 8) {
            C1272850jEB c1272850jEB = (C1272850jEB) buffer;
            return aNativeWindowRenderDrawer.drawRgb(c1272850jEB.LIZ, c1272850jEB.LIZIZ, c1272850jEB.LIZJ);
        }
        return false;
    }
}
