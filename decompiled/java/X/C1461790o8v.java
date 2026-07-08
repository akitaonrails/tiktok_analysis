package X;

/* JADX INFO: renamed from: X.0o8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461790o8v {
    public final int LIZ;
    public final boolean LIZIZ;

    public C1461790o8v() {
        this(0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1461790o8v)) {
            return false;
        }
        C1461790o8v c1461790o8v = (C1461790o8v) obj;
        return this.LIZ == c1461790o8v.LIZ && this.LIZIZ == c1461790o8v.LIZIZ;
    }

    public C1461790o8v(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
