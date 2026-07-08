package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588450N6d {
    public final ViewGroup LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C588450N6d)) {
            return false;
        }
        C588450N6d c588450N6d = (C588450N6d) obj;
        return Intrinsics.LJFF(this.LIZ, c588450N6d.LIZ) && this.LIZIZ == c588450N6d.LIZIZ && this.LIZJ == c588450N6d.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StableRightAreaClipState(viewGroup=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clipChildren=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clipToPadding=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C588450N6d(ViewGroup viewGroup, boolean z, boolean z2) {
        this.LIZ = viewGroup;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
