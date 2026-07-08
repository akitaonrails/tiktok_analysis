package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0u5K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1690200u5K {
    public final boolean LIZ;
    public final C1672540tcq LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final AbstractC1690150u5F LJ;
    public final C1690940u6W LJFF;

    public abstract C1690210u5L LIZIZ(int i, C1690030u53[] c1690030u53Arr, List<C1561460qjg> list, int i2);

    public final C1690210u5L LIZJ(int i) {
        int i2;
        C1690420u5g c1690420u5gLIZIZ = this.LJFF.LIZIZ(i);
        int size = c1690420u5gLIZIZ.LIZIZ.size();
        if (size != 0 && c1690420u5gLIZIZ.LIZ + size != this.LIZJ) {
            i2 = this.LIZLLL;
        } else {
            i2 = 0;
        }
        C1690030u53[] c1690030u53Arr = new C1690030u53[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = (int) ((C1561460qjg) ListProtector.get(c1690420u5gLIZIZ.LIZIZ, i4)).LIZ;
            C1690030u53 c1690030u53LIZJ = this.LJ.LIZJ(c1690420u5gLIZIZ.LIZ + i4, i3, i5, i2, LIZ(i3, i5));
            i3 += i5;
            c1690030u53Arr[i4] = c1690030u53LIZJ;
        }
        return LIZIZ(i, c1690030u53Arr, c1690420u5gLIZIZ.LIZIZ, i2);
    }

    public final long LIZ(int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = this.LIZIZ.LIZ[i];
        } else {
            int i4 = (i2 + i) - 1;
            C1672540tcq c1672540tcq = this.LIZIZ;
            int[] iArr = c1672540tcq.LIZIZ;
            i3 = (iArr[i4] + c1672540tcq.LIZ[i4]) - iArr[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (this.LIZ) {
            return C1682390tsj.LJII(i3, i3, 0, Integer.MAX_VALUE);
        }
        return C1682390tsj.LJII(0, Integer.MAX_VALUE, i3, i3);
    }

    public AbstractC1690200u5K(boolean z, C1672540tcq c1672540tcq, int i, int i2, AbstractC1690150u5F abstractC1690150u5F, C1690940u6W c1690940u6W) {
        this.LIZ = z;
        this.LIZIZ = c1672540tcq;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = abstractC1690150u5F;
        this.LJFF = c1690940u6W;
    }
}
