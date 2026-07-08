package X;

/* JADX INFO: renamed from: X.0g9J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1154510g9J extends AbstractC1154520g9K {
    public static final C1154510g9J INSTANCE = new C1154510g9J();
    public static final String LL = "Missing matching_strategy_orchestrator configuration";

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return LL;
    }
}
