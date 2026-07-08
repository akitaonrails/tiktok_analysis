package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0YHQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YHQ implements C0YHS {
    public final C0YH7 LIZ;
    public final CopyOnWriteArrayList<InterfaceC1743606sE> LIZIZ = new CopyOnWriteArrayList<>();
    public final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 31));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 30));

    public C0YHQ(C0YH7 c0yh7) {
        this.LIZ = c0yh7;
    }

    @Override // X.C0YHS
    public final void LIZIZ(InterfaceC1743606sE interfaceC1743606sE) {
        this.LIZIZ.remove(interfaceC1743606sE);
    }

    @Override // X.C0YHS
    public final void LIZJ(C873500YOm c873500YOm) {
        boolean z = this.LIZ.getConfig().LIZ.LJFF().LJIILL().LIZ.LJFF.invoke().enabled;
        if (z && !this.LIZ.isLogin()) {
            return;
        }
        if (!this.LIZIZ.isEmpty()) {
            C23250099c.LIZLLL(this.LIZJ, null, null, new C0YHR(this, c873500YOm, z, null), 3);
        } else {
            ((C873580YOu) this.LIZLLL.getValue()).LIZIZ(c873500YOm);
        }
    }

    @Override // X.C0YHS
    public final void LIZLLL(InterfaceC1743606sE interfaceC1743606sE) {
        this.LIZIZ.add(interfaceC1743606sE);
    }

    @Override // X.C0YHS
    public final void LIZ(List list, AwS593S0100000_14 awS593S0100000_14) {
        try {
            InterfaceC497601wk interfaceC497601wkLIZ = this.LIZ.LLJLL().LIZ();
            if (interfaceC497601wkLIZ != null) {
                C23250099c.LIZLLL(interfaceC497601wkLIZ, null, null, new C862550Xsb(this, list, awS593S0100000_14, null), 3);
            } else {
                awS593S0100000_14.invoke(C2097608Jq.LJ());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIIZZ("DefaultMediaAbility", "get media status failed", e);
            awS593S0100000_14.invoke(C2097608Jq.LJ());
        }
    }
}
