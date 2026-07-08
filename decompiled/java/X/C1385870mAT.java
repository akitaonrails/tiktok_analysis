package X;

/* JADX INFO: renamed from: X.0mAT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385870mAT extends AbstractC1385800mAM {
    public static final C1385870mAT INSTANCE = new C1385870mAT();
    public static final String LL = "Invalid target preprocessor configuration";

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return LL;
    }
}
