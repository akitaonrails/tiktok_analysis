package X;

/* JADX INFO: renamed from: X.0cJ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006760cJ0 extends C1006740cIy {
    public final boolean LIZJ;
    public final EnumC1006700cIu LIZLLL = EnumC1006700cIu.MAIN_THREAD_STATE;

    @Override // X.C1006740cIy
    public final int LIZ() {
        return this.LIZJ ? 25 : 100;
    }

    @Override // X.C1006740cIy
    public final boolean LIZJ() {
        return !this.LIZJ;
    }

    @Override // X.C1006740cIy
    public final EnumC1006700cIu LIZIZ() {
        return this.LIZLLL;
    }

    public C1006760cJ0(boolean z) {
        this.LIZJ = z;
    }
}
