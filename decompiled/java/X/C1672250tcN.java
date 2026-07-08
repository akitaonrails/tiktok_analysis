package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tcN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672250tcN {
    public final EnumC979710bbN LIZ;
    public final C1672260tcO LIZIZ;
    public final float LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final Integer LJI;
    public final Function2<String, Integer, Unit> LJII;
    public final boolean LJIIIIZZ;
    public final float LJIIIZ;

    public C1672250tcN() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1672250tcN)) {
            return false;
        }
        C1672250tcN c1672250tcN = (C1672250tcN) obj;
        return this.LIZ == c1672250tcN.LIZ && Intrinsics.LJFF(this.LIZIZ, c1672250tcN.LIZIZ) && C1668650tWZ.LIZJ(this.LIZJ, c1672250tcN.LIZJ) && this.LIZLLL == c1672250tcN.LIZLLL && this.LJ == c1672250tcN.LJ && Intrinsics.LJFF(this.LJFF, c1672250tcN.LJFF) && Intrinsics.LJFF(this.LJI, c1672250tcN.LJI) && Intrinsics.LJFF(this.LJII, c1672250tcN.LJII) && this.LJIIIIZZ == c1672250tcN.LJIIIIZZ && Float.compare(this.LJIIIZ, c1672250tcN.LJIIIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IconItemState(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageSource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", imagePadding=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZJ));
        sbLIZ.append(", visibility=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", withAnchorView=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", rulesToShow=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", scrollToIndex=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", onClickListener=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", isRedDotIndicatorOn=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str = this.LJFF;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LJI;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Function2<String, Integer, Unit> function2 = this.LJII;
        return ((((iHashCode3 + (function2 != null ? function2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + Float.floatToIntBits(this.LJIIIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1672250tcN(EnumC979710bbN enumC979710bbN, C1672260tcO c1672260tcO, float f, boolean z, Function2 function2, float f2, int i) {
        boolean z2;
        float f3 = f2;
        boolean z3 = z;
        Function2 function22 = function2;
        float f4 = (i & 4) != 0 ? 0 : f;
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(enumC979710bbN, c1672260tcO, f4, z2, (i & 16) != 0 ? false : z3, null, null, (i & 128) != 0 ? null : function22, false, (i & 512) != 0 ? 1.0f : f3);
    }

    public static C1672250tcN LIZ(C1672250tcN c1672250tcN, C1672260tcO c1672260tcO, boolean z, String str, Integer num, boolean z2, int i) {
        EnumC979710bbN enumC979710bbN;
        float f;
        boolean z3;
        float f2;
        boolean z4 = z2;
        String str2 = str;
        boolean z5 = z;
        Integer num2 = num;
        C1672260tcO c1672260tcO2 = c1672260tcO;
        Function2<String, Integer, Unit> function2 = null;
        if ((i & 1) != 0) {
            enumC979710bbN = c1672250tcN.LIZ;
        } else {
            enumC979710bbN = null;
        }
        if ((i & 2) != 0) {
            c1672260tcO2 = c1672250tcN.LIZIZ;
        }
        if ((i & 4) != 0) {
            f = c1672250tcN.LIZJ;
        } else {
            f = 0.0f;
        }
        if ((i & 8) != 0) {
            z5 = c1672250tcN.LIZLLL;
        }
        if ((i & 16) != 0) {
            z3 = c1672250tcN.LJ;
        } else {
            z3 = false;
        }
        if ((i & 32) != 0) {
            str2 = c1672250tcN.LJFF;
        }
        if ((i & 64) != 0) {
            num2 = c1672250tcN.LJI;
        }
        if ((i & 128) != 0) {
            function2 = c1672250tcN.LJII;
        }
        if ((i & 256) != 0) {
            z4 = c1672250tcN.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            f2 = c1672250tcN.LJIIIZ;
        } else {
            f2 = 0.0f;
        }
        c1672250tcN.getClass();
        return new C1672250tcN(enumC979710bbN, c1672260tcO2, f, z5, z3, str2, num2, function2, z4, f2);
    }

    public C1672250tcN(EnumC979710bbN enumC979710bbN, C1672260tcO c1672260tcO, float f, boolean z, boolean z2, String str, Integer num, Function2 function2, boolean z3, float f2) {
        this.LIZ = enumC979710bbN;
        this.LIZIZ = c1672260tcO;
        this.LIZJ = f;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = str;
        this.LJI = num;
        this.LJII = function2;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = f2;
    }
}
