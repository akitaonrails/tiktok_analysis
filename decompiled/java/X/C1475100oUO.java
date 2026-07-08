package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oUO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475100oUO {
    public static Map LIZ(Map map) {
        String str;
        HashMap map2 = new HashMap();
        if (C582130MsN.LIZ().getConfig().getCommonConfig().isUseLastNetworkSpeed()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("config_quality", String.valueOf(1));
        map2.put("use_last_network_speed", str);
        map2.put("internet_speed", String.valueOf(map.get("internet_speed")));
        map2.put("gear_client_portrait", String.valueOf(map.get("gear_client_portrait")));
        int iLJIIJ = C1474810oTv.LJIIJ();
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) map.get("sim_video_url_model");
        float f = 1.0f;
        if (simVideoUrlModel != null && !TextUtils.isEmpty(simVideoUrlModel.getMeta())) {
            try {
                String strOptString = C1473210oRL.from(simVideoUrlModel.getMeta()).getJson().optString("qprf", String.valueOf(1.0f));
                if (!TextUtils.isEmpty(strOptString)) {
                    f = CastFloatProtector.parseFloat(strOptString);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
        String sourceId = simVideoUrlModel.getSourceId();
        c1477400oY6.getClass();
        if (!TextUtils.isEmpty(sourceId)) {
            c1477400oY6.LJIIZILJ.put(sourceId, Float.valueOf(f));
        }
        map2.put("curve_adjust_mode", String.valueOf(iLJIIJ));
        map2.put("curve_adjust_factor", String.valueOf(f));
        if (C1476990oXR.LIZLLL == null) {
            C1476990oXR.LIZLLL = Integer.valueOf(C582130MsN.LIZ().getConfig().getCommonConfig().getLastNetworkSpeed());
        }
        Integer num = C1476990oXR.LIZLLL;
        if (num != null) {
            map2.put("initial_speed", num.toString());
        }
        if (map.containsKey("bitrate_curve")) {
            InterfaceC1475360oUo interfaceC1475360oUo = (InterfaceC1475360oUo) map.get("bitrate_curve");
            map2.put("dynamic_curve", "param_a=" + interfaceC1475360oUo.LIZLLL() + "&param_b=" + interfaceC1475360oUo.LIZJ() + "&param_c=" + interfaceC1475360oUo.LJ() + "&param_d=" + interfaceC1475360oUo.LIZIZ() + "&min_bitrate=" + interfaceC1475360oUo.LIZ());
        }
        return map2;
    }

    public static C1469920oM2 LIZIZ(Map map) {
        String urlKey;
        List<String> urlList;
        List<SimAudioBitrate> listLIZ;
        String translationTargetLanguageCode;
        String languageCode;
        String str;
        String format;
        C1474540oTU c1474540oTULIZ;
        String str2;
        String urlKey2;
        C1474540oTU c1474540oTULIZ2;
        String vmaf;
        String gearVQM;
        List<String> listUrlList;
        int audioBitrate;
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) map.get("sim_video_url_model");
        List<SimBitRate> list = (List) map.get("sim_bitrate_list");
        if (simVideoUrlModel == null) {
            return null;
        }
        C1469930oM3 c1469930oM3 = new C1469930oM3();
        if (C1474810oTv.LLJL()) {
            c1469930oM3.LJIIJ = simVideoUrlModel.getShouldPlayTranslatedAudio();
        }
        if ((C1474810oTv.LJLJJI() && TextUtils.isEmpty(simVideoUrlModel.getSourceId())) || (C1474810oTv.LJLZ() && simVideoUrlModel.hasDashBitrate())) {
            c1469930oM3.LIZJ(simVideoUrlModel.getOriginUri());
        } else {
            c1469930oM3.LIZJ(simVideoUrlModel.getSourceId());
        }
        if (simVideoUrlModel.hasDashBitrate()) {
            c1469930oM3.LIZJ = simVideoUrlModel.getAdaptive();
            c1469930oM3.LJIIIZ = simVideoUrlModel.getVidProfileLabels();
            c1469930oM3.LJIIIIZZ = simVideoUrlModel.getDidProfileLabels();
            c1469930oM3.LJIIJJI = simVideoUrlModel.getTransParams();
        }
        c1469930oM3.LIZIZ = ((int) simVideoUrlModel.getDuration()) / LSPassThroughRecordSizeConfig.DEFAULT;
        if (C1474810oTv.LLJJIJI()) {
            c1469930oM3.LJFF = simVideoUrlModel.getScCategory();
        }
        int i = 0;
        String str3 = "mp3";
        String str4 = "dash";
        if (list != null && list.size() != 0) {
            for (SimBitRate simBitRate : list) {
                if (C1474810oTv.LJLZ() && simVideoUrlModel.hasDashBitrate()) {
                    if (simBitRate.getPlayAddr() == null) {
                        str2 = "dash";
                    } else {
                        urlKey2 = simBitRate.getPlayAddr().getFileHash();
                        str2 = "dash";
                    }
                } else if (simBitRate.urlList() == null || simBitRate.urlList().size() <= 0 || ListProtector.get(simBitRate.urlList(), i) == null) {
                    str2 = "";
                    urlKey2 = "";
                } else {
                    if (!((String) ListProtector.get(simBitRate.urlList(), i)).endsWith("mp4") && ((String) ListProtector.get(simBitRate.urlList(), i)).endsWith("mp3")) {
                        str2 = "mp3";
                    } else {
                        str2 = "mp4";
                    }
                    urlKey2 = simBitRate.getUrlKey() != null ? simBitRate.getUrlKey() : "";
                }
                if (simBitRate.urlList() != null && simBitRate.urlList().size() > 0) {
                    String audioFileId = simBitRate.getAudioFileId();
                    C1474550oTV c1474550oTV = new C1474550oTV();
                    c1474550oTV.LIZ = i;
                    c1474550oTV.LJIILJJIL = simBitRate.getGearName();
                    c1474550oTV.LJIIL = "normal";
                    c1474550oTV.LJIILIIL = String.valueOf(simBitRate.getQualityType());
                    c1474550oTV.LJIIJ = str2;
                    c1474550oTV.LIZIZ = simVideoUrlModel.getWidth();
                    c1474550oTV.LIZJ = simVideoUrlModel.getHeight();
                    c1474550oTV.LJIIJJI = EnumC2281151EQn.Undefine;
                    c1474550oTV.LIZLLL = simBitRate.getBitRate();
                    c1474550oTV.LJIIIZ = C1475940oVk.LIZ(simBitRate.getCodecType());
                    c1474550oTV.LJFF = simBitRate.getSize();
                    c1474550oTV.LJI = simVideoUrlModel.getCdnUrlExpired();
                    c1474550oTV.LJIILL = simVideoUrlModel.getaK();
                    c1474550oTV.LJII = urlKey2;
                    c1474550oTV.LJIIIIZZ = simBitRate.getChecksum();
                    if (audioFileId == null) {
                        audioFileId = "";
                    }
                    c1474550oTV.LJIJJLI = audioFileId;
                    if (simBitRate.getSimVideoExtra() == null) {
                        vmaf = "";
                    } else {
                        vmaf = simBitRate.getSimVideoExtra().getVmaf();
                    }
                    c1474550oTV.LJIILLIIL = vmaf;
                    if (simBitRate.getSimVideoExtra() == null) {
                        gearVQM = "";
                    } else {
                        gearVQM = simBitRate.getSimVideoExtra().getGearVQM();
                    }
                    c1474550oTV.LJIIZILJ = gearVQM;
                    if (C790030Uyv.LIZ.LJIILIIL == 1) {
                        listUrlList = Collections.emptyList();
                    } else {
                        listUrlList = simBitRate.urlList();
                    }
                    c1474550oTV.LJIJI = listUrlList;
                    simVideoUrlModel.getSourceId();
                    if (C1474810oTv.LLJL() && str2.equals("mp4") && simVideoUrlModel.getSimAudios() != null && !simVideoUrlModel.getSimAudios().isEmpty()) {
                        if (simBitRate.getSimVideoExtra() != null) {
                            audioBitrate = simBitRate.getSimVideoExtra().getAudioBitrate();
                        } else {
                            audioBitrate = 0;
                        }
                        c1474550oTV.LJ = audioBitrate;
                    }
                    c1474540oTULIZ2 = c1474550oTV.LIZ();
                } else {
                    c1474540oTULIZ2 = null;
                }
                c1469930oM3.LIZ(c1474540oTULIZ2);
                i = 0;
            }
            if (C1474810oTv.LLJL() && simVideoUrlModel.getSimAudios() != null && !simVideoUrlModel.getSimAudios().isEmpty() && (listLIZ = C1476770oX5.LIZ(simVideoUrlModel.getSimAudios())) != null && (translationTargetLanguageCode = simVideoUrlModel.getTranslationTargetLanguageCode()) != null) {
                for (SimAudioBitrate simAudioBitrate : (ArrayList) listLIZ) {
                    if (simAudioBitrate.getAudioMeta() != null && (languageCode = simAudioBitrate.getAudioMeta().getLanguageCode()) != null && translationTargetLanguageCode.equals(languageCode)) {
                        if (simVideoUrlModel.hasDashBitrate()) {
                            str = "dash";
                        } else {
                            str = "mp4";
                        }
                        if (simAudioBitrate.getAudioMeta() != null) {
                            format = simAudioBitrate.getAudioMeta().getFormat();
                        } else {
                            format = null;
                        }
                        if (str.equals(format) && (c1474540oTULIZ = C1474590oTZ.LIZ(simVideoUrlModel, simAudioBitrate, true)) != null) {
                            c1469930oM3.LIZ(c1474540oTULIZ);
                        }
                    }
                }
            }
            if (simVideoUrlModel.hasDashBitrate()) {
                Iterator<SimAudioBitrate> it2 = simVideoUrlModel.getAudioBitrate().iterator();
                while (it2.hasNext()) {
                    c1469930oM3.LIZ(C1474590oTZ.LIZ(simVideoUrlModel, it2.next(), false));
                }
            }
            return c1469930oM3.LIZIZ();
        }
        if (C1474810oTv.LJLZ() && simVideoUrlModel.hasDashBitrate()) {
            urlKey = simVideoUrlModel.getFileHash();
        } else if (simVideoUrlModel.getUrlList() == null || simVideoUrlModel.getUrlList().size() <= 0 || ListProtector.get(simVideoUrlModel.getUrlList(), 0) == null) {
            urlKey = "";
            str4 = "";
        } else {
            if (((String) ListProtector.get(simVideoUrlModel.getUrlList(), 0)).endsWith("mp4")) {
                str3 = "mp4";
            } else if (!((String) ListProtector.get(simVideoUrlModel.getUrlList(), 0)).endsWith("mp3")) {
                str3 = "";
            }
            if (simVideoUrlModel.getUrlKey() == null) {
                urlKey = "";
            } else {
                urlKey = simVideoUrlModel.getUrlKey();
            }
            str4 = str3;
        }
        C1474550oTV c1474550oTV2 = new C1474550oTV();
        c1474550oTV2.LIZ = 0;
        c1474550oTV2.LJIILJJIL = "";
        c1474550oTV2.LJIIL = "normal";
        c1474550oTV2.LJIILIIL = "";
        c1474550oTV2.LJIIJ = str4;
        c1474550oTV2.LIZIZ = simVideoUrlModel.getWidth();
        c1474550oTV2.LIZJ = simVideoUrlModel.getHeight();
        c1474550oTV2.LJIIJJI = EnumC2281151EQn.Undefine;
        c1474550oTV2.LIZLLL = -1L;
        c1474550oTV2.LJIIIZ = C1475940oVk.LIZ(0);
        c1474550oTV2.LJFF = simVideoUrlModel.getSize();
        c1474550oTV2.LJI = simVideoUrlModel.getCdnUrlExpired();
        c1474550oTV2.LJIILL = simVideoUrlModel.getaK();
        c1474550oTV2.LJII = urlKey;
        c1474550oTV2.LJIIIIZZ = simVideoUrlModel.getFileCheckSum();
        c1474550oTV2.LJIILLIIL = "";
        c1474550oTV2.LJIIZILJ = "";
        if (C790030Uyv.LIZ.LJIILIIL == 1) {
            urlList = Collections.emptyList();
        } else {
            urlList = simVideoUrlModel.getUrlList();
        }
        c1474550oTV2.LJIJI = urlList;
        c1469930oM3.LIZ(c1474550oTV2.LIZ());
        return c1469930oM3.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1476840oXC LIZJ(java.util.List r9, java.util.Map r10) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1475100oUO.LIZJ(java.util.List, java.util.Map):X.0oXC");
    }
}
