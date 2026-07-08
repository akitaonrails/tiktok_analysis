package X;

/* JADX INFO: renamed from: X.0WAR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0WAR {
    DISK_IO,
    NET_IO,
    POLL_WAIT,
    FUTEX_WAIT,
    SLEEP,
    OTHER;

    public static C0WAR valueOf(String str) {
        return (C0WAR) C08FF.LIZ(C0WAR.class, str);
    }
}
