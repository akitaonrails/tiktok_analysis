package X;

/* JADX INFO: renamed from: X.0mAV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385890mAV extends AbstractC1385830mAP {
    public static final C1385890mAV INSTANCE = new C1385890mAV();
    public static final String LL = "Missing required parameters for PSP preprocessor";

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return LL;
    }
}
