package X;

/* JADX INFO: renamed from: X.0nwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453980nwK extends AbstractC2255721DQs<InterfaceC1458170o35> implements InterfaceC1458170o35, InterfaceC379610EuV {
    public final C1DRG LL;
    public volatile C204607154j LLILLJJLI;

    public InterfaceC1458170o35 W1() {
        return this;
    }

    @Override // X.InterfaceC1458170o35
    public boolean hv2() {
        return this.LLILLJJLI != null;
    }

    @Override // X.InterfaceC1458170o35
    public C204607154j zK1() {
        C204607154j c204607154j = this.LLILLJJLI;
        this.LLILLJJLI = null;
        return c204607154j;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1453980nwK(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1458170o35
    public void BC(C204607154j c204607154j) {
        this.LLILLJJLI = c204607154j;
    }
}
