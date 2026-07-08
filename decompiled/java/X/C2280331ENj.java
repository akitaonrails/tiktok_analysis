package X;

import android.media.MediaCodecInfo;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.1ENj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2280331ENj {
    public static Map<String, Integer> LIZLLL;
    public MediaCodecInfo LIZ;
    public int LIZIZ;
    public String LIZJ;

    public static C2280331ENj LIZ(MediaCodecInfo mediaCodecInfo, String str) {
        int iIntValue;
        String name = mediaCodecInfo.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        Map<String, Integer> map = LIZLLL;
        if (map == null) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            LIZLLL = treeMap;
            treeMap.put("OMX.qcom.video.decoder.avc", 100);
            ((TreeMap) LIZLLL).put("OMX.qcom.video.decoder.hevc", 100);
            ((TreeMap) LIZLLL).put("OMX.qcom.video.decoder.hevcswvdec", 20);
            ((TreeMap) LIZLLL).put("OMX.MTK.VIDEO.DECODER.HEVC", 100);
            ((TreeMap) LIZLLL).put("OMX.MTK.VIDEO.DECODER.AVC", 100);
            ((TreeMap) LIZLLL).put("OMX.Nvidia.h264.decode", 100);
            ((TreeMap) LIZLLL).put("OMX.Intel.hw_vd.h264", 100);
            ((TreeMap) LIZLLL).put("OMX.Intel.VideoDecoder.AVC", 99);
            ((TreeMap) LIZLLL).put("OMX.SEC.avc.dec", 100);
            ((TreeMap) LIZLLL).put("OMX.SEC.AVC.Decoder", 99);
            ((TreeMap) LIZLLL).put("OMX.SEC.avcdec", 98);
            ((TreeMap) LIZLLL).put("OMX.SEC.avc.sw.dec", 20);
            ((TreeMap) LIZLLL).put("OMX.SEC.hevc.sw.dec", 20);
            ((TreeMap) LIZLLL).put("OMX.Exynos.avc.dec", 100);
            ((TreeMap) LIZLLL).put("OMX.Exynos.AVC.Decoder", 99);
            ((TreeMap) LIZLLL).put("OMX.TI.DUCATI1.VIDEO.DECODER", 100);
            ((TreeMap) LIZLLL).put("OMX.rk.video_decoder.avc", 100);
            ((TreeMap) LIZLLL).put("OMX.amlogic.avc.decoder.awesome", 100);
            ((TreeMap) LIZLLL).put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", 100);
            ((TreeMap) LIZLLL).put("OMX.brcm.video.h264.hw.decoder", 40);
            ((TreeMap) LIZLLL).put("OMX.k3.video.decoder.avc", 40);
            ((TreeMap) LIZLLL).put("OMX.IMG.MSVDX.Decoder.AVC", 100);
            ((TreeMap) LIZLLL).put("OMX.hisi.video.decoder.avc", 100);
            ((TreeMap) LIZLLL).put("OMX.hisi.video.decoder.hevc", 100);
            ((TreeMap) LIZLLL).put("OMX.MARVELL.VIDEO.H264DECODER", 20);
            ((TreeMap) LIZLLL).put("OMX.sprd.soft.h264.decoder", 20);
            map = LIZLLL;
        }
        Integer num = map.get(name);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (mediaCodecInfo.getCapabilitiesForType(str) != null) {
                iIntValue = 70;
            } else {
                iIntValue = 60;
            }
        }
        C2280331ENj c2280331ENj = new C2280331ENj();
        c2280331ENj.LIZ = mediaCodecInfo;
        c2280331ENj.LIZJ = str;
        c2280331ENj.LIZIZ = iIntValue;
        return c2280331ENj;
    }
}
