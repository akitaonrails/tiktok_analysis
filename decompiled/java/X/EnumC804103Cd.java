package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Cd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC804103Cd {
    public static final EnumC804103Cd DOORSTEP;
    public static final /* synthetic */ EnumC804103Cd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC804103Cd PICKUP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC804103Cd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC804103Cd enumC804103Cd = new EnumC804103Cd("DOORSTEP", 0, 1);
        DOORSTEP = enumC804103Cd;
        EnumC804103Cd enumC804103Cd2 = new EnumC804103Cd("PICKUP", 1, 2);
        PICKUP = enumC804103Cd2;
        EnumC804103Cd[] enumC804103CdArr = {enumC804103Cd, enumC804103Cd2};
        LLILLJJLI = enumC804103CdArr;
        LLILLL = new C2254308sP(enumC804103CdArr);
    }

    public static EnumC804103Cd[] values() {
        return (EnumC804103Cd[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC804103Cd valueOf(String str) {
        return (EnumC804103Cd) C08FF.LIZ(EnumC804103Cd.class, str);
    }

    public EnumC804103Cd(String str, int i, int i2) {
        this.LL = i2;
    }
}
