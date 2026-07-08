package X;

/* JADX INFO: renamed from: X.06mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1709506mj implements InterfaceC1490905sZ<C0Y8T> {
    public static final C1709506mj INSTANCE = new C1709506mj();
    public static final String LL = "message_request_wrapper_type";

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // X.InterfaceC1490905sZ
    public String getTag() {
        return LL;
    }
}
