package X;

/* JADX INFO: renamed from: X.0OUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C620150OUb {
    public long LIZ = 0;
    public long LIZIZ = 0;

    public final long LIZ() {
        return Math.max(0L, this.LIZIZ - this.LIZ);
    }

    public final void LIZJ() {
        if (this.LIZIZ == 0) {
            this.LIZIZ = System.currentTimeMillis();
        }
    }

    public final void LIZIZ() {
        this.LIZIZ = System.currentTimeMillis();
    }

    public final void LIZLLL() {
        this.LIZ = System.currentTimeMillis();
    }
}
