package X;

/* JADX INFO: renamed from: X.139O, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C139O extends Error {
    public C139O() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public C139O(String str) {
        super(str);
    }

    public C139O(Throwable th) {
        super(th);
    }

    public C139O(String str, Throwable th) {
        super(str, th);
    }
}
