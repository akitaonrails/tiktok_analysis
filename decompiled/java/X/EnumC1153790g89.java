package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g89, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153790g89 {
    public static final EnumC1153790g89 ELEMENT_CLOSED;
    public static final EnumC1153790g89 ELEMENT_TRANSLATION_CLOSED;
    public static final /* synthetic */ EnumC1153790g89[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1153790g89 OTHER;
    public static final EnumC1153790g89 USER_FILTER_LANGUAGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1153790g89> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1153790g89 enumC1153790g89 = new EnumC1153790g89("USER_FILTER_LANGUAGE", 0, 1);
        USER_FILTER_LANGUAGE = enumC1153790g89;
        EnumC1153790g89 enumC1153790g892 = new EnumC1153790g89("ELEMENT_TRANSLATION_CLOSED", 1, 2);
        ELEMENT_TRANSLATION_CLOSED = enumC1153790g892;
        EnumC1153790g89 enumC1153790g893 = new EnumC1153790g89("ELEMENT_CLOSED", 2, 3);
        ELEMENT_CLOSED = enumC1153790g893;
        EnumC1153790g89 enumC1153790g894 = new EnumC1153790g89("OTHER", 3, 4);
        OTHER = enumC1153790g894;
        EnumC1153790g89[] enumC1153790g89Arr = {enumC1153790g89, enumC1153790g892, enumC1153790g893, enumC1153790g894};
        LLILLJJLI = enumC1153790g89Arr;
        LLILLL = new C2254308sP(enumC1153790g89Arr);
    }

    public static EnumC1153790g89[] values() {
        return (EnumC1153790g89[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1153790g89 valueOf(String str) {
        return (EnumC1153790g89) C08FF.LIZ(EnumC1153790g89.class, str);
    }

    public EnumC1153790g89(String str, int i, int i2) {
        this.LL = i2;
    }
}
