package X;

/* JADX INFO: renamed from: X.12yY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19930812yY {
    public final AnonymousClass1301 LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 65535) + this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19930812yY)) {
            return false;
        }
        C19930812yY c19930812yY = (C19930812yY) obj;
        if (this.LIZ != c19930812yY.LIZ || this.LIZIZ != c19930812yY.LIZIZ) {
            return false;
        }
        return true;
    }

    public C19930812yY(AnonymousClass1301 anonymousClass1301, int i) {
        this.LIZ = anonymousClass1301;
        this.LIZIZ = i;
    }
}
