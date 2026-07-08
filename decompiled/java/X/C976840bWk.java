package X;

/* JADX INFO: renamed from: X.0bWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976840bWk implements InterfaceC981940bey {
    public final /* synthetic */ C976640bWQ LIZ;

    @Override // X.InterfaceC981940bey
    public final C981480beE LJI() {
        return this.LIZ.LJII;
    }

    @Override // X.InterfaceC981940bey
    public final EnumC974260bSa getStatus() {
        EnumC974260bSa status;
        InterfaceC976690bWV<? extends InterfaceC981890bet> interfaceC976690bWV = this.LIZ.LJIIIZ;
        return (interfaceC976690bWV == null || (status = interfaceC976690bWV.getStatus()) == null) ? EnumC974260bSa.NONE : status;
    }

    public C976840bWk(C976640bWQ c976640bWQ) {
        this.LIZ = c976640bWQ;
    }
}
