package X;

/* JADX INFO: renamed from: X.0IEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C463230IEn implements C1A7H {
    public final /* synthetic */ C463710IGj LIZ;

    public C463230IEn(C463710IGj c463710IGj) {
        this.LIZ = c463710IGj;
    }

    @Override // X.C1A7H
    public final void LIZ(int i, long j) {
        C0IFA c0ifa;
        if (i != 0 && this.LIZ.LIZIZ && j > 0 && (c0ifa = C0IX5.LJ.get(Long.valueOf(j))) != null && c0ifa.LIZIZ == 1) {
            c0ifa.LJFF |= 8;
        }
    }
}
