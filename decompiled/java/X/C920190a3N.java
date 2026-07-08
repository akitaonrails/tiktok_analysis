package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0a3N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920190a3N extends AbstractC920180a3M {
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(275));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(277));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(276));
    public C01FV LJ;

    @Override // X.AbstractC920180a3M, X.InterfaceC920200a3O
    public final void LIZIZ() {
        super.LIZIZ();
        ((InterfaceC920200a3O) this.LIZIZ.getValue()).LIZIZ();
        ((InterfaceC920200a3O) this.LIZJ.getValue()).LIZIZ();
        ((InterfaceC920200a3O) this.LIZLLL.getValue()).LIZIZ();
    }

    public final InterfaceC920200a3O LJIILLIIL() {
        C01FV c01fvLJ = C01HE.LJ();
        C01FV c01fv = this.LJ;
        if (c01fv != c01fvLJ) {
            this.LJ = c01fvLJ;
            if (c01fv != null && c01fv != c01fvLJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Role changed from ");
                sbLIZ.append(c01fv);
                sbLIZ.append(" to ");
                sbLIZ.append(this.LJ);
                C20441214yg.LIZIZ("LayoutAction", C2188811AlT.LIZIZ(sbLIZ));
                int i = C01FY.LIZ[c01fv.ordinal()];
                if (i == 1) {
                    ((InterfaceC920200a3O) this.LIZIZ.getValue()).LIZIZ();
                } else if (i == 2) {
                    ((InterfaceC920200a3O) this.LIZJ.getValue()).LIZIZ();
                } else {
                    if (i != 3) {
                        throw new C1954807lC();
                    }
                    ((InterfaceC920200a3O) this.LIZLLL.getValue()).LIZIZ();
                }
            }
        }
        int i2 = C01FY.LIZ[c01fvLJ.ordinal()];
        if (i2 == 1) {
            return (InterfaceC920200a3O) this.LIZIZ.getValue();
        }
        if (i2 == 2) {
            return (InterfaceC920200a3O) this.LIZJ.getValue();
        }
        if (i2 == 3) {
            return (InterfaceC920200a3O) this.LIZLLL.getValue();
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC920180a3M, X.InterfaceC920200a3O
    public final void LIZLLL(C917100ZyO c917100ZyO) {
        LJIILLIIL().LIZLLL(c917100ZyO);
    }

    @Override // X.InterfaceC920200a3O
    public final void LJ(InterfaceC920110a3F interfaceC920110a3F) {
        LJIILLIIL().LJ(interfaceC920110a3F);
    }

    @Override // X.AbstractC920180a3M, X.InterfaceC920200a3O
    public final void LIZ(PosIdentity posIdentity, boolean z, boolean z2, InterfaceC920110a3F interfaceC920110a3F) {
        LJIILLIIL().LIZ(posIdentity, z, z2, interfaceC920110a3F);
    }

    @Override // X.InterfaceC920200a3O
    public final void LIZJ(PosIdentity posIdentity, PosIdentity posIdentity2, AwS559S0100000_15 awS559S0100000_15, AwS594S0100000_15 awS594S0100000_15) {
        LJIILLIIL().LIZJ(posIdentity, posIdentity2, awS559S0100000_15, awS594S0100000_15);
    }

    @Override // X.InterfaceC920200a3O
    public final void LJFF(int i, int i2, Function1<? super LayoutState, Unit> function1, Function1<? super LinkCoreError, Unit> function12) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("panelLayoutStyle = ");
        sbLIZ.append(i);
        sbLIZ.append(", micCount = ");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("LayoutAction", C2188811AlT.LIZIZ(sbLIZ));
        LJIILLIIL().LJFF(i, i2, function1, function12);
    }

    @Override // X.InterfaceC920200a3O
    public final void LJII(int i, int i2, Function0<Unit> function0, Function1<? super LinkCoreError, Unit> function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("layoutStyle = ");
        sbLIZ.append(i);
        sbLIZ.append(", micCount = ");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("LayoutAction", C2188811AlT.LIZIZ(sbLIZ));
        LJIILLIIL().LJII(i, i2, function0, function1);
    }

    @Override // X.InterfaceC920200a3O
    public final void LJI(String str, boolean z, boolean z2, InterfaceC920110a3F interfaceC920110a3F, C334801Rq c334801Rq) {
        LJIILLIIL().LJI(str, z, z2, interfaceC920110a3F, c334801Rq);
    }
}
