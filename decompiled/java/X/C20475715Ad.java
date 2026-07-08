package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Ad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20475715Ad implements InterfaceC20476615Am {
    public C20476115Ah LIZ;
    public String LIZIZ;
    public final InterfaceC20477315At LIZJ;
    public final EnumC20476715An LIZLLL;
    public final EnumC20476415Ak LJ = EnumC20476415Ak.LABEL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20475715Ad)) {
            return false;
        }
        C20475715Ad c20475715Ad = (C20475715Ad) obj;
        return Intrinsics.LJFF(this.LIZ, c20475715Ad.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20475715Ad.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20475715Ad.LIZJ) && this.LIZLLL == c20475715Ad.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LabelGeniusModel(location=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", geniusId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", geniusConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", rootType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20476615Am
    public final InterfaceC20477315At LIZ() {
        return this.LIZJ;
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
        return this.LIZIZ;
    }

    @Override // X.InterfaceC20476615Am
    public final C20476115Ah getLocation() {
        return this.LIZ;
    }

    @Override // X.InterfaceC20476615Am
    public final void LIZIZ(String str) {
        this.LIZIZ = str;
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
        String str = this.LIZIZ;
        if (interfaceC20477315At == null) {
            interfaceC20477315At = this.LIZJ.LIZJ();
        }
        return new C20475715Ad(interfaceC20477315At, c20476115Ah, EnumC20476715An.CANT_AUTO_CREATE, str);
    }

    public C20475715Ad(InterfaceC20477315At interfaceC20477315At, C20476115Ah c20476115Ah, EnumC20476715An enumC20476715An, String str) {
        this.LIZ = c20476115Ah;
        this.LIZIZ = str;
        this.LIZJ = interfaceC20477315At;
        this.LIZLLL = enumC20476715An;
    }
}
