package X;

/* JADX INFO: renamed from: X.0VP2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VP2 {
    public final String LIZ;
    public final long LIZIZ;
    public final EnumC1847970yBn LIZJ;

    public final boolean LIZ(C0VP2 c0vp2) {
        long j;
        long j2 = this.LIZIZ;
        if (c0vp2 != null) {
            j = c0vp2.LIZIZ;
        } else {
            j = 0;
        }
        if (j2 > j) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C0VP2(String str, EnumC1847970yBn enumC1847970yBn) {
        this(str, System.currentTimeMillis(), enumC1847970yBn);
    }

    public C0VP2(String str, long j, EnumC1847970yBn enumC1847970yBn) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = enumC1847970yBn;
    }
}
