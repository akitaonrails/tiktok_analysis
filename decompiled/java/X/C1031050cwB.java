package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031050cwB {
    public final String LIZ = "SplashAdShowInventory";

    public final void LIZJ(String str) {
        if (str != null && str.length() != 0) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                C1022620cia.LIZIZ(this.LIZ, str);
            }
        }
    }

    public final boolean LJII(Context context) {
        InterfaceC1028550cs9 interfaceC1028550cs9LIZ = C1031100cwG.LIZ();
        if (interfaceC1028550cs9LIZ != null && interfaceC1028550cs9LIZ.LJJIIJZLJL()) {
            LIZJ("Don't show the normal open screen Reason: the trace function is turned on");
            return false;
        }
        if (context == null) {
            LIZJ("Don't show the normal open screen Reason: context == null");
            return false;
        }
        C2212241BiA.LIZIZ(context);
        if (C2212241BiA.LIZIZ == null) {
            LIZJ("Don’t show the normal open screen Reason: splashAdManager is empty");
            return false;
        }
        C2212191Bi5.LIZIZ();
        C2212211Bi7 c2212211Bi7 = new C2212211Bi7();
        String str = NormalSplashAdActivity._pnsPageId;
        C1030990cw5 c1030990cw5 = new C1030990cw5();
        c2212211Bi7.LIZ = c1030990cw5;
        C1030680cva.LJIIJJI = null;
        C1030680cva.LJIIL = false;
        return NormalSplashAdActivity.LLILLJJLI.LIZ(context, c2212211Bi7.LIZ(context), c1030990cw5);
    }

    public final void LJIIIIZZ(boolean z) {
        int i;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("topview_start_track isColdStart=");
            sbLIZ.append(z);
            LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_cold_start", i);
            C20684815ws.LJIJ("topview_start_track", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final boolean LJI(int i, Context context) {
        boolean zLJII;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            C1031060cwC.LIZ.getClass();
            if (!C1031060cwC.LIZIZ) {
                C1035180d2q.LIZ = false;
                C1035180d2q.LIZLLL = false;
                C1035180d2q.LIZIZ = false;
                LIZJ("warmCanShowTopView false, splashCheck=false");
            } else {
                LJIIIIZZ(false);
                if (LIZ(context, false, true, false)) {
                    C1031060cwC.LIZIZ = false;
                    Activity activityLIZ = C1388190mED.LIZ(context);
                    if (!C1035180d2q.LIZIZ && activityLIZ != null) {
                        if (!LIZIZ(activityLIZ, false, false)) {
                            LIZJ("warmCanShowTopView has no splash");
                            return false;
                        }
                        zLJII = LJII(activityLIZ);
                        C1035180d2q.LIZLLL = zLJII;
                    } else {
                        C1035180d2q.LIZ = false;
                        C1035180d2q.LIZLLL = false;
                        zLJII = false;
                    }
                    C1035180d2q.LIZIZ = false;
                    return zLJII;
                }
            }
            return false;
        }
        if (((Boolean) C0A3K.LIZ.getValue()).booleanValue() && C1030680cva.LJIJJLI) {
            LIZJ("coldHasSplash return false, brecause hasProcessedColdStart = true");
            return false;
        }
        C1030680cva.LJIJJLI = true;
        LJIIIIZZ(true);
        if (!LIZ(context, true, true, false)) {
            LIZJ("coldHasSplash, businessSideAllowShowTopView = false");
            return false;
        }
        C1031090cwF.LIZ("has_splash_ad");
        boolean zLIZIZ = LIZIZ(context, true, false);
        C1031060cwC.LIZ.getClass();
        C1031060cwC.LIZLLL = zLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("coldPreload hasSplash = ");
        sbLIZ.append(zLIZIZ);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        C1031090cwF.LIZIZ("has_splash_ad");
        if (zLIZIZ && LJII(context)) {
            LJFF(0, "coldShowSplash has splash", null, true, true, true);
        } else {
            z = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("coldHasSplash = ");
        sbLIZ2.append(z);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        return z;
    }

    public static boolean LIZIZ(Context context, boolean z, boolean z2) {
        if (!ComplianceServiceProvider.LJIILJJIL().LJII(null)) {
            if (!z2) {
                C1031060cwC.LIZ.getClass();
                C1031060cwC.LIZJ().LJFF(2, "ConsentStatus failed", null, z, false, true);
            }
            return false;
        }
        if (C786410Ut5.N3(context) == null) {
            return false;
        }
        C2212241BiA.LIZIZ(context);
        C2212241BiA.LIZIZ.getClass();
        C2212231Bi9.LJJIJIIJI = z ? 1 : 0;
        if (z2) {
            C2212241BiA.LIZIZ(context);
            return C2212241BiA.LIZIZ.LJ(true);
        }
        C2212241BiA.LIZIZ(context);
        return C2212241BiA.LIZIZ.LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(final android.content.Context r20, boolean r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1031050cwB.LIZ(android.content.Context, boolean, boolean, boolean):boolean");
    }

    public final void LIZLLL(String str, int i, String str2, boolean z, boolean z2) {
        int i2;
        int i3;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("topview_show isColdStart=");
            sbLIZ.append(z);
            sbLIZ.append(",fromStockRevamp=");
            sbLIZ.append(z2);
            sbLIZ.append(", errorCode=");
            sbLIZ.append(i);
            sbLIZ.append(", splashId=");
            sbLIZ.append(str2);
            sbLIZ.append(",errorTips=");
            sbLIZ.append(str);
            LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tag", "topview_show");
            jSONObject.put("error_code", i);
            if (z2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_revamp", i2);
            if (z) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("is_cold_start", i3);
            if (str2 != null && str2.length() != 0) {
                jSONObject.put("creative_id", str2);
            }
            C20684815ws.LJIJ("topview_whole_track", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJ(String str, int i, String str2, boolean z, boolean z2) {
        int i2;
        int i3;
        boolean zLJI = MethodIDManager.LJI(137948);
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("topview_stock isColdStart=");
            sbLIZ.append(z);
            sbLIZ.append(",fromStockRevamp=");
            sbLIZ.append(z2);
            sbLIZ.append(", errorCode=");
            sbLIZ.append(i);
            sbLIZ.append(", splashId=");
            sbLIZ.append(str2);
            sbLIZ.append(", errorTips=");
            sbLIZ.append(str);
            LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tag", "topview_stock");
            jSONObject.put("error_code", i);
            if (z2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_revamp", i2);
            if (z) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("is_cold_start", i3);
            if (str2 != null && str2.length() != 0) {
                jSONObject.put("creative_id", str2);
            }
            C20684815ws.LJIJ("topview_whole_track", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJFF(int i, String str, String str2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        int iIntValue;
        Integer num;
        if (!z2) {
            if (!z3) {
                LJ(str, i, str2, z, false);
            }
            LJ(str, i, str2, z, true);
        }
        LIZLLL(str, i, str2, z, true);
        LIZLLL(str, i, str2, z, false);
        String str3 = null;
        if (i != 0) {
            ((ISplashAdService) ServiceManager.get().getService(ISplashAdService.class)).LJJIZ().LJ(null, null);
        }
        if (z) {
            C1030790cvl.LIZ.getClass();
            if (!C1030790cvl.LIZIZ) {
                C1031040cwA c1031040cwA = C1030790cvl.LIZJ;
                C1031040cwA c1031040cwA2 = new C1031040cwA(i, str2, 4);
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("lightCheckResult ");
                    sbLIZ.append(c1031040cwA);
                    sbLIZ.append(", realCheckResult ");
                    sbLIZ.append(c1031040cwA2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (c1031040cwA != null && c1031040cwA.LIZ == i) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    JSONObject jSONObject = new JSONObject();
                    if (c1031040cwA != null) {
                        i2 = c1031040cwA.LIZ;
                    } else {
                        i2 = -1;
                    }
                    jSONObject.put("light_error_code", i2);
                    if (c1031040cwA != null) {
                        str3 = c1031040cwA.LIZIZ;
                    }
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("light_cid", str3);
                    if (c1031040cwA != null && (num = c1031040cwA.LIZJ) != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    jSONObject.put("light_brand_safety_value", iIntValue);
                    String str5 = c1031040cwA2.LIZIZ;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    jSONObject.put("real_cid", str4);
                    jSONObject.put("real_error_code", i);
                    jSONObject.put("real_brand_safety_value", -1);
                    jSONObject.put("result_is_same", z4);
                    C20684815ws.LJIJ("topview_bs_check_result", jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }
}
