package X;

import kotlin.jvm.internal.AwS27S0202000_25;

/* JADX INFO: renamed from: X.0u6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691060u6i<T> {
    public final C19968013Aw<C1691050u6h<T>> LIZ = new C19968013Aw<>(new C1691050u6h[16]);
    public int LIZIZ;
    public C1691050u6h<? extends T> LIZJ;

    public final C1691050u6h<T> LIZJ(int i) {
        if (i < 0 || i >= this.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Index ");
            sbLIZ.append(i);
            sbLIZ.append(", size ");
            sbLIZ.append(this.LIZIZ);
            C1691080u6k.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1691050u6h<? extends T> c1691050u6h = this.LIZJ;
        if (c1691050u6h != null) {
            int i2 = c1691050u6h.LIZ;
            if (i < c1691050u6h.LIZIZ + i2 && i2 <= i) {
                return c1691050u6h;
            }
        }
        C19968013Aw<C1691050u6h<T>> c19968013Aw = this.LIZ;
        C1691050u6h c1691050u6h2 = (C1691050u6h<? extends T>) c19968013Aw.LL[C1691100u6m.LIZ(i, c19968013Aw)];
        this.LIZJ = c1691050u6h2;
        return c1691050u6h2;
    }

    public final void LIZ(int i, InterfaceC1691090u6l interfaceC1691090u6l) {
        if (i < 0) {
            C1691080u6k.LIZ("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        C1691050u6h c1691050u6h = new C1691050u6h(this.LIZIZ, i, interfaceC1691090u6l);
        this.LIZIZ += i;
        this.LIZ.LIZLLL(c1691050u6h);
    }

    public final void LIZIZ(int i, int i2, AwS27S0202000_25 awS27S0202000_25) {
        boolean z;
        if (i >= 0 && i < this.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Index ");
            sbLIZ.append(i);
            sbLIZ.append(", size ");
            sbLIZ.append(this.LIZIZ);
            C1691080u6k.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i2 < 0 || i2 >= this.LIZIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Index ");
            sbLIZ2.append(i2);
            sbLIZ2.append(", size ");
            sbLIZ2.append(this.LIZIZ);
            C1691080u6k.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (i2 < i) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("toIndex (");
            sbLIZ3.append(i2);
            sbLIZ3.append(") should be not smaller than fromIndex (");
            sbLIZ3.append(i);
            sbLIZ3.append(')');
            C1691080u6k.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        }
        int iLIZ = C1691100u6m.LIZ(i, this.LIZ);
        int i3 = this.LIZ.LL[iLIZ].LIZ;
        while (i3 <= i2) {
            C1691050u6h<T> c1691050u6h = this.LIZ.LL[iLIZ];
            awS27S0202000_25.invoke(c1691050u6h);
            i3 += c1691050u6h.LIZIZ;
            iLIZ++;
        }
    }
}
