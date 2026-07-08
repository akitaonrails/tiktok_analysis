package X;

import android.graphics.Matrix;
import com.ss.ttlivestreamer.core.buffer.RoiInfo;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;

/* JADX INFO: renamed from: X.0jC7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271570jC7 {
    public static final VideoFrame LIZ(InterfaceC1271560jC6 interfaceC1271560jC6, VideoFrame videoFrame, RoiInfo roiInfo) {
        interfaceC1271560jC6.updateExtraData(null);
        interfaceC1271560jC6.updateCaptureMs(videoFrame.getBuffer().getCaptureMs());
        interfaceC1271560jC6.updateCaptureServerNtpMs(videoFrame.getBuffer().getCaptureServerNtpMs());
        interfaceC1271560jC6.updateEffectServerNtpMs(videoFrame.getBuffer().getEffectServerNtpMs());
        interfaceC1271560jC6.setROIInfo(roiInfo);
        if (interfaceC1271560jC6.getTransformMatrix() == null) {
            interfaceC1271560jC6.setTransformMatrix(new Matrix());
        }
        return new VideoFrame(interfaceC1271560jC6, 0, videoFrame.getTimestampNs());
    }
}
