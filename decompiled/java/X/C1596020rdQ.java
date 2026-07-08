package X;

/* JADX INFO: renamed from: X.0rdQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596020rdQ<T> {
    public final T LIZ;
    public final EnumC1595320rcI LIZIZ;
    public final Exception LIZJ;

    public C1596020rdQ() {
        this(null, null, null, 63);
    }

    public C1596020rdQ(Object obj, EnumC1595320rcI enumC1595320rcI, Exception exc, int i) {
        obj = (i & 1) != 0 ? (T) null : obj;
        enumC1595320rcI = (i & 2) != 0 ? EnumC1595320rcI.FAIL : enumC1595320rcI;
        exc = (i & 8) != 0 ? null : exc;
        this.LIZ = (T) obj;
        this.LIZIZ = enumC1595320rcI;
        this.LIZJ = exc;
    }
}
