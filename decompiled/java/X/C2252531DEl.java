package X;

import X.InterfaceC2252551DEn;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: X.1DEl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2252531DEl<T extends InterfaceC2252551DEn & Comparable<? super T>> {
    public static final AtomicIntegerFieldUpdater LIZIZ = AtomicIntegerFieldUpdater.newUpdater(C2252531DEl.class, "_size");
    public T[] LIZ;
    public volatile int _size;

    public final int LIZIZ() {
        return LIZIZ.get(this);
    }

    public final void LIZ(AbstractRunnableC2252511DEj abstractRunnableC2252511DEj) {
        abstractRunnableC2252511DEj.LJII((C2252561DEo) this);
        T[] tArr = this.LIZ;
        if (tArr == null) {
            tArr = (T[]) new InterfaceC2252551DEn[4];
            this.LIZ = tArr;
        } else if (LIZIZ() >= tArr.length) {
            tArr = (T[]) ((InterfaceC2252551DEn[]) Arrays.copyOf(tArr, LIZIZ() * 2));
            this.LIZ = tArr;
        }
        int iLIZIZ = LIZIZ();
        LIZIZ.set(this, iLIZIZ + 1);
        tArr[iLIZIZ] = abstractRunnableC2252511DEj;
        abstractRunnableC2252511DEj.LLILLJJLI = iLIZIZ;
        while (iLIZIZ > 0) {
            T[] tArr2 = this.LIZ;
            int i = (iLIZIZ - 1) / 2;
            if (((Comparable) tArr2[i]).compareTo(tArr2[iLIZIZ]) > 0) {
                LJ(iLIZIZ, i);
                iLIZIZ = i;
            } else {
                return;
            }
        }
    }

    public final void LIZJ(InterfaceC2252551DEn interfaceC2252551DEn) {
        synchronized (this) {
            if (interfaceC2252551DEn.LJFF() != null) {
                LIZLLL(interfaceC2252551DEn.getIndex());
            }
        }
    }

    public final T LIZLLL(int i) {
        T[] tArr = this.LIZ;
        LIZIZ.set(this, LIZIZ() - 1);
        if (i < LIZIZ()) {
            LJ(i, LIZIZ());
            int i2 = (i - 1) / 2;
            if (i > 0 && ((Comparable) tArr[i]).compareTo(tArr[i2]) < 0) {
                LJ(i, i2);
                while (i2 > 0) {
                    T[] tArr2 = this.LIZ;
                    int i3 = (i2 - 1) / 2;
                    if (((Comparable) tArr2[i3]).compareTo(tArr2[i2]) <= 0) {
                        break;
                    }
                    LJ(i2, i3);
                    i2 = i3;
                }
            } else {
                while (true) {
                    int i4 = (i * 2) + 1;
                    if (i4 >= LIZIZ()) {
                        break;
                    }
                    T[] tArr3 = this.LIZ;
                    int i5 = i4 + 1;
                    if (i5 < LIZIZ() && ((Comparable) tArr3[i5]).compareTo(tArr3[i4]) < 0) {
                        i4 = i5;
                    }
                    if (((Comparable) tArr3[i]).compareTo(tArr3[i4]) <= 0) {
                        break;
                    }
                    LJ(i, i4);
                    i = i4;
                }
            }
        }
        T t = tArr[LIZIZ()];
        t.LJII(null);
        t.setIndex(-1);
        tArr[LIZIZ()] = null;
        return t;
    }

    public final void LJ(int i, int i2) {
        T[] tArr = this.LIZ;
        T t = tArr[i2];
        T t2 = tArr[i];
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }
}
