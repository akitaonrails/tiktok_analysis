package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EyI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC381960EyI {
    public static final EnumC381960EyI EDITOR_PRO;
    public static final EnumC381960EyI EDITOR_PRO_AIGC_T2I;
    public static final EnumC381960EyI EDITOR_PRO_AIGC_T2V;
    public static final EnumC381960EyI EDIT_AI_PLAYGROUND;
    public static final /* synthetic */ EnumC381960EyI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC381960EyI TEMPLATE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC381960EyI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC381960EyI enumC381960EyI = new EnumC381960EyI("EDITOR_PRO", 0, "editor_pro");
        EDITOR_PRO = enumC381960EyI;
        EnumC381960EyI enumC381960EyI2 = new EnumC381960EyI("EDITOR_PRO_AIGC_T2I", 1, "EDITOR_PRO_AIGC_T2I");
        EDITOR_PRO_AIGC_T2I = enumC381960EyI2;
        EnumC381960EyI enumC381960EyI3 = new EnumC381960EyI("EDITOR_PRO_AIGC_T2V", 2, "EDITOR_PRO_AIGC_T2V");
        EDITOR_PRO_AIGC_T2V = enumC381960EyI3;
        EnumC381960EyI enumC381960EyI4 = new EnumC381960EyI("EDIT_AI_PLAYGROUND", 3, "edit_ai_playground");
        EDIT_AI_PLAYGROUND = enumC381960EyI4;
        EnumC381960EyI enumC381960EyI5 = new EnumC381960EyI("TEMPLATE", 4, "template");
        TEMPLATE = enumC381960EyI5;
        EnumC381960EyI[] enumC381960EyIArr = {enumC381960EyI, enumC381960EyI2, enumC381960EyI3, enumC381960EyI4, enumC381960EyI5};
        LLILLJJLI = enumC381960EyIArr;
        LLILLL = new C2254308sP(enumC381960EyIArr);
    }

    public static EnumC381960EyI[] values() {
        return (EnumC381960EyI[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC381960EyI valueOf(String str) {
        return (EnumC381960EyI) C08FF.LIZ(EnumC381960EyI.class, str);
    }

    public EnumC381960EyI(String str, int i, String str2) {
        this.LL = str2;
    }
}
