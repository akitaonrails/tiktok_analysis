package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Af, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20475915Af implements InterfaceC20476615Am {
    public C20476115Ah LIZ;
    public final InterfaceC20477315At LIZIZ;
    public final EnumC20476415Ak LIZJ;
    public final EnumC20476715An LIZLLL;
    public String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20475915Af)) {
            return false;
        }
        C20475915Af c20475915Af = (C20475915Af) obj;
        return Intrinsics.LJFF(this.LIZ, c20475915Af.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20475915Af.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardGeniusModelNew(location=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", geniusConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
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
        return this.LIZJ;
    }

    @Override // X.InterfaceC20476615Am
    public final String getGeniusId() {
        return this.LJ;
    }

    @Override // X.InterfaceC20476615Am
    public final C20476115Ah getLocation() {
        return this.LIZ;
    }

    @Override // X.InterfaceC20476615Am
    public final void LIZIZ(String str) {
        this.LJ = str;
    }

    @Override // X.InterfaceC20476615Am
    public final void LIZLLL(C20476115Ah c20476115Ah) {
        this.LIZ = c20476115Ah;
    }

    public C20475915Af(C20476115Ah c20476115Ah, InterfaceC20477315At interfaceC20477315At) {
        this.LIZ = c20476115Ah;
        this.LIZIZ = interfaceC20477315At;
        EnumC20476415Ak enumC20476415Ak = EnumC20476415Ak.BOARD;
        this.LIZJ = enumC20476415Ak;
        this.LIZLLL = EnumC20476715An.NORMAL;
        this.LJ = enumC20476415Ak.name();
    }

    @Override // X.InterfaceC20476615Am
    public final InterfaceC20476615Am LJ(C20476115Ah c20476115Ah, InterfaceC20477315At interfaceC20477315At) {
        if (c20476115Ah == null) {
            c20476115Ah = this.LIZ.LIZ();
        }
        if (interfaceC20477315At == null) {
            interfaceC20477315At = this.LIZIZ.LIZJ();
        }
        return new C20475915Af(c20476115Ah, interfaceC20477315At);
    }
}
