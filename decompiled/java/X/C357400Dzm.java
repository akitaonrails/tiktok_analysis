package X;

/* JADX INFO: renamed from: X.0Dzm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357400Dzm {
    public static InterfaceC357390Dzl LIZ;

    public static final void LIZIZ(String str) {
        InterfaceC357390Dzl interfaceC357390Dzl = LIZ;
        if (interfaceC357390Dzl != null) {
            if (str == null) {
                str = "";
            }
            interfaceC357390Dzl.i(str);
            return;
        }
        throw new IllegalStateException("Log service not initialized");
    }

    public static final void LIZ(String str, String str2) {
        InterfaceC357390Dzl interfaceC357390Dzl = LIZ;
        if (interfaceC357390Dzl != null) {
            if (str2 == null) {
                str2 = "";
            }
            interfaceC357390Dzl.d(str, str2);
            return;
        }
        throw new IllegalStateException("Log service not initialized");
    }
}
