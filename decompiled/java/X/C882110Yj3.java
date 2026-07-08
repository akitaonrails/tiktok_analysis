package X;

/* JADX INFO: renamed from: X.0Yj3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882110Yj3 implements InterfaceC1606206Qq {
    public static final C882110Yj3 INSTANCE = new C882110Yj3();
    public static final String LL = "single_chat";

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // X.InterfaceC1606206Qq, X.InterfaceC1490905sZ
    public String getTag() {
        return LL;
    }
}
