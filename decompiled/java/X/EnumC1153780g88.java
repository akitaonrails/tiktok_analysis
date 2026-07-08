package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g88, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153780g88 {
    public static final EnumC1153780g88 EFFECT_ICON_FEMALE;
    public static final EnumC1153780g88 EFFECT_ICON_MALE;
    public static final /* synthetic */ EnumC1153780g88[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1153780g88> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1153780g88 enumC1153780g88 = new EnumC1153780g88("EFFECT_ICON_FEMALE", 0, "female");
        EFFECT_ICON_FEMALE = enumC1153780g88;
        EnumC1153780g88 enumC1153780g882 = new EnumC1153780g88("EFFECT_ICON_MALE", 1, "male");
        EFFECT_ICON_MALE = enumC1153780g882;
        EnumC1153780g88[] enumC1153780g88Arr = {enumC1153780g88, enumC1153780g882};
        LLILLJJLI = enumC1153780g88Arr;
        LLILLL = new C2254308sP(enumC1153780g88Arr);
    }

    public static EnumC1153780g88[] values() {
        return (EnumC1153780g88[]) LLILLJJLI.clone();
    }

    public final String getTypeVal() {
        return this.LL;
    }

    public static EnumC1153780g88 valueOf(String str) {
        return (EnumC1153780g88) C08FF.LIZ(EnumC1153780g88.class, str);
    }

    public EnumC1153780g88(String str, int i, String str2) {
        this.LL = str2;
    }
}
