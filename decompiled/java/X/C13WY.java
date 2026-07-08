package X;

/* JADX INFO: renamed from: X.13WY, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13WY implements InterfaceC1563540qn2 {
    public static final C13WY LIZ = new C13WY();
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;

    @Override // X.InterfaceC1563540qn2
    public final void LIZIZ() {
        LIZLLL++;
    }

    @Override // X.InterfaceC1563540qn2
    public final void LIZJ() {
        LIZIZ++;
    }

    @Override // X.InterfaceC1563540qn2
    public final void LIZLLL() {
        LIZJ++;
    }

    @Override // X.InterfaceC1563540qn2
    public final void LIZ() {
        C2214201BlK.LIZLLL().LJJLJLI(new C09JN() { // from class: X.13WX
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ExternalDeviceFeedScrollEventTrackManager@5f87.initEventTrackManager$1");
                if (((Boolean) obj).booleanValue()) {
                    C13WY.LIZ.getClass();
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C13WV(C13WY.LIZIZ, C13WY.LIZLLL, C13WY.LIZJ, null), 2);
                    C13WY.LIZIZ = 0;
                    C13WY.LIZLLL = 0;
                    C13WY.LIZJ = 0;
                }
                C1C7U.LIZIZ("ExternalDeviceFeedScrollEventTrackManager@5f87.initEventTrackManager$1");
            }
        });
    }
}
