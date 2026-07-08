package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779760wPm {
    public static final EnumC1779760wPm FAIL;
    public static final /* synthetic */ EnumC1779760wPm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779760wPm PENDING;
    public static final EnumC1779760wPm SUCCESS;

    public static InterfaceC2044707zh<EnumC1779760wPm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779760wPm enumC1779760wPm = new EnumC1779760wPm("SUCCESS", 0);
        SUCCESS = enumC1779760wPm;
        EnumC1779760wPm enumC1779760wPm2 = new EnumC1779760wPm("PENDING", 1);
        PENDING = enumC1779760wPm2;
        EnumC1779760wPm enumC1779760wPm3 = new EnumC1779760wPm("FAIL", 2);
        FAIL = enumC1779760wPm3;
        EnumC1779760wPm[] enumC1779760wPmArr = {enumC1779760wPm, enumC1779760wPm2, enumC1779760wPm3};
        LL = enumC1779760wPmArr;
        LLILLJJLI = new C2254308sP(enumC1779760wPmArr);
    }

    public static EnumC1779760wPm[] values() {
        return (EnumC1779760wPm[]) LL.clone();
    }

    public static EnumC1779760wPm valueOf(String str) {
        return (EnumC1779760wPm) C08FF.LIZ(EnumC1779760wPm.class, str);
    }

    public EnumC1779760wPm(String str, int i) {
    }
}
