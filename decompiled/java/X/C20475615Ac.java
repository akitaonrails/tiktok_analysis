package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Ac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20475615Ac implements InterfaceC20476615Am {
    public C20476115Ah LIZ;
    public final InterfaceC20477315At LIZIZ;
    public String LIZJ;
    public final EnumC20476715An LIZLLL;
    public final EnumC20476415Ak LJ = EnumC20476415Ak.TEXT;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20475615Ac)) {
            return false;
        }
        C20475615Ac c20475615Ac = (C20475615Ac) obj;
        return Intrinsics.LJFF(this.LIZ, c20475615Ac.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20475615Ac.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20475615Ac.LIZJ) && this.LIZLLL == c20475615Ac.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextGeniusModel(location=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", geniusConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", geniusId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", rootType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C150P LJI() {
        InterfaceC20477315At interfaceC20477315At = this.LIZIZ;
        if (interfaceC20477315At instanceof C150P) {
            return (C150P) interfaceC20477315At;
        }
        return null;
    }

    @Override // X.InterfaceC20476615Am
    public final InterfaceC20477315At LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC20476615Am
    public final EnumC20476715An LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC20476615Am
    public final EnumC20476415Ak LJFF() {
        return this.LJ;
    }

    @Override // X.InterfaceC20476615Am
    public final String getGeniusId() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC20476615Am
    public final C20476115Ah getLocation() {
        return this.LIZ;
    }

    @Override // X.InterfaceC20476615Am
    public final void LIZIZ(String str) {
        this.LIZJ = str;
    }

    @Override // X.InterfaceC20476615Am
    public final void LIZLLL(C20476115Ah c20476115Ah) {
        this.LIZ = c20476115Ah;
    }

    @Override // X.InterfaceC20476615Am
    public final InterfaceC20476615Am LJ(C20476115Ah c20476115Ah, InterfaceC20477315At interfaceC20477315At) {
        if (c20476115Ah == null) {
            c20476115Ah = this.LIZ.LIZ();
        }
        if (interfaceC20477315At == null) {
            interfaceC20477315At = this.LIZIZ.LIZJ();
        }
        return new C20475615Ac(interfaceC20477315At, c20476115Ah, this.LIZLLL, this.LIZJ);
    }

    public C20475615Ac(InterfaceC20477315At interfaceC20477315At, C20476115Ah c20476115Ah, EnumC20476715An enumC20476715An, String str) {
        this.LIZ = c20476115Ah;
        this.LIZIZ = interfaceC20477315At;
        this.LIZJ = str;
        this.LIZLLL = enumC20476715An;
    }
}
