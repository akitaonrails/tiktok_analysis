package X;

/* JADX INFO: renamed from: X.0u5w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690580u5w {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1690580u5w)) {
            return false;
        }
        C1690580u5w c1690580u5w = (C1690580u5w) obj;
        return this.LIZ == c1690580u5w.LIZ && this.LIZIZ == c1690580u5w.LIZIZ;
    }

    public C1690580u5w(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        if (i < 0) {
            C1691080u6k.LIZ("negative start index");
        }
        if (i2 < i) {
            C1691080u6k.LIZ("end index greater than start");
        }
    }
}
