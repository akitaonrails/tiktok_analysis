package X;

/* JADX INFO: renamed from: X.09ER, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public enum C09ER {
    /* JADX INFO: Fake field, exist only in values array */
    NULL_RESULT_TYPE("null", 0),
    /* JADX INFO: Fake field, exist only in values array */
    STRING_RESULT_TYPE("string", 1),
    /* JADX INFO: Fake field, exist only in values array */
    INT_RESULT_TYPE("int", 2),
    /* JADX INFO: Fake field, exist only in values array */
    LONG_RESULT_TYPE("long", 3),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT_RESULT_TYPE("float", 4),
    /* JADX INFO: Fake field, exist only in values array */
    JSON_ELEMENT_RESULT_TYPE("jsonElement", 5),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN_RESULT_TYPE("boolean", 6),
    /* JADX INFO: Fake field, exist only in values array */
    BYTE_RESULT_TYPE("byte", 7),
    /* JADX INFO: Fake field, exist only in values array */
    SHORT_RESULT_TYPE("short", 8),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE_RESULT_TYPE("double", 9);

    public final String LL;
    public final int LLILLJJLI;

    public static int LIZJ(String str) {
        for (C09ER c09er : values()) {
            if (str.equals(c09er.LL)) {
                return c09er.LLILLJJLI;
            }
        }
        return 0;
    }

    public static C09ER valueOf(String str) {
        return (C09ER) C08FF.LIZ(C09ER.class, str);
    }

    C09ER(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
