package X;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1AiG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2186821AiG implements InterfaceC2186931AiR {
    public final /* synthetic */ C2186761AiA LIZ;

    @Override // X.InterfaceC2186931AiR
    public final void LIZ() {
        Iterator it2 = ((ArrayList) this.LIZ.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2186931AiR) it2.next()).LIZ();
        }
    }

    @Override // X.InterfaceC2186931AiR
    public final void LIZIZ() {
        Iterator<InterfaceC2186931AiR> it2 = this.LIZ.LLJI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
    }

    @Override // X.InterfaceC2186931AiR
    public final void LIZJ() {
        Iterator it2 = ((ArrayList) this.LIZ.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2186931AiR) it2.next()).LIZJ();
        }
    }

    @Override // X.InterfaceC2186931AiR
    public final void LJ() {
        Iterator it2 = ((ArrayList) this.LIZ.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2186931AiR) it2.next()).LJ();
        }
    }

    public C2186821AiG(C2186761AiA c2186761AiA) {
        this.LIZ = c2186761AiA;
    }

    @Override // X.InterfaceC2186931AiR
    public final void LIZLLL(Exception exc) {
        Iterator it2 = ((ArrayList) this.LIZ.LLJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2186931AiR) it2.next()).LIZLLL(exc);
        }
    }
}
