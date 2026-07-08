package X;

/* JADX INFO: renamed from: X.0lBc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348140lBc {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C1348140lBc() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1348140lBc)) {
            return false;
        }
        C1348140lBc c1348140lBc = (C1348140lBc) obj;
        return this.LIZ == c1348140lBc.LIZ && this.LIZIZ == c1348140lBc.LIZIZ;
    }

    public C1348140lBc(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
