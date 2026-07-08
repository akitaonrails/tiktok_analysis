package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07bp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1896707bp {
    public final String LIZ;
    public final Fragment LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1896707bp)) {
            return false;
        }
        C1896707bp c1896707bp = (C1896707bp) obj;
        return Intrinsics.LJFF(this.LIZ, c1896707bp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1896707bp.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdWebFragmentLifecycleEvent(containerId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fragment=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1896707bp(String str, Fragment fragment) {
        this.LIZ = str;
        this.LIZIZ = fragment;
    }
}
