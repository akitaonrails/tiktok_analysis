package X;

import kotlin.Unit;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05am, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1380605am extends AbstractC20074613ge {
    public InterfaceC1381005aq LLJJJJLIIL;
    public EnumC1684030tvN LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public InterfaceC1631620sYq<? super InterfaceC497601wk, ? super C1378605aS, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> LLJL;
    public InterfaceC1631620sYq<? super InterfaceC497601wk, ? super Float, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> LLJLIL;
    public boolean LLJLILLLLZIIL;

    @Override // X.AbstractC20074613ge
    public final boolean LLJJJJLIIL() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.AbstractC20074613ge
    public final void LLJJJJ(long j) {
        if (this.LLJILLL && !Intrinsics.LJFF(this.LLJL, C1380805ao.LIZ)) {
            C23250099c.LIZLLL(LLILLIZIL(), null, C099V.UNDISPATCHED, new C1380205ai(this, j, null), 1);
        }
    }

    @Override // X.AbstractC20074613ge
    public final void LLJJJJJIL(long j) {
        if (this.LLJILLL && !Intrinsics.LJFF(this.LLJLIL, C1380805ao.LIZIZ)) {
            C23250099c.LIZLLL(LLILLIZIL(), null, C099V.UNDISPATCHED, new C1380305aj(this, j, null), 1);
        }
    }

    @Override // X.AbstractC20074613ge
    public final Object LLJJJIL(C1394205cy c1394205cy, C1394305cz c1394305cz) {
        Object objLIZ = this.LLJJJJLIIL.LIZ(EnumC1384205bM.UserInput, new C1380405ak(c1394205cy, this, null), c1394305cz);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    public C1380605am(InterfaceC1381005aq interfaceC1381005aq, AFwS229S0000000_2 aFwS229S0000000_2, EnumC1684030tvN enumC1684030tvN, boolean z, InterfaceC595010NVj interfaceC595010NVj, boolean z2, InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq interfaceC1631620sYq2, boolean z3) {
        super(aFwS229S0000000_2, z, interfaceC595010NVj, enumC1684030tvN);
        this.LLJJJJLIIL = interfaceC1381005aq;
        this.LLJJL = enumC1684030tvN;
        this.LLJJLIIIJLLLLLLLZ = z2;
        this.LLJL = interfaceC1631620sYq;
        this.LLJLIL = interfaceC1631620sYq2;
        this.LLJLILLLLZIIL = z3;
    }
}
