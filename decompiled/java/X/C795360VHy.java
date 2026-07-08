package X;

/* JADX INFO: renamed from: X.0VHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C795360VHy {
    public String LIZ;
    public C0VIP LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C795360VHy)) {
            return false;
        }
        C795360VHy c795360VHy = (C795360VHy) obj;
        if (this.LIZIZ != c795360VHy.LIZIZ) {
            return false;
        }
        return this.LIZ.equals(c795360VHy.LIZ);
    }
}
