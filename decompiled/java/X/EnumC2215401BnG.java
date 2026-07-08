package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1BnG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2215401BnG {
    public static final C2215441BnK Companion;
    public static final EnumC2215401BnG EQUAL;
    public static final EnumC2215401BnG GREATER_EQUAL;
    public static final EnumC2215401BnG GREATER_THAN;
    public static final EnumC2215401BnG IN;
    public static final EnumC2215401BnG LESS_EQUAL;
    public static final EnumC2215401BnG LESS_THAN;
    public static final /* synthetic */ EnumC2215401BnG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2215401BnG NOT_EQUAL;
    public static final EnumC2215401BnG NOT_IN;
    public static final EnumC2215401BnG REGEX;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2215401BnG> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.1BnK] */
    static {
        EnumC2215401BnG enumC2215401BnG = new EnumC2215401BnG("EQUAL", 0, "==");
        EQUAL = enumC2215401BnG;
        EnumC2215401BnG enumC2215401BnG2 = new EnumC2215401BnG("NOT_EQUAL", 1, "!=");
        NOT_EQUAL = enumC2215401BnG2;
        EnumC2215401BnG enumC2215401BnG3 = new EnumC2215401BnG("GREATER_THAN", 2, ">");
        GREATER_THAN = enumC2215401BnG3;
        EnumC2215401BnG enumC2215401BnG4 = new EnumC2215401BnG("LESS_THAN", 3, "<");
        LESS_THAN = enumC2215401BnG4;
        EnumC2215401BnG enumC2215401BnG5 = new EnumC2215401BnG("GREATER_EQUAL", 4, ">=");
        GREATER_EQUAL = enumC2215401BnG5;
        EnumC2215401BnG enumC2215401BnG6 = new EnumC2215401BnG("LESS_EQUAL", 5, "<=");
        LESS_EQUAL = enumC2215401BnG6;
        EnumC2215401BnG enumC2215401BnG7 = new EnumC2215401BnG("IN", 6, "in");
        IN = enumC2215401BnG7;
        EnumC2215401BnG enumC2215401BnG8 = new EnumC2215401BnG("NOT_IN", 7, "not_in");
        NOT_IN = enumC2215401BnG8;
        EnumC2215401BnG enumC2215401BnG9 = new EnumC2215401BnG("REGEX", 8, "regex");
        REGEX = enumC2215401BnG9;
        EnumC2215401BnG[] enumC2215401BnGArr = {enumC2215401BnG, enumC2215401BnG2, enumC2215401BnG3, enumC2215401BnG4, enumC2215401BnG5, enumC2215401BnG6, enumC2215401BnG7, enumC2215401BnG8, enumC2215401BnG9};
        LLILLJJLI = enumC2215401BnGArr;
        LLILLL = new C2254308sP(enumC2215401BnGArr);
        Companion = new Object() { // from class: X.1BnK
        };
    }

    public static EnumC2215401BnG[] values() {
        return (EnumC2215401BnG[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2215401BnG valueOf(String str) {
        return (EnumC2215401BnG) C08FF.LIZ(EnumC2215401BnG.class, str);
    }

    public EnumC2215401BnG(String str, int i, String str2) {
        this.LL = str2;
    }
}
