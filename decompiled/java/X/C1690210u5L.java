package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0u5L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690210u5L {
    public final int LIZ;
    public final C1690030u53[] LIZIZ;
    public final C1672540tcq LIZJ;
    public final List<C1561460qjg> LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;

    public final C1690030u53[] LIZ(int i, int i2, int i3) {
        int i4;
        int i5;
        C1690030u53[] c1690030u53Arr = this.LIZIZ;
        int length = c1690030u53Arr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            C1690030u53 c1690030u53 = c1690030u53Arr[i6];
            int i9 = i7 + 1;
            int i10 = (int) ((C1561460qjg) ListProtector.get(this.LIZLLL, i7)).LIZ;
            int i11 = this.LIZJ.LIZIZ[i8];
            if (this.LJ) {
                i4 = this.LIZ;
                i5 = i8;
            } else {
                i4 = i8;
                i5 = this.LIZ;
            }
            c1690030u53.LJIIZILJ(i, i11, i2, i3, i4, i5);
            i8 += i10;
            i6++;
            i7 = i9;
        }
        return this.LIZIZ;
    }

    public C1690210u5L(int i, C1690030u53[] c1690030u53Arr, C1672540tcq c1672540tcq, List<C1561460qjg> list, boolean z, int i2) {
        this.LIZ = i;
        this.LIZIZ = c1690030u53Arr;
        this.LIZJ = c1672540tcq;
        this.LIZLLL = list;
        this.LJ = z;
        this.LJFF = i2;
        int iMax = 0;
        for (C1690030u53 c1690030u53 : c1690030u53Arr) {
            iMax = Math.max(iMax, c1690030u53.LJIILL);
        }
        this.LJI = iMax;
        int i3 = iMax + this.LJFF;
        this.LJII = i3 >= 0 ? i3 : 0;
    }
}
