package X;

/* JADX INFO: renamed from: X.1AVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180601AVu implements InterfaceC2180611AVv {
    public static final C2180601AVu LIZ = new C2180601AVu();
    public static InterfaceC2180611AVv LIZIZ;

    @Override // X.InterfaceC2180611AVv
    public final void logException(Throwable th) {
        InterfaceC2180611AVv interfaceC2180611AVv = LIZIZ;
        if (interfaceC2180611AVv != null) {
            interfaceC2180611AVv.logException(th);
        }
    }

    @Override // X.InterfaceC2180611AVv
    public final void LIZ(String str, Throwable th) {
        InterfaceC2180611AVv interfaceC2180611AVv = LIZIZ;
        if (interfaceC2180611AVv != null) {
            interfaceC2180611AVv.LIZ(str, th);
        }
    }
}
