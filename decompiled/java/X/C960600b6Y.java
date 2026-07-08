package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b6Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960600b6Y extends C955670ayb implements InterfaceC951240arS<Object> {
    public String LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C960600b6Y)) {
            return false;
        }
        C960600b6Y c960600b6Y = (C960600b6Y) obj;
        return Intrinsics.LJFF(this.LJ, c960600b6Y.LJ) && this.LJFF == c960600b6Y.LJFF && this.LJI == c960600b6Y.LJI;
    }

    public final int hashCode() {
        return (((this.LJ.hashCode() * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoHostInvitationStatusItem(content=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isShowIcon=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", showCloseIcon=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (obj instanceof C960600b6Y) {
            return Intrinsics.LJFF(((C960600b6Y) obj).LJ, this.LJ);
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C960600b6Y;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C960600b6Y(String str, int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(str, z, false);
    }

    public C960600b6Y(String str, boolean z, boolean z2) {
        this.LJ = str;
        this.LJFF = z;
        this.LJI = z2;
    }
}
