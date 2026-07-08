package X;

/* JADX INFO: renamed from: X.0mAS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385860mAS extends AbstractC1385800mAM {
    public static final C1385860mAS INSTANCE = new C1385860mAS();
    public static final String LL = "Invalid query preprocessor configuration";

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return LL;
    }
}
