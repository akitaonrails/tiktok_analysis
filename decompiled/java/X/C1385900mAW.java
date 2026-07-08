package X;

/* JADX INFO: renamed from: X.0mAW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385900mAW extends AbstractC1385830mAP {
    public static final C1385900mAW INSTANCE = new C1385900mAW();
    public static final String LL = "Missing preprocessor type";

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return LL;
    }
}
