package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qZC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554960qZC {
    public static final <T extends InterfaceC2753014t> void LIZLLL(InterfaceC665370Q7z interfaceC665370Q7z, Class<T> cls, String str) {
        C1554890qZ5 tree = interfaceC665370Q7z.getTree();
        if (str == null) {
            str = "source_default_key";
        }
        tree.getClass();
        InterfaceC1555100qZQ interfaceC1555100qZQ = (InterfaceC1555100qZQ) ((ConcurrentHashMap) tree.LIZIZ).remove(new C1554820qYy(cls, str));
        if (interfaceC1555100qZQ != null) {
            interfaceC1555100qZQ.destroy();
        }
    }

    public static final <T extends InterfaceC2753014t> void LIZ(InterfaceC665370Q7z interfaceC665370Q7z, T t, Class<T> cls, String str) {
        C725430Scv.LIZLLL(C1561910qkP.LIZ, new C723430SZh(), new C0R1Y(interfaceC665370Q7z, t, cls, str));
    }

    public static final <T extends InterfaceC2753014t> InterfaceC1555100qZQ<T> LIZIZ(InterfaceC665370Q7z interfaceC665370Q7z, String str, Class<T> cls, InterfaceC1554780qYu interfaceC1554780qYu) {
        return (InterfaceC1555100qZQ) C725430Scv.LIZLLL(C1561900qkO.LIZ, new C723430SZh(), new C0R22(interfaceC665370Q7z, str, cls, interfaceC1554780qYu));
    }
}
