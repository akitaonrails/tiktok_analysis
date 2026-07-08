package X;

/* JADX INFO: renamed from: X.08kg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2206408kg {
    public static final C2206408kg LIZIZ = new C2206408kg();
    public static final int LIZJ;
    public static final int LIZLLL;
    public final ExecutorC2206508kh LIZ = new ExecutorC2206508kh();

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        LIZJ = iAvailableProcessors + 1;
        LIZLLL = (iAvailableProcessors * 2) + 1;
    }
}
