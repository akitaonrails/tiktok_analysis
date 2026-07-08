package X;

/* JADX INFO: renamed from: X.0pzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532970pzj implements InterfaceC1166350gSP {
    public C1541080qCo<C1532310pyf> LIZ;
    public volatile C1532310pyf LIZIZ;

    public final C1532310pyf LIZ() {
        C1541080qCo<C1532310pyf> c1541080qCo = this.LIZ;
        if (c1541080qCo != null) {
            c1541080qCo.execute();
        }
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1166350gSP
    public final boolean cancel() {
        C1541080qCo<C1532310pyf> c1541080qCo = this.LIZ;
        return c1541080qCo != null && c1541080qCo.cancel();
    }

    @Override // X.InterfaceC1166350gSP
    public final boolean isValid() {
        C1541080qCo<C1532310pyf> c1541080qCo = this.LIZ;
        return c1541080qCo != null && c1541080qCo.isValid();
    }
}
