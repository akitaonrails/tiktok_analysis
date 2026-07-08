package X;

/* JADX INFO: renamed from: X.1ByG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222221ByG implements InterfaceC2222251ByJ {
    public EnumC20103013lE LIZ = EnumC20103013lE.INITED;

    @Override // X.InterfaceC2222251ByJ
    public final void LJIILL(long j, C2222081By2 c2222081By2) {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LIZ() {
        this.LIZ = EnumC20103013lE.READY;
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onDestroy() {
        this.LIZ = EnumC20103013lE.DESTROYED;
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onRelease() {
        this.LIZ = EnumC20103013lE.RELEASED;
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onStart() {
        this.LIZ = EnumC20103013lE.STARTED;
    }

    public final boolean LIZIZ(EnumC20103013lE enumC20103013lE) {
        if (this.LIZ == enumC20103013lE) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIIZ(C2222081By2 c2222081By2) {
        this.LIZ = EnumC20103013lE.INITED;
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIL(C2222371ByV c2222371ByV) {
        this.LIZ = EnumC20103013lE.STOPED;
    }
}
