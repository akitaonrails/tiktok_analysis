package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuickFollow;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yS4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858060yS4 {
    public static final String LIZLLL(C1856450yPT c1856450yPT) throws JSONException {
        String str;
        TakoQuickFollow next;
        List<TakoQuickFollow> list = c1856450yPT.LLILLJJLI.quickFollow;
        if (!list.isEmpty()) {
            Iterator<TakoQuickFollow> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.query, c1856450yPT.LIZ())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TakoQuickFollow takoQuickFollow = next;
            if (takoQuickFollow == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("group", takoQuickFollow.followGroup);
            jSONObject.put("query", takoQuickFollow.query);
            jSONObject.put("type", takoQuickFollow.followType);
            return C786410Ut5.J3(jSONObject);
        }
        Map<String, String> map = c1856450yPT.LLIZ;
        if (map == null || (str = map.get("followup_info")) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public static final int LIZJ(C1856450yPT c1856450yPT, Message message) {
        Integer numValueOf;
        TakoSug takoSug;
        TakoMixFeed takoMixFeedLJIIIZ;
        if (message != null && (takoMixFeedLJIIIZ = message.LJIIIZ()) != null && takoMixFeedLJIIIZ.cardType == 107) {
            return 204;
        }
        if (c1856450yPT != null && (takoSug = c1856450yPT.LLILLJJLI) != null && takoSug.isFirstSug) {
            return 204;
        }
        if (message != null) {
            TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
            if (takoMixFeedLJIIIZ2 != null) {
                numValueOf = Integer.valueOf(takoMixFeedLJIIIZ2.cardType);
            } else {
                numValueOf = null;
            }
            if (C0R2X.LIZ(numValueOf)) {
                return 218;
            }
            return 202;
        }
        return 202;
    }

    public static final Map<String, String> LIZ(C1856450yPT c1856450yPT, String str, String str2) {
        int iIntValue;
        String str3;
        Map<String, String> map;
        String str4;
        Map<? extends String, ? extends String> mapBuild;
        String str5;
        Map<String, String> map2;
        Pair[] pairArr = new Pair[8];
        TakoSug takoSug = c1856450yPT.LLILLJJLI;
        if (takoSug.sugShowType == 103 && takoSug.quickFollow.isEmpty()) {
            iIntValue = 17;
        } else {
            Integer num = takoSug.sugSource;
            if (num != null && num.intValue() != 0) {
                Integer num2 = takoSug.sugSource;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 0;
                }
            } else if (takoSug.isFirstSug) {
                iIntValue = 1;
            } else {
                iIntValue = 2;
            }
        }
        pairArr[0] = new Pair("source", String.valueOf(iIntValue));
        pairArr[1] = new Pair("rank", String.valueOf(c1856450yPT.LLILLL));
        String str6 = c1856450yPT.LLILLJJLI.replyUuid;
        if (str6 == null || str6.length() == 0) {
            str6 = "none";
        }
        pairArr[2] = new Pair("query_message_id", str6);
        pairArr[3] = new Pair("log_id", c1856450yPT.LLILLJJLI.LJ.LIZ);
        String str7 = c1856450yPT.LLILZLL;
        if (str7 == null) {
            str7 = "";
        }
        pairArr[4] = new Pair("sug_id", str7);
        if (c1856450yPT.LLILLJJLI.isFirstSug) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[5] = new Pair("is_session_first_round", str3);
        pairArr[6] = new Pair("engine_message_type", String.valueOf(c1856450yPT.LLILLJJLI.sugCardType));
        pairArr[7] = new Pair("interaction_name", c1856450yPT.LIZ());
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        Message message = c1856450yPT.LL.LLILLL;
        if (message != null) {
            mapLJIIJ.put("message_id", message.uuid);
            TakoMixFeed takoMixFeedLJIIIZ = c1856450yPT.LL.LLILLL.LJIIIZ();
            if (takoMixFeedLJIIIZ == null || (map2 = takoMixFeedLJIIIZ.msgExt) == null || (str5 = map2.get("log_id")) == null) {
                str5 = c1856450yPT.LLILLJJLI.LJ.LIZ;
            }
            mapLJIIJ.put("log_id", str5);
        }
        Map<String, String> map3 = c1856450yPT.LLILLJJLI.LJFF;
        if (map3 != null) {
            for (Map.Entry<String, String> entry : map3.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value.length() > 0) {
                    mapLJIIJ.put(key, value);
                }
            }
        }
        boolean zLIZJ = C1858070yS5.LIZJ(c1856450yPT.LLILLJJLI);
        if ((c1856450yPT.LLILLJJLI.isFirstSug || zLIZJ) && (map = c1856450yPT.LLIZ) != null) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                String key2 = entry2.getKey();
                String value2 = entry2.getValue();
                if (value2.length() > 0) {
                    mapLJIIJ.put(key2, value2);
                }
            }
        }
        String strLIZLLL = LIZLLL(c1856450yPT);
        if (strLIZLLL != null) {
            mapLJIIJ.put("followup_info", strLIZLLL);
        }
        TakoSug takoSug2 = c1856450yPT.LLILLJJLI;
        if (takoSug2.isFirstSug) {
            mapLJIIJ.put("impr_id", takoSug2.LJ.LIZ);
        }
        if (zLIZJ) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) mapLJIIJ;
            CharSequence charSequence = (CharSequence) linkedHashMap.get("impr_id");
            if ((charSequence == null || charSequence.length() == 0) && (str4 = (String) linkedHashMap.get("log_id")) != null && str4.length() > 0) {
                mapLJIIJ.put("impr_id", str4);
            }
            if (str != null && !a0.LJJJIL(str)) {
                if (a0.LJJJIL(str)) {
                    mapBuild = C2097608Jq.LJ();
                } else {
                    C13DA c13da = new C13DA();
                    C20235214Fq.LIZ.getClass();
                    String strLIZJ = C20235214Fq.LIZJ(str);
                    if (strLIZJ != null && (!a0.LJJJIL(strLIZJ))) {
                        c13da.put("group_id", strLIZJ);
                    }
                    String strLIZLLL2 = C20235214Fq.LIZLLL(str);
                    if (strLIZLLL2 != null && (!a0.LJJJIL(strLIZLLL2))) {
                        c13da.put("last_feed_group_id", strLIZLLL2);
                    }
                    mapBuild = c13da.build();
                }
                mapLJIIJ.putAll(mapBuild);
            }
        }
        String str8 = c1856450yPT.LLILLJJLI.LJIILL;
        if (str8 != null && str8.length() > 0) {
            str2 = str8;
        } else {
            if (str2 != null && str2.length() > 0) {
            }
            return mapLJIIJ;
        }
        mapLJIIJ.put("tako_session_id", str2);
        return mapLJIIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:295:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C1856450yPT r26, X.InterfaceC665370Q7z r27, android.view.View r28, com.ss.android.ugc.aweme.tako.ccl.model.api.Message r29, java.util.Map r30, java.lang.Long r31, int r32) {
        /*
            Method dump skipped, instruction units count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1858060yS4.LJ(X.0yPT, X.0Q7z, android.view.View, com.ss.android.ugc.aweme.tako.ccl.model.api.Message, java.util.Map, java.lang.Long, int):void");
    }
}
