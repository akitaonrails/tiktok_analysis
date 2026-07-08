package X;

import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777100wLU {
    public final FrameLayout LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777100wLU)) {
            return false;
        }
        C1777100wLU c1777100wLU = (C1777100wLU) obj;
        return Intrinsics.LJFF(this.LIZ, c1777100wLU.LIZ) && this.LIZIZ == c1777100wLU.LIZIZ && this.LIZJ == c1777100wLU.LIZJ && this.LIZLLL == c1777100wLU.LIZLLL;
    }

    public final int hashCode() {
        FrameLayout frameLayout = this.LIZ;
        return ((((((frameLayout == null ? 0 : frameLayout.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CachedLayoutContainer(root=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", videoW=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", videoH=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bottomViewHeight=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777100wLU(FrameLayout frameLayout, int i, int i2, int i3) {
        this.LIZ = frameLayout;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
