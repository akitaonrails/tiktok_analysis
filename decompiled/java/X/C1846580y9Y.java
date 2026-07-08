package X;

/* JADX INFO: renamed from: X.0y9Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846580y9Y implements InterfaceC1846590y9Z {
    public static final C1846580y9Y LIZ = new C1846580y9Y();
    public static volatile InterfaceC1846570y9X LIZIZ;

    @Override // X.InterfaceC1846590y9Z
    public final void onVTreeChange(InterfaceC1848550yCj interfaceC1848550yCj) {
        if (LIZIZ != null) {
            InterfaceC1846570y9X interfaceC1846570y9X = LIZIZ;
            if (interfaceC1846570y9X != null) {
                interfaceC1846570y9X.LIZ();
            }
            LIZIZ = null;
        }
    }
}
