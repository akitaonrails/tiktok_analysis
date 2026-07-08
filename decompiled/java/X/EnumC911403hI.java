package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03hI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC911403hI {
    public static final EnumC911403hI CANCEL;
    public static final /* synthetic */ EnumC911403hI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC911403hI PASS;
    public static final EnumC911403hI REJECT;

    public static InterfaceC2044707zh<EnumC911403hI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC911403hI enumC911403hI = new EnumC911403hI("PASS", 0);
        PASS = enumC911403hI;
        EnumC911403hI enumC911403hI2 = new EnumC911403hI("REJECT", 1);
        REJECT = enumC911403hI2;
        EnumC911403hI enumC911403hI3 = new EnumC911403hI("CANCEL", 2);
        CANCEL = enumC911403hI3;
        EnumC911403hI[] enumC911403hIArr = {enumC911403hI, enumC911403hI2, enumC911403hI3};
        LL = enumC911403hIArr;
        LLILLJJLI = new C2254308sP(enumC911403hIArr);
    }

    public static EnumC911403hI[] values() {
        return (EnumC911403hI[]) LL.clone();
    }

    public static EnumC911403hI valueOf(String str) {
        return (EnumC911403hI) C08FF.LIZ(EnumC911403hI.class, str);
    }

    public EnumC911403hI(String str, int i) {
    }
}
