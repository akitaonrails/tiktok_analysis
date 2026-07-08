package X;

/* JADX INFO: renamed from: X.0uGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697350uGr implements InterfaceC1697360uGs, InterfaceC1697370uGt, InterfaceC1690590u5x {
    public final Object LIZ;
    public final C1682920tta LIZIZ;
    public int LIZLLL;
    public InterfaceC1697370uGt LJ;
    public boolean LJFF;
    public int LIZJ = -1;
    public final C05P0 LJI = C20028913Yh.LJI(null);

    @Override // X.InterfaceC1697360uGs
    public final C1697350uGr LIZJ() {
        if (!(!this.LJFF)) {
            C1691080u6k.LIZJ("Pin should not be called on an already disposed item ");
        }
        if (this.LIZLLL == 0) {
            this.LIZIZ.LL.add(this);
            InterfaceC1697360uGs interfaceC1697360uGs = (InterfaceC1697360uGs) ((C13FE) this.LJI).getValue();
            this.LJ = interfaceC1697360uGs != null ? interfaceC1697360uGs.LIZJ() : null;
        }
        this.LIZLLL++;
        return this;
    }

    @Override // X.InterfaceC1697370uGt
    public final void release() {
        if (this.LJFF) {
            return;
        }
        if (this.LIZLLL <= 0) {
            C1691080u6k.LIZJ("Release should only be called once");
        }
        int i = this.LIZLLL - 1;
        this.LIZLLL = i;
        if (i == 0) {
            this.LIZIZ.LL.remove(this);
            InterfaceC1697370uGt interfaceC1697370uGt = this.LJ;
            if (interfaceC1697370uGt != null) {
                interfaceC1697370uGt.release();
            }
            this.LJ = null;
        }
    }

    @Override // X.InterfaceC1690590u5x
    public final int getIndex() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1690590u5x
    public final Object getKey() {
        return this.LIZ;
    }

    public C1697350uGr(Object obj, C1682920tta c1682920tta) {
        this.LIZ = obj;
        this.LIZIZ = c1682920tta;
    }
}
