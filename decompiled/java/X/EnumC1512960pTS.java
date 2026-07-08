package X;

/* JADX INFO: renamed from: X.0pTS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1512960pTS {
    NO_ERROR,
    ERR_MEMORY_ALLOC,
    NOT_IMPLEMENTED,
    ERR_UNEXPECTED,
    ERR_DATANOMATCH,
    INPUT_DATA_ERROR,
    CALL_BACK_STOP,
    BACKEND_FALLBACK,
    NULL_POINTER,
    INVALID_POINTER,
    INVALID_MODEL,
    INFER_SIZE_ERROR,
    NOT_SUPPORT,
    DESTROYED_ERROR,
    WRONG_LICENSE,
    BROKEN_MODEL,
    EARLY_STOP;

    public static EnumC1512960pTS valueOf(String str) {
        return (EnumC1512960pTS) C08FF.LIZ(EnumC1512960pTS.class, str);
    }
}
