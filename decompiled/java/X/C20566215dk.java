package X;

/* JADX INFO: renamed from: X.15dk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20566215dk implements InterfaceC1869470ykT {
    public final float LL;
    public final float LLILLJJLI;
    public final C1869440ykQ LLILLL;

    public final float getHeightThreshold() {
        return this.LLILLJJLI;
    }

    public final float getWidthThreshold() {
        return this.LL;
    }

    @Override // X.InterfaceC1869470ykT
    public C1869440ykQ getStrategyContext() {
        return this.LLILLL;
    }

    public C20566215dk(float f, float f2, C1869440ykQ c1869440ykQ) {
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = c1869440ykQ;
    }
}
