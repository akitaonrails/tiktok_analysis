package X;

import android.content.Context;
import com.bytedance.lynx.hybrid.bridge.IBridgeServiceApi;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0qFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542940qFo implements InterfaceC1543620qGu, InterfaceC1538970q9P, InterfaceC1543070qG1 {
    public final C1543320qGQ LIZIZ = new C1543320qGQ();
    public final HashMap<String, C1543320qGQ> LIZJ = new HashMap<>();
    public WeakReference<InterfaceC1541990qEH> LIZLLL;

    @Override // X.InterfaceC1543070qG1
    public final C1543320qGQ LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1543070qG1
    public final InterfaceC1543360qGU LIZJ(C1543910qHN c1543910qHN) {
        return this.LIZJ.get(c1543910qHN.LJIIJ);
    }

    @Override // X.InterfaceC1538970q9P
    public final void LJII(Context context) {
        this.LIZIZ.LJII(context);
        if (!this.LIZJ.isEmpty()) {
            Iterator<Map.Entry<String, C1543320qGQ>> it2 = this.LIZJ.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue().LJII(context);
            }
        }
    }

    @Override // X.InterfaceC1543620qGu
    public final void LIZLLL(C1543910qHN c1543910qHN, C1543430qGb c1543430qGb) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("realDispatchBridgeMethod: ");
        sbLIZ.append(C786410Ut5.u3());
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        C587540N2q.LIZ.getClass();
        IBridgeServiceApi iBridgeServiceApi = (IBridgeServiceApi) C587540N2q.LIZ(IBridgeServiceApi.class);
        if (iBridgeServiceApi != null) {
            iBridgeServiceApi.onDownGrade(this, c1543910qHN, c1543430qGb);
        }
    }
}
