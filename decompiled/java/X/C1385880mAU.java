package X;

/* JADX INFO: renamed from: X.0mAU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385880mAU extends AbstractC1385800mAM {
    public static final C1385880mAU INSTANCE = new C1385880mAU();
    public static final String LL = "Invalid threshold value";

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return LL;
    }
}
