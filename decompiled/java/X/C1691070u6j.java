package X;

import kotlin.jvm.internal.AwS27S0202000_25;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0u6j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691070u6j implements InterfaceC1691130u6p {
    public final C20028313Yb LIZ;
    public final Object[] LIZIZ;
    public final int LIZJ;

    @Override // X.InterfaceC1691130u6p
    public final int LIZ(Object obj) {
        C20028313Yb c20028313Yb = this.LIZ;
        int iLIZ = c20028313Yb.LIZ(obj);
        if (iLIZ >= 0) {
            return c20028313Yb.LIZJ[iLIZ];
        }
        return -1;
    }

    @Override // X.InterfaceC1691130u6p
    public final Object LIZLLL(int i) {
        Object[] objArr = this.LIZIZ;
        int i2 = i - this.LIZJ;
        if (i2 >= 0 && i2 <= objArr.length - 1) {
            return objArr[i2];
        }
        return null;
    }

    public C1691070u6j(IntRange intRange, AbstractC1691020u6e<?> abstractC1691020u6e) {
        C1691060u6i c1691060u6iLJFF = abstractC1691020u6e.LJFF();
        int i = intRange.LL;
        if (i < 0) {
            C1691080u6k.LIZJ("negative nearestRange.first");
        }
        int iMin = Math.min(intRange.LLILLJJLI, c1691060u6iLJFF.LIZIZ - 1);
        if (iMin < i) {
            this.LIZ = C1691440u7K.LIZ;
            this.LIZIZ = new Object[0];
            this.LIZJ = 0;
        } else {
            int i2 = (iMin - i) + 1;
            this.LIZIZ = new Object[i2];
            this.LIZJ = i;
            C20028313Yb c20028313Yb = new C20028313Yb(i2);
            c1691060u6iLJFF.LIZIZ(i, iMin, new AwS27S0202000_25(i, iMin, (int) c20028313Yb, (C20028313Yb<Object>) this, (C1691070u6j) 3));
            this.LIZ = c20028313Yb;
        }
    }
}
