package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Mx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19489711Mx {
    public static void LIZ(Class<?> cls) {
        String name = cls.getName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("It is not allowed to subscribe with a(n) ");
        sbLIZ.append(name);
        sbLIZ.append(" multiple times. Please create a fresh instance of ");
        sbLIZ.append(name);
        sbLIZ.append(" and subscribe that to the target source instead.");
        C19489211Ms.LIZIZ(new C11JB(C2188811AlT.LIZIZ(sbLIZ)));
    }

    public static boolean LIZIZ(AtomicReference<InterfaceC420801kM> atomicReference, InterfaceC420801kM interfaceC420801kM, Class<?> cls) {
        if (interfaceC420801kM == null) {
            throw new NullPointerException("next is null");
        }
        while (!atomicReference.compareAndSet(null, interfaceC420801kM)) {
            if (atomicReference.get() != null) {
                interfaceC420801kM.dispose();
                if (atomicReference.get() != EnumC19489911Mz.LL) {
                    LIZ(cls);
                }
                return false;
            }
        }
        return true;
    }
}
