package X;

import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15ZL, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15ZL extends C15ZP implements InterfaceC20541615Zm {
    public final C15ZM LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC20541615Zm
    public final void LIZ() {
        LJI(this.LJ ? 1 : 0);
        if (this.LJ) {
            this.LJ = false;
        }
    }

    @Override // X.InterfaceC20541615Zm
    public final void LIZIZ() {
        LIZLLL(EnumC992810bwV.REMOVE_BY_BIZ);
    }

    public final void LJII() {
        String str;
        LIZLLL(EnumC992810bwV.REMOVE_BY_BIZ);
        C15ZM c15zm = this.LIZJ;
        if (c15zm != null) {
            c15zm.LIZ();
            str = "SessionTimeBox";
        } else {
            str = "";
        }
        LIZJ(new C15ZN(this, new AwS575S0100000_31(this, 1626), "ScreenTimeBreaksSnoozeStrategy", str, new AwS575S0100000_31(this, 1627), 0));
    }

    public C15ZL(C1910940zpM c1910940zpM) {
        super("ScreenTimeBreak");
        this.LIZJ = c1910940zpM;
        this.LJ = true;
        C20541515Zl.LIZ(this);
    }

    public final void LJI(int i) {
        String str;
        C15ZM c15zm = this.LIZJ;
        if (c15zm != null && !c15zm.LJ()) {
            return;
        }
        LIZLLL(EnumC992810bwV.REMOVE_BY_BIZ);
        C15ZM c15zm2 = this.LIZJ;
        if (c15zm2 != null) {
            c15zm2.LIZ();
            str = "SessionTimeBox";
        } else {
            str = "";
        }
        LIZJ(new C15ZN(this, new AwS575S0100000_31(this, 1624), "ScreenTimeBreaksShowStrategy", str, new AwS575S0100000_31(this, 1625), i));
    }
}
