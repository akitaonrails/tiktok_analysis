package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777090wLT {
    public final View LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777090wLT)) {
            return false;
        }
        C1777090wLT c1777090wLT = (C1777090wLT) obj;
        return Intrinsics.LJFF(this.LIZ, c1777090wLT.LIZ) && this.LIZIZ == c1777090wLT.LIZIZ && this.LIZJ == c1777090wLT.LIZJ;
    }

    public final int hashCode() {
        View view = this.LIZ;
        return ((((view == null ? 0 : view.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CachedRenderView(renderView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", videoW=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", videoH=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777090wLT(View view, int i, int i2) {
        this.LIZ = view;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
