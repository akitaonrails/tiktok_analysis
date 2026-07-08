package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hlm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216800hlm {
    public static final /* synthetic */ EnumC1216800hlm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1216800hlm NICKNAME;
    public static final EnumC1216800hlm USERNAME;

    public static InterfaceC2044707zh<EnumC1216800hlm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1216800hlm enumC1216800hlm = new EnumC1216800hlm("USERNAME", 0);
        USERNAME = enumC1216800hlm;
        EnumC1216800hlm enumC1216800hlm2 = new EnumC1216800hlm("NICKNAME", 1);
        NICKNAME = enumC1216800hlm2;
        EnumC1216800hlm[] enumC1216800hlmArr = {enumC1216800hlm, enumC1216800hlm2};
        LL = enumC1216800hlmArr;
        LLILLJJLI = new C2254308sP(enumC1216800hlmArr);
    }

    public static EnumC1216800hlm[] values() {
        return (EnumC1216800hlm[]) LL.clone();
    }

    public static EnumC1216800hlm valueOf(String str) {
        return (EnumC1216800hlm) C08FF.LIZ(EnumC1216800hlm.class, str);
    }

    public EnumC1216800hlm(String str, int i) {
    }
}
