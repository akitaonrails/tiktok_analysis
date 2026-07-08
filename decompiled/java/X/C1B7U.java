package X;

/* JADX INFO: renamed from: X.1B7U, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1B7U {
    RUN_STATUS_NONE,
    RUN_STATUS_PAUSE,
    RUN_STATUS_CANCELED,
    RUN_STATUS_ERROR,
    RUN_STATUS_END_RIGHT_NOW,
    RUN_STATUS_RETRY_DELAY,
    RUN_STATUS_WAITING_ASYNC_HANDLER,
    RUN_STATUS_END_FOR_FILE_EXIST,
    RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET;

    public static C1B7U valueOf(String str) {
        return (C1B7U) C08FF.LIZ(C1B7U.class, str);
    }
}
