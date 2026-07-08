package X;

/* JADX INFO: renamed from: X.0jYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285680jYs {
    public static final C1285680jYs LIZIZ = new C1285680jYs("default");
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        return this.LIZ;
    }

    public C1285680jYs(String str) {
        this.LIZ = str.toLowerCase();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1285680jYs)) {
            return false;
        }
        return this.LIZ.equals(((C1285680jYs) obj).LIZ);
    }
}
