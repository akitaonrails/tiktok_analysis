package X;

/* JADX INFO: renamed from: X.1Aae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182101Aae {
    public final long LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2182101Aae)) {
            return false;
        }
        C2182101Aae c2182101Aae = (C2182101Aae) obj;
        return this.LIZ == c2182101Aae.LIZ && this.LIZIZ == c2182101Aae.LIZIZ;
    }

    public final C2233761Cbm LIZ() {
        return new C2233761Cbm(Long.valueOf(this.LIZ), Long.valueOf(this.LIZIZ));
    }

    public C2182101Aae(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
