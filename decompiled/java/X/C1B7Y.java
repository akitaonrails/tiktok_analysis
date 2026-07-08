package X;

/* JADX INFO: renamed from: X.1B7Y, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1B7Y {
    DELAY_RETRY_NONE,
    DELAY_RETRY_WAITING,
    DELAY_RETRY_DOWNLOADING,
    DELAY_RETRY_DOWNLOADED;

    public static C1B7Y valueOf(String str) {
        return (C1B7Y) C08FF.LIZ(C1B7Y.class, str);
    }
}
