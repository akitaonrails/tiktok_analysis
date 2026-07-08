package X;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS209S0000000_21;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mCR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387090mCR {
    public static final List<String> LIZ = C1697810uHb.LJIILJJIL("video_play", "video_play_finish", "play_time", "like", "post_comment", "favourite_video");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(72));
    public static final C2092608Hs<String, String> LIZJ = new C2092608Hs<>(20);

    public static final void LIZ(String str, Map<String, String> map) {
        boolean zContains;
        Long lLJIILIIL;
        String str2;
        String str3;
        String str4;
        if (map == null) {
            return;
        }
        if (C14TF.LIZIZ.LJJJJIZL(map.get("enter_from"))) {
            if (C18079076f.LIZ()) {
                zContains = ((Set) LIZIZ.getValue()).contains(str);
            } else {
                zContains = LIZ.contains(str);
            }
            if (zContains) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1877516040) {
                    if (iHashCode != -1617968008) {
                        if (iHashCode == -17674694 && str.equals("video_play_finish")) {
                            String str5 = map.get("process_id");
                            if (str5 != null && str5.length() > 0) {
                                C14FI.LIZ(str5);
                                return;
                            }
                            return;
                        }
                    } else if (str.equals("video_play")) {
                        String str6 = map.get("process_id");
                        if (str6 == null || str6.length() <= 0 || (str4 = map.get("group_id")) == null || str4.length() <= 0) {
                            return;
                        }
                        LIZJ.put(str4, str6);
                        return;
                    }
                } else if (str.equals("play_time")) {
                    String str7 = map.get("duration");
                    if (str7 == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str7)) == null || lLJIILIIL.longValue() < 10000 || (str2 = map.get("process_id")) == null || str2.length() <= 0) {
                        return;
                    }
                    C14FI.LIZ(str2);
                    return;
                }
                String str8 = map.get("group_id");
                if (str8 == null || str8.length() <= 0 || (str3 = LIZJ.get(str8)) == null || str3.length() <= 0) {
                    return;
                }
                C14FI.LIZ(str3);
            }
        }
    }

    public static final void LIZIZ(String str, JSONObject jSONObject) {
        boolean zContains;
        String str2;
        if (jSONObject == null) {
            return;
        }
        if (C14TF.LIZIZ.LJJJJIZL(jSONObject.optString("enter_from"))) {
            if (C18079076f.LIZ()) {
                zContains = ((Set) LIZIZ.getValue()).contains(str);
            } else {
                zContains = LIZ.contains(str);
            }
            if (zContains) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1877516040) {
                    if (iHashCode != -1617968008) {
                        if (iHashCode == -17674694 && str.equals("video_play_finish")) {
                            String strOptString = jSONObject.optString("process_id");
                            if (strOptString.length() > 0) {
                                C14FI.LIZ(strOptString);
                                return;
                            }
                            return;
                        }
                    } else if (str.equals("video_play")) {
                        String strOptString2 = jSONObject.optString("process_id");
                        if (strOptString2.length() <= 0) {
                            return;
                        }
                        String strOptString3 = jSONObject.optString("group_id");
                        if (strOptString3.length() <= 0) {
                            return;
                        }
                        LIZJ.put(strOptString3, strOptString2);
                        return;
                    }
                } else if (str.equals("play_time")) {
                    if (jSONObject.optLong("duration") < 10000) {
                        return;
                    }
                    String strOptString4 = jSONObject.optString("process_id");
                    if (strOptString4.length() <= 0) {
                        return;
                    }
                    C14FI.LIZ(strOptString4);
                    return;
                }
                String strOptString5 = jSONObject.optString("group_id");
                if (strOptString5.length() <= 0 || (str2 = LIZJ.get(strOptString5)) == null || str2.length() <= 0) {
                    return;
                }
                C14FI.LIZ(str2);
            }
        }
    }
}
