package X;

/* JADX INFO: renamed from: X.19Gl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21511319Gl<T> implements C09JN {
    public static final C21511319Gl<T> LL = new C21511319Gl<>();

    @Override // X.C09JN
    public final void accept(Object obj) {
        String str;
        C1C7U.LIZ("ResAltasCore@f32f.subscribeResCheckerEventsStandalone$3");
        boolean z = ((C606810Nr5) obj).LIZIZ;
        InterfaceC21511219Gk interfaceC21511219Gk = C1BAC.LJJI;
        if (interfaceC21511219Gk != null && interfaceC21511219Gk.LIZIZ("BackgroundSwitch")) {
            if (z) {
                str = "background";
            } else {
                str = "foreground";
            }
            interfaceC21511219Gk.LIZLLL("process_state", str);
            interfaceC21511219Gk.LIZ("BackgroundSwitch", str, null);
        }
        C1C7U.LIZIZ("ResAltasCore@f32f.subscribeResCheckerEventsStandalone$3");
    }
}
