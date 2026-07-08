package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11JE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11JE implements InterfaceC420801kM {
    public static final C11JE DISPOSED;
    public static final /* synthetic */ C11JE[] LL;

    @Override // X.InterfaceC420801kM
    public void dispose() {
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return true;
    }

    static {
        C11JE c11je = new C11JE();
        DISPOSED = c11je;
        LL = new C11JE[]{c11je};
    }

    public static void reportDisposableSet() {
        C19489211Ms.LIZIZ(new C11JB("Disposable already set!"));
    }

    public static C11JE[] values() {
        return (C11JE[]) LL.clone();
    }

    public static boolean dispose(AtomicReference<InterfaceC420801kM> atomicReference) {
        InterfaceC420801kM andSet;
        InterfaceC420801kM interfaceC420801kM = atomicReference.get();
        C11JE c11je = DISPOSED;
        if (interfaceC420801kM != c11je && (andSet = atomicReference.getAndSet(c11je)) != c11je) {
            if (andSet != null) {
                andSet.dispose();
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean isDisposed(InterfaceC420801kM interfaceC420801kM) {
        if (interfaceC420801kM == DISPOSED) {
            return true;
        }
        return false;
    }

    public static C11JE valueOf(String str) {
        return (C11JE) C08FF.LIZ(C11JE.class, str);
    }

    public static boolean replace(AtomicReference<InterfaceC420801kM> atomicReference, InterfaceC420801kM interfaceC420801kM) {
        while (true) {
            InterfaceC420801kM interfaceC420801kM2 = atomicReference.get();
            if (interfaceC420801kM2 == DISPOSED) {
                if (interfaceC420801kM != null) {
                    interfaceC420801kM.dispose();
                }
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC420801kM2, interfaceC420801kM)) {
                if (atomicReference.get() != interfaceC420801kM2) {
                    break;
                }
            }
            return true;
        }
    }

    public static boolean set(AtomicReference<InterfaceC420801kM> atomicReference, InterfaceC420801kM interfaceC420801kM) {
        while (true) {
            InterfaceC420801kM interfaceC420801kM2 = atomicReference.get();
            if (interfaceC420801kM2 == DISPOSED) {
                if (interfaceC420801kM != null) {
                    interfaceC420801kM.dispose();
                }
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC420801kM2, interfaceC420801kM)) {
                if (atomicReference.get() != interfaceC420801kM2) {
                    break;
                }
            }
            if (interfaceC420801kM2 != null) {
                interfaceC420801kM2.dispose();
            }
            return true;
        }
    }

    public static boolean setOnce(AtomicReference<InterfaceC420801kM> atomicReference, InterfaceC420801kM interfaceC420801kM) {
        C1701890uOB.LIZ(interfaceC420801kM, "d is null");
        while (!atomicReference.compareAndSet(null, interfaceC420801kM)) {
            if (atomicReference.get() != null) {
                interfaceC420801kM.dispose();
                if (atomicReference.get() != DISPOSED) {
                    reportDisposableSet();
                }
                return false;
            }
        }
        return true;
    }

    public static boolean trySet(AtomicReference<InterfaceC420801kM> atomicReference, InterfaceC420801kM interfaceC420801kM) {
        while (!atomicReference.compareAndSet(null, interfaceC420801kM)) {
            if (atomicReference.get() != null) {
                if (atomicReference.get() == DISPOSED) {
                    interfaceC420801kM.dispose();
                }
                return false;
            }
        }
        return true;
    }

    public static boolean validate(InterfaceC420801kM interfaceC420801kM, InterfaceC420801kM interfaceC420801kM2) {
        if (interfaceC420801kM2 == null) {
            C19489211Ms.LIZIZ(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC420801kM != null) {
            interfaceC420801kM2.dispose();
            reportDisposableSet();
            return false;
        }
        return true;
    }
}
