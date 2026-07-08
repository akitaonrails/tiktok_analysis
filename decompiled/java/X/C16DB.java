package X;

/* JADX INFO: renamed from: X.16DB, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public enum C16DB {
    CONTINUOUS,
    TEXT,
    BINARY,
    PING,
    PONG,
    CLOSING;

    public static C16DB valueOf(String str) {
        return (C16DB) C08FF.LIZ(C16DB.class, str);
    }
}
