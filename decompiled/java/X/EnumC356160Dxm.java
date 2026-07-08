package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356160Dxm {
    public static final EnumC356160Dxm CUSTOM;
    public static final EnumC356160Dxm DATE;
    public static final /* synthetic */ EnumC356160Dxm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356160Dxm MAGNIFIER;
    public static final EnumC356160Dxm NORMAL;
    public static final EnumC356160Dxm TIME;

    public static InterfaceC2044707zh<EnumC356160Dxm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356160Dxm enumC356160Dxm = new EnumC356160Dxm("MAGNIFIER", 0);
        MAGNIFIER = enumC356160Dxm;
        EnumC356160Dxm enumC356160Dxm2 = new EnumC356160Dxm("DATE", 1);
        DATE = enumC356160Dxm2;
        EnumC356160Dxm enumC356160Dxm3 = new EnumC356160Dxm("TIME", 2);
        TIME = enumC356160Dxm3;
        EnumC356160Dxm enumC356160Dxm4 = new EnumC356160Dxm("NORMAL", 3);
        NORMAL = enumC356160Dxm4;
        EnumC356160Dxm enumC356160Dxm5 = new EnumC356160Dxm("CUSTOM", 4);
        CUSTOM = enumC356160Dxm5;
        EnumC356160Dxm[] enumC356160DxmArr = {enumC356160Dxm, enumC356160Dxm2, enumC356160Dxm3, enumC356160Dxm4, enumC356160Dxm5};
        LL = enumC356160DxmArr;
        LLILLJJLI = new C2254308sP(enumC356160DxmArr);
    }

    public static EnumC356160Dxm[] values() {
        return (EnumC356160Dxm[]) LL.clone();
    }

    public static EnumC356160Dxm valueOf(String str) {
        return (EnumC356160Dxm) C08FF.LIZ(EnumC356160Dxm.class, str);
    }

    public EnumC356160Dxm(String str, int i) {
    }
}
