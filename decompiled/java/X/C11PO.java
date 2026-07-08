package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11PO, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11PO {
    public static final C11PO COMPLETE;
    public static final /* synthetic */ C11PO[] LL;

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static <T> Object next(T t) {
        return t;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    static {
        C11PO c11po = new C11PO();
        COMPLETE = c11po;
        LL = new C11PO[]{c11po};
    }

    public static C11PO[] values() {
        return (C11PO[]) LL.clone();
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(InterfaceC420801kM interfaceC420801kM) {
        return new C0TIP(interfaceC420801kM);
    }

    public static Object error(Throwable th) {
        return new C0TIO(th);
    }

    public static InterfaceC420801kM getDisposable(Object obj) {
        return ((C0TIP) obj).LL;
    }

    public static Throwable getError(Object obj) {
        return ((C0TIO) obj).LL;
    }

    public static C11LR getSubscription(Object obj) {
        return ((C11PS) obj).LL;
    }

    public static boolean isComplete(Object obj) {
        if (obj == COMPLETE) {
            return true;
        }
        return false;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof C0TIP;
    }

    public static boolean isError(Object obj) {
        return obj instanceof C0TIO;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof C11PS;
    }

    public static Object subscription(C11LR c11lr) {
        return new C11PS(c11lr);
    }

    public static C11PO valueOf(String str) {
        return (C11PO) C08FF.LIZ(C11PO.class, str);
    }

    public static <T> boolean accept(Object obj, InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        if (obj == COMPLETE) {
            interfaceC626120Oh8.onComplete();
            return true;
        }
        if (obj instanceof C0TIO) {
            interfaceC626120Oh8.onError(((C0TIO) obj).LL);
            return true;
        }
        interfaceC626120Oh8.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        if (obj == COMPLETE) {
            interfaceC626120Oh8.onComplete();
            return true;
        }
        if (obj instanceof C0TIO) {
            interfaceC626120Oh8.onError(((C0TIO) obj).LL);
            return true;
        }
        if (obj instanceof C0TIP) {
            interfaceC626120Oh8.onSubscribe(((C0TIP) obj).LL);
            return false;
        }
        interfaceC626120Oh8.onNext(obj);
        return false;
    }

    public static <T> boolean accept(Object obj, C11M9<? super T> c11m9) {
        if (obj == COMPLETE) {
            c11m9.onComplete();
            return true;
        }
        if (obj instanceof C0TIO) {
            c11m9.onError(((C0TIO) obj).LL);
            return true;
        }
        c11m9.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, C11M9<? super T> c11m9) {
        if (obj == COMPLETE) {
            c11m9.onComplete();
            return true;
        }
        if (obj instanceof C0TIO) {
            c11m9.onError(((C0TIO) obj).LL);
            return true;
        }
        if (obj instanceof C11PS) {
            c11m9.onSubscribe(((C11PS) obj).LL);
            return false;
        }
        c11m9.onNext(obj);
        return false;
    }
}
