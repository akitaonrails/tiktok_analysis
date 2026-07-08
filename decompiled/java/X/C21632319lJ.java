package X;

/* JADX INFO: renamed from: X.19lJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21632319lJ implements InterfaceC21631619lC<Integer> {
    public final int LIZ;
    public final int LIZIZ;

    @Override // X.InterfaceC21631619lC
    public final int Q0() {
        return (this.LIZIZ - this.LIZ) + 1;
    }

    @Override // X.InterfaceC21631619lC
    public final Integer getItem(int i) {
        if (i >= 0 && i < Q0()) {
            return Integer.valueOf((this.LIZ + i) % 24);
        }
        return 0;
    }

    public C21632319lJ(int i, int i2) {
        this.LIZ = i;
        if (i2 > i) {
            this.LIZIZ = i2;
        } else {
            this.LIZIZ = i2 + 24;
        }
    }
}
