package X;

/* JADX INFO: renamed from: X.0mAR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385850mAR extends AbstractC1385800mAM {
    public static final C1385850mAR INSTANCE = new C1385850mAR();
    public static final String LL = "Invalid matcher configuration";

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return LL;
    }
}
