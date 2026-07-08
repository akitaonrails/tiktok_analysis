package X;

/* JADX INFO: renamed from: X.156K, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C156K {
    public final C156O LIZ;
    public final int LIZIZ;

    public C156K() {
        this(null, 3, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C156K)) {
            return false;
        }
        C156K c156k = (C156K) obj;
        return this.LIZ == c156k.LIZ && this.LIZIZ == c156k.LIZIZ;
    }

    public C156K(C156O c156o, int i) {
        this.LIZ = c156o;
        this.LIZIZ = i;
    }

    public /* synthetic */ C156K(C156O c156o, int i, int i2) {
        this((i & 1) != 0 ? C156O.PENDING : c156o, 0);
    }
}
