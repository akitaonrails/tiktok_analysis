package X;

/* JADX INFO: renamed from: X.0YoI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885360YoI implements InterfaceC1490905sZ<Object> {
    public static final C885360YoI INSTANCE = new C885360YoI();
    public static final String LL = "default_chat_list_wrapper_type";

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // X.InterfaceC1490905sZ
    public String getTag() {
        return LL;
    }
}
