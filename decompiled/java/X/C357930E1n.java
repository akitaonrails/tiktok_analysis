package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357930E1n {
    public final Integer LIZ;
    public final String LIZIZ;
    public final C375830EoP<Unit> LIZJ;
    public final C375830EoP<Bitmap> LIZLLL;
    public final boolean LJ;
    public final float LJFF;

    public C357930E1n() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C357930E1n)) {
            return false;
        }
        C357930E1n c357930E1n = (C357930E1n) obj;
        return Intrinsics.LJFF(this.LIZ, c357930E1n.LIZ) && Intrinsics.LJFF(this.LIZIZ, c357930E1n.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c357930E1n.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c357930E1n.LIZLLL) && this.LJ == c357930E1n.LJ && Float.compare(this.LJFF, c357930E1n.LJFF) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MagicPanelSceneState(resetColorRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectedCategory=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", magicChanged=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showGuideEvent=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showLoading=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", loadingProgress=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        C375830EoP<Bitmap> c375830EoP2 = this.LIZLLL;
        return ((((iHashCode3 + (c375830EoP2 != null ? c375830EoP2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF);
    }

    public /* synthetic */ C357930E1n(int i) {
        this(null, null, null, null, false, 0.0f);
    }

    public C357930E1n(Integer num, String str, C375830EoP<Unit> c375830EoP, C375830EoP<Bitmap> c375830EoP2, boolean z, float f) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = c375830EoP;
        this.LIZLLL = c375830EoP2;
        this.LJ = z;
        this.LJFF = f;
    }

    public static C357930E1n LIZ(C357930E1n c357930E1n, Integer num, String str, C375830EoP c375830EoP, boolean z, float f, int i) {
        C375830EoP<Bitmap> c375830EoP2;
        float f2 = f;
        boolean z2 = z;
        C375830EoP c375830EoP3 = c375830EoP;
        String str2 = str;
        Integer num2 = num;
        if ((i & 1) != 0) {
            num2 = c357930E1n.LIZ;
        }
        if ((i & 2) != 0) {
            str2 = c357930E1n.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP3 = c357930E1n.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP2 = c357930E1n.LIZLLL;
        } else {
            c375830EoP2 = null;
        }
        if ((i & 16) != 0) {
            z2 = c357930E1n.LJ;
        }
        if ((i & 32) != 0) {
            f2 = c357930E1n.LJFF;
        }
        c357930E1n.getClass();
        return new C357930E1n(num2, str2, c375830EoP3, c375830EoP2, z2, f2);
    }
}
