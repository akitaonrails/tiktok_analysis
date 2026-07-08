package X;

/* JADX INFO: renamed from: X.06Qr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1606306Qr implements InterfaceC1606206Qq {
    public static final C1606306Qr INSTANCE = new C1606306Qr();
    public static final String LL = "group_chat";

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // X.InterfaceC1606206Qq, X.InterfaceC1490905sZ
    public String getTag() {
        return LL;
    }
}
