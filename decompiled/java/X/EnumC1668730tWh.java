package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1668730tWh {
    public static final EnumC1668730tWh AI_SELF_MODEL_GENERATING;
    public static final EnumC1668730tWh AI_SELF_MODEL_GENERATION_FAIL;
    public static final EnumC1668730tWh AI_SELF_MODEL_GENERATION_SUCCESS;
    public static final EnumC1668730tWh DEFAULT_EMPTY_PREVIEW;
    public static final /* synthetic */ EnumC1668730tWh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1668730tWh NO_AI_SELF;
    public static final EnumC1668730tWh STYLE_GENERATED;
    public static final EnumC1668730tWh STYLE_GENERATING;
    public static final EnumC1668730tWh STYLE_GENERATION_FAIL;
    public static final EnumC1668730tWh STYLE_NOT_GENERATED;
    public static final EnumC1668730tWh STYLE_QUEUEING;

    public static InterfaceC2044707zh<EnumC1668730tWh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1668730tWh enumC1668730tWh = new EnumC1668730tWh("DEFAULT_EMPTY_PREVIEW", 0);
        DEFAULT_EMPTY_PREVIEW = enumC1668730tWh;
        EnumC1668730tWh enumC1668730tWh2 = new EnumC1668730tWh("NO_AI_SELF", 1);
        NO_AI_SELF = enumC1668730tWh2;
        EnumC1668730tWh enumC1668730tWh3 = new EnumC1668730tWh("STYLE_NOT_GENERATED", 2);
        STYLE_NOT_GENERATED = enumC1668730tWh3;
        EnumC1668730tWh enumC1668730tWh4 = new EnumC1668730tWh("STYLE_QUEUEING", 3);
        STYLE_QUEUEING = enumC1668730tWh4;
        EnumC1668730tWh enumC1668730tWh5 = new EnumC1668730tWh("STYLE_GENERATING", 4);
        STYLE_GENERATING = enumC1668730tWh5;
        EnumC1668730tWh enumC1668730tWh6 = new EnumC1668730tWh("STYLE_GENERATED", 5);
        STYLE_GENERATED = enumC1668730tWh6;
        EnumC1668730tWh enumC1668730tWh7 = new EnumC1668730tWh("STYLE_GENERATION_FAIL", 6);
        STYLE_GENERATION_FAIL = enumC1668730tWh7;
        EnumC1668730tWh enumC1668730tWh8 = new EnumC1668730tWh("AI_SELF_MODEL_GENERATING", 7);
        AI_SELF_MODEL_GENERATING = enumC1668730tWh8;
        EnumC1668730tWh enumC1668730tWh9 = new EnumC1668730tWh("AI_SELF_MODEL_GENERATION_FAIL", 8);
        AI_SELF_MODEL_GENERATION_FAIL = enumC1668730tWh9;
        EnumC1668730tWh enumC1668730tWh10 = new EnumC1668730tWh("AI_SELF_MODEL_GENERATION_SUCCESS", 9);
        AI_SELF_MODEL_GENERATION_SUCCESS = enumC1668730tWh10;
        EnumC1668730tWh[] enumC1668730tWhArr = {enumC1668730tWh, enumC1668730tWh2, enumC1668730tWh3, enumC1668730tWh4, enumC1668730tWh5, enumC1668730tWh6, enumC1668730tWh7, enumC1668730tWh8, enumC1668730tWh9, enumC1668730tWh10};
        LL = enumC1668730tWhArr;
        LLILLJJLI = new C2254308sP(enumC1668730tWhArr);
    }

    public static EnumC1668730tWh[] values() {
        return (EnumC1668730tWh[]) LL.clone();
    }

    public static EnumC1668730tWh valueOf(String str) {
        return (EnumC1668730tWh) C08FF.LIZ(EnumC1668730tWh.class, str);
    }

    public EnumC1668730tWh(String str, int i) {
    }
}
