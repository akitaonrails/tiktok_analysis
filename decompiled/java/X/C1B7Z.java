package X;

/* JADX INFO: renamed from: X.1B7Z, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1B7Z {
    BYTE_INVALID_RETRY_STATUS_NONE,
    BYTE_INVALID_RETRY_STATUS_RESTART,
    BYTE_INVALID_RETRY_STATUS_DOWNLOADING,
    BYTE_INVALID_RETRY_STATUS_DOWNLOADED;

    public static C1B7Z valueOf(String str) {
        return (C1B7Z) C08FF.LIZ(C1B7Z.class, str);
    }
}
