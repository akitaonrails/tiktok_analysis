package X;

/* JADX INFO: renamed from: X.1B0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197921B0k extends AbstractC2197911B0j {
    public final C0KPG LLILZIL;

    @Override // X.AbstractC2197911B0j
    public final C0KPG LIZIZ() {
        return this.LLILZIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2197921B0k(C0KPG c0kpg) {
        String str;
        EnumC2197951B0n enumC2197951B0n = EnumC2197951B0n.PURCHASE_FAILED;
        C0KQW c0kqw = c0kpg.LIZLLL;
        if (c0kqw != null) {
            str = c0kqw.LIZIZ;
        } else {
            str = null;
        }
        super(enumC2197951B0n, 0, str, c0kpg, null, 102);
        this.LLILZIL = c0kpg;
    }
}
