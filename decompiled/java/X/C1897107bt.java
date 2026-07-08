package X;

import com.bytedance.router.RouteIntent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07bt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1897107bt extends AbstractC1897007bs {
    public final RouteIntent LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1897107bt)) {
            return false;
        }
        C1897107bt c1897107bt = (C1897107bt) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1897107bt.LIZIZ) && this.LIZJ == c1897107bt.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1897107bt.LIZLLL);
    }

    public final int hashCode() {
        return (((this.LIZIZ.hashCode() * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(intent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1897107bt(int i, RouteIntent routeIntent, String str) {
        super(routeIntent);
        this.LIZIZ = routeIntent;
        this.LIZJ = i;
        this.LIZLLL = str;
    }
}
