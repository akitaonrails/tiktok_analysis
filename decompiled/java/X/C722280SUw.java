package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722280SUw implements C07XH {
    public final C722300SUy LIZ;
    public final CharSequence LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C722280SUw)) {
            return false;
        }
        C722280SUw c722280SUw = (C722280SUw) obj;
        return Intrinsics.LJFF(this.LIZ, c722280SUw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c722280SUw.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WarningLabelModel(headIcon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append((Object) this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C722280SUw(C722300SUy c722300SUy, C1360500lVY c1360500lVY) {
        this.LIZ = c722300SUy;
        this.LIZIZ = c1360500lVY;
    }
}
