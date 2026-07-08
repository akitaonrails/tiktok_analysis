package X;

/* JADX INFO: renamed from: X.15dj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20566115dj implements InterfaceC1869470ykT {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final C1869440ykQ LLILZIL;

    public final boolean getMoveDownAvoidBlackBar() {
        return this.LLILLJJLI;
    }

    public final boolean getRecordMobOnly() {
        return this.LL;
    }

    public final boolean getShrinkForOut() {
        return this.LLILLL;
    }

    public final boolean getShrinkForText() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1869470ykT
    public C1869440ykQ getStrategyContext() {
        return this.LLILZIL;
    }

    public C20566115dj(boolean z, boolean z2, boolean z3, boolean z4, C1869440ykQ c1869440ykQ) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = z4;
        this.LLILZIL = c1869440ykQ;
    }
}
