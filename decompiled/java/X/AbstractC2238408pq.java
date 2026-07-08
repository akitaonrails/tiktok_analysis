package X;

/* JADX INFO: renamed from: X.08pq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2238408pq extends AbstractC2252651DEx {
    public abstract AbstractC2238408pq LLIILII();

    @Override // X.AbstractC2252651DEx
    public String toString() {
        String str;
        AbstractC2238408pq abstractC2238408pqLLIILII;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        if (this == abstractC2238408pq) {
            str = "Dispatchers.Main";
        } else {
            str = null;
            try {
                abstractC2238408pqLLIILII = abstractC2238408pq.LLIILII();
            } catch (UnsupportedOperationException unused) {
                abstractC2238408pqLLIILII = null;
            }
            if (this == abstractC2238408pqLLIILII) {
                str = "Dispatchers.Main.immediate";
            }
        }
        if (str != null) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append('@');
        sbLIZ.append(C2239208py.LIZ(this));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC2252651DEx
    public AbstractC2252651DEx limitedParallelism(int i) {
        C1917207f8.LIZ(i);
        return this;
    }
}
