package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Ag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20476015Ag implements InterfaceC20476615Am {
    public C20476115Ah LIZ;
    public String LIZIZ;
    public final InterfaceC20477315At LIZJ;
    public final EnumC20476415Ak LIZLLL = EnumC20476415Ak.IMAGE;
    public final EnumC20476715An LJ = EnumC20476715An.NORMAL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20476015Ag)) {
            return false;
        }
        C20476015Ag c20476015Ag = (C20476015Ag) obj;
        return Intrinsics.LJFF(this.LIZ, c20476015Ag.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20476015Ag.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20476015Ag.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageGeniusModel(location=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", geniusId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", geniusConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20476615Am
    public final InterfaceC20477315At LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC20476615Am
    public final EnumC20476715An LIZJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC20476615Am
    public final EnumC20476415Ak LJFF() {
        return this.LIZLLL;
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
        return new C20476015Ag(c20476115Ah, str, interfaceC20477315At);
    }

    public C20476015Ag(C20476115Ah c20476115Ah, String str, InterfaceC20477315At interfaceC20477315At) {
        this.LIZ = c20476115Ah;
        this.LIZIZ = str;
        this.LIZJ = interfaceC20477315At;
    }
}
