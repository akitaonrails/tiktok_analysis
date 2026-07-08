package X;

/* JADX INFO: renamed from: X.0Y7G, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0Y7G {
    UNSUPPORTED,
    FAILED_TO_DECODE,
    CURSOR_IS_ZERO,
    CURSOR_TOO_OLD,
    CURSOR_TOO_NEW,
    INVALID_MSG,
    CMD_HANDLED,
    SAVED,
    SKIPPED_SAVE,
    FAILED_TO_SAVE,
    UNKNOWN;

    public static C0Y7G valueOf(String str) {
        return (C0Y7G) C08FF.LIZ(C0Y7G.class, str);
    }
}
