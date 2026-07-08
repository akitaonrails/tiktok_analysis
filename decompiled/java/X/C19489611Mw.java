package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Mw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19489611Mw {
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

    public static void LIZIZ(AtomicReference atomicReference, InterfaceC420801kM interfaceC420801kM, Class cls) {
        C1701890uOB.LIZ(interfaceC420801kM, "next is null");
        while (!atomicReference.compareAndSet(null, interfaceC420801kM)) {
            if (atomicReference.get() != null) {
                interfaceC420801kM.dispose();
                if (atomicReference.get() != C11JE.DISPOSED) {
                    LIZ(cls);
                    return;
                }
                return;
            }
        }
    }

    public static boolean LIZJ(AtomicReference<C11LR> atomicReference, C11LR c11lr, Class<?> cls) {
        C1701890uOB.LIZ(c11lr, "next is null");
        while (!atomicReference.compareAndSet(null, c11lr)) {
            if (atomicReference.get() != null) {
                c11lr.cancel();
                if (atomicReference.get() != C11NC.CANCELLED) {
                    LIZ(cls);
                }
                return false;
            }
        }
        return true;
    }
}
