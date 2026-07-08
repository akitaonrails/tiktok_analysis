package X;

/* JADX INFO: renamed from: X.0lBb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348130lBb {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C1348130lBb() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1348130lBb)) {
            return false;
        }
        C1348130lBb c1348130lBb = (C1348130lBb) obj;
        return this.LIZ == c1348130lBb.LIZ && this.LIZIZ == c1348130lBb.LIZIZ;
    }

    public C1348130lBb(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
