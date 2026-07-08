package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1985907qD {
    public static final /* synthetic */ EnumC1985907qD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1985907qD MALL_NEW_USER;
    public static final EnumC1985907qD MALL_OLD_USER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1985907qD> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1985907qD enumC1985907qD = new EnumC1985907qD("MALL_NEW_USER", 0, 0);
        MALL_NEW_USER = enumC1985907qD;
        EnumC1985907qD enumC1985907qD2 = new EnumC1985907qD("MALL_OLD_USER", 1, 1);
        MALL_OLD_USER = enumC1985907qD2;
        EnumC1985907qD[] enumC1985907qDArr = {enumC1985907qD, enumC1985907qD2};
        LLILLJJLI = enumC1985907qDArr;
        LLILLL = new C2254308sP(enumC1985907qDArr);
    }

    public static EnumC1985907qD[] values() {
        return (EnumC1985907qD[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1985907qD valueOf(String str) {
        return (EnumC1985907qD) C08FF.LIZ(EnumC1985907qD.class, str);
    }

    public EnumC1985907qD(String str, int i, int i2) {
        this.LL = i2;
    }
}
