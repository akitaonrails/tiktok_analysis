package X;

/* JADX INFO: renamed from: X.19lK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21632419lK implements InterfaceC21631619lC<Integer> {
    public final int LIZ;
    public final int LIZIZ;

    @Override // X.InterfaceC21631619lC
    public final int Q0() {
        return (this.LIZIZ - this.LIZ) + 1;
    }

    @Override // X.InterfaceC21631619lC
    public final Integer getItem(int i) {
        if (i >= 0 && i < Q0()) {
            return Integer.valueOf(this.LIZ + i);
        }
        return 0;
    }

    public C21632419lK(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
