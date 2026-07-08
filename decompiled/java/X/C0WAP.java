package X;

/* JADX INFO: renamed from: X.0WAP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WAP {
    public final C0WAR LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0WAP)) {
            return false;
        }
        C0WAP c0wap = (C0WAP) obj;
        if (this.LIZ == c0wap.LIZ && this.LIZIZ.equals(c0wap.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C0WAP(C0WAR c0war, String str) {
        this.LIZ = c0war;
        this.LIZIZ = str;
    }
}
