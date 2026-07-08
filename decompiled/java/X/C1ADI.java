package X;

/* JADX INFO: renamed from: X.1ADI, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ADI implements C09JN<C1567000qsc> {
    public boolean LL;
    public boolean LLILLJJLI;

    @Override // X.C09JN
    public final void accept(C1567000qsc c1567000qsc) {
        C1C7U.LIZ("LifeCycleConsumer@8050.accept");
        C1567000qsc c1567000qsc2 = c1567000qsc;
        if (c1567000qsc2 != null) {
            if (c1567000qsc2.LIZIZ) {
                this.LL = true;
            } else if (this.LL) {
                this.LL = false;
                this.LLILLJJLI = true;
            }
        }
        C1C7U.LIZIZ("LifeCycleConsumer@8050.accept");
    }
}
