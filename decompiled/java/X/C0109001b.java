package X;

/* JADX INFO: renamed from: X.001b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0109001b {
    public final String LIZ;
    public final Integer LIZIZ;

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public C0109001b(String str, Integer num) {
        this.LIZ = str;
        this.LIZIZ = num;
    }
}
