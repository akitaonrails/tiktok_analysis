package X;

import Y.ARunnableS53S0300000_20;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.lyraxwrapper.LyraxVideoFrameWrapper;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectorJava;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jHW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1274920jHW implements InterfaceC1275840jJ0 {
    public final /* synthetic */ C1275000jHe LIZ;
    public final /* synthetic */ StreamKey LIZIZ;

    public /* synthetic */ C1274920jHW(C1275000jHe c1275000jHe, StreamKey streamKey) {
        this.LIZ = c1275000jHe;
        this.LIZIZ = streamKey;
    }

    public final boolean LIZ(LyraxVideoRendererWrapper lyraxVideoRendererWrapper, LyraxVideoFrameWrapper lyraxVideoFrameWrapper) {
        InterfaceC1275190jHx interfaceC1275190jHxLJIIIIZZ;
        InterfaceC1274490jGp interfaceC1274490jGpLIZJ;
        Handler handlerLJJLIIIJJI;
        String string;
        int textureID;
        int iLJIILL;
        AbstractC1273900jFs abstractC1273900jFs;
        C1275000jHe c1275000jHe = this.LIZ;
        StreamKey streamKey = this.LIZIZ;
        C1275290jI7 c1275290jI7 = c1275000jHe.LIZIZ.LJJIII;
        if (streamKey != null) {
            c1275290jI7.getClass();
            if (!TextUtils.isEmpty(streamKey.getUserId())) {
                ByteBuffer externalDataInfo = lyraxVideoFrameWrapper.getExternalDataInfo();
                if (externalDataInfo == null) {
                    string = "";
                } else {
                    string = StandardCharsets.UTF_8.decode(externalDataInfo.duplicate()).toString();
                }
                if (((C1275770jIt) c1275290jI7.LIZ).LIZ.LJIJJLI == null || !string.isEmpty()) {
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(string.getBytes(StandardCharsets.UTF_8));
                    if (lyraxVideoFrameWrapper.getFrameType() == VideoFrameType.GL_TEXTURE) {
                        textureID = lyraxVideoFrameWrapper.getTextureID();
                    } else {
                        textureID = -1;
                    }
                    InterfaceC1275870jJ3 interfaceC1275870jJ3 = c1275290jI7.LIZ;
                    String userId = streamKey.getUserId();
                    C1274850jHP c1274850jHP = ((C1275770jIt) interfaceC1275870jJ3).LIZ.LIZLLL;
                    if (c1274850jHP != null) {
                        iLJIILL = c1274850jHP.LJIILL(userId);
                    } else {
                        iLJIILL = 0;
                    }
                    String userId2 = streamKey.getUserId();
                    int width = lyraxVideoFrameWrapper.getWidth();
                    int height = lyraxVideoFrameWrapper.getHeight();
                    long timeStampUs = lyraxVideoFrameWrapper.getTimeStampUs() / 1000;
                    ByteBuffer byteBufferLIZ = C1275290jI7.LIZ(byteBufferWrap);
                    C1271090jBL c1271090jBL = ((C1275770jIt) c1275290jI7.LIZ).LIZ.LJJLIIIIJ;
                    if (c1271090jBL != null && (abstractC1273900jFs = c1271090jBL.LL) != null) {
                        abstractC1273900jFs.LLJJJJ(iLJIILL, userId2, textureID, width, height, timeStampUs, byteBufferLIZ);
                    }
                    if (!string.isEmpty()) {
                        String userId3 = streamKey.getUserId();
                        String strNativeParseStringFromByteBuffer = EffectWrapper.nativeParseStringFromByteBuffer(0, C1275290jI7.LIZ(ByteBuffer.wrap(string.getBytes(StandardCharsets.UTF_8))));
                        if (!TextUtils.isEmpty(strNativeParseStringFromByteBuffer)) {
                            try {
                                long jOptLong = JSONObjectProtectorUtils.getJSONObject(new JSONObject(strNativeParseStringFromByteBuffer), "video_e2e_delay").optLong("capture_ntp_ts", -1L);
                                C1274990jHd c1274990jHd = ((C1275770jIt) c1275290jI7.LIZ).LIZ.LJIIIZ;
                                if (jOptLong > 0 && c1274990jHd != null) {
                                    long serverTimeMSec = TimeUtils.getServerTimeMSec();
                                    C1274910jHV c1274910jHV = c1274990jHd.LIZJ;
                                    if (c1274910jHV != null) {
                                        c1274910jHV.onVideoDelayInfo(userId3, (int) (serverTimeMSec - jOptLong));
                                    }
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                }
            }
        }
        ((C1275770jIt) c1275290jI7.LIZ).LIZ.getClass();
        if (streamKey != null && streamKey.getStreamIndex() == StreamIndex.STREAM_INDEX_MAIN) {
            if (lyraxVideoRendererWrapper == null) {
                return true;
            }
            if (lyraxVideoRendererWrapper.LJJIJIIJIL) {
                return false;
            }
        } else if (lyraxVideoRendererWrapper == null) {
            return true;
        }
        TTLHAbnormalDetectorJava tTLHAbnormalDetectorJava = lyraxVideoRendererWrapper.LJJIFFI.get();
        if (tTLHAbnormalDetectorJava == null) {
            return true;
        }
        if (lyraxVideoFrameWrapper.getFrameType() == VideoFrameType.GL_TEXTURE) {
            synchronized (lyraxVideoRendererWrapper) {
                interfaceC1275190jHxLJIIIIZZ = lyraxVideoRendererWrapper.LJIIIIZZ();
            }
            if (interfaceC1275190jHxLJIIIIZZ == null || (interfaceC1274490jGpLIZJ = interfaceC1275190jHxLJIIIIZZ.LIZJ()) == null || (handlerLJJLIIIJJI = interfaceC1274490jGpLIZJ.LJJLIIIJJI()) == null) {
                return true;
            }
            VideoPixelFormat pixelFormat = lyraxVideoFrameWrapper.getPixelFormat();
            lyraxVideoFrameWrapper.retain();
            if (C786410Ut5.LJJZZIII(handlerLJJLIIIJJI, new ARunnableS53S0300000_20(pixelFormat, lyraxVideoFrameWrapper, tTLHAbnormalDetectorJava, 72))) {
                return true;
            }
            lyraxVideoFrameWrapper.release();
            return true;
        }
        if (lyraxVideoFrameWrapper.getFrameType() != VideoFrameType.RAW_MEMORY) {
            return true;
        }
        tTLHAbnormalDetectorJava.processI420(lyraxVideoFrameWrapper.getPlaneData(0), lyraxVideoFrameWrapper.getPlaneData(1), lyraxVideoFrameWrapper.getPlaneData(2), lyraxVideoFrameWrapper.getWidth(), lyraxVideoFrameWrapper.getHeight(), lyraxVideoFrameWrapper.getPlaneStride(0), lyraxVideoFrameWrapper.getPlaneStride(1), lyraxVideoFrameWrapper.getPlaneStride(2));
        return true;
    }
}
