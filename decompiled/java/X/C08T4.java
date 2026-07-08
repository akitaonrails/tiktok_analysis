package X;

/* JADX INFO: renamed from: X.08T4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08T4 extends RuntimeException {
    public C08T4(String str) {
        super(str);
    }

    public C08T4(String str, Throwable th) {
        super("Failed to initialize FileStorage", th);
    }
}
