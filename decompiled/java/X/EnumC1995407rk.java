package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1995407rk {
    public static final EnumC1995407rk AUTHORIZATION;
    public static final /* synthetic */ EnumC1995407rk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1995407rk OPT_AUTHORIZATION;
    public static final EnumC1995407rk THIRD_PART_NAME;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1995407rk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1995407rk enumC1995407rk = new EnumC1995407rk("AUTHORIZATION", 0, 1);
        AUTHORIZATION = enumC1995407rk;
        EnumC1995407rk enumC1995407rk2 = new EnumC1995407rk("THIRD_PART_NAME", 1, 2);
        THIRD_PART_NAME = enumC1995407rk2;
        EnumC1995407rk enumC1995407rk3 = new EnumC1995407rk("OPT_AUTHORIZATION", 2, 3);
        OPT_AUTHORIZATION = enumC1995407rk3;
        EnumC1995407rk[] enumC1995407rkArr = {enumC1995407rk, enumC1995407rk2, enumC1995407rk3};
        LLILLJJLI = enumC1995407rkArr;
        LLILLL = new C2254308sP(enumC1995407rkArr);
    }

    public static EnumC1995407rk[] values() {
        return (EnumC1995407rk[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1995407rk valueOf(String str) {
        return (EnumC1995407rk) C08FF.LIZ(EnumC1995407rk.class, str);
    }

    public EnumC1995407rk(String str, int i, int i2) {
        this.LL = i2;
    }
}
