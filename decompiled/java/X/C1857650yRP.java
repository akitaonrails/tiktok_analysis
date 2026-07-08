package X;

/* JADX INFO: renamed from: X.0yRP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857650yRP implements InterfaceC1857660yRQ {
    public static final C1857650yRP LIZ = new C1857650yRP();
    public static InterfaceC1857660yRQ LIZIZ;

    @Override // X.InterfaceC1857660yRQ
    public final void ensureNotReachHere(Throwable th, String str) {
        InterfaceC1857660yRQ interfaceC1857660yRQ = LIZIZ;
        if (interfaceC1857660yRQ != null) {
            interfaceC1857660yRQ.ensureNotReachHere(th, str);
        }
    }
}
