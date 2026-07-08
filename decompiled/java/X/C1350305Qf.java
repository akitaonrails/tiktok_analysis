package X;

/* JADX INFO: renamed from: X.05Qf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1350305Qf {
    public final int LIZ;
    public final C05TY LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1350305Qf)) {
            return false;
        }
        C1350305Qf c1350305Qf = (C1350305Qf) obj;
        return this.LIZ == c1350305Qf.LIZ && this.LIZIZ == c1350305Qf.LIZIZ;
    }

    public C1350305Qf(int i, C05TY c05ty) {
        this.LIZ = i;
        this.LIZIZ = c05ty;
    }
}
