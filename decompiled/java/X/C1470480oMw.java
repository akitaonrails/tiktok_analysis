package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0oMw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470480oMw {
    public final Map<Class<?>, InterfaceC1470580oN6<?>> LIZ = new ConcurrentHashMap();
    public final Map<Class<?>, InterfaceC1470580oN6<?>> LIZIZ = new ConcurrentHashMap();
    public final Map<Class<?>, InterfaceC1470540oN2<? extends InterfaceC1470560oN4>> LIZJ = new ConcurrentHashMap();
    public final Map<Class<?>, InterfaceC1470540oN2<? extends InterfaceC1470560oN4>> LIZLLL = new ConcurrentHashMap();

    public final void LIZ(EnumC1469090oKh enumC1469090oKh, Class cls, C1470570oN5 c1470570oN5) {
        if (enumC1469090oKh == EnumC1469090oKh.LIVE_PLAYER) {
            ((ConcurrentHashMap) this.LIZLLL).put(cls, c1470570oN5);
        } else {
            if (enumC1469090oKh != EnumC1469090oKh.VOD_PLAYER) {
                return;
            }
            ((ConcurrentHashMap) this.LIZJ).put(cls, c1470570oN5);
        }
    }

    public final void LIZIZ(EnumC1469090oKh enumC1469090oKh, Class cls, InterfaceC1470580oN6 interfaceC1470580oN6) {
        if (enumC1469090oKh == EnumC1469090oKh.LIVE_PLAYER) {
            ((ConcurrentHashMap) this.LIZ).put(cls, interfaceC1470580oN6);
        } else {
            if (enumC1469090oKh != EnumC1469090oKh.VOD_PLAYER) {
                return;
            }
            ((ConcurrentHashMap) this.LIZIZ).put(cls, interfaceC1470580oN6);
        }
    }

    public final <Module extends InterfaceC1470560oN4, Factory extends InterfaceC1470580oN6<Module>> Module LIZJ(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc, Class<Module> cls) {
        InterfaceC1470580oN6 interfaceC1470580oN6;
        InterfaceC1470540oN2 interfaceC1470540oN2;
        Module module;
        if (abstractC1470590oN7.LIZLLL()) {
            interfaceC1470580oN6 = (InterfaceC1470580oN6) ((ConcurrentHashMap) this.LIZ).get(cls);
            interfaceC1470540oN2 = (InterfaceC1470540oN2) ((ConcurrentHashMap) this.LIZLLL).get(cls);
        } else {
            if (abstractC1470590oN7.LIZJ() == EnumC1469090oKh.VOD_PLAYER) {
                interfaceC1470580oN6 = (InterfaceC1470580oN6) ((ConcurrentHashMap) this.LIZIZ).get(cls);
                interfaceC1470540oN2 = (InterfaceC1470540oN2) ((ConcurrentHashMap) this.LIZJ).get(cls);
            }
            return null;
        }
        if (interfaceC1470580oN6 != null) {
            if (interfaceC1470540oN2 == null || (module = (Module) interfaceC1470540oN2.LIZIZ(abstractC1470590oN7, interfaceC1469660oLc)) == null) {
                return (Module) interfaceC1470580oN6.LIZ(abstractC1470590oN7, interfaceC1469660oLc);
            }
            return module;
        }
        return null;
    }
}
