package X;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l0R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341210l0R {
    public final EnumC1341600l14 LIZ;
    public final AbstractC1341300l0a LIZIZ;
    public final Size LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1341210l0R)) {
            return false;
        }
        C1341210l0R c1341210l0R = (C1341210l0R) obj;
        return this.LIZ == c1341210l0R.LIZ && Intrinsics.LJFF(this.LIZIZ, c1341210l0R.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1341210l0R.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1341210l0R.LIZLLL) && this.LJ == c1341210l0R.LJ && Intrinsics.LJFF(this.LJFF, c1341210l0R.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Size size = this.LIZJ;
        int iHashCode2 = (iHashCode + (size == null ? 0 : size.hashCode())) * 31;
        String str = this.LIZLLL;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str2 = this.LJFF;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentMediaSpec(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", viewSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cidForMonitor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enableLowRes=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", lowResUri=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1341210l0R(EnumC1341600l14 enumC1341600l14, AbstractC1341300l0a abstractC1341300l0a, Size size, String str) {
        this(enumC1341600l14, abstractC1341300l0a, size, str, false, null);
    }

    public C1341210l0R(EnumC1341600l14 enumC1341600l14, AbstractC1341300l0a abstractC1341300l0a, Size size, String str, boolean z, String str2) {
        this.LIZ = enumC1341600l14;
        this.LIZIZ = abstractC1341300l0a;
        this.LIZJ = size;
        this.LIZLLL = str;
        this.LJ = z;
        this.LJFF = str2;
    }
}
