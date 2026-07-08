package X;

/* JADX INFO: renamed from: X.0mAQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385840mAQ extends AbstractC1385800mAM {
    public static final C1385840mAQ INSTANCE = new C1385840mAQ();
    public static final String LL = "Invalid dimension value";

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return LL;
    }
}
