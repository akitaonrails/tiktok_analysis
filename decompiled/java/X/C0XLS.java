package X;

/* JADX INFO: renamed from: X.0XLS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0XLS {
    SUCCESS,
    /* JADX INFO: Fake field, exist only in values array */
    MISSING_SCHEME,
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_SCHEME,
    INVALID_PORT,
    INVALID_HOST;

    public static C0XLS valueOf(String str) {
        return (C0XLS) C08FF.LIZ(C0XLS.class, str);
    }
}
