package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ElI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC373900ElI {
    public static final EnumC373900ElI FAIL;
    public static final /* synthetic */ EnumC373900ElI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC373900ElI LOADING;
    public static final EnumC373900ElI NONE;
    public static final EnumC373900ElI SUCCESS;

    public static InterfaceC2044707zh<EnumC373900ElI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC373900ElI enumC373900ElI = new EnumC373900ElI("NONE", 0);
        NONE = enumC373900ElI;
        EnumC373900ElI enumC373900ElI2 = new EnumC373900ElI("LOADING", 1);
        LOADING = enumC373900ElI2;
        EnumC373900ElI enumC373900ElI3 = new EnumC373900ElI("SUCCESS", 2);
        SUCCESS = enumC373900ElI3;
        EnumC373900ElI enumC373900ElI4 = new EnumC373900ElI("FAIL", 3);
        FAIL = enumC373900ElI4;
        EnumC373900ElI[] enumC373900ElIArr = {enumC373900ElI, enumC373900ElI2, enumC373900ElI3, enumC373900ElI4};
        LL = enumC373900ElIArr;
        LLILLJJLI = new C2254308sP(enumC373900ElIArr);
    }

    public static EnumC373900ElI[] values() {
        return (EnumC373900ElI[]) LL.clone();
    }

    public static EnumC373900ElI valueOf(String str) {
        return (EnumC373900ElI) C08FF.LIZ(EnumC373900ElI.class, str);
    }

    public EnumC373900ElI(String str, int i) {
    }
}
