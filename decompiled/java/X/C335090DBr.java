package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335090DBr {
    public final C0D4D LIZ;
    public final List<C0DCV> LIZIZ;
    public final C335070DBp LIZJ;
    public final AnonymousClass0098 LIZLLL;

    public C335090DBr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C335090DBr)) {
            return false;
        }
        C335090DBr c335090DBr = (C335090DBr) obj;
        return Intrinsics.LJFF(this.LIZ, c335090DBr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c335090DBr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c335090DBr.LIZJ) && this.LIZLLL == c335090DBr.LIZLLL;
    }

    public final int hashCode() {
        C0D4D c0d4d = this.LIZ;
        int iHashCode = (((c0d4d == null ? 0 : c0d4d.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31;
        C335070DBp c335070DBp = this.LIZJ;
        return ((iHashCode + (c335070DBp != null ? c335070DBp.hashCode() : 0)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OneStepScreenState(skuPanelState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", contentItems=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bottomBarState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", brandBenefitsPlacement=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C335090DBr(C0D4D c0d4d, List list, C335070DBp c335070DBp) {
        AnonymousClass0098 anonymousClass0098 = AnonymousClass0098.AfterCheckoutContentBeforeBottomBar;
        this.LIZ = c0d4d;
        this.LIZIZ = list;
        this.LIZJ = c335070DBp;
        this.LIZLLL = anonymousClass0098;
    }
}
