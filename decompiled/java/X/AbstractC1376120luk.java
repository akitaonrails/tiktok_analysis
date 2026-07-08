package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0luk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1376120luk implements InterfaceC1369790lkX {
    @Override // X.InterfaceC1369790lkX
    public boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1369790lkX
    public boolean LJIIZILJ(Context context) {
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final void LJIL() {
    }

    @Override // X.InterfaceC1369790lkX
    public final void LJJI() {
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJJIII() {
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final void LJJIIJZLJL(int i) {
    }

    @Override // X.InterfaceC1369790lkX
    public final void LJJIJIL(View view, boolean z) {
    }

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 101;
    }

    @Override // X.InterfaceC1369790lkX
    public boolean LJJJLIIL() {
        return false;
    }

    @Override // X.InterfaceC1369790lkX
    public float LJJL() {
        return 0.34f;
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJJLI() {
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJJLIIIJJI() {
        return false;
    }

    @Override // X.InterfaceC1369790lkX
    public int LJIIJJI() {
        return LIZJ() ? 1 : 0;
    }

    public static String LIZ(C1371420lnA c1371420lnA) {
        String strLIZIZ;
        C1371430lnB c1371430lnB;
        String str;
        if ((c1371420lnA instanceof C1371430lnB) && (str = (c1371430lnB = (C1371430lnB) c1371420lnA).LJ) != null && AnonymousClass0652.LIZ(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1371430lnB.LJ);
            sbLIZ.append(' ');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        String str2 = c1371420lnA.LIZJ;
        if (str2 != null && str2.length() != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c1371420lnA.LIZJ);
            sbLIZ2.append(' ');
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(c1371420lnA.LIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(c1371420lnA.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public boolean LJ(Context context, Intent intent) {
        C1370370llT.LJ.LJ(intent, key());
        if (context.getPackageManager().resolveActivity(intent, 0) == null) {
            return false;
        }
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYpHA2T4LJAA5E2g/iVTJHz/1qINni4/gHOokL11ux8JT", null));
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public void LJIJI(C424540Gkm c424540Gkm, boolean z) {
        c424540Gkm.setImageDrawable(LJJII(c424540Gkm.getContext(), z));
    }

    @Override // X.InterfaceC1369790lkX
    public boolean LJJIFFI(C1371430lnB c1371430lnB, Context context, C0M7Y c0m7y) {
        return LJIIL(c1371430lnB, context, c0m7y);
    }

    @Override // X.InterfaceC1369790lkX
    public boolean LJJIIJ(AbstractC1375550ltp abstractC1375550ltp, Context context, C0M7Y c0m7y) {
        try {
            if (abstractC1375550ltp instanceof C1371430lnB) {
                return LJJIFFI((C1371430lnB) abstractC1375550ltp, context, c0m7y);
            }
            if (abstractC1375550ltp instanceof C1371420lnA) {
                return LJIIL((C1371420lnA) abstractC1375550ltp, context, c0m7y);
            }
            if (abstractC1375550ltp instanceof C1375540lto) {
                return LJJJIL((C1375540lto) abstractC1375550ltp, context, c0m7y);
            }
            if (abstractC1375550ltp instanceof C1374270lrl) {
                return LJIJ((C1374270lrl) abstractC1375550ltp, context, c0m7y);
            }
            throw new C1954807lC();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
