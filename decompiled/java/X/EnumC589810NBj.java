package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC589810NBj {
    public static final EnumC589810NBj IS_NOT_CLICKED;
    public static final EnumC589810NBj IS_NOT_VISIBLE;
    public static final EnumC589810NBj IS_VISIBLE;
    public static final /* synthetic */ EnumC589810NBj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC589810NBj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC589810NBj enumC589810NBj = new EnumC589810NBj("IS_VISIBLE", 0);
        IS_VISIBLE = enumC589810NBj;
        EnumC589810NBj enumC589810NBj2 = new EnumC589810NBj("IS_NOT_VISIBLE", 1);
        IS_NOT_VISIBLE = enumC589810NBj2;
        EnumC589810NBj enumC589810NBj3 = new EnumC589810NBj("IS_NOT_CLICKED", 2);
        IS_NOT_CLICKED = enumC589810NBj3;
        EnumC589810NBj[] enumC589810NBjArr = {enumC589810NBj, enumC589810NBj2, enumC589810NBj3};
        LL = enumC589810NBjArr;
        LLILLJJLI = new C2254308sP(enumC589810NBjArr);
    }

    public static EnumC589810NBj[] values() {
        return (EnumC589810NBj[]) LL.clone();
    }

    public static EnumC589810NBj valueOf(String str) {
        return (EnumC589810NBj) C08FF.LIZ(EnumC589810NBj.class, str);
    }

    public EnumC589810NBj(String str, int i) {
    }
}
