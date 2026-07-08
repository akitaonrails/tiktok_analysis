package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tuK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683380tuK implements InterfaceC1683480tuU {
    public final C1668880tWw LIZ;
    public final String LIZIZ;
    public final C1668880tWw LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1683380tuK)) {
            return false;
        }
        C1683380tuK c1683380tuK = (C1683380tuK) obj;
        return Intrinsics.LJFF(this.LIZ, c1683380tuK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1683380tuK.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1683380tuK.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Item(startIconRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", endIconRes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1683380tuK(C1668880tWw c1668880tWw, String str, C1668880tWw c1668880tWw2) {
        this.LIZ = c1668880tWw;
        this.LIZIZ = str;
        this.LIZJ = c1668880tWw2;
    }
}
