package X;

/* JADX INFO: renamed from: X.08FG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public enum C08FG {
    PATTERN("PATTERN_PROTECT_THROWABLE"),
    JSON("JSON_PROTECT_THROWABLE"),
    CAST_NUMBER("CAST_NUMBER_PROTECT_THROWABLE"),
    CAST_COLOR("CAST_COLOR_PROTECT_THROWABLE"),
    EQUALS("EQUALS_PROTECT_THROWABLE"),
    ENUM("ENUM_PROTECT_THROWABLE"),
    URI("URI_PROTECT_THROWABLE"),
    COLLECTIONS("COLLECTION_PROTECT_THROWABLE");

    public final String LL;

    public String getName() {
        return this.LL;
    }

    public static C08FG valueOf(String str) {
        return (C08FG) C08FF.LIZ(C08FG.class, str);
    }

    C08FG(String str) {
        this.LL = str;
    }
}
