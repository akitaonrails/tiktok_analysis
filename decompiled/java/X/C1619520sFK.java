package X;

import com.bytedance.touchpoint.api.model.BottomTabBubble;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sFK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619520sFK implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final C291001Au<BottomTabBubble> LLILZ;

    public C1619520sFK() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1619520sFK)) {
            return false;
        }
        C1619520sFK c1619520sFK = (C1619520sFK) obj;
        return this.LL == c1619520sFK.LL && this.LLILLJJLI == c1619520sFK.LLILLJJLI && this.LLILLL == c1619520sFK.LLILLL && Intrinsics.LJFF(this.LLILZ, c1619520sFK.LLILZ);
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        C291001Au<BottomTabBubble> c291001Au = this.LLILZ;
        return iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoinTabDataState(showBottomTabBubble=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showRewardTabBubble=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pauseLottie=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", bubble=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1619520sFK(int i) {
        this(false, false, false, null);
    }

    public C1619520sFK(boolean z, boolean z2, boolean z3, C291001Au<BottomTabBubble> c291001Au) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = c291001Au;
    }

    public static C1619520sFK LIZ(C1619520sFK c1619520sFK, boolean z, C291001Au c291001Au, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            z = c1619520sFK.LL;
        }
        boolean z3 = false;
        if ((i & 2) != 0) {
            z2 = c1619520sFK.LLILLJJLI;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = c1619520sFK.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au = c1619520sFK.LLILZ;
        }
        c1619520sFK.getClass();
        return new C1619520sFK(z, z2, z3, c291001Au);
    }
}
