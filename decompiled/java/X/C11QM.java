package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11QM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11QM {
    public static void LIZ(InterfaceC626120Oh8<?> interfaceC626120Oh8, AtomicInteger atomicInteger, C19487711Md c19487711Md) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = c19487711Md.terminate();
            if (thTerminate != null) {
                interfaceC626120Oh8.onError(thTerminate);
            } else {
                interfaceC626120Oh8.onComplete();
            }
        }
    }

    public static void LIZIZ(InterfaceC626120Oh8<?> interfaceC626120Oh8, Throwable th, AtomicInteger atomicInteger, C19487711Md c19487711Md) {
        if (c19487711Md.addThrowable(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                interfaceC626120Oh8.onError(c19487711Md.terminate());
                return;
            }
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void LIZJ(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, T t, AtomicInteger atomicInteger, C19487711Md c19487711Md) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC626120Oh8.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = c19487711Md.terminate();
                if (thTerminate != null) {
                    interfaceC626120Oh8.onError(thTerminate);
                } else {
                    interfaceC626120Oh8.onComplete();
                }
            }
        }
    }
}
