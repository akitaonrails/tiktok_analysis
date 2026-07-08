package X;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2430309fh {
    public static final C2430309fh LIZ = new C2430309fh();

    public static boolean LIZ(Context context, String str, String str2) {
        if (str.length() > 0 && str2.length() > 0) {
            LIZ.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("smsto:");
            sbLIZ.append(str);
            Intent intent = new Intent("android.intent.action.SENDTO", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
            intent.putExtra("sms_body", str2);
            intent.setPackage(Telephony.Sms.getDefaultSmsPackage(context));
            try {
                if (C2204961BRm.LJJJJZ(context.getPackageManager(), intent, 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPitb57a1T2PZzsc7UjYzsRPDpQudO4vOQHSgNBeOr6Xk4AT3EMOadA=", null)).size() > 0) {
                    C2429209fW.LIZ().appendDataFlowId(intent, 1207960578);
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, context);
                    C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPitb57a1T2PZzsc7UjYzsRPDpQudO4vOQHSgNBeOr6Xk4AT3EMO", null));
                    return true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        LIZ.getClass();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
            c1389890mGx.LJIIIZ(2131836219);
            c1389890mGx.LJIIJJI();
            return false;
        }
        return false;
    }
}
