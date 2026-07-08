package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18IO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18IO extends C18IV<Fragment> {
    public final Fragment LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18IO)) {
            return false;
        }
        C18IO c18io = (C18IO) obj;
        return Intrinsics.LJFF(this.LJII, c18io.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c18io.LJIIIIZZ) && this.LJIIIZ == c18io.LJIIIZ && this.LJIIJ == c18io.LJIIJ && this.LJIIJJI == c18io.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c18io.LJIIL) && this.LJIILIIL == c18io.LJIILIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    public final int hashCode() {
        int iHashCode = ((this.LJII.hashCode() * 31) + this.LJIIIIZZ.hashCode()) * 31;
        boolean z = this.LJIIIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode + r0) * 31;
        boolean z2 = this.LJIIJ;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = (i + r02) * 31;
        boolean z3 = this.LJIIJJI;
        ?? r03 = z3;
        if (z3) {
            r03 = 1;
        }
        int i3 = (i2 + r03) * 31;
        String str = this.LJIIL;
        return ((i3 + (str == null ? 0 : str.hashCode())) * 31) + (this.LJIILIIL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FragmentPageInstance(page=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", btm=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", auto=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", singleton=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", reuse=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", sourceBtmToken=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", ignoreSystemFirstResume=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C18IO(Fragment fragment, String str, boolean z, boolean z2, boolean z3, String str2, int i) {
        this(fragment, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : str2, false);
    }

    public C18IO(Fragment fragment, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        super(fragment, str, z, z2, z3, str2, z4);
        this.LJII = fragment;
        this.LJIIIIZZ = str;
        this.LJIIIZ = z;
        this.LJIIJ = z2;
        this.LJIIJJI = z3;
        this.LJIIL = str2;
        this.LJIILIIL = z4;
    }
}
