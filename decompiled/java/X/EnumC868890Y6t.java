package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Y6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC868890Y6t {
    public static final EnumC868890Y6t CLIENT_ERROR;
    public static final EnumC868890Y6t CUSTOM;
    public static final C868930Y6x Companion;
    public static final EnumC868890Y6t DB_ERROR;
    public static final EnumC868890Y6t ENTITY_MISSING;
    public static final EnumC868890Y6t INVALID_PARAMETER;
    public static final /* synthetic */ EnumC868890Y6t[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC868890Y6t LOGIN_USER_CHANGED;
    public static final EnumC868890Y6t MISSING_ENTITY_OR_VALUE;
    public static final EnumC868890Y6t NOT_REGISTERED;
    public static final EnumC868890Y6t PARSE_FAILURE;
    public static final EnumC868890Y6t TIMEOUT;
    public static final EnumC868890Y6t UNDEFINED;
    public static final EnumC868890Y6t VERSION_TOO_OLD;
    public static final Map<Integer, EnumC868890Y6t> codeToEnumMap;
    public final int LL;

    public static InterfaceC2044707zh<EnumC868890Y6t> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0Y6x] */
    static {
        EnumC868890Y6t enumC868890Y6t = new EnumC868890Y6t("UNDEFINED", 0, 0);
        UNDEFINED = enumC868890Y6t;
        EnumC868890Y6t enumC868890Y6t2 = new EnumC868890Y6t("CLIENT_ERROR", 1, 1);
        CLIENT_ERROR = enumC868890Y6t2;
        EnumC868890Y6t enumC868890Y6t3 = new EnumC868890Y6t("MISSING_ENTITY_OR_VALUE", 2, 2);
        MISSING_ENTITY_OR_VALUE = enumC868890Y6t3;
        EnumC868890Y6t enumC868890Y6t4 = new EnumC868890Y6t("NOT_REGISTERED", 3, 3);
        NOT_REGISTERED = enumC868890Y6t4;
        EnumC868890Y6t enumC868890Y6t5 = new EnumC868890Y6t("ENTITY_MISSING", 4, 4);
        ENTITY_MISSING = enumC868890Y6t5;
        EnumC868890Y6t enumC868890Y6t6 = new EnumC868890Y6t("VERSION_TOO_OLD", 5, 5);
        VERSION_TOO_OLD = enumC868890Y6t6;
        EnumC868890Y6t enumC868890Y6t7 = new EnumC868890Y6t("LOGIN_USER_CHANGED", 6, 6);
        LOGIN_USER_CHANGED = enumC868890Y6t7;
        EnumC868890Y6t enumC868890Y6t8 = new EnumC868890Y6t("INVALID_PARAMETER", 7, 7);
        INVALID_PARAMETER = enumC868890Y6t8;
        EnumC868890Y6t enumC868890Y6t9 = new EnumC868890Y6t("PARSE_FAILURE", 8, 8);
        PARSE_FAILURE = enumC868890Y6t9;
        EnumC868890Y6t enumC868890Y6t10 = new EnumC868890Y6t("TIMEOUT", 9, 9);
        TIMEOUT = enumC868890Y6t10;
        EnumC868890Y6t enumC868890Y6t11 = new EnumC868890Y6t("DB_ERROR", 10, 10);
        DB_ERROR = enumC868890Y6t11;
        EnumC868890Y6t enumC868890Y6t12 = new EnumC868890Y6t("CUSTOM", 11, 10000);
        CUSTOM = enumC868890Y6t12;
        EnumC868890Y6t[] enumC868890Y6tArr = {enumC868890Y6t, enumC868890Y6t2, enumC868890Y6t3, enumC868890Y6t4, enumC868890Y6t5, enumC868890Y6t6, enumC868890Y6t7, enumC868890Y6t8, enumC868890Y6t9, enumC868890Y6t10, enumC868890Y6t11, enumC868890Y6t12};
        LLILLJJLI = enumC868890Y6tArr;
        LLILLL = new C2254308sP(enumC868890Y6tArr);
        Companion = new Object() { // from class: X.0Y6x
        };
        EnumC868890Y6t[] enumC868890Y6tArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC868890Y6tArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC868890Y6t enumC868890Y6t13 : enumC868890Y6tArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC868890Y6t13.LL), enumC868890Y6t13);
        }
        codeToEnumMap = linkedHashMap;
    }

    public static EnumC868890Y6t[] values() {
        return (EnumC868890Y6t[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC868890Y6t valueOf(String str) {
        return (EnumC868890Y6t) C08FF.LIZ(EnumC868890Y6t.class, str);
    }

    public EnumC868890Y6t(String str, int i, int i2) {
        this.LL = i2;
    }
}
