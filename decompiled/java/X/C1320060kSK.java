package X;

/* JADX INFO: renamed from: X.0kSK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320060kSK extends C1320270kSf {
    public String LIZ;
    public final InterfaceC1320080kSM LIZIZ;

    public C1320060kSK(String str, InterfaceC1320080kSM interfaceC1320080kSM) {
        this.LIZIZ = interfaceC1320080kSM;
        this.LIZ = str;
    }

    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final void LJIIIZ(String str, String str2, boolean z) {
        InterfaceC1320080kSM interfaceC1320080kSM = this.LIZIZ;
        if (interfaceC1320080kSM != null) {
            interfaceC1320080kSM.LIZ(C1327250kdv.LIZ(str2), this.LIZ, z);
        }
    }
}
