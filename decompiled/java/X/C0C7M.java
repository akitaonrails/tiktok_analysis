package X;

/* JADX INFO: renamed from: X.0C7M, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public enum C0C7M {
    INT,
    BOOLEAN,
    LONG,
    FLOAT,
    DOUBLE,
    STRING,
    STRING_ARRAY,
    OBJECT;

    public static C0C7M valueOf(String str) {
        return (C0C7M) C08FF.LIZ(C0C7M.class, str);
    }
}
