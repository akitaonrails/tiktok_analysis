package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;
import webcast.api.pgc_sub.PGCTemplateListData;

/* JADX INFO: renamed from: X.0KC9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KC9 {
    public static final C0KC9 LIZ = new C0KC9();

    public static C0KLA LIZJ(C0KCC c0kcc, Boolean bool) {
        boolean zBooleanValue;
        if (c0kcc != null) {
            String str = c0kcc.LIZ;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = c0kcc.LIZLLL;
            }
            return new C0KLA(str, zBooleanValue, c0kcc.LJ, c0kcc.LJFF, c0kcc.LJJIIZI, c0kcc.LJJIJ, false, null, c0kcc.LJI, null, new C0KLD() { // from class: X.0KCO
                @Override // X.C0KLD
                public final void LIZ(int i, String str2) {
                }

                @Override // X.C0KLD
                public final void LIZIZ() {
                }

                @Override // X.C0KLD
                public final void LIZJ(String str2) {
                }

                @Override // X.C0KLD
                public final void LIZLLL(long j, PGCTemplateListData pGCTemplateListData) {
                }

                @Override // X.C0KLD
                public final void LJ(int i, int i2, String str2, C0KCK c0kck) {
                }

                @Override // X.C0KLD
                public final void LJFF(Map<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>> map, C0KCK c0kck) {
                }
            }, null, c0kcc.LJJIJIIJI, false, c0kcc.LIZIZ, c0kcc.LJII, 96960);
        }
        return null;
    }

    public static CharSequence LIZIZ(Context context, Context context2, Function0 function0) {
        String strLJII;
        int length;
        int iLJI = C0K7G.LJI("giftsub_region_terms", 2);
        if (iLJI != 0) {
            if (iLJI != 1) {
                strLJII = C511520K4g.LJII(2131839641);
            } else {
                strLJII = C511520K4g.LJII(2131839643);
            }
        } else {
            strLJII = C511520K4g.LJII(2131839642);
        }
        int length2 = 0;
        String strLJIIIIZZ = C511520K4g.LJIIIIZZ(2131839644, strLJII);
        if (context2 == null && context == null) {
            if (strLJIIIIZZ == null) {
                return "";
            }
            return strLJIIIIZZ;
        }
        if (strLJIIIIZZ != null) {
            length = strLJIIIIZZ.length();
        } else {
            length = 0;
        }
        if (strLJII != null) {
            length2 = strLJII.length();
        }
        return C510740K1g.LIZ(strLJIIIIZZ, 61, new C0KCL(length - (length2 + 1), length, context, function0, context2));
    }

    public static void LIZLLL(C0KCC c0kcc, Boolean bool, Context context) {
        boolean z;
        String strOptString;
        Boolean boolValueOf;
        C0K77 c0k77C3;
        if (c0kcc == null) {
            return;
        }
        try {
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null && (c0k77C3 = iLiveOuterService.C3()) != null) {
                boolValueOf = Boolean.valueOf(c0k77C3.LJII(new JSONObject()));
            } else {
                boolValueOf = null;
            }
            C189200o6.m2constructorimpl(boolValueOf);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (c0kcc.LJIJJLI > 0 || Intrinsics.LJFF(bool, Boolean.TRUE)) {
            if (c0kcc.LJIJJLI != 2 && !Intrinsics.LJFF(bool, Boolean.TRUE)) {
                z = false;
            } else {
                z = true;
            }
            String str = "";
            if (z) {
                strOptString = C0K7G.LJIILJJIL().optString("subscribe_state_scheme", "");
                if (strOptString.length() == 0) {
                    strOptString = "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_subscription%2Fpages%2Fuser%2Fsubscribe%2Fstate.js&should_full_screen=1&hide_nav_bar=1&hide_status_bar=0&hide_loading=1&trans_status_bar=0&use_spark=1&bd_hybrid_monitor_bid=tiktok_live_revenue%2Fsubscription";
                }
            } else {
                strOptString = C0K7G.LJIILJJIL().optString("user_subscribe_state_five_split", "");
            }
            C495520Jby c495520Jby = new C495520Jby(strOptString);
            c495520Jby.LIZJ("anchor_id", c0kcc.LIZ);
            c495520Jby.LIZJ("log_anchor_id", c0kcc.LIZ);
            c495520Jby.LIZJ("sec_anchor_id", c0kcc.LIZ);
            c495520Jby.LIZJ("subscribe_state", C0KBJ.SUBSCRIBED_NOT_EXPIRED.getState());
            c495520Jby.LIZJ("show_entrance", "subscription_succeed");
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                str = "homepage";
            }
            c495520Jby.LIZJ("enter_type", str);
            c495520Jby.LIZJ("previous_page", "live_subscription_user_template");
            c495520Jby.LIZIZ(System.currentTimeMillis(), "click_time");
            c495520Jby.LIZJ("room_id", c0kcc.LJIILLIIL);
            c495520Jby.LIZJ("show_entrance", c0kcc.LJII);
            c495520Jby.LIZJ("privilege_show_type", c0kcc.LJIILJJIL);
            c495520Jby.LIZJ("privilege_page", c0kcc.LJIILL);
            c495520Jby.LIZJ("show_entrance", c0kcc.LJII);
            c495520Jby.LIZJ("from_sub_enter", c0kcc.LJIIL);
            c495520Jby.LIZJ("current_page", "user_template");
            c495520Jby.LIZ(Intrinsics.LJFF(c0kcc.LIZJ, "sub_change_price_email") ? 1 : 0, "is_price_change");
            String strLIZLLL = c495520Jby.LIZLLL();
            strLIZLLL.toString();
            C510690K1b.LIZ(C0K51.LJIIJ(context, true), strLIZLLL, null);
        }
    }

    public static void LJ(Context context, String str, boolean z, Integer num) {
        Boolean boolValueOf;
        C0K77 c0k77C3;
        if (context == null) {
            return;
        }
        try {
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null && (c0k77C3 = iLiveOuterService.C3()) != null) {
                boolValueOf = Boolean.valueOf(c0k77C3.LJIIIZ(context, str, z, num));
            } else {
                boolValueOf = null;
            }
            C189200o6.m2constructorimpl(boolValueOf);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(java.lang.Integer r4, int r5, X.C0KC5 r6, X.C0KCK r7) {
        /*
            r3 = 0
            if (r7 == 0) goto L2b
            int r0 = r7.LIZJ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.0KDz r3 = r7.LJ
        Lb:
            r0 = 0
            if (r6 != 0) goto L13
            X.0KC5 r6 = new X.0KC5
            r6.<init>(r0)
        L13:
            if (r4 == 0) goto L2d
            int r1 = r4.intValue()
            r0 = 4025009(0x3d6ab1, float:5.640239E-39)
            if (r1 != r0) goto L2d
            X.0KBo r0 = X.EnumC513420KBo.LATE_CALLBACK_SCENE
            r6.LIZJ = r0
            java.lang.String r0 = "late_callback"
            r6.LIZ = r0
            java.lang.String r0 = "late_callback_error"
            r6.LIZIZ = r0
            return
        L2b:
            r2 = r3
            goto Lb
        L2d:
            if (r2 == 0) goto L59
            int r1 = r2.intValue()
            r0 = 5
            if (r1 != r0) goto L45
            if (r5 <= 0) goto L45
            X.0KBo r0 = X.EnumC513420KBo.AUTO_RENEWAL_CANCEL_SCENE
            r6.LIZJ = r0
            java.lang.String r0 = "renewal_cancel"
            r6.LIZ = r0
            java.lang.String r0 = "renewal_cancel_error"
            r6.LIZIZ = r0
            return
        L45:
            int r1 = r2.intValue()
            r0 = 6
            if (r1 != r0) goto L59
            X.0KBo r0 = X.EnumC513420KBo.ONHOLD_SCENE
            r6.LIZJ = r0
            java.lang.String r0 = "on_hold"
            r6.LIZ = r0
            java.lang.String r0 = "on_hold_error"
            r6.LIZIZ = r0
            return
        L59:
            X.0KDz r0 = X.EnumC514050KDz.PRE_CHECK_STATUS_ELIGIBLE
            r2 = 1
            if (r3 == r0) goto L94
            com.ss.android.ugc.aweme.subscription.pgc.experiment.PGCRestructurePreCheckSettings r0 = com.ss.android.ugc.aweme.subscription.pgc.experiment.PGCRestructurePreCheckSettings.INSTANCE
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L94
            if (r3 == 0) goto L8f
            int[] r1 = X.C0KE7.LIZ
            int r0 = r3.ordinal()
            r1 = r1[r0]
            if (r1 == r2) goto L8a
            r0 = 2
            if (r1 == r0) goto L85
            r0 = 3
            if (r1 != r0) goto L8f
            X.0KBo r0 = X.EnumC513420KBo.INCORRECT_PAYMENT_CHANNEL
            r6.LIZJ = r0
        L7c:
            java.lang.String r0 = "multi_account"
            r6.LIZ = r0
            java.lang.String r0 = "multi_account_error"
            r6.LIZIZ = r0
            return
        L85:
            X.0KBo r0 = X.EnumC513420KBo.INCORRECT_TIKTOK_OR_GP_ACCOUNT
            r6.LIZJ = r0
            goto L7c
        L8a:
            X.0KBo r0 = X.EnumC513420KBo.INCORRECT_GP_ACCOUNT
            r6.LIZJ = r0
            goto L7c
        L8f:
            X.0KBo r0 = X.EnumC513420KBo.INCORRECT_PRECHECK_UNKNOWN
            r6.LIZJ = r0
            goto L7c
        L94:
            if (r5 <= 0) goto La1
            X.0KBo r0 = X.EnumC513420KBo.NOT_SPECIAL_SCENE
            r6.LIZJ = r0
            java.lang.String r0 = "available"
            r6.LIZ = r0
            r6.LIZIZ = r0
            return
        La1:
            if (r7 == 0) goto Lb3
            boolean r0 = r7.LJII
            if (r0 != r2) goto Lac
            java.lang.String r0 = "tpl_error"
        La9:
            r6.LIZIZ = r0
            return
        Lac:
            boolean r0 = r7.LJIIIIZZ
            if (r0 != r2) goto Lb3
            java.lang.String r0 = "iap_error"
            goto La9
        Lb3:
            java.lang.String r0 = "unknown"
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KC9.LJFF(java.lang.Integer, int, X.0KC5, X.0KCK):void");
    }

    public static CharSequence LIZ(Context context, String str, String str2, String str3, String str4, Map map) {
        if (str != null) {
            if (str.length() != 0) {
                if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
                    int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
                    int length = iLJJJ + str2.length();
                    if (context != null && iLJJJ >= 0) {
                        return C510740K1g.LIZ(str, 51, new C512540K8e(iLJJJ, length, context, str4, map, str3));
                    }
                    return str;
                }
                if (str != null) {
                    return str;
                }
            } else {
                return str;
            }
        }
        return "";
    }
}
