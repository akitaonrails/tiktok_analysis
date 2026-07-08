package X;

/* JADX INFO: renamed from: X.0g9L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1154530g9L extends AbstractC1154520g9K {
    public static final C1154530g9L INSTANCE = new C1154530g9L();
    public static final String LL = "Missing matching_strategies array";

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return LL;
    }
}
