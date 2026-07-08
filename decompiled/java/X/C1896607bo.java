package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1896607bo {
    public final Fragment LIZ;
    public final Fragment LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1896607bo)) {
            return false;
        }
        C1896607bo c1896607bo = (C1896607bo) obj;
        return Intrinsics.LJFF(this.LIZ, c1896607bo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1896607bo.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Fragment fragment = this.LIZIZ;
        return iHashCode + (fragment == null ? 0 : fragment.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TargetFragmentResult(fragment=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", staleFragment=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1896607bo(Fragment fragment, Fragment fragment2) {
        this.LIZ = fragment;
        this.LIZIZ = fragment2;
    }
}
