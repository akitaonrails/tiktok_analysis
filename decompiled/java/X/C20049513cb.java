package X;

import Y.AComparatorS49S0000000_30;
import java.util.TreeSet;

/* JADX INFO: renamed from: X.13cb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20049513cb {
    public final boolean LIZ = false;
    public C20028313Yb<C20053713dH> LIZIZ;
    public final C1113990f5x<C20053713dH> LIZJ;

    public final C20053713dH LIZJ() {
        C20053713dH c20053713dHFirst = first();
        LIZLLL(c20053713dHFirst);
        return c20053713dHFirst;
    }

    public final String toString() {
        return toString();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0f5x, X.0f5x<X.13dH>] */
    public C20049513cb() {
        final AComparatorS49S0000000_30 aComparatorS49S0000000_30 = C20049713cd.LIZ;
        this.LIZJ = new TreeSet<E>(aComparatorS49S0000000_30) { // from class: X.0f5x
            public static final int $stable = 0;

            public /* bridge */ int getSize() {
                return super.size();
            }

            @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ int size() {
                return getSize();
            }
        };
    }

    public final void LIZ(C20053713dH c20053713dH) {
        int i;
        if (!c20053713dH.LIZLLL()) {
            C1696250uF5.LIZIZ("DepthSortedSet.add called on an unattached node");
        }
        if (this.LIZ) {
            if (this.LIZIZ == null) {
                this.LIZIZ = C1691440u7K.LIZ();
            }
            C20028313Yb<C20053713dH> c20028313Yb = this.LIZIZ;
            int iLIZ = c20028313Yb.LIZ(c20053713dH);
            if (iLIZ >= 0 && (i = c20028313Yb.LIZJ[iLIZ]) != Integer.MAX_VALUE) {
                if (i != c20053713dH.LLJJI) {
                    C1696250uF5.LIZIZ("invalid node depth");
                }
            } else {
                c20028313Yb.LJII(c20053713dH.LLJJI, c20053713dH);
            }
        }
        add(c20053713dH);
    }

    public final boolean LIZIZ(C20053713dH c20053713dH) {
        boolean z;
        boolean zContains = contains(c20053713dH);
        if (this.LIZ) {
            if (this.LIZIZ == null) {
                this.LIZIZ = C1691440u7K.LIZ();
            }
            if (this.LIZIZ.LIZ(c20053713dH) >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (zContains != z) {
                C1696250uF5.LIZIZ("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public final boolean LIZLLL(C20053713dH c20053713dH) {
        int i;
        if (!c20053713dH.LIZLLL()) {
            C1696250uF5.LIZIZ("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = remove(c20053713dH);
        if (this.LIZ) {
            if (this.LIZIZ == null) {
                this.LIZIZ = C1691440u7K.LIZ();
            }
            C20028313Yb<C20053713dH> c20028313Yb = this.LIZIZ;
            if (c20028313Yb.LIZ(c20053713dH) >= 0) {
                int iLIZIZ = c20028313Yb.LIZIZ(c20053713dH);
                int iLIZ = c20028313Yb.LIZ(c20053713dH);
                if (iLIZ >= 0) {
                    c20028313Yb.LJI(iLIZ);
                }
                if (zRemove) {
                    i = c20053713dH.LLJJI;
                } else {
                    i = Integer.MAX_VALUE;
                }
                if (iLIZIZ != i) {
                    C1696250uF5.LIZIZ("invalid node depth");
                }
            }
        }
        return zRemove;
    }
}
