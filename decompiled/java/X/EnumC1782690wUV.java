package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782690wUV {
    public static final /* synthetic */ EnumC1782690wUV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1782690wUV NOT_EXIST;
    public static final EnumC1782690wUV NOT_TRANSLATABLE;
    public static final EnumC1782690wUV TO_BE_TRANSLATED;
    public static final EnumC1782690wUV TRANSLATION_NOT_TRIGGERED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1782690wUV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1782690wUV enumC1782690wUV = new EnumC1782690wUV("NOT_EXIST", 0, 0);
        NOT_EXIST = enumC1782690wUV;
        EnumC1782690wUV enumC1782690wUV2 = new EnumC1782690wUV("TO_BE_TRANSLATED", 1, 1);
        TO_BE_TRANSLATED = enumC1782690wUV2;
        EnumC1782690wUV enumC1782690wUV3 = new EnumC1782690wUV("NOT_TRANSLATABLE", 2, 2);
        NOT_TRANSLATABLE = enumC1782690wUV3;
        EnumC1782690wUV enumC1782690wUV4 = new EnumC1782690wUV("TRANSLATION_NOT_TRIGGERED", 3, 3);
        TRANSLATION_NOT_TRIGGERED = enumC1782690wUV4;
        EnumC1782690wUV[] enumC1782690wUVArr = {enumC1782690wUV, enumC1782690wUV2, enumC1782690wUV3, enumC1782690wUV4};
        LLILLJJLI = enumC1782690wUVArr;
        LLILLL = new C2254308sP(enumC1782690wUVArr);
    }

    public static EnumC1782690wUV[] values() {
        return (EnumC1782690wUV[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1782690wUV valueOf(String str) {
        return (EnumC1782690wUV) C08FF.LIZ(EnumC1782690wUV.class, str);
    }

    public EnumC1782690wUV(String str, int i, int i2) {
        this.LL = i2;
    }
}
