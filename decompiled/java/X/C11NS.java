package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11NS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11NS implements InterfaceC19495511Pd<Object> {
    public static final C11NS INSTANCE;
    public static final /* synthetic */ C11NS[] LL;

    @Override // X.C11LR
    public void cancel() {
    }

    @Override // X.InterfaceC19494911Ox
    public void clear() {
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

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    static {
        C11NS c11ns = new C11NS();
        INSTANCE = c11ns;
        LL = new C11NS[]{c11ns};
    }

    public static C11NS[] values() {
        return (C11NS[]) LL.clone();
    }

    public static void complete(C11M9<?> c11m9) {
        c11m9.onSubscribe(INSTANCE);
        c11m9.onComplete();
    }

    public static C11NS valueOf(String str) {
        return (C11NS) C08FF.LIZ(C11NS.class, str);
    }

    @Override // X.InterfaceC19494911Ox
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // X.C11LR
    public void request(long j) {
        C11NC.validate(j);
    }

    public static void error(Throwable th, C11M9<?> c11m9) {
        c11m9.onSubscribe(INSTANCE);
        c11m9.onError(th);
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
