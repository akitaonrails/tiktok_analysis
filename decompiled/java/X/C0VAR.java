package X;

/* JADX INFO: renamed from: X.0VAR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0VAR {
    TIMESTAMP,
    CALLER_LIB_NAME,
    OP,
    LIB_NAME,
    SYM_NAME,
    SYM_ADDR,
    NEW_ADDR,
    BACKUP_LEN,
    ERRNO,
    STUB,
    FLAGS,
    TRACE;

    public static C0VAR valueOf(String str) {
        return (C0VAR) C08FF.LIZ(C0VAR.class, str);
    }
}
