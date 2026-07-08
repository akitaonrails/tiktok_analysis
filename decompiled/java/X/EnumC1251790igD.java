package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0igD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1251790igD {
    public static final EnumC1251790igD CHANGE_TAB;
    public static final /* synthetic */ EnumC1251790igD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1251790igD NORMAL;
    public static final EnumC1251790igD START_OTHER_PAGE;

    public static InterfaceC2044707zh<EnumC1251790igD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1251790igD enumC1251790igD = new EnumC1251790igD("NORMAL", 0);
        NORMAL = enumC1251790igD;
        EnumC1251790igD enumC1251790igD2 = new EnumC1251790igD("CHANGE_TAB", 1);
        CHANGE_TAB = enumC1251790igD2;
        EnumC1251790igD enumC1251790igD3 = new EnumC1251790igD("START_OTHER_PAGE", 2);
        START_OTHER_PAGE = enumC1251790igD3;
        EnumC1251790igD[] enumC1251790igDArr = {enumC1251790igD, enumC1251790igD2, enumC1251790igD3};
        LL = enumC1251790igDArr;
        LLILLJJLI = new C2254308sP(enumC1251790igDArr);
    }

    public static EnumC1251790igD[] values() {
        return (EnumC1251790igD[]) LL.clone();
    }

    public static EnumC1251790igD valueOf(String str) {
        return (EnumC1251790igD) C08FF.LIZ(EnumC1251790igD.class, str);
    }

    public EnumC1251790igD(String str, int i) {
    }
}
