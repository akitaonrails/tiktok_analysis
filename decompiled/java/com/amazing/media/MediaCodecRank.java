package com.amazing.media;

import android.media.MediaCodecInfo;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes36.dex */
public class MediaCodecRank {
    public static Map<String, Integer> LIZJ;
    public MediaCodecInfo LIZ;
    public int LIZIZ;

    public static MediaCodecRank LIZ(MediaCodecInfo mediaCodecInfo, String str) {
        int iIntValue;
        String name = mediaCodecInfo.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        Map<String, Integer> map = LIZJ;
        if (map == null) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            LIZJ = treeMap;
            treeMap.put("OMX.qcom.video.decoder.avc", 100);
            ((TreeMap) LIZJ).put("OMX.qcom.video.decoder.hevc", 100);
            ((TreeMap) LIZJ).put("OMX.qcom.video.decoder.hevcswvdec", 20);
            ((TreeMap) LIZJ).put("OMX.qcom.video.decoder.mpeg4", 100);
            ((TreeMap) LIZJ).put("OMX.qcom.video.decoder.mpeg2", 100);
            ((TreeMap) LIZJ).put("OMX.qcom.video.decoder.vp8", 100);
            ((TreeMap) LIZJ).put("OMX.qcom.video.decoder.vp9", 100);
            ((TreeMap) LIZJ).put("OMX.MTK.VIDEO.DECODER.HEVC", 100);
            ((TreeMap) LIZJ).put("OMX.MTK.VIDEO.DECODER.AVC", 100);
            ((TreeMap) LIZJ).put("OMX.MTK.VIDEO.DECODER.MPEG2", 100);
            ((TreeMap) LIZJ).put("OMX.MTK.VIDEO.DECODER.MPEG4", 100);
            ((TreeMap) LIZJ).put("OMX.MTK.VIDEO.DECODER.VP9", 100);
            ((TreeMap) LIZJ).put("OMX.MTK.VIDEO.DECODER.VPX", 100);
            ((TreeMap) LIZJ).put("OMX.Nvidia.h264.decode", 100);
            ((TreeMap) LIZJ).put("OMX.Intel.hw_vd.h264", 100);
            ((TreeMap) LIZJ).put("OMX.Intel.VideoDecoder.AVC", 99);
            ((TreeMap) LIZJ).put("OMX.SEC.avc.dec", 100);
            ((TreeMap) LIZJ).put("OMX.SEC.AVC.Decoder", 99);
            ((TreeMap) LIZJ).put("OMX.SEC.avcdec", 98);
            ((TreeMap) LIZJ).put("OMX.SEC.avc.sw.dec", 20);
            ((TreeMap) LIZJ).put("OMX.SEC.hevc.sw.dec", 20);
            ((TreeMap) LIZJ).put("OMX.SEC.mpeg4.dec", 100);
            ((TreeMap) LIZJ).put("OMX.SEC.mpeg2.dec", 100);
            ((TreeMap) LIZJ).put("OMX.SEC.vp8.dec", 100);
            ((TreeMap) LIZJ).put("OMX.SEC.vp9.dec", 100);
            ((TreeMap) LIZJ).put("OMX.Exynos.avc.dec", 100);
            ((TreeMap) LIZJ).put("OMX.Exynos.AVC.Decoder", 99);
            ((TreeMap) LIZJ).put("OMX.Exynos.MPEG4.Decoder", 100);
            ((TreeMap) LIZJ).put("OMX.Exynos.MPEG2.Decoder", 100);
            ((TreeMap) LIZJ).put("OMX.Exynos.VP8.Decoder", 100);
            ((TreeMap) LIZJ).put("OMX.Exynos.VP9.Decoder", 100);
            ((TreeMap) LIZJ).put("OMX.TI.DUCATI1.VIDEO.DECODER", 100);
            ((TreeMap) LIZJ).put("OMX.rk.video_decoder.avc", 100);
            ((TreeMap) LIZJ).put("OMX.amlogic.avc.decoder.awesome", 100);
            ((TreeMap) LIZJ).put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", 100);
            ((TreeMap) LIZJ).put("OMX.brcm.video.h264.hw.decoder", 40);
            ((TreeMap) LIZJ).put("OMX.k3.video.decoder.avc", 40);
            ((TreeMap) LIZJ).put("OMX.IMG.MSVDX.Decoder.AVC", 100);
            ((TreeMap) LIZJ).put("OMX.hisi.video.decoder.avc", 100);
            ((TreeMap) LIZJ).put("OMX.hisi.video.decoder.hevc", 100);
            ((TreeMap) LIZJ).put("OMX.hisi.video.decoder.mpeg4", 100);
            ((TreeMap) LIZJ).put("OMX.hisi.video.decoder.mpeg2", 100);
            ((TreeMap) LIZJ).put("OMX.hisi.video.decoder.vp8", 100);
            ((TreeMap) LIZJ).put("OMX.hisi.video.decoder.vp9", 100);
            ((TreeMap) LIZJ).put("OMX.MARVELL.VIDEO.H264DECODER", 20);
            ((TreeMap) LIZJ).put("OMX.sprd.soft.h264.decoder", 20);
            map = LIZJ;
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
        MediaCodecRank mediaCodecRank = new MediaCodecRank();
        mediaCodecRank.LIZ = mediaCodecInfo;
        mediaCodecRank.LIZIZ = iIntValue;
        return mediaCodecRank;
    }
}
