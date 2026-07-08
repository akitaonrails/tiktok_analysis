package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2173661A5c extends AbstractC2173741A5k {
    public final C1722300uv6 LIZ;
    public final View LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Float LIZLLL;

    public C2173661A5c() {
        this(null, null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2173661A5c)) {
            return false;
        }
        C2173661A5c c2173661A5c = (C2173661A5c) obj;
        return Intrinsics.LJFF(this.LIZ, c2173661A5c.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2173661A5c.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2173661A5c.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2173661A5c.LIZLLL);
    }

    public final int hashCode() {
        C1722300uv6 c1722300uv6 = this.LIZ;
        int iHashCode = (c1722300uv6 == null ? 0 : c1722300uv6.hashCode()) * 31;
        View view = this.LIZIZ;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        Function0<Unit> function0 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Float f = this.LIZLLL;
        return iHashCode3 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(tuxStatus=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", customView=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onCloseAction=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", topMarginDp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2173661A5c(C1722300uv6 c1722300uv6, View view, Function0 function0, Float f, int i) {
        c1722300uv6 = (i & 1) != 0 ? null : c1722300uv6;
        view = (i & 2) != 0 ? null : view;
        function0 = (i & 4) != 0 ? null : function0;
        f = (i & 8) != 0 ? null : f;
        this.LIZ = c1722300uv6;
        this.LIZIZ = view;
        this.LIZJ = function0;
        this.LIZLLL = f;
    }
}
