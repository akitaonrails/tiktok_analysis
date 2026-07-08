package X;

/* JADX INFO: renamed from: X.0XkT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857510XkT extends RuntimeException {
    public static final C857500XkS Companion = new Object() { // from class: X.0XkS
    };

    public C857510XkT() {
        this("", null);
    }

    public static final C857510XkT from(Exception exc) {
        Companion.getClass();
        return new C857510XkT("", exc);
    }

    public C857510XkT(String str, Throwable th) {
        super(str, th);
    }

    public static final C857510XkT from(String str, Throwable th) {
        Companion.getClass();
        return new C857510XkT(str, th);
    }
}
