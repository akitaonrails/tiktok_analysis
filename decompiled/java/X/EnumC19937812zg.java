package X;

/* JADX INFO: renamed from: X.12zg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19937812zg {
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

    public static EnumC19937812zg valueOf(String str) {
        return (EnumC19937812zg) C08FF.LIZ(EnumC19937812zg.class, str);
    }

    EnumC19937812zg(Object obj) {
        this.defaultDefault = obj;
    }
}
