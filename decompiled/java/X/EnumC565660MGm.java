package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC565660MGm {
    public static final EnumC565660MGm INPUT;
    public static final /* synthetic */ EnumC565660MGm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC565660MGm SELECT;

    public static InterfaceC2044707zh<EnumC565660MGm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC565660MGm enumC565660MGm = new EnumC565660MGm("SELECT", 0);
        SELECT = enumC565660MGm;
        EnumC565660MGm enumC565660MGm2 = new EnumC565660MGm("INPUT", 1);
        INPUT = enumC565660MGm2;
        EnumC565660MGm[] enumC565660MGmArr = {enumC565660MGm, enumC565660MGm2};
        LL = enumC565660MGmArr;
        LLILLJJLI = new C2254308sP(enumC565660MGmArr);
    }

    public static EnumC565660MGm[] values() {
        return (EnumC565660MGm[]) LL.clone();
    }

    public static EnumC565660MGm valueOf(String str) {
        return (EnumC565660MGm) C08FF.LIZ(EnumC565660MGm.class, str);
    }

    public EnumC565660MGm(String str, int i) {
    }
}
