package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.19Gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21511119Gj<T> implements C09JN {
    public static final C21511119Gj<T> LL = new C21511119Gj<>();

    @Override // X.C09JN
    public final void accept(Object obj) {
        C1C7U.LIZ("ResAltasCore@f32f.subscribeResCheckerEventsStandalone$1");
        AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) obj;
        InterfaceC21511219Gk interfaceC21511219Gk = C1BAC.LJJI;
        if (interfaceC21511219Gk != null) {
            if (abstractC1387200mCc instanceof C1397950mTx) {
                if (interfaceC21511219Gk.LIZIZ("Activity")) {
                    C1397950mTx c1397950mTx = (C1397950mTx) abstractC1387200mCc;
                    String simpleName = c1397950mTx.LIZLLL.getClass().getSimpleName();
                    interfaceC21511219Gk.LIZLLL("top_activity", simpleName);
                    interfaceC21511219Gk.LIZ("Activity", "resumed", C2097608Jq.LJIIIIZZ(new Pair("name", simpleName), new Pair("page", c1397950mTx.toString())));
                }
            } else if (abstractC1387200mCc instanceof C1844400y62) {
                if (interfaceC21511219Gk.LIZIZ("Fragment")) {
                    C1844400y62 c1844400y62 = (C1844400y62) abstractC1387200mCc;
                    String simpleName2 = c1844400y62.LIZLLL.getClass().getSimpleName();
                    interfaceC21511219Gk.LIZLLL("top_fragment", simpleName2);
                    interfaceC21511219Gk.LIZ("Fragment", "resumed", C2097608Jq.LJIIIIZZ(new Pair("name", simpleName2), new Pair("page", c1844400y62.toString())));
                }
            } else if (abstractC1387200mCc instanceof C198S) {
                if (interfaceC21511219Gk.LIZIZ("Scene")) {
                    C198S c198s = (C198S) abstractC1387200mCc;
                    String simpleName3 = c198s.LIZLLL.getClass().getSimpleName();
                    interfaceC21511219Gk.LIZLLL("top_scene", simpleName3);
                    interfaceC21511219Gk.LIZ("Scene", "resumed", C2097608Jq.LJIIIIZZ(new Pair("name", simpleName3), new Pair("page", c198s.toString())));
                }
            } else {
                interfaceC21511219Gk.LIZ("Page", "resumed", C2097608Jq.LJIIIIZZ(new Pair("name", abstractC1387200mCc.getClass().getSimpleName()), new Pair("page", abstractC1387200mCc.toString())));
            }
        }
        C1C7U.LIZIZ("ResAltasCore@f32f.subscribeResCheckerEventsStandalone$1");
    }
}
