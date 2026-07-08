package X;

/* JADX INFO: renamed from: X.1AQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179171AQh implements InterfaceC2178281AMw {
    public final /* synthetic */ InterfaceC2178281AMw LIZ;
    public final /* synthetic */ C2179201AQk LIZIZ;

    public C2179171AQh(InterfaceC2178281AMw interfaceC2178281AMw, C2179201AQk c2179201AQk) {
        this.LIZ = interfaceC2178281AMw;
        this.LIZIZ = c2179201AQk;
    }

    @Override // X.InterfaceC2178281AMw
    public final void LIZ(long j, boolean z) {
        EnumC1778440wNe enumC1778440wNe;
        InterfaceC2178281AMw interfaceC2178281AMw = this.LIZ;
        if (interfaceC2178281AMw != null) {
            interfaceC2178281AMw.LIZ(j, z);
        }
        InterfaceC2179191AQj interfaceC2179191AQj = this.LIZIZ.LIZIZ;
        if (z) {
            enumC1778440wNe = EnumC1778440wNe.SEEK_SUCCESS;
        } else {
            enumC1778440wNe = EnumC1778440wNe.SEEK_FAILED;
        }
        interfaceC2179191AQj.LJIILIIL(enumC1778440wNe);
    }
}
