package X;

/* JADX INFO: renamed from: X.0IID, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public enum C0IID {
    IDLE,
    INITIALIZED,
    PREPARING,
    PREPARED,
    LIVE_STARTED,
    LIVE_FINISHED,
    DETACHED;

    public static C0IID valueOf(String str) {
        return (C0IID) C08FF.LIZ(C0IID.class, str);
    }
}
