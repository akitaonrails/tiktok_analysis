package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537760L7e implements InterfaceC538410L9r {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int[][] LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GridType(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rows=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", columns=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", maxCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", itemDetails=");
        sbLIZ.append(Arrays.toString(this.LJ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C537760L7e() {
        this("", 1, 1, 1, new int[][]{new int[]{0, 0, 1, 1}});
    }

    public final int hashCode() {
        return (((((((this.LIZIZ * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LIZ.hashCode()) * 31) + Arrays.deepHashCode(this.LJ);
    }

    @Override // X.InterfaceC538410L9r
    public final int LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC538410L9r
    public final int[][] LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC538410L9r
    public final int LIZJ() {
        return this.LIZJ;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C537760L7e.class, cls)) {
            return false;
        }
        C537760L7e c537760L7e = (C537760L7e) obj;
        if (this.LIZIZ == c537760L7e.LIZIZ && this.LIZJ == c537760L7e.LIZJ && this.LIZLLL == c537760L7e.LIZLLL && Intrinsics.LJFF(this.LIZ, c537760L7e.LIZ) && C13BK.LIZIZ(this.LJ, c537760L7e.LJ)) {
            return true;
        }
        return false;
    }

    public C537760L7e(String str, int i, int i2, int i3, int[][] iArr) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = iArr;
    }
}
