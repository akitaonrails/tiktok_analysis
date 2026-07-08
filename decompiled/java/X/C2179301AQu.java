package X;

/* JADX INFO: renamed from: X.1AQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179301AQu implements InterfaceC2179311AQv, InterfaceC2179331AQx, InterfaceC2179191AQj {
    public final C2179271AQr LL;
    public C0NIR LLILLJJLI;

    @Override // X.InterfaceC2179311AQv
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC2179311AQv
    public final boolean LIZLLL(C0NIR c0nir) {
        return false;
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJ(EnumC1782190wTh enumC1782190wTh) {
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJFF(C1AN0 c1an0) {
    }

    @Override // X.InterfaceC2179311AQv
    public final boolean LJII(C0NIR c0nir) {
        return false;
    }

    @Override // X.InterfaceC2179311AQv
    public final boolean LJIIJ(C0NIR c0nir) {
        return false;
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJIIJJI(C2179231AQn c2179231AQn) {
    }

    @Override // X.InterfaceC2179331AQx
    public final C0NIR LJIIL() {
        throw null;
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJIILIIL(EnumC1778440wNe enumC1778440wNe) {
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJIIZILJ(long j) {
    }

    @Override // X.InterfaceC2179311AQv
    public final C2179231AQn LJIJJ(C2179231AQn c2179231AQn) {
        return c2179231AQn;
    }

    @Override // X.InterfaceC2179191AQj
    public final void onCompletion() {
    }

    @Override // X.InterfaceC2179191AQj
    public final void onPlaybackTimeChanged(long j) {
    }

    @Override // X.InterfaceC2179191AQj
    public final void onPrepare() {
    }

    @Override // X.InterfaceC2179191AQj
    public final void onPrepared() {
    }

    public C2179301AQu(C2179271AQr c2179271AQr) {
        this.LL = c2179271AQr;
    }

    @Override // X.InterfaceC2179311AQv
    public final boolean LJIIIIZZ(C0NIR c0nir) {
        this.LLILLJJLI = c0nir;
        return false;
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJIILLIIL(C1ANF c1anf) {
        if (c1anf == C1ANF.PLAYBACK_STATE_STOPPED) {
            C2179201AQk c2179201AQkLJI = this.LL.LJI();
            if (c2179201AQkLJI.LJFF != null) {
                c2179201AQkLJI.LIZIZ().LJII();
            }
        }
    }
}
