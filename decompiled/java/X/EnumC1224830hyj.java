package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1224830hyj {
    public static final EnumC1224830hyj HIGHER;
    public static final /* synthetic */ EnumC1224830hyj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1224830hyj NORMAL;
    public static final EnumC1224830hyj NORMAL_WITH_GRAY_DESC;

    public static InterfaceC2044707zh<EnumC1224830hyj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1224830hyj enumC1224830hyj = new EnumC1224830hyj("NORMAL", 0);
        NORMAL = enumC1224830hyj;
        EnumC1224830hyj enumC1224830hyj2 = new EnumC1224830hyj("NORMAL_WITH_GRAY_DESC", 1);
        NORMAL_WITH_GRAY_DESC = enumC1224830hyj2;
        EnumC1224830hyj enumC1224830hyj3 = new EnumC1224830hyj("HIGHER", 2);
        HIGHER = enumC1224830hyj3;
        EnumC1224830hyj[] enumC1224830hyjArr = {enumC1224830hyj, enumC1224830hyj2, enumC1224830hyj3};
        LL = enumC1224830hyjArr;
        LLILLJJLI = new C2254308sP(enumC1224830hyjArr);
    }

    public static EnumC1224830hyj[] values() {
        return (EnumC1224830hyj[]) LL.clone();
    }

    public static EnumC1224830hyj valueOf(String str) {
        return (EnumC1224830hyj) C08FF.LIZ(EnumC1224830hyj.class, str);
    }

    public EnumC1224830hyj(String str, int i) {
    }
}
