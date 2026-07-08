package X;

/* JADX INFO: renamed from: X.0u1m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688000u1m extends AbstractC20055413dY implements InterfaceC20057313dr {
    public float LLJJ;
    public boolean LLJJI;

    public C1688000u1m(float f, boolean z) {
        this.LLJJ = f;
        this.LLJJI = z;
    }

    @Override // X.InterfaceC20057313dr
    public final Object LJZ(InterfaceC1690500u5o interfaceC1690500u5o, Object obj) {
        C1688050u1r c1688050u1r;
        if (!(obj instanceof C1688050u1r) || (c1688050u1r = (C1688050u1r) obj) == null) {
            c1688050u1r = new C1688050u1r(0);
        }
        c1688050u1r.LIZ = this.LLJJ;
        c1688050u1r.LIZIZ = this.LLJJI;
        return c1688050u1r;
    }
}
