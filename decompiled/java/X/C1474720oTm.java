package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0oTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474720oTm implements InterfaceC1469300oL2 {
    public static final Map<String, String> LIZ(Map<String, String> map) {
        SimVideoUrlModel simVideoUrlModelLIZIZ;
        C1474740oTo watchTimeInfo;
        C1473250oRP playTimeInfo;
        Map<String, String> groupPortraits;
        C1474730oTn c1474730oTn = C0NEL.LIZ;
        c1474730oTn.getClass();
        HashMap map2 = new HashMap();
        HashMap map3 = (HashMap) map;
        if (!map3.isEmpty()) {
            String str = (String) map3.get("from");
            String str2 = (String) map3.get("type");
            String str3 = (String) map3.get("name");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                if ("smart".equals(str) && c1474730oTn.LIZ != null) {
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        if ("one".equals(str2)) {
                            String portrait = c1474730oTn.LIZ.getPortrait(str3);
                            if (!TextUtils.isEmpty(portrait)) {
                                map2.put(str3, portrait);
                            }
                        } else if (str2.equals("group") && (groupPortraits = c1474730oTn.LIZ.getGroupPortraits(str3)) != null && !groupPortraits.isEmpty()) {
                            map2.putAll(groupPortraits);
                        }
                    }
                } else if ("video".equals(str)) {
                    String str4 = (String) map3.get("video_id");
                    if (!TextUtils.isEmpty(str4)) {
                        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && (simVideoUrlModelLIZIZ = C1474710oTl.LIZ.LIZIZ(str4)) != null) {
                            if ("one".equals(str2)) {
                                if ("play_time_prob_dist".equals(str3)) {
                                    C1473210oRL c1473210oRLLIZ = C1474730oTn.LIZ(str4);
                                    if (c1473210oRLLIZ != null && (playTimeInfo = c1473210oRLLIZ.getPlayTimeInfo()) != null) {
                                        map2.put("gamma", playTimeInfo.getGamma());
                                        map2.put("beta", playTimeInfo.getBeta());
                                        map2.put("eta", playTimeInfo.getEta());
                                    }
                                } else if ("estimate_posterior_watch_time".equals(str3)) {
                                    C1473210oRL c1473210oRLLIZ2 = C1474730oTn.LIZ(str4);
                                    if (c1473210oRLLIZ2 != null && (watchTimeInfo = c1473210oRLLIZ2.getWatchTimeInfo()) != null) {
                                        map2.put("paramA", watchTimeInfo.getParamA());
                                        map2.put("paramB", watchTimeInfo.getParamB());
                                        map2.put("paramC", watchTimeInfo.getParamC());
                                        map2.put("paramD", watchTimeInfo.getParamD());
                                        map2.put("threshold", String.valueOf(watchTimeInfo.getThreshold()));
                                    }
                                } else if ("video_business_value".equals(str3)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(simVideoUrlModelLIZIZ.getScCategory());
                                    sbLIZ.append("");
                                    map2.put("businessValue", C2188811AlT.LIZIZ(sbLIZ));
                                }
                            } else if ("group".equals(str2)) {
                                ((HashMap) c1474730oTn.LIZIZ).containsKey(str3);
                            }
                        }
                    }
                }
                Iterator it2 = map2.entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        }
        return map2;
    }
}
