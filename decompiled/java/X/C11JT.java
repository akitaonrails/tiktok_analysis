package X;

/* JADX INFO: renamed from: X.11JT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public enum C11JT implements InterfaceC19495611Pe<Object> {
    INSTANCE,
    NEVER;

    @Override // X.InterfaceC19494911Ox
    public void clear() {
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
    }

    @Override // X.InterfaceC19494911Ox
    public boolean isEmpty() {
        return true;
    }

    @Override // X.InterfaceC19494911Ox
    public Object poll() {
        return null;
    }

    @Override // X.InterfaceC19495111Oz
    public int requestFusion(int i) {
        return i & 2;
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    public static void complete(InterfaceC626120Oh8<?> interfaceC626120Oh8) {
        interfaceC626120Oh8.onSubscribe(INSTANCE);
        interfaceC626120Oh8.onComplete();
    }

    public static C11JT valueOf(String str) {
        return (C11JT) C08FF.LIZ(C11JT.class, str);
    }

    @Override // X.InterfaceC19494911Ox
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(C11IH<?> c11ih) {
        c11ih.onSubscribe(INSTANCE);
        c11ih.onComplete();
    }

    public static void complete(C11IY c11iy) {
        c11iy.onSubscribe(INSTANCE);
        c11iy.onComplete();
    }

    public static void error(Throwable th, InterfaceC626120Oh8<?> interfaceC626120Oh8) {
        interfaceC626120Oh8.onSubscribe(INSTANCE);
        interfaceC626120Oh8.onError(th);
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void error(Throwable th, InterfaceC19474811He<?> interfaceC19474811He) {
        interfaceC19474811He.onSubscribe(INSTANCE);
        interfaceC19474811He.onError(th);
    }

    public static void error(Throwable th, C11IH<?> c11ih) {
        c11ih.onSubscribe(INSTANCE);
        c11ih.onError(th);
    }

    public static void error(Throwable th, C11IY c11iy) {
        c11iy.onSubscribe(INSTANCE);
        c11iy.onError(th);
    }
}
