package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC381980EyK {
    public static final EnumC381980EyK EDITOR_PRO_AIGC_T2I;
    public static final EnumC381980EyK EDITOR_PRO_AIGC_T2V;
    public static final EnumC381980EyK EDITOR_PRO_AIGC_V2V;
    public static final EnumC381980EyK I2V;
    public static final /* synthetic */ EnumC381980EyK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC381980EyK TEMPLATE_FL2V;
    public static final EnumC381980EyK TEMPLATE_I2I;
    public static final EnumC381980EyK TRANSITION_FRAME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC381980EyK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC381980EyK enumC381980EyK = new EnumC381980EyK("EDITOR_PRO_AIGC_T2I", 0, "EDITOR_PRO_AIGC_T2I");
        EDITOR_PRO_AIGC_T2I = enumC381980EyK;
        EnumC381980EyK enumC381980EyK2 = new EnumC381980EyK("EDITOR_PRO_AIGC_T2V", 1, "EDITOR_PRO_AIGC_T2V");
        EDITOR_PRO_AIGC_T2V = enumC381980EyK2;
        EnumC381980EyK enumC381980EyK3 = new EnumC381980EyK("EDITOR_PRO_AIGC_V2V", 2, "EDITOR_PRO_AIGC_V2V");
        EDITOR_PRO_AIGC_V2V = enumC381980EyK3;
        EnumC381980EyK enumC381980EyK4 = new EnumC381980EyK("I2V", 3, "I2V");
        I2V = enumC381980EyK4;
        EnumC381980EyK enumC381980EyK5 = new EnumC381980EyK("TEMPLATE_FL2V", 4, "template_fl2v");
        TEMPLATE_FL2V = enumC381980EyK5;
        EnumC381980EyK enumC381980EyK6 = new EnumC381980EyK("TEMPLATE_I2I", 5, "template_i2i");
        TEMPLATE_I2I = enumC381980EyK6;
        EnumC381980EyK enumC381980EyK7 = new EnumC381980EyK("TRANSITION_FRAME", 6, "transition_frame");
        TRANSITION_FRAME = enumC381980EyK7;
        EnumC381980EyK[] enumC381980EyKArr = {enumC381980EyK, enumC381980EyK2, enumC381980EyK3, enumC381980EyK4, enumC381980EyK5, enumC381980EyK6, enumC381980EyK7};
        LLILLJJLI = enumC381980EyKArr;
        LLILLL = new C2254308sP(enumC381980EyKArr);
    }

    public static EnumC381980EyK[] values() {
        return (EnumC381980EyK[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC381980EyK valueOf(String str) {
        return (EnumC381980EyK) C08FF.LIZ(EnumC381980EyK.class, str);
    }

    public EnumC381980EyK(String str, int i, String str2) {
        this.LL = str2;
    }
}
