package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594950NVd<T> implements InterfaceC594940NVc<T> {
    public final List<T> LIZ;
    public final float[] LIZIZ;
    public final int LIZJ;

    @Override // X.InterfaceC594940NVc
    public final float LIZIZ() {
        float[] fArr = this.LIZIZ;
        int i = 1;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMin = fArr[0];
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMin = Math.min(fMin, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        Float fValueOf = Float.valueOf(fMin);
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return Float.NaN;
    }

    @Override // X.InterfaceC594940NVc
    public final float LJ() {
        Float fLJJJJJ = C13LQ.LJJJJJ(this.LIZIZ);
        if (fLJJJJJ != null) {
            return fLJJJJJ.floatValue();
        }
        return Float.NaN;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + Arrays.hashCode(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int i = this.LIZJ;
        int i2 = 0;
        while (i2 < i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C13LP.LJJJLZIJ(i2, this.LIZ));
            sbLIZ.append('=');
            float[] fArr = this.LIZIZ;
            sbLIZ.append((i2 < 0 || i2 > fArr.length + (-1)) ? ((Number) C1677950tlZ.LIZIZ.invoke(Integer.valueOf(i2))).floatValue() : fArr[i2]);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            if (i2 < this.LIZJ - 1) {
                sb.append(", ");
            }
            i2++;
        }
        sb.append("})");
        return sb.toString();
    }

    @Override // X.InterfaceC594940NVc
    public final T LIZ(float f) {
        float[] fArr = this.LIZIZ;
        int length = fArr.length;
        int i = -1;
        float f2 = Float.POSITIVE_INFINITY;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            float fAbs = Math.abs(f - fArr[i2]);
            if (fAbs <= f2) {
                i = i3;
                f2 = fAbs;
            }
            i2++;
            i3 = i4;
        }
        return (T) ListProtector.get(this.LIZ, i);
    }

    @Override // X.InterfaceC594940NVc
    public final boolean LIZJ(T t) {
        if (this.LIZ.indexOf(t) != -1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC594940NVc
    public final float LIZLLL(T t) {
        int iIndexOf = this.LIZ.indexOf(t);
        float[] fArr = this.LIZIZ;
        AFwS240S0000000_9 aFwS240S0000000_9 = C1677950tlZ.LIZIZ;
        if (iIndexOf >= 0 && iIndexOf <= fArr.length - 1) {
            return fArr[iIndexOf];
        }
        return ((Number) aFwS240S0000000_9.invoke(Integer.valueOf(iIndexOf))).floatValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C594950NVd)) {
            return false;
        }
        C594950NVd c594950NVd = (C594950NVd) obj;
        if (Intrinsics.LJFF(this.LIZ, c594950NVd.LIZ) && Arrays.equals(this.LIZIZ, c594950NVd.LIZIZ) && this.LIZJ == c594950NVd.LIZJ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C594950NVd(List<? extends T> list, float[] fArr) {
        this.LIZ = list;
        this.LIZIZ = fArr;
        list.size();
        this.LIZJ = fArr.length;
    }

    @Override // X.InterfaceC594940NVc
    public final T LJFF(float f, boolean z) {
        float f2;
        float[] fArr = this.LIZIZ;
        int length = fArr.length;
        int i = -1;
        int i2 = 0;
        float f3 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i2 < length) {
            float f4 = fArr[i2];
            int i4 = i3 + 1;
            if (z) {
                f2 = f4 - f;
            } else {
                f2 = f - f4;
            }
            if (f2 < 0.0f) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if (f2 <= f3) {
                i = i3;
                f3 = f2;
            }
            i2++;
            i3 = i4;
        }
        return (T) ListProtector.get(this.LIZ, i);
    }
}
