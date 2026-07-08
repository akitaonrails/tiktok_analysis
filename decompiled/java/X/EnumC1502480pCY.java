package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pCY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1502480pCY {
    public static final EnumC1502480pCY CLICK_VIEW_NOT_FOUND;
    public static final EnumC1502480pCY DATA_PROVIDER_NOT_FOUND;
    public static final EnumC1502480pCY DYNAMIC_CONTAINER_NOT_FOUND;
    public static final EnumC1502480pCY GENERAL_FAILURE;
    public static final EnumC1502480pCY INVALID_DI_PARAMS;
    public static final EnumC1502480pCY INVALID_INPUT_PARAMS;
    public static final /* synthetic */ EnumC1502480pCY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1502480pCY PARSE_MODEL_ERROR;
    public static final EnumC1502480pCY PDP_FRAGMENT_NOT_FOUND;
    public static final EnumC1502480pCY SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1502480pCY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1502480pCY enumC1502480pCY = new EnumC1502480pCY("SUCCESS", 0, 1);
        SUCCESS = enumC1502480pCY;
        EnumC1502480pCY enumC1502480pCY2 = new EnumC1502480pCY("GENERAL_FAILURE", 1, 0);
        GENERAL_FAILURE = enumC1502480pCY2;
        EnumC1502480pCY enumC1502480pCY3 = new EnumC1502480pCY("INVALID_INPUT_PARAMS", 2, -1);
        INVALID_INPUT_PARAMS = enumC1502480pCY3;
        EnumC1502480pCY enumC1502480pCY4 = new EnumC1502480pCY("PARSE_MODEL_ERROR", 3, -2);
        PARSE_MODEL_ERROR = enumC1502480pCY4;
        EnumC1502480pCY enumC1502480pCY5 = new EnumC1502480pCY("INVALID_DI_PARAMS", 4, -3);
        INVALID_DI_PARAMS = enumC1502480pCY5;
        EnumC1502480pCY enumC1502480pCY6 = new EnumC1502480pCY("DYNAMIC_CONTAINER_NOT_FOUND", 5, -4);
        DYNAMIC_CONTAINER_NOT_FOUND = enumC1502480pCY6;
        EnumC1502480pCY enumC1502480pCY7 = new EnumC1502480pCY("DATA_PROVIDER_NOT_FOUND", 6, -5);
        DATA_PROVIDER_NOT_FOUND = enumC1502480pCY7;
        EnumC1502480pCY enumC1502480pCY8 = new EnumC1502480pCY("PDP_FRAGMENT_NOT_FOUND", 7, -6);
        PDP_FRAGMENT_NOT_FOUND = enumC1502480pCY8;
        EnumC1502480pCY enumC1502480pCY9 = new EnumC1502480pCY("CLICK_VIEW_NOT_FOUND", 8, -7);
        CLICK_VIEW_NOT_FOUND = enumC1502480pCY9;
        EnumC1502480pCY[] enumC1502480pCYArr = {enumC1502480pCY, enumC1502480pCY2, enumC1502480pCY3, enumC1502480pCY4, enumC1502480pCY5, enumC1502480pCY6, enumC1502480pCY7, enumC1502480pCY8, enumC1502480pCY9};
        LLILLJJLI = enumC1502480pCYArr;
        LLILLL = new C2254308sP(enumC1502480pCYArr);
    }

    public static EnumC1502480pCY[] values() {
        return (EnumC1502480pCY[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1502480pCY valueOf(String str) {
        return (EnumC1502480pCY) C08FF.LIZ(EnumC1502480pCY.class, str);
    }

    public EnumC1502480pCY(String str, int i, int i2) {
        this.LL = i2;
    }
}
