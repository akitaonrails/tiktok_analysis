package X;

/* JADX INFO: renamed from: X.0Y0J, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y0J implements InterfaceC866620XzA {
    public final /* synthetic */ C0Y0K LIZ;

    public C0Y0J(C0Y0K c0y0k) {
        this.LIZ = c0y0k;
    }

    @Override // X.InterfaceC871370YGh
    public final InterfaceC866920Xze LIZJ(InterfaceC1741206rq<? super InterfaceC874460YSe> interfaceC1741206rq) {
        return this.LIZ.LIZIZ.LIZIZ(interfaceC1741206rq);
    }

    @Override // X.InterfaceC866620XzA
    public final InterfaceC866630XzB LIZLLL(String str) {
        InterfaceC866620XzA interfaceC866620XzALJIILIIL;
        InterfaceC866630XzB interfaceC866630XzBLIZLLL;
        InterfaceC866310Xyf interfaceC866310XyfLJJ = this.LIZ.LJJ("eventManager.forConversation");
        if (interfaceC866310XyfLJJ == null || (interfaceC866620XzALJIILIIL = interfaceC866310XyfLJJ.LJIILIIL()) == null || (interfaceC866630XzBLIZLLL = interfaceC866620XzALJIILIIL.LIZLLL(str)) == null) {
            final C0Y0K c0y0k = this.LIZ;
            c0y0k.getClass();
            return new InterfaceC866630XzB() { // from class: X.0Y0H
                @Override // X.InterfaceC871370YGh
                public final InterfaceC866920Xze LIZJ(InterfaceC1741206rq<? super InterfaceC874460YSe> interfaceC1741206rq) {
                    return c0y0k.LIZLLL;
                }
            };
        }
        return interfaceC866630XzBLIZLLL;
    }
}
