package X;

import com.bytedance.router.RouteIntent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07br, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1896907br extends AbstractC1897007bs {
    public final RouteIntent LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1896907br) && Intrinsics.LJFF(this.LIZIZ, ((C1896907br) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(intent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1896907br(RouteIntent routeIntent) {
        super(routeIntent);
        this.LIZIZ = routeIntent;
    }
}
