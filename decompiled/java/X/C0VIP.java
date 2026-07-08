package X;

/* JADX INFO: renamed from: X.0VIP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0VIP {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean isFinished() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }

    public static C0VIP valueOf(String str) {
        return (C0VIP) C08FF.LIZ(C0VIP.class, str);
    }
}
