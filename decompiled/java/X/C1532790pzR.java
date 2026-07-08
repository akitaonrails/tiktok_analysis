package X;

/* JADX INFO: renamed from: X.0pzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532790pzR implements InterfaceC1541240qD4 {
    public final C0X52<?> LIZ;

    @Override // X.InterfaceC1541240qD4, X.InterfaceC1541260qD6
    public final boolean LIZ(C1540930qCZ c1540930qCZ) {
        return true;
    }

    @Override // X.InterfaceC1541260qD6
    public final boolean LIZJ(C1540930qCZ c1540930qCZ) {
        return true;
    }

    @Override // X.InterfaceC1541240qD4
    public final boolean isSuccess() {
        C0X52<?> c0x52 = this.LIZ;
        return c0x52 != null && c0x52.LIZJ();
    }

    public C1532790pzR(String str, C0X52 c0x52) {
        this.LIZ = c0x52;
    }
}
