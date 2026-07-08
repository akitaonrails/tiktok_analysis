package X;

/* JADX INFO: renamed from: X.0efR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097550efR extends AbstractC1097540efQ {
    public String LJ = "";

    @Override // X.InterfaceC1097480efK
    public final int LIZLLL() {
        return 2;
    }

    @Override // X.InterfaceC1097480efK
    public final boolean LIZIZ() {
        return this.LIZ != null;
    }

    @Override // X.AbstractC1097540efQ, X.InterfaceC1097480efK
    public final void execute() {
        C1097520efO c1097520efO = new C1097520efO(this);
        if (this.LIZ == null || this.LIZIZ == null) {
            return;
        }
        c1097520efO.invoke();
    }

    @Override // X.AbstractC1097540efQ, X.InterfaceC1097480efK
    public final void destroy() {
        super.destroy();
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LJIILL(this.LJ);
    }
}
