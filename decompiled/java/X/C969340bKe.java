package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableChannelBasedTrackSupportGroupChannelIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSEIPrecisionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkMultiguestOptimizeLinkmicSeiSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestShareBgOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3VideoSeiEndSetting;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0bKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969340bKe {
    public static int LJFF(C945320ahu c945320ahu) {
        int i;
        if (LinkMicMultiGuestShareBgOptSetting.INSTANCE.isEnable()) {
            i = -1;
        } else {
            i = 0;
        }
        if (c945320ahu == null) {
            return i;
        }
        LiveSeiStruct liveSeiStruct = c945320ahu.LIZ;
        if (liveSeiStruct != null) {
            SeiAppData seiAppData = liveSeiStruct.LIZ;
            if (seiAppData != null) {
                return seiAppData.version;
            }
            return i;
        }
        String str = c945320ahu.LIZIZ;
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("app_data")) {
                return i;
            }
            i = JSONObjectProtectorUtils.getInt(new JSONObject(JSONObjectProtectorUtils.getString(jSONObject, "app_data")), "ver");
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return i;
        }
    }

    public static boolean LJI(C945320ahu c945320ahu) {
        if (c945320ahu == null) {
            return false;
        }
        LiveSeiStruct liveSeiStruct = c945320ahu.LIZ;
        if (liveSeiStruct != null) {
            String str = liveSeiStruct.ttlsLiveScene;
            if (MultiGuestV3VideoSeiEndSetting.INSTANCE.enableSceneList().contains(str)) {
                return true;
            }
            return "video".equals(str);
        }
        String str2 = c945320ahu.LIZIZ;
        if (!TextUtils.isEmpty(str2)) {
            try {
                String string = JSONObjectProtectorUtils.getString(new JSONObject(str2), "ttls_live_scene");
                if (MultiGuestV3VideoSeiEndSetting.INSTANCE.enableSceneList().contains(string)) {
                    return true;
                }
                return "video".equals(string);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }

    public static SeiAppData LJII(C945320ahu c945320ahu) {
        String str;
        if (c945320ahu == null) {
            return null;
        }
        LiveSeiStruct liveSeiStruct = c945320ahu.LIZ;
        if (liveSeiStruct != null) {
            SeiAppData seiAppData = liveSeiStruct.LIZ;
            if (seiAppData == null && (str = c945320ahu.LIZIZ) != null && str.contains("app_data")) {
                return C473260IhA.LIZIZ(str);
            }
            return seiAppData;
        }
        return C473260IhA.LIZIZ(c945320ahu.LIZIZ);
    }

    public static double LJIIIZ(double d) {
        return new BigDecimal(d).setScale(4, RoundingMode.DOWN).doubleValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(org.json.JSONObject r6, com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r7) throws org.json.JSONException {
        /*
            r4 = 7
            java.lang.String r1 = "link_condition_v2"
            if (r7 != 0) goto L9
            r6.put(r1, r4)
        L8:
            return
        L9:
            int r5 = r7.allowRequestFromFriends
            r3 = 4
            if (r5 != r3) goto L1b
            int r0 = r7.allowRequestFromFollowers
            if (r0 != r3) goto L1b
            int r0 = r7.allowRequestFromOthers
            if (r0 != r3) goto L1b
            r0 = 0
            r6.put(r1, r0)
            return
        L1b:
            r2 = 3
            if (r5 != r3) goto L2b
            int r0 = r7.allowRequestFromFollowers
            if (r0 != r3) goto L69
            int r0 = r7.allowRequestFromOthers
            if (r0 != r2) goto L69
            r0 = 1
            r6.put(r1, r0)
            return
        L2b:
            if (r5 == r3) goto L69
            if (r5 == r3) goto L76
            if (r5 != r2) goto L3d
            int r0 = r7.allowRequestFromFollowers
            if (r0 != r3) goto L4f
            int r0 = r7.allowRequestFromOthers
            if (r0 != r3) goto L4f
            r6.put(r1, r3)
            return
        L3d:
            if (r5 == r2) goto L4f
            if (r5 == r2) goto L5c
            if (r5 != r2) goto L8
        L43:
            int r0 = r7.allowRequestFromFollowers
            if (r0 != r2) goto L8
            int r0 = r7.allowRequestFromOthers
            if (r0 != r2) goto L8
            r6.put(r1, r4)
            return
        L4f:
            int r0 = r7.allowRequestFromFollowers
            if (r0 != r3) goto L5c
            int r0 = r7.allowRequestFromOthers
            if (r0 != r2) goto L5c
            r0 = 5
            r6.put(r1, r0)
            return
        L5c:
            int r0 = r7.allowRequestFromFollowers
            if (r0 != r2) goto L43
            int r0 = r7.allowRequestFromOthers
            if (r0 != r3) goto L43
            r0 = 6
            r6.put(r1, r0)
            return
        L69:
            int r0 = r7.allowRequestFromFollowers
            if (r0 != r2) goto L76
            int r0 = r7.allowRequestFromOthers
            if (r0 != r3) goto L76
            r0 = 2
            r6.put(r1, r0)
            return
        L76:
            int r0 = r7.allowRequestFromFollowers
            if (r0 != r2) goto L8
            int r0 = r7.allowRequestFromOthers
            if (r0 != r2) goto L8
            r6.put(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C969340bKe.LIZ(org.json.JSONObject, com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings):void");
    }

    public static Object LJIIIIZZ(Class cls, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("app_data")) {
                    return C19748512Ol.LIZIZ.LJII(JSONObjectProtectorUtils.getString(jSONObject, "app_data"), cls);
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        return null;
    }

    public static JSONObject LIZLLL(C1275030jHh c1275030jHh, List<C1276580jKC> list, Map<String, Integer> map, Layout layout, String str, String str2, InterfaceC969870bLV interfaceC969870bLV, Map<String, Map<String, Object>> map2, int i) {
        List<PosIdentity> listLIZIZ;
        int iLJIIL;
        int i2;
        int iLIZLLL;
        int i3;
        int iLIZLLL2;
        int iLJIL;
        int i4;
        int i5;
        int i6;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ver", 16);
            jSONObject.put("timestamp", System.currentTimeMillis());
            if (c1275030jHh != null && !c1275030jHh.LIZLLL.equals("")) {
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(c1275030jHh.LIZLLL).optJSONObject("live_rtc_engine_config");
                    if (jSONObjectOptJSONObject != null) {
                        jSONObject.put("channel_id", jSONObjectOptJSONObject.optString("rtc_channel_id"));
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (i >= 0) {
                jSONObject.put("linker_arch_type", i);
            }
            JSONArray jSONArray = new JSONArray();
            for (C1276580jKC c1276580jKC : list) {
                if (c1276580jKC.LJIIJ) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("uid_str", c1276580jKC.LIZIZ);
                    String str3 = c1276580jKC.LJIIZILJ;
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject2.put("stream_id", str3);
                    jSONObject2.put("w", LJIIIZ(c1276580jKC.LJI));
                    jSONObject2.put("h", LJIIIZ(c1276580jKC.LJII));
                    jSONObject2.put("x", LJIIIZ(c1276580jKC.LJ));
                    jSONObject2.put("y", LJIIIZ(c1276580jKC.LJFF));
                    if (interfaceC969870bLV == null) {
                        iLJIIL = 0;
                    } else {
                        iLJIIL = interfaceC969870bLV.LJIIL(c1276580jKC.LIZIZ);
                    }
                    if (layout != null) {
                        i2 = layout.scene;
                    } else {
                        i2 = 0;
                    }
                    if (iLJIIL > 0) {
                        if (!LivesdkMultiguestOptimizeLinkmicSeiSetting.INSTANCE.enable(i2)) {
                            jSONObject2.put("talk_volume", iLJIIL);
                        }
                        if (interfaceC969870bLV == null) {
                            if (c1276580jKC.LJIIIZ) {
                                i6 = 1;
                            }
                            i6 = 0;
                        } else if (interfaceC969870bLV.LJJIII(c1276580jKC.LIZIZ)) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        jSONObject2.put("talk", i6);
                        iLIZLLL = 0;
                    } else {
                        if (!LivesdkMultiguestOptimizeLinkmicSeiSetting.INSTANCE.enable(i2)) {
                            iLIZLLL = 0;
                            jSONObject2.put("talk_volume", 0);
                        } else {
                            iLIZLLL = 0;
                        }
                        if (c1276580jKC.LJIIIZ) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        jSONObject2.put("talk", i3);
                    }
                    if (interfaceC969870bLV == null) {
                        iLIZLLL2 = 0;
                    } else {
                        iLIZLLL2 = interfaceC969870bLV.LIZLLL(c1276580jKC.LIZIZ);
                    }
                    jSONObject2.put("online_user_state", iLIZLLL2);
                    if (interfaceC969870bLV == null) {
                        iLJIL = 0;
                    } else {
                        iLJIL = interfaceC969870bLV.LJIL(c1276580jKC.LIZIZ);
                    }
                    if (iLJIL != 3 && iLJIL != 4) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                    jSONObject2.put("audio_occupied", i4);
                    if (iLJIL != 2 && iLJIL != 4) {
                        i5 = 0;
                    } else {
                        i5 = 1;
                    }
                    jSONObject2.put("mute_a", i5);
                    if (interfaceC969870bLV != null) {
                        iLIZLLL = interfaceC969870bLV.LIZLLL(c1276580jKC.LIZIZ);
                    }
                    jSONObject2.put("online_user_state", iLIZLLL);
                    if (map != null && map.containsKey(c1276580jKC.LIZIZ)) {
                        jSONObject2.put("p", map.get(c1276580jKC.LIZIZ));
                    }
                    jSONArray.put(jSONObject2);
                }
            }
            int iLJIIJJI = 0;
            jSONObject.put("grids", jSONArray);
            if (layout != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(Scene.SCENE_SERVICE, layout.scene);
                jSONObject3.put("version", layout.version);
                jSONObject3.put("layoutId", layout.layoutId);
                jSONObject3.put("sync_layout_id", str);
                jSONObject.put("DSLData", jSONObject3);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("anchor_link_mic_id", str2);
            }
            if (map2 != null) {
                jSONObject.put("business_extra_info", new JSONObject(map2));
            }
            if (interfaceC969870bLV != null) {
                iLJIIJJI = interfaceC969870bLV.LJIIJJI();
            }
            jSONObject.put("sub_scene", iLJIIJJI);
            if (interfaceC969870bLV != null && (listLIZIZ = interfaceC969870bLV.LIZIZ()) != null && !listLIZIZ.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<PosIdentity> it2 = listLIZIZ.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next().LJI());
                }
                jSONObject.put("zps", jSONArray2);
            }
            return jSONObject;
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(org.json.JSONObject r7, java.lang.String r8, java.lang.String r9, boolean r10, X.C1276580jKC r11, java.util.Map<java.lang.String, com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo> r12, java.util.Map<java.lang.String, X.C969350bKf> r13, java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, org.json.JSONObject>> r14, X.InterfaceC969870bLV r15, int r16, java.util.Map<java.lang.String, java.lang.Integer> r17) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C969340bKe.LJ(org.json.JSONObject, java.lang.String, java.lang.String, boolean, X.0jKC, java.util.Map, java.util.Map, java.util.HashMap, X.0bLV, int, java.util.Map):void");
    }

    public static JSONObject LIZIZ(C1275030jHh c1275030jHh, List<C1276580jKC> list, int i, int i2, Map<String, Integer> map, Layout layout, String str, Map<String, String> map2, String str2, InterfaceC969870bLV interfaceC969870bLV, Map<String, Map<String, Object>> map3, List<String> list2, float f, long j, int i3, String str3, HashMap<String, Map<String, JSONObject>> map4, String str4, Map<String, OnLineMicInfo> map5, List<PosIdentity> list3) {
        JSONObject jSONObjectLIZJ = LIZJ(c1275030jHh, list, i, i2, map, layout, str, map2, str2, interfaceC969870bLV, map3, list2, f, j, i3, str3, map4, str4, map5, list3, null, 0);
        if (LinkMicSEIPrecisionSetting.INSTANCE.enable() && jSONObjectLIZJ != null) {
            if (jSONObjectLIZJ.isNull("zoomed_position")) {
                jSONObjectLIZJ.remove("zoomed_position");
            }
            if (jSONObjectLIZJ.isNull("zoomed_linkmic_id")) {
                jSONObjectLIZJ.remove("zoomed_linkmic_id");
            }
            if (jSONObjectLIZJ.isNull("local_change_linkmic_ids")) {
                jSONObjectLIZJ.remove("local_change_linkmic_ids");
            }
        }
        return jSONObjectLIZJ;
    }

    public static JSONObject LIZJ(C1275030jHh c1275030jHh, List<C1276580jKC> list, int i, int i2, Map<String, Integer> map, Layout layout, String str, Map<String, String> map2, String str2, InterfaceC969870bLV interfaceC969870bLV, Map<String, Map<String, Object>> map3, List<String> list2, float f, long j, int i3, String str3, HashMap<String, Map<String, JSONObject>> map4, String str4, Map<String, OnLineMicInfo> map5, List<PosIdentity> list3, Map<String, C969350bKf> map6, int i4) {
        int i5;
        int i6;
        List<PosIdentity> listLIZIZ;
        try {
            JSONObject jSONObject = new JSONObject();
            int iLJIIJJI = 0;
            if (c1275030jHh == null) {
                i5 = 0;
            } else {
                i5 = c1275030jHh.LJJIJIIJIL;
            }
            jSONObject.put("ver", i5);
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("linker_mode", i4);
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = C924810aAp.LJ().LJJIII;
            if (multiLiveAnchorPanelSettings == null) {
                jSONObject.put("link_condition", 1);
            } else {
                int i7 = C924810aAp.LJ().LJJIII.allowViewerReq;
                int i8 = C924810aAp.LJ().LJJIII.onlyAllowFollowerReq;
                if (i7 == 3 && i8 == 4) {
                    jSONObject.put("link_condition", 1);
                } else {
                    int i9 = 3;
                    if (i7 == i9 && i8 == i9) {
                        jSONObject.put("link_condition", 2);
                    } else {
                        jSONObject.put("link_condition", i9);
                    }
                }
            }
            if (interfaceC969870bLV != null && interfaceC969870bLV.LJIIZILJ()) {
                LIZ(jSONObject, multiLiveAnchorPanelSettings);
            }
            if (c1275030jHh != null && !c1275030jHh.LIZLLL.equals("")) {
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(c1275030jHh.LIZLLL).optJSONObject("live_rtc_engine_config");
                    if (jSONObjectOptJSONObject != null) {
                        if (!str4.equals("") && !str4.equals("-1")) {
                            jSONObject.put("channel_id", str4);
                        } else {
                            jSONObject.put("channel_id", jSONObjectOptJSONObject.optString("rtc_channel_id"));
                        }
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (EnableChannelBasedTrackSupportGroupChannelIdSetting.INSTANCE.isEnable()) {
                jSONObject.put("group_channel_id", str3);
            }
            if (i3 >= 0) {
                jSONObject.put("linker_arch_type", i3);
            }
            if (layout == null) {
                i6 = -1;
            } else {
                i6 = layout.scene;
            }
            JSONArray jSONArray = new JSONArray();
            for (C1276580jKC c1276580jKC : list) {
                if (c1276580jKC.LJIIJ) {
                    JSONObject jSONObject2 = new JSONObject();
                    LJ(jSONObject2, c1276580jKC.LIZIZ, c1276580jKC.LJIIZILJ, c1276580jKC.LJIILLIIL, c1276580jKC, map5, map6, map4, interfaceC969870bLV, i6, map);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("grids", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", i);
            jSONObject3.put("height", i2);
            jSONObject3.put("background", "#303342");
            jSONObject.put("canvas", jSONObject3);
            if (j >= 0) {
                jSONObject.put("battle_id", j);
            }
            if (layout != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(Scene.SCENE_SERVICE, layout.scene);
                jSONObject4.put("version", layout.version);
                jSONObject4.put("layoutId", layout.layoutId);
                jSONObject4.put("sync_layout_id", str);
                jSONObject.put("DSLData", jSONObject4);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("anchor_link_mic_id", str2);
            }
            if (map2 != null && map2.containsKey("zoomed_linkmic_id") && !TextUtils.isEmpty(map2.get("zoomed_linkmic_id"))) {
                jSONObject.put("zoomed_linkmic_id", map2.get("zoomed_linkmic_id"));
            } else {
                jSONObject.put("zoomed_linkmic_id", "");
            }
            if (map2 != null && map2.containsKey("zoomed_position") && !TextUtils.isEmpty(map2.get("zoomed_position"))) {
                jSONObject.put("zoomed_position", map2.get("zoomed_position"));
            } else {
                jSONObject.put("zoomed_position", "");
            }
            if (list2 != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it2 = list2.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next());
                }
                jSONObject.put("local_change_linkmic_ids", jSONArray2);
            }
            if (f >= 0.0f) {
                jSONObject.put("container_offset_y", f);
            }
            if (map3 != null) {
                jSONObject.put("business_extra_info", new JSONObject(map3));
            }
            if (interfaceC969870bLV != null) {
                iLJIIJJI = interfaceC969870bLV.LJIIJJI();
            }
            jSONObject.put("sub_scene", iLJIIJJI);
            if (interfaceC969870bLV != null && (listLIZIZ = interfaceC969870bLV.LIZIZ()) != null && !listLIZIZ.isEmpty()) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator<PosIdentity> it3 = listLIZIZ.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(it3.next().LJI());
                }
                jSONObject.put("zps", jSONArray3);
            }
            if (list3 != null) {
                JSONArray jSONArray4 = new JSONArray();
                Iterator<PosIdentity> it4 = list3.iterator();
                while (it4.hasNext()) {
                    jSONArray4.put(it4.next().LJI());
                }
                jSONObject.put("ui_pos", jSONArray4);
            }
            return jSONObject;
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }
}
