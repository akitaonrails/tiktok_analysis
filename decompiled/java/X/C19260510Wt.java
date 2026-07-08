package X;

import Y.ARunnableS128S0100000_28;
import android.content.Context;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.UltimateCmplSettings;
import com.ss.android.ugc.aweme.legoImp.task.FetchUltimateComplianceSettingsTask;

/* JADX INFO: renamed from: X.10Wt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19260510Wt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.10Wu] */
    public static void LIZ() {
        C10SW.LIZ.getClass();
        C10SW.LIZLLL("did_ready");
        ComplianceServiceProvider.LJJI().LJIILL(new InterfaceC191806102a() { // from class: X.10Wu
            @Override // X.InterfaceC191806102a
            public final void onFailed() {
                C19260510Wt.LIZIZ("", true, true, true);
            }

            @Override // X.InterfaceC191806102a
            public final void LIZ(UltimateCmplSettings ultimateCmplSettings) {
                C19260510Wt.LIZIZ(ultimateCmplSettings.country, ultimateCmplSettings.setAnonymizeUserForAF, ultimateCmplSettings.delayAFStart, false);
                long j = C0BFL.LIZ;
                if (j != -1) {
                    C0CN5.LIZIZ(Long.valueOf(j), new ARunnableS128S0100000_28(ultimateCmplSettings, 44));
                    return;
                }
                Context context = FetchUltimateComplianceSettingsTask.LL;
                if (context == null) {
                    return;
                }
                C19260510Wt.LIZJ(context, ultimateCmplSettings.setAnonymizeUserForFireBase);
            }
        });
    }

    public static void LIZJ(Context context, boolean z) {
        String str;
        C0WG5 c0wg5LIZ = C0WG5.LIZIZ.LIZ(context);
        if (z) {
            str = "false";
        } else {
            str = "true";
        }
        C20144713rx c20144713rx = new C20144713rx(939524362);
        C837720Wte.LIZ("Firebase", "setUserProperty", c20144713rx, new C0WGY(str, c20144713rx, c0wg5LIZ));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setFirebaseRDP: ");
        sbLIZ.append(z);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("FetchUltimateComplianceSettingsTask", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(String str, boolean z, boolean z2, boolean z3) {
        int i;
        C19260410Ws c19260410Ws = C19260410Ws.LIZ;
        c19260410Ws.getClass();
        int i2 = 1;
        C19260410Ws.LIZLLL = true;
        C19260410Ws.LJ = z;
        C19260410Ws.LJI = z2;
        C19260410Ws.LJFF = str;
        C19260410Ws.LJIIIZ = z3;
        if (!C19260410Ws.LJI()) {
            C19260410Ws.LJIILIIL();
        }
        c19260410Ws.LJIIL();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "anonymize_user");
        if (!z2) {
            i2 = 0;
        }
        c2344009Gk.LIZJ(i2, "delay_af_start");
        c2344009Gk.LJIIIIZZ("region", C19260410Ws.LIZLLL());
        c2344009Gk.LJIIIIZZ("country", str);
        c2344009Gk.LIZJ(z3 ? 1 : 0, "is_fail_default");
        C20684815ws.LJIILLIIL("af_compliance_info", c2344009Gk.LIZ);
        C0CNO.LIZ(C15O7.LJI, new C19261110Wz());
    }
}
