package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LuW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC557980LuW {
    public static final EnumC557980LuW EDITOR_PRO;
    public static final /* synthetic */ EnumC557980LuW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC557980LuW POV;
    public static final EnumC557980LuW UNKNOWN;
    public static final EnumC557980LuW VISUAL_POET;
    public final int LL;

    public static InterfaceC2044707zh<EnumC557980LuW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC557980LuW enumC557980LuW = new EnumC557980LuW("UNKNOWN", 0, 0);
        UNKNOWN = enumC557980LuW;
        EnumC557980LuW enumC557980LuW2 = new EnumC557980LuW("VISUAL_POET", 1, 1);
        VISUAL_POET = enumC557980LuW2;
        EnumC557980LuW enumC557980LuW3 = new EnumC557980LuW("POV", 2, 2);
        POV = enumC557980LuW3;
        EnumC557980LuW enumC557980LuW4 = new EnumC557980LuW("EDITOR_PRO", 3, 3);
        EDITOR_PRO = enumC557980LuW4;
        EnumC557980LuW[] enumC557980LuWArr = {enumC557980LuW, enumC557980LuW2, enumC557980LuW3, enumC557980LuW4};
        LLILLJJLI = enumC557980LuWArr;
        LLILLL = new C2254308sP(enumC557980LuWArr);
    }

    public static EnumC557980LuW[] values() {
        return (EnumC557980LuW[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC557980LuW valueOf(String str) {
        return (EnumC557980LuW) C08FF.LIZ(EnumC557980LuW.class, str);
    }

    public EnumC557980LuW(String str, int i, int i2) {
        this.LL = i2;
    }
}
