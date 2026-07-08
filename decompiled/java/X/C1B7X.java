package X;

/* JADX INFO: renamed from: X.1B7X, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1B7X {
    ASYNC_HANDLE_NONE,
    ASYNC_HANDLE_WAITING,
    ASYNC_HANDLE_RESTART,
    ASYNC_HANDLE_DOWNLOADING,
    ASYNC_HANDLE_DOWNLOADED;

    public static C1B7X valueOf(String str) {
        return (C1B7X) C08FF.LIZ(C1B7X.class, str);
    }
}
