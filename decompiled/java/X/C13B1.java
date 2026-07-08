package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.13B1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13B1<E> extends C13B2<E> {
    public C13B0<E> LIZJ;

    public C13B1() {
        this((Object) null);
    }

    public final void LJIIIIZZ() {
        Arrays.fill(this.LIZ, 0, this.LIZIZ, (Object) null);
        this.LIZIZ = 0;
    }

    public C13B1(Object obj) {
        super(16);
    }

    public final void LJI(Object obj) {
        int i = this.LIZIZ + 1;
        Object[] objArr = this.LIZ;
        if (objArr.length < i) {
            LJIIL(i, objArr);
        }
        Object[] objArr2 = this.LIZ;
        int i2 = this.LIZIZ;
        objArr2[i2] = obj;
        this.LIZIZ = i2 + 1;
    }

    public final void LJII(List list) {
        if (!list.isEmpty()) {
            int i = this.LIZIZ;
            int size = list.size() + i;
            Object[] objArr = this.LIZ;
            if (objArr.length < size) {
                LJIIL(size, objArr);
            }
            Object[] objArr2 = this.LIZ;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                objArr2[i2 + i] = ListProtector.get(list, i2);
            }
            this.LIZIZ += list.size();
        }
    }

    public final boolean LJIIIZ(E e) {
        int iLIZJ = LIZJ(e);
        if (iLIZJ >= 0) {
            LJIIJ(iLIZJ);
            return true;
        }
        return false;
    }

    public final E LJIIJ(int i) {
        boolean z = false;
        if (i >= 0 && i < this.LIZIZ) {
            z = true;
        }
        if (z) {
            Object[] objArr = this.LIZ;
            E e = (E) objArr[i];
            int i2 = this.LIZIZ;
            if (i != i2 - 1) {
                int i3 = i + 1;
                System.arraycopy(objArr, i3, objArr, i, i2 - i3);
            }
            int i4 = this.LIZIZ - 1;
            this.LIZIZ = i4;
            objArr[i4] = null;
            return e;
        }
        LJFF(i);
        throw null;
    }

    public final void LJIILIIL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index ");
        sbLIZ.append(i);
        sbLIZ.append(" must be in 0..");
        sbLIZ.append(this.LIZIZ);
        C19968313Az.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        throw null;
    }

    public C13B1(int i) {
        super(i);
    }

    public final void LJIIJJI(int i, int i2) {
        boolean z;
        if (i >= 0 && i <= this.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        if (z && i2 >= 0 && i2 <= this.LIZIZ) {
            if (i2 >= i) {
                if (i2 != i) {
                    int i3 = this.LIZIZ;
                    if (i2 < i3) {
                        Object[] objArr = this.LIZ;
                        System.arraycopy(objArr, i2, objArr, i, i3 - i2);
                    }
                    int i4 = this.LIZIZ;
                    int i5 = i4 - (i2 - i);
                    Arrays.fill(this.LIZ, i5, i4, (Object) null);
                    this.LIZIZ = i5;
                    return;
                }
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Start (");
            sbLIZ.append(i);
            sbLIZ.append(") is more than end (");
            sbLIZ.append(i2);
            sbLIZ.append(')');
            C19968313Az.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            throw null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Start (");
        sbLIZ2.append(i);
        sbLIZ2.append(") and end (");
        sbLIZ2.append(i2);
        sbLIZ2.append(") must be in 0..");
        sbLIZ2.append(this.LIZIZ);
        C19968313Az.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        throw null;
    }

    public final void LJIIL(int i, Object[] objArr) {
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.LIZ = objArr2;
    }
}
