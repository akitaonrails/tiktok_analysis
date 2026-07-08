package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0IiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473970IiJ implements InterfaceC473980IiK {
    public final Context LIZ;
    public final C01GW LIZIZ = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(341));

    public C473970IiJ(Context context) {
        this.LIZ = context;
    }

    public final void LIZ(final String str, final String str2, final String str3, final String str4, final boolean z) {
        if (!((Keva) this.LIZIZ.getValue()).getBoolean("live_debug_tools_client_trigger_switcher", false)) {
            return;
        }
        C473410IhP.LIZIZ(new Runnable() { // from class: X.0IYI
            public final void LIZ() {
                if (z) {
                    Context context = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Trigger Succeed !!\nBusiness : ");
                    sbLIZ.append(str2);
                    sbLIZ.append("\nRule : ");
                    sbLIZ.append(str3);
                    sbLIZ.append("\nTrigger Type : ");
                    sbLIZ.append(str);
                    C766270U4b.LIZIZ(context, C2188811AlT.LIZIZ(sbLIZ), 10000L);
                    return;
                }
                Context context2 = this.LIZ;
                StringBuilder sb = new StringBuilder("Trigger failed !!\nBusiness : ");
                sb.append(str2);
                sb.append("\nRule : ");
                sb.append(str3);
                sb.append("\nTrigger Type : ");
                sb.append(str);
                sb.append("\nError Message: ");
                String str5 = str4;
                if (str5.length() == 0) {
                    str5 = "empty";
                }
                sb.append(str5);
                C766270U4b.LIZIZ(context2, sb.toString(), 10000L);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    LIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }
}
