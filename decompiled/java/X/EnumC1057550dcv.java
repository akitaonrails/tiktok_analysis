package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dcv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1057550dcv {
    public static final /* synthetic */ EnumC1057550dcv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1057550dcv alwaysCloseAfterOpen;
    public static final EnumC1057550dcv alwaysCloseBeforeOpen;
    public static final EnumC1057550dcv onlyCloseAfterOpenSucceed;

    public static InterfaceC2044707zh<EnumC1057550dcv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1057550dcv enumC1057550dcv = new EnumC1057550dcv("alwaysCloseAfterOpen", 0);
        alwaysCloseAfterOpen = enumC1057550dcv;
        EnumC1057550dcv enumC1057550dcv2 = new EnumC1057550dcv("alwaysCloseBeforeOpen", 1);
        alwaysCloseBeforeOpen = enumC1057550dcv2;
        EnumC1057550dcv enumC1057550dcv3 = new EnumC1057550dcv("onlyCloseAfterOpenSucceed", 2);
        onlyCloseAfterOpenSucceed = enumC1057550dcv3;
        EnumC1057550dcv[] enumC1057550dcvArr = {enumC1057550dcv, enumC1057550dcv2, enumC1057550dcv3};
        LL = enumC1057550dcvArr;
        LLILLJJLI = new C2254308sP(enumC1057550dcvArr);
    }

    public static EnumC1057550dcv[] values() {
        return (EnumC1057550dcv[]) LL.clone();
    }

    public static EnumC1057550dcv valueOf(String str) {
        return (EnumC1057550dcv) C08FF.LIZ(EnumC1057550dcv.class, str);
    }

    public EnumC1057550dcv(String str, int i) {
    }
}
