package X;

/* JADX INFO: renamed from: X.1332, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum AnonymousClass1332 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(AbstractC19922812xG.EMPTY),
    ENUM(null),
    MESSAGE(null);

    public final Object defaultDefault;

    public static AnonymousClass1332 valueOf(String str) {
        return (AnonymousClass1332) C08FF.LIZ(AnonymousClass1332.class, str);
    }

    AnonymousClass1332(Object obj) {
        this.defaultDefault = obj;
    }
}
