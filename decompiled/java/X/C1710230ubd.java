package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ubd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710230ubd implements InterfaceC0148002o {
    public final String LL;
    public final C291001Au<List<C1710030ubJ>> LLILLJJLI;
    public final boolean LLILLL;
    public final EnumC1710220ubc LLILZ;
    public final C291001Au<Object> LLILZIL;
    public final C291001Au<Object> LLILZLL;

    public C1710230ubd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1710230ubd)) {
            return false;
        }
        C1710230ubd c1710230ubd = (C1710230ubd) obj;
        return Intrinsics.LJFF(this.LL, c1710230ubd.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1710230ubd.LLILLJJLI) && this.LLILLL == c1710230ubd.LLILLL && this.LLILZ == c1710230ubd.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1710230ubd.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1710230ubd.LLILZLL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        EnumC1710220ubc enumC1710220ubc = this.LLILZ;
        int iHashCode2 = (iHashCode + (enumC1710220ubc == null ? 0 : enumC1710220ubc.hashCode())) * 31;
        C291001Au<Object> c291001Au = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Object> c291001Au2 = this.LLILZLL;
        return iHashCode3 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubCashierState(inputText=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", items=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showSearchBar=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", closeType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", triggerClickLog=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", clearSearchFocus=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1710230ubd(int i) {
        this(null, new C291001Au(C13BV.INSTANCE), false, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1710230ubd(String str, C291001Au<? extends List<C1710030ubJ>> c291001Au, boolean z, EnumC1710220ubc enumC1710220ubc, C291001Au<? extends Object> c291001Au2, C291001Au<? extends Object> c291001Au3) {
        this.LL = str;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = z;
        this.LLILZ = enumC1710220ubc;
        this.LLILZIL = c291001Au2;
        this.LLILZLL = c291001Au3;
    }

    public static C1710230ubd LIZ(C1710230ubd c1710230ubd, C291001Au c291001Au, boolean z, EnumC1710220ubc enumC1710220ubc, C291001Au c291001Au2, int i) {
        String str;
        C291001Au c291001Au3 = c291001Au2;
        EnumC1710220ubc enumC1710220ubc2 = enumC1710220ubc;
        boolean z2 = z;
        C291001Au c291001Au4 = c291001Au;
        C291001Au<Object> c291001Au5 = null;
        if ((i & 1) != 0) {
            str = c1710230ubd.LL;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            c291001Au4 = c1710230ubd.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z2 = c1710230ubd.LLILLL;
        }
        if ((i & 8) != 0) {
            enumC1710220ubc2 = c1710230ubd.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au3 = c1710230ubd.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au5 = c1710230ubd.LLILZLL;
        }
        c1710230ubd.getClass();
        return new C1710230ubd(str, c291001Au4, z2, enumC1710220ubc2, c291001Au3, c291001Au5);
    }
}
