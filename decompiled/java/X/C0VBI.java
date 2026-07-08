package X;

/* JADX INFO: renamed from: X.0VBI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0VBI {
    OTHER_LOG_TYPE("other"),
    SERVICE_MONITOR("service_monitor");

    public final String logType;

    public static C0VBI valueOf(String str) {
        return (C0VBI) C08FF.LIZ(C0VBI.class, str);
    }

    C0VBI(String str) {
        this.logType = str;
    }
}
