package X;

/* JADX INFO: renamed from: X.0g9M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1154540g9M extends AbstractC1154520g9K {
    public static final C1154540g9M INSTANCE = new C1154540g9M();
    public static final String LL = "Missing orchestrator type";

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return LL;
    }
}
