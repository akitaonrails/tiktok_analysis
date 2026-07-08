package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS37S0001000_25;

/* JADX INFO: renamed from: X.0u6W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690940u6W {
    public final C1690990u6b LIZ;
    public final ArrayList<C1690930u6V> LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public final List<Integer> LJI;
    public List<C1561460qjg> LJII;
    public int LJIIIIZZ;

    public final int LIZLLL() {
        return this.LIZ.LIZIZ.LIZIZ;
    }

    public final int LIZ() {
        return ((int) Math.sqrt((((double) LIZLLL()) * 1.0d) / ((double) this.LJIIIIZZ))) + 1;
    }

    public C1690940u6W(C1690990u6b c1690990u6b) {
        this.LIZ = c1690990u6b;
        ArrayList<C1690930u6V> arrayList = new ArrayList<>();
        arrayList.add(new C1690930u6V(0, 0));
        this.LIZIZ = arrayList;
        this.LJFF = -1;
        this.LJI = new ArrayList();
        this.LJII = C13BV.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1690420u5g LIZIZ(int r9) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1690940u6W.LIZIZ(int):X.0u5g");
    }

    public final int LIZJ(int i) {
        int i2;
        if (LIZLLL() <= 0) {
            return 0;
        }
        if (i >= LIZLLL()) {
            C1691080u6k.LIZ("ItemIndex > total count");
        }
        if (!this.LIZ.LIZJ) {
            return i / this.LJIIIIZZ;
        }
        int iLJII = C1697810uHb.LJII(this.LIZIZ, new AwS37S0001000_25(i, 8));
        if (iLJII < 0) {
            iLJII = (-iLJII) - 2;
        }
        int iLIZ = LIZ() * iLJII;
        int i3 = ((C1690930u6V) ListProtector.get(this.LIZIZ, iLJII)).LIZ;
        if (i3 > i) {
            C1691080u6k.LIZ("currentItemIndex > itemIndex");
        }
        int i4 = 0;
        while (i3 < i) {
            int i5 = i3 + 1;
            int iLJ = LJ(i3);
            i4 += iLJ;
            int i6 = this.LJIIIIZZ;
            if (i4 >= i6) {
                iLIZ++;
                if (i4 == i6) {
                    i4 = 0;
                } else {
                    i4 = iLJ;
                }
            }
            if (iLIZ % LIZ() == 0 && iLIZ / LIZ() >= this.LIZIZ.size()) {
                ArrayList<C1690930u6V> arrayList = this.LIZIZ;
                if (i4 > 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                arrayList.add(new C1690930u6V(i5 - i2, 0));
            }
            i3 = i5;
        }
        if (i4 + LJ(i) > this.LJIIIIZZ) {
            return iLIZ + 1;
        }
        return iLIZ;
    }

    public final int LJ(int i) {
        C1691110u6n c1691110u6n = C1691110u6n.LIZ;
        C1691110u6n.LIZIZ = this.LJIIIIZZ;
        C1691050u6h<C1690950u6X> c1691050u6hLIZJ = this.LIZ.LIZIZ.LIZJ(i);
        return (int) c1691050u6hLIZJ.LIZJ.LIZIZ.invoke(c1691110u6n, Integer.valueOf(i - c1691050u6hLIZJ.LIZ)).LIZ;
    }
}
