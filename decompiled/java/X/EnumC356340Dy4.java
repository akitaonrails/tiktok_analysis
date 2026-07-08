package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dy4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356340Dy4 {
    public static final EnumC356340Dy4 AI_DRAWING;
    public static final EnumC356340Dy4 AI_PHOTO;
    public static final EnumC356340Dy4 EXPRESSION;
    public static final /* synthetic */ EnumC356340Dy4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC356340Dy4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC356340Dy4 enumC356340Dy4 = new EnumC356340Dy4("EXPRESSION", 0, "expression");
        EXPRESSION = enumC356340Dy4;
        EnumC356340Dy4 enumC356340Dy42 = new EnumC356340Dy4("AI_PHOTO", 1, "ai_photo");
        AI_PHOTO = enumC356340Dy42;
        EnumC356340Dy4 enumC356340Dy43 = new EnumC356340Dy4("AI_DRAWING", 2, "ai_painting");
        AI_DRAWING = enumC356340Dy43;
        EnumC356340Dy4[] enumC356340Dy4Arr = {enumC356340Dy4, enumC356340Dy42, enumC356340Dy43};
        LLILLJJLI = enumC356340Dy4Arr;
        LLILLL = new C2254308sP(enumC356340Dy4Arr);
    }

    public static EnumC356340Dy4[] values() {
        return (EnumC356340Dy4[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC356340Dy4 valueOf(String str) {
        return (EnumC356340Dy4) C08FF.LIZ(EnumC356340Dy4.class, str);
    }

    public EnumC356340Dy4(String str, int i, String str2) {
        this.LL = str2;
    }
}
