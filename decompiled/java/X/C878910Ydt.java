package X;

/* JADX INFO: renamed from: X.0Ydt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878910Ydt implements InterfaceC1490905sZ<C879950YfZ> {
    public static final int $stable = 0;
    public static final C878910Ydt INSTANCE = new C878910Ydt();
    public static final String LL = "message_request_entrance_wrapper_type";

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // X.InterfaceC1490905sZ
    public String getTag() {
        return LL;
    }
}
