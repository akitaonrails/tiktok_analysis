package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS13S0500000_20;
import android.graphics.Matrix;
import android.os.Handler;
import android.util.Log;
import com.ss.pusher.core.utils.AVLog;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: renamed from: X.0jCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1272060jCu {
    public static boolean LIZIZ(LiveSdkSetting liveSdkSetting) {
        if (liveSdkSetting != null && liveSdkSetting.enableNewVideoBufferPool) {
            liveSdkSetting.ttlhABSettingsConfigs.getClass();
            if (!TTLHABSettingsConfigs.LJFF.getVideoFramePoolConfig().getEnable() && liveSdkSetting.mPushBase.LJIILIIL() && liveSdkSetting.mPushBase.LJIJJLI()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static C1277560jLm LIZ(VideoFrame videoFrame, Handler handler, C1269940j9U c1269940j9U, LiveSdkSetting liveSdkSetting) {
        boolean z;
        if (videoFrame != null && videoFrame.getBuffer() != null) {
            final int rotatedWidth = videoFrame.getRotatedWidth();
            final int rotatedHeight = videoFrame.getRotatedHeight();
            final EnumC1277730jM3 enumC1277730jM3FromInt = EnumC1277730jM3.fromInt(videoFrame.getRotation() % 360);
            final long timestampNs = videoFrame.getTimestampNs() / 1000;
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            if (buffer instanceof InterfaceC1271560jC6) {
                InterfaceC1271560jC6 interfaceC1271560jC6 = (InterfaceC1271560jC6) buffer;
                int textureId = interfaceC1271560jC6.getTextureId();
                if (interfaceC1271560jC6.getType() == EnumC1273550jFJ.OES) {
                    z = true;
                } else {
                    z = false;
                }
                Matrix transformMatrix = interfaceC1271560jC6.getTransformMatrix();
                if (LIZIZ(liveSdkSetting) && liveSdkSetting.LJIIJ()) {
                    enumC1277730jM3FromInt = EnumC1277730jM3.Rotation0;
                    if (interfaceC1271560jC6.getTransformMatrixArray() != null) {
                        transformMatrix = C1273010jER.LIZJ(0, interfaceC1271560jC6.getTransformMatrixArray());
                    }
                }
                if (c1269940j9U != null) {
                    c1269940j9U.LIZ(11, videoFrame.getBuffer().getCaptureMs());
                }
                if (LIZIZ(liveSdkSetting)) {
                    interfaceC1271560jC6.retain("PusherEncode");
                } else {
                    interfaceC1271560jC6.retain();
                }
                ARunnableS13S0500000_20 aRunnableS13S0500000_20 = new ARunnableS13S0500000_20(videoFrame, interfaceC1271560jC6, handler, liveSdkSetting, c1269940j9U, 1);
                C1277560jLm c1277560jLm = new C1277560jLm(rotatedWidth, rotatedHeight, timestampNs, textureId, z, transformMatrix);
                c1277560jLm.LIZJ = enumC1277730jM3FromInt;
                c1277560jLm.LJIILIIL = aRunnableS13S0500000_20;
                long fence = interfaceC1271560jC6.getFence();
                c1277560jLm.LJIIIZ = fence;
                C1272080jCw c1272080jCw = C1277560jLm.LJIILL;
                if (c1272080jCw.LIZ) {
                    c1272080jCw.LIZ = false;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setFenceSyncObj: ");
                    sbLIZ.append(fence);
                    Throwable th = new Throwable(C2188811AlT.LIZIZ(sbLIZ));
                    AVLog.logKibana(4, "VeLiveVideoFrame", th.getMessage(), th);
                    AVLog.iod("VeLiveVideoFrame", Log.getStackTraceString(th));
                }
                return c1277560jLm;
            }
            if (buffer instanceof VideoFrame.I420Buffer) {
                final VideoFrame.I420Buffer i420Buffer = (VideoFrame.I420Buffer) buffer;
                return new AbstractC1278120jMg(rotatedWidth, rotatedHeight, timestampNs, enumC1277730jM3FromInt, i420Buffer) { // from class: X.0jCv
                    public final VideoFrame.I420Buffer LJIILLIIL;

                    @Override // X.C1277560jLm
                    public final void LIZJ() {
                        this.LJIILLIIL.release();
                    }

                    @Override // X.C1277560jLm
                    public final void LIZLLL() {
                        this.LJIILLIIL.retain();
                    }

                    @Override // X.AbstractC1278120jMg
                    public final ByteBuffer LJ() {
                        return this.LJIILLIIL.getDataU();
                    }

                    @Override // X.AbstractC1278120jMg
                    public final ByteBuffer LJFF() {
                        return this.LJIILLIIL.getDataV();
                    }

                    @Override // X.AbstractC1278120jMg
                    public final ByteBuffer LJI() {
                        return this.LJIILLIIL.getDataY();
                    }

                    {
                        this.LJIILLIIL = i420Buffer;
                        i420Buffer.retain();
                        Objects.requireNonNull(i420Buffer);
                        this.LJIILIIL = new ARunnableS120S0100000_20(i420Buffer, 390);
                    }
                };
            }
            return null;
        }
        return null;
    }
}
