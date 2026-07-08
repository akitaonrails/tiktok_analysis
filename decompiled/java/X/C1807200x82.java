package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x82, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807200x82 implements InterfaceC1806820x7Q {
    public final int LIZ = 2131853118;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;

    @Override // X.InterfaceC1806790x7N
    public final int LIZ() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1807200x82)) {
            return false;
        }
        C1807200x82 c1807200x82 = (C1807200x82) obj;
        return this.LIZ == c1807200x82.LIZ && this.LIZIZ == c1807200x82.LIZIZ && this.LIZJ == c1807200x82.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1807200x82.LIZLLL) && Intrinsics.LJFF(this.LJ, c1807200x82.LJ);
    }

    @Override // X.InterfaceC1806790x7N
    public final int getStyle() {
        return 8;
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WebBannerGuideData(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", withoutPrice=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", coins=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", discount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", price=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1807200x82(long j, String str, String str2, boolean z) {
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
