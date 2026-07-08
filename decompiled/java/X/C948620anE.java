package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCompanionInviteDiagnosisEnableSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0anE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948620anE {
    public static volatile C948630anF LIZ;

    public static String LIZ(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJI(X.C974210bSV r31) {
        /*
            com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCompanionInviteDiagnosisEnableSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCompanionInviteDiagnosisEnableSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 != 0) goto L9
            return
        L9:
            r0 = r31
            java.util.List<X.0afh> r1 = r0.LIZLLL     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r5 = X.C13LP.LJJJLL(r1)     // Catch: java.lang.Throwable -> Lab
            X.0afh r5 = (X.C943950afh) r5     // Catch: java.lang.Throwable -> Lab
            if (r5 == 0) goto L42
            X.0ayO r4 = r5.LIZLLL     // Catch: java.lang.Throwable -> Lab
        L17:
            X.0anF r6 = new X.0anF     // Catch: java.lang.Throwable -> Lab
            if (r5 == 0) goto L27
            long r2 = r5.LIZ     // Catch: java.lang.Throwable -> Lab
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> Lab
            if (r7 != 0) goto L29
        L27:
            java.lang.String r7 = ""
        L29:
            X.0ayO r2 = X.C955540ayO.LJJJLIIL     // Catch: java.lang.Throwable -> Lab
            boolean r8 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r2)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r9 = r0.LJFF     // Catch: java.lang.Throwable -> Lab
            if (r4 == 0) goto L40
            int r2 = r4.LIZ     // Catch: java.lang.Throwable -> Lab
        L35:
            java.lang.String r10 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> Lab
            if (r5 == 0) goto L46
            boolean r2 = r5.LJ     // Catch: java.lang.Throwable -> Lab
            if (r2 != 0) goto L46
            goto L44
        L40:
            r2 = 0
            goto L35
        L42:
            r4 = 0
            goto L17
        L44:
            r11 = 1
            goto L4b
        L46:
            r11 = 0
            if (r5 != 0) goto L4b
            r12 = 0
            goto L4d
        L4b:
            boolean r12 = r5.LJFF     // Catch: java.lang.Throwable -> Lab
        L4d:
            boolean r13 = r0.LJIILIIL     // Catch: java.lang.Throwable -> Lab
            java.lang.Number r2 = r0.LJIILJJIL     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = "0"
            if (r2 == 0) goto L5b
            java.lang.String r14 = r2.toString()     // Catch: java.lang.Throwable -> Lab
            if (r14 != 0) goto L5c
        L5b:
            r14 = r3
        L5c:
            java.lang.Number r2 = r0.LJIILL     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto L66
            java.lang.String r15 = r2.toString()     // Catch: java.lang.Throwable -> Lab
            if (r15 != 0) goto L67
        L66:
            r15 = r3
        L67:
            java.lang.String r17 = ","
            r18 = 0
            r20 = 0
            r2 = 245(0xf5, float:3.43E-43)
            kotlin.jvm.internal.AFwS250S0000000_15 r22 = kotlin.jvm.internal.AFwS250S0000000_15.get$arr$(r2)     // Catch: java.lang.Throwable -> Lab
            r23 = 30
            r19 = r18
            r21 = r18
            r16 = r1
            java.lang.String r16 = X.C13LP.LJJLIIIJ(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r25 = ","
            r2 = 246(0xf6, float:3.45E-43)
            kotlin.jvm.internal.AFwS250S0000000_15 r30 = kotlin.jvm.internal.AFwS250S0000000_15.get$arr$(r2)     // Catch: java.lang.Throwable -> Lab
            r27 = r18
            r29 = r18
            r24 = r1
            r26 = r18
            r28 = r20
            r31 = r23
            java.lang.String r17 = X.C13LP.LJJLIIIJ(r24, r25, r26, r27, r28, r29, r30, r31)     // Catch: java.lang.Throwable -> Lab
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lab
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.LJIILLIIL     // Catch: java.lang.Throwable -> Lab
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lab
            r18 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> Lab
            X.C948620anE.LIZ = r6     // Catch: java.lang.Throwable -> Lab
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> Lab
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> Lab
            return
        Lab:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C948620anE.LJI(X.0bSV):void");
    }

    public static final void LIZIZ(String str, String str2, String str3) {
        LIZJ(str, "blocked", str2, str3, null);
    }

    public static final void LIZJ(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (!LiveCompanionInviteDiagnosisEnableSetting.INSTANCE.isEnable()) {
            return;
        }
        try {
            HashMap map2 = new HashMap();
            C948630anF c948630anF = LIZ;
            if (c948630anF != null) {
                map2.putAll(c948630anF.LJIIJJI);
            }
            if (map != null) {
                map2.putAll(map);
            }
            if (c948630anF != null) {
                map2.put("uid", c948630anF.LIZ);
                map2.put("isFriend", LIZ(c948630anF.LIZIZ));
                map2.put("enterFrom", c948630anF.LIZJ);
                map2.put("autoCohostSourceType", c948630anF.LIZLLL);
                map2.put("notOpenPanelWhenAutoCohostFailure", LIZ(c948630anF.LJ));
                map2.put("showAnimationForAutoCohostUser", LIZ(c948630anF.LJFF));
                map2.put("autoQuickCohostInvite", LIZ(c948630anF.LJI));
                map2.put("autoMatchScene", c948630anF.LJII);
                map2.put("autoMatchEntrance", c948630anF.LJIIIIZZ);
                map2.put("autoCohostUIDs", c948630anF.LJIIIZ);
                map2.put("autoCohostRoomIDs", c948630anF.LJIIJ);
            }
            LJFF(str, str2, str3, str4, map2);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJFF(String str, String str2, String str3, String str4, HashMap map) {
        map.put("stage", str);
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        map.put("target_type", str3);
        if (str4 != null && str4.length() != 0) {
            map.put("reason", str4);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_connection_invite_action_point_diagnosis");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static final void LIZLLL(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, String str5, String str6, String str7, String str8, Map<String, String> map, Map<String, String> map2) {
        if (!LiveCompanionInviteDiagnosisEnableSetting.INSTANCE.isEnable()) {
            return;
        }
        try {
            HashMap map3 = new HashMap();
            if (map != null) {
                map3.putAll(map);
            }
            if (map2 != null) {
                map3.putAll(map2);
            }
            map3.put("method", str3);
            map3.put("panel_type", str4);
            map3.put("should_send_invite", LIZ(z));
            map3.put("skip_match_mode_selection_panel", LIZ(z2));
            map3.put("is_rematch", LIZ(z3));
            map3.put("enter_from", str5);
            if (str7 != null) {
                map3.put("match_type", str7);
            }
            if (str8 != null) {
                map3.put("resolved_panel_type", str8);
            }
            LJFF(str, str2, "open_live_interaction", str6, map3);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
