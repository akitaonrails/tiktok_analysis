package X;

/* JADX INFO: renamed from: X.0cKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1007810cKh implements InterfaceC1023400cjq<String> {
    public final String LIZ;
    public final InterfaceC1023650ckF<?, ?>[] LIZIZ;
    public final InterfaceC1007800cKg LIZJ;
    public final String LIZLLL;

    @Override // X.InterfaceC1023400cjq
    public final InterfaceC1007800cKg LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1023400cjq
    public final String LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1023400cjq
    public final /* bridge */ /* synthetic */ String getEventId() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1023410cjr
    public final InterfaceC1023650ckF<?, ?>[] getKeys() {
        return this.LIZIZ;
    }

    public C1007810cKh(String str, InterfaceC1023650ckF<?, ?>[] interfaceC1023650ckFArr, InterfaceC1007800cKg interfaceC1007800cKg) {
        this.LIZ = str;
        this.LIZIZ = interfaceC1023650ckFArr;
        this.LIZJ = interfaceC1007800cKg;
        this.LIZLLL = str;
    }
}
