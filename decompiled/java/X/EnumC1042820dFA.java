package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dFA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1042820dFA {
    public static final EnumC1042820dFA CACHE_UPDATE_ERROR;
    public static final /* synthetic */ EnumC1042820dFA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1042820dFA NET_REQUEST_FAILED;
    public static final EnumC1042820dFA REQUEST_META_INVALID;
    public static final EnumC1042820dFA RESPONSE_PARSE_ERROR;
    public static final EnumC1042820dFA SERVER_RULES_INVALID;
    public static final EnumC1042820dFA SERVER_UPDATE_AT_INVALID;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1042820dFA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1042820dFA enumC1042820dFA = new EnumC1042820dFA("REQUEST_META_INVALID", 0, 100);
        REQUEST_META_INVALID = enumC1042820dFA;
        EnumC1042820dFA enumC1042820dFA2 = new EnumC1042820dFA("NET_REQUEST_FAILED", 1, 101);
        NET_REQUEST_FAILED = enumC1042820dFA2;
        EnumC1042820dFA enumC1042820dFA3 = new EnumC1042820dFA("RESPONSE_PARSE_ERROR", 2, 102);
        RESPONSE_PARSE_ERROR = enumC1042820dFA3;
        EnumC1042820dFA enumC1042820dFA4 = new EnumC1042820dFA("SERVER_UPDATE_AT_INVALID", 3, 103);
        SERVER_UPDATE_AT_INVALID = enumC1042820dFA4;
        EnumC1042820dFA enumC1042820dFA5 = new EnumC1042820dFA("SERVER_RULES_INVALID", 4, 104);
        SERVER_RULES_INVALID = enumC1042820dFA5;
        EnumC1042820dFA enumC1042820dFA6 = new EnumC1042820dFA("CACHE_UPDATE_ERROR", 5, 105);
        CACHE_UPDATE_ERROR = enumC1042820dFA6;
        EnumC1042820dFA[] enumC1042820dFAArr = {enumC1042820dFA, enumC1042820dFA2, enumC1042820dFA3, enumC1042820dFA4, enumC1042820dFA5, enumC1042820dFA6};
        LLILLJJLI = enumC1042820dFAArr;
        LLILLL = new C2254308sP(enumC1042820dFAArr);
    }

    public static EnumC1042820dFA[] values() {
        return (EnumC1042820dFA[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC1042820dFA valueOf(String str) {
        return (EnumC1042820dFA) C08FF.LIZ(EnumC1042820dFA.class, str);
    }

    public EnumC1042820dFA(String str, int i, int i2) {
        this.LL = i2;
    }
}
