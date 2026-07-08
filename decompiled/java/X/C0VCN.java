package X;

/* JADX INFO: renamed from: X.0VCN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0VCN {
    OTHER_LOG_TYPE("other"),
    SERVICE_MONITOR("service_monitor");

    public final String logType;

    public static C0VCN valueOf(String str) {
        return (C0VCN) C08FF.LIZ(C0VCN.class, str);
    }

    C0VCN(String str) {
        this.logType = str;
    }
}
