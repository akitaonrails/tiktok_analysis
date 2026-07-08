package X;

import X.C0O35;
import Y.AfS178S0100000_9;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0O38, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public abstract class C0O38<STATE extends C0O35> {
    public final boolean LIZ = true;
    public final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1843));

    public abstract String LJFF();

    public abstract STATE LJII(STATE state);

    public final C612230Nzp<STATE> LJI() {
        return (C612230Nzp) this.LIZJ.getValue();
    }

    public C0O38() {
        if (LJ()) {
            C1906580ziK.LIZJ().LJII().LJJIL(new InterfaceC19483011Ki() { // from class: X.0O39
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    return ((AbstractC1387200mCc) obj).LIZ instanceof C08B7;
                }
            }).LJJLJLI(new AfS178S0100000_9(this, 80));
        }
    }

    public boolean LJ() {
        return this.LIZ;
    }

    public final <REQ, RESP> void LJIIIIZZ(STATE state, C0O54<REQ, RESP> c0o54, boolean z, List<? extends C0O3D> list, Function2<? super STATE, ? super Boolean, Unit> function2, InterfaceC1631620sYq<? super STATE, ? super Boolean, ? super Throwable, Unit> interfaceC1631620sYq) {
        String id = state.getId();
        if (id.length() == 0) {
            if (interfaceC1631620sYq != null) {
                interfaceC1631620sYq.invoke(state, Boolean.FALSE, new C0OAF(100, "id cannot empty", null));
                return;
            }
            return;
        }
        C23250099c.LIZLLL(this.LIZIZ, null, null, new C0O3A(list, id, state, this, c0o54, z, interfaceC1631620sYq, function2, null), 3);
    }
}
