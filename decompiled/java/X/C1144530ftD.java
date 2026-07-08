package X;

import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ftD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144530ftD {
    public static final String LIZIZ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 7 ? i != 8 ? i != 9 ? "unknown" : "vault_gloves" : "no3_booster" : "no2_booster" : "hammer" : "time_extending" : "magic_smokes" : "boosting_gloves";
    }

    public static final List<String> LIZJ(List<Integer> list) {
        ArrayList arrayList = new ArrayList(C13BV.INSTANCE);
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(LIZIZ(it2.next().intValue()));
        }
        return arrayList;
    }

    public static final void LJII(C1144880ftm c1144880ftm) {
        String str;
        Long lValueOf;
        String string;
        String str2;
        String strValueOf;
        C973660bRc c973660bRc = C973660bRc.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C973660bRc.LJIIZILJ(c973660bRc, linkedHashMap, false, false, null, 14);
        C973660bRc.LJJIIJZLJL(linkedHashMap);
        C973660bRc.LJIJ(c973660bRc, linkedHashMap, false, false, false, 12);
        linkedHashMap.put(C973660bRc.LJJ, String.valueOf(C973660bRc.LJJIJLIJ()));
        String str3 = C973660bRc.LJJII;
        if (C973660bRc.LJLLLL()) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap.put(str3, str);
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        Long lValueOf2 = null;
        if (interfaceC973730bRjYf2 != null) {
            lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL());
        } else {
            lValueOf = null;
        }
        linkedHashMap.put("pk_id", String.valueOf(lValueOf));
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null) {
            lValueOf2 = Long.valueOf(interfaceC973730bRjYf22.LJJL());
        }
        linkedHashMap.put("channel_id", String.valueOf(lValueOf2));
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        String str4 = "";
        if (interfaceC500940JkiUser == null || (string = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("user_id", string);
        if (c1144880ftm != null) {
            if (Intrinsics.LJFF(c1144880ftm.LJFF, "count_down")) {
                str2 = "countdown";
            } else {
                str2 = c1144880ftm.LJFF;
                if (str2 == null) {
                    str2 = "";
                }
            }
            linkedHashMap.put("trigger_type", str2);
            String str5 = c1144880ftm.LJI;
            if (str5 != null) {
                str4 = str5;
            }
            linkedHashMap.put("notification_request_id", str4);
            int i = (int) (c1144880ftm.LIZIZ / ((long) 10000));
            if (i != 7 && i != 8) {
                EnumC1144450ft5.Companion.getClass();
                strValueOf = String.valueOf(C1144460ft6.LIZ(i));
            } else {
                strValueOf = "no2_no3_booster";
            }
            linkedHashMap.put("match_item_type", strValueOf);
        }
        LIZ(c973660bRc, linkedHashMap);
        String strLIZIZ = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
        if (strLIZIZ == null) {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
        }
        if (C970370bMJ.LJII()) {
            C973660bRc.LJZ(c973660bRc, "livesdk_match_item_guide_click", linkedHashMap, strLIZIZ);
        } else {
            C973660bRc.LJZI(c973660bRc, "livesdk_match_item_guide_click", linkedHashMap, strLIZIZ);
        }
    }

    public static final void LJIIIIZZ(C1144880ftm c1144880ftm) {
        String str;
        Long lValueOf;
        String string;
        String str2;
        String strValueOf;
        C973660bRc c973660bRc = C973660bRc.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C973660bRc.LJIIZILJ(c973660bRc, linkedHashMap, false, false, null, 14);
        C973660bRc.LJJIIJZLJL(linkedHashMap);
        C973660bRc.LJIJ(c973660bRc, linkedHashMap, false, false, false, 12);
        linkedHashMap.put(C973660bRc.LJJ, String.valueOf(C973660bRc.LJJIJLIJ()));
        String str3 = C973660bRc.LJJII;
        if (C973660bRc.LJLLLL()) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap.put(str3, str);
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        Long lValueOf2 = null;
        if (interfaceC973730bRjYf2 != null) {
            lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL());
        } else {
            lValueOf = null;
        }
        linkedHashMap.put("pk_id", String.valueOf(lValueOf));
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null) {
            lValueOf2 = Long.valueOf(interfaceC973730bRjYf22.LJJL());
        }
        linkedHashMap.put("channel_id", String.valueOf(lValueOf2));
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        String str4 = "";
        if (interfaceC500940JkiUser == null || (string = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("user_id", string);
        if (c1144880ftm != null) {
            if (Intrinsics.LJFF(c1144880ftm.LJFF, "count_down")) {
                str2 = "countdown";
            } else {
                str2 = c1144880ftm.LJFF;
                if (str2 == null) {
                    str2 = "";
                }
            }
            linkedHashMap.put("trigger_type", str2);
            String str5 = c1144880ftm.LJI;
            if (str5 != null) {
                str4 = str5;
            }
            linkedHashMap.put("notification_request_id", str4);
            int i = (int) (c1144880ftm.LIZIZ / ((long) 10000));
            if (i != 7 && i != 8) {
                EnumC1144450ft5.Companion.getClass();
                strValueOf = String.valueOf(C1144460ft6.LIZ(i));
            } else {
                strValueOf = "no2_no3_booster";
            }
            linkedHashMap.put("match_item_type", strValueOf);
        }
        LIZ(c973660bRc, linkedHashMap);
        String strLIZIZ = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
        if (strLIZIZ == null) {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
        }
        if (C970370bMJ.LJII()) {
            C973660bRc.LJZ(c973660bRc, "livesdk_match_item_guide_show", linkedHashMap, strLIZIZ);
        } else {
            C973660bRc.LJZI(c973660bRc, "livesdk_match_item_guide_show", linkedHashMap, strLIZIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(C973660bRc c973660bRc, Map<String, String> map) {
        List<TeamUsersInfo> listLJJJ;
        c973660bRc.getClass();
        Map<String, String> map2 = C973660bRc.LJLJLLL;
        String str = C973660bRc.LJJIII;
        String str2 = (String) ((LinkedHashMap) map2).get(str);
        int size = 1;
        if (str2 != null && !a0.LJJJIL(str2)) {
            Object obj = ((LinkedHashMap) C973660bRc.LJLJLLL).get(str);
            if (obj == null) {
                obj = "1";
            }
            map.put(str, obj);
            return;
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null && (listLJJJ = interfaceC973730bRjYf2.LJJJ()) != null) {
            for (TeamUsersInfo teamUsersInfo : listLJJJ) {
                if (teamUsersInfo.userIds.contains(Long.valueOf(C973660bRc.LJJIJLIJ()))) {
                    size = teamUsersInfo.userIds.size();
                }
            }
        }
        map.put(C973660bRc.LJJIII, String.valueOf(size));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b A[PHI: r1
      0x000b: PHI (r1v1 com.bytedance.android.livesdkapi.depend.model.live.match.CommunityHeartMeInfo) = 
      (r1v0 com.bytedance.android.livesdkapi.depend.model.live.match.CommunityHeartMeInfo)
      (r1v4 com.bytedance.android.livesdkapi.depend.model.live.match.CommunityHeartMeInfo)
     binds: [B:3:0x0003, B:5:0x0009] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIZ(java.util.Map<java.lang.String, java.lang.String> r4, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE r5) {
        /*
            X.0bRc r0 = X.C973660bRc.LIZ
            r1 = 0
            if (r5 == 0) goto Lb
            com.bytedance.android.livesdkapi.depend.model.live.match.CommunityHeartMeInfo r1 = r5.LIZIZ
            java.lang.String r0 = r5.LIZJ
            if (r0 != 0) goto Ld
        Lb:
            java.lang.String r0 = ""
        Ld:
            java.lang.Long r0 = X.C973660bRc.LJLLL(r1, r0)
            if (r0 == 0) goto L20
            long r2 = r0.longValue()
            java.lang.String r1 = "anchor_community_level"
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r4.put(r1, r0)
        L20:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1144530ftD.LJIIIZ(java.util.Map, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(int r17, java.lang.String r18, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE r19) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1144530ftD.LJFF(int, java.lang.String, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(com.bytedance.ies.sdk.datachannel.DataChannel r23, int r24, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE r25, boolean r26, boolean r27, boolean r28) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1144530ftD.LIZLLL(com.bytedance.ies.sdk.datachannel.DataChannel, int, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(com.bytedance.ies.sdk.datachannel.DataChannel r16, int r17, java.lang.String r18, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE r19, boolean r20, java.lang.String r21, int r22) {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1144530ftD.LJI(com.bytedance.ies.sdk.datachannel.DataChannel, int, java.lang.String, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, boolean, java.lang.String, int):void");
    }
}
