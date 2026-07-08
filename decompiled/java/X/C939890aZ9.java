package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicVoiceChatLayoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS203S0000000_15;
import org.json.JSONArray;
import org.json.JSONObject;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aZ9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939890aZ9 {
    public static final C465260IMi LIZ = new C465260IMi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(266));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(266));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(267));
    public static final C01GW LJ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(265));

    public static JSONObject LIZ() {
        return (JSONObject) LIZIZ.getValue();
    }

    public static JSONObject LIZIZ(Integer num) {
        Boolean boolValueOf;
        if (C500260Jjc.LJJIL() && LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage()) {
            return (JSONObject) LIZLLL.getValue();
        }
        if (!C930540aK4.LJJIJ()) {
            if (num != null) {
                boolValueOf = Boolean.valueOf(C933980aPc.LJIIIZ(num.intValue()));
            } else {
                boolValueOf = null;
            }
            if (!C500260Jjc.LJJJI(boolValueOf)) {
                return (JSONObject) LIZJ.getValue();
            }
        }
        return (JSONObject) LJ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJ(java.lang.String r4) {
        /*
            r2 = 0
            r3 = 0
            if (r4 == 0) goto Lb
            int r0 = r4.length()     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L11
            return r3
        L11:
            org.json.JSONObject r1 = LIZ()     // Catch: java.lang.Exception -> L2c
            java.lang.String r0 = "public_screen_align"
            org.json.JSONObject r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r1, r0)     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = r0.optString(r4)     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto L27
            int r0 = r1.length()     // Catch: java.lang.Exception -> L2c
            if (r0 != 0) goto L28
        L27:
            r2 = 1
        L28:
            if (r2 == 0) goto L2b
            return r3
        L2b:
            return r1
        L2c:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getPublicScreenAlignMode error="
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LayoutBizConfigController"
            X.C937310aUz.LJFF(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939890aZ9.LJ(java.lang.String):java.lang.String");
    }

    public static boolean LJFF(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    if (JSONObjectProtectorUtils.getJSONObject(LIZ(), "need_hide_blur_in_audience").optInt(str, 0) == 1) {
                        return true;
                    }
                    return false;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("needHideBlurInAudience error=");
                sbLIZ.append(e.getMessage());
                C937310aUz.LJFF("LayoutBizConfigController", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
        }
        return false;
    }

    public static boolean LJI(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    if (JSONObjectProtectorUtils.getJSONObject(LIZ(), "need_offset_bottom_toolbar").optInt(str, 0) == 1) {
                        return true;
                    }
                    return false;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("needOffsetBottomToolbar error=");
                sbLIZ.append(e.getMessage());
                C937310aUz.LJFF("LayoutBizConfigController", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ(org.json.JSONArray r7, tikcast.linkmic.common.PosIdentity r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939890aZ9.LIZJ(org.json.JSONArray, tikcast.linkmic.common.PosIdentity, boolean):java.util.List");
    }

    public static Pair LIZLLL(String str, EnumC939930aZD enumC939930aZD, PosIdentity posIdentity, boolean z, Integer num) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getMapOfViewElement windowId=");
            sbLIZ.append(str);
            sbLIZ.append(" layoutBizViewType=");
            sbLIZ.append(enumC939930aZD);
            C937310aUz.LIZLLL("LayoutBizConfigController", C2188811AlT.LIZIZ(sbLIZ));
            if (str != null && str.length() != 0) {
                String strOptString = JSONObjectProtectorUtils.getJSONObject(LIZ(), "window_style").optString(str);
                if (strOptString == null || strOptString.length() == 0) {
                    if (C931780aM4.LJFF(null) && LinkCoreModelKt.currentUserIsAnchor() && LinkmicVoiceChatLayoutSetting.INSTANCE.getValue().optNotMatchAnchor) {
                        strOptString = "grid_normal";
                    } else {
                        strOptString = null;
                    }
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getMapOfViewElement windowId=");
                sbLIZ2.append(str);
                sbLIZ2.append(" windowStyle=");
                sbLIZ2.append(strOptString);
                C937310aUz.LIZLLL("LayoutBizConfigController", C2188811AlT.LIZIZ(sbLIZ2));
                if (strOptString != null && strOptString.length() != 0) {
                    JSONObject jSONObjectOptJSONObject = LIZIZ(num).optJSONObject(strOptString);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("getMapOfViewElement windowId=");
                    sbLIZ3.append(str);
                    sbLIZ3.append(" object1=");
                    sbLIZ3.append(jSONObjectOptJSONObject);
                    C937310aUz.LIZLLL("LayoutBizConfigController", C2188811AlT.LIZIZ(sbLIZ3));
                    if (jSONObjectOptJSONObject == null) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("getMapOfViewElement windowId=");
                        sbLIZ4.append(str);
                        sbLIZ4.append(" object1 is empty");
                        C937310aUz.LIZLLL("LayoutBizConfigController", C2188811AlT.LIZIZ(sbLIZ4));
                        return null;
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(enumC939930aZD.getValue());
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("getMapOfViewElement windowId=");
                    sbLIZ5.append(str);
                    sbLIZ5.append(" object2=");
                    sbLIZ5.append(jSONObjectOptJSONObject2);
                    C937310aUz.LIZLLL("LayoutBizConfigController", C2188811AlT.LIZIZ(sbLIZ5));
                    if (jSONObjectOptJSONObject2 == null) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("getMapOfViewElement windowId=");
                        sbLIZ6.append(str);
                        sbLIZ6.append(" object2 is empty");
                        C937310aUz.LIZLLL("LayoutBizConfigController", C2188811AlT.LIZIZ(sbLIZ6));
                        return null;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    EnumC939920aZC enumC939920aZC = EnumC939920aZC.TOP_START;
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(enumC939920aZC.getValue());
                    if (jSONArrayOptJSONArray != null) {
                        linkedHashMap.put(enumC939920aZC, LIZJ(jSONArrayOptJSONArray, posIdentity, z));
                    }
                    EnumC939920aZC enumC939920aZC2 = EnumC939920aZC.TOP_START_SECOND;
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray(enumC939920aZC2.getValue());
                    if (jSONArrayOptJSONArray2 != null) {
                        linkedHashMap.put(enumC939920aZC2, LIZJ(jSONArrayOptJSONArray2, posIdentity, z));
                    }
                    EnumC939920aZC enumC939920aZC3 = EnumC939920aZC.TOP_START_THIRD;
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray(enumC939920aZC3.getValue());
                    if (jSONArrayOptJSONArray3 != null) {
                        linkedHashMap.put(enumC939920aZC3, LIZJ(jSONArrayOptJSONArray3, posIdentity, z));
                    }
                    EnumC939920aZC enumC939920aZC4 = EnumC939920aZC.TOP_UNDER_BANNER;
                    JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject2.optJSONArray(enumC939920aZC4.getValue());
                    if (jSONArrayOptJSONArray4 != null) {
                        linkedHashMap.put(enumC939920aZC4, LIZJ(jSONArrayOptJSONArray4, posIdentity, z));
                    }
                    EnumC939920aZC enumC939920aZC5 = EnumC939920aZC.TOP_UNDER_BANNER_SECOND;
                    JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject2.optJSONArray(enumC939920aZC5.getValue());
                    if (jSONArrayOptJSONArray5 != null) {
                        linkedHashMap.put(enumC939920aZC5, LIZJ(jSONArrayOptJSONArray5, posIdentity, z));
                    }
                    EnumC939920aZC enumC939920aZC6 = EnumC939920aZC.TOP_END;
                    JSONArray jSONArrayOptJSONArray6 = jSONObjectOptJSONObject2.optJSONArray(enumC939920aZC6.getValue());
                    if (jSONArrayOptJSONArray6 != null) {
                        linkedHashMap.put(enumC939920aZC6, LIZJ(jSONArrayOptJSONArray6, posIdentity, z));
                    }
                    EnumC939920aZC enumC939920aZC7 = EnumC939920aZC.FULL_CONTAINER;
                    JSONArray jSONArrayOptJSONArray7 = jSONObjectOptJSONObject2.optJSONArray(enumC939920aZC7.getValue());
                    if (jSONArrayOptJSONArray7 != null) {
                        linkedHashMap.put(enumC939920aZC7, LIZJ(jSONArrayOptJSONArray7, posIdentity, z));
                    }
                    EnumC939920aZC enumC939920aZC8 = EnumC939920aZC.FULL_OVERLAY;
                    JSONArray jSONArrayOptJSONArray8 = jSONObjectOptJSONObject2.optJSONArray(enumC939920aZC8.getValue());
                    if (jSONArrayOptJSONArray8 != null) {
                        linkedHashMap.put(enumC939920aZC8, LIZJ(jSONArrayOptJSONArray8, posIdentity, z));
                    }
                    EnumC939920aZC enumC939920aZC9 = EnumC939920aZC.BOTTOM_START;
                    JSONArray jSONArrayOptJSONArray9 = jSONObjectOptJSONObject2.optJSONArray(enumC939920aZC9.getValue());
                    if (jSONArrayOptJSONArray9 != null) {
                        linkedHashMap.put(enumC939920aZC9, LIZJ(jSONArrayOptJSONArray9, posIdentity, z));
                    }
                    EnumC939920aZC enumC939920aZC10 = EnumC939920aZC.BOTTOM_START_SECOND;
                    JSONArray jSONArrayOptJSONArray10 = jSONObjectOptJSONObject2.optJSONArray(enumC939920aZC10.getValue());
                    if (jSONArrayOptJSONArray10 != null) {
                        linkedHashMap.put(enumC939920aZC10, LIZJ(jSONArrayOptJSONArray10, posIdentity, z));
                    }
                    EnumC939920aZC enumC939920aZC11 = EnumC939920aZC.BOTTOM_END;
                    JSONArray jSONArrayOptJSONArray11 = jSONObjectOptJSONObject2.optJSONArray(enumC939920aZC11.getValue());
                    if (jSONArrayOptJSONArray11 != null) {
                        linkedHashMap.put(enumC939920aZC11, LIZJ(jSONArrayOptJSONArray11, posIdentity, z));
                    }
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("getMapOfViewElement windowId=");
                    sbLIZ7.append(str);
                    sbLIZ7.append(" result=");
                    sbLIZ7.append(linkedHashMap);
                    C937310aUz.LIZLLL("LayoutBizConfigController", C2188811AlT.LIZIZ(sbLIZ7));
                    return new Pair(strOptString, linkedHashMap);
                }
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("getMapOfViewElement windowId=");
                sbLIZ8.append(str);
                sbLIZ8.append("  windowStyle is empty");
                C937310aUz.LIZLLL("LayoutBizConfigController", C2188811AlT.LIZIZ(sbLIZ8));
                return null;
            }
            C937310aUz.LIZLLL("LayoutBizConfigController", "getMapOfViewElement windowId is empty");
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("getMapOfViewElement error=");
            sbLIZ9.append(e.getMessage());
            C937310aUz.LJFF("LayoutBizConfigController", C2188811AlT.LIZIZ(sbLIZ9));
            return null;
        }
    }
}
