package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dyq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1071140dyq {
    public static final EnumC1071140dyq BLACK_BACKGROUND_ACTUAL;
    public static final EnumC1071140dyq BLACK_BACKGROUND_ACTUAL_DIALOG_USER;
    public static final EnumC1071140dyq DIALOG_ACTUAL;
    public static final EnumC1071140dyq DIALOG_ACTUAL_AND_USER;
    public static final EnumC1071140dyq DIALOG_USER;
    public static final /* synthetic */ EnumC1071140dyq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1071140dyq NONE;

    public static InterfaceC2044707zh<EnumC1071140dyq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1071140dyq enumC1071140dyq = new EnumC1071140dyq("NONE", 0);
        NONE = enumC1071140dyq;
        EnumC1071140dyq enumC1071140dyq2 = new EnumC1071140dyq("BLACK_BACKGROUND_ACTUAL", 1);
        BLACK_BACKGROUND_ACTUAL = enumC1071140dyq2;
        EnumC1071140dyq enumC1071140dyq3 = new EnumC1071140dyq("BLACK_BACKGROUND_ACTUAL_DIALOG_USER", 2);
        BLACK_BACKGROUND_ACTUAL_DIALOG_USER = enumC1071140dyq3;
        EnumC1071140dyq enumC1071140dyq4 = new EnumC1071140dyq("DIALOG_ACTUAL", 3);
        DIALOG_ACTUAL = enumC1071140dyq4;
        EnumC1071140dyq enumC1071140dyq5 = new EnumC1071140dyq("DIALOG_USER", 4);
        DIALOG_USER = enumC1071140dyq5;
        EnumC1071140dyq enumC1071140dyq6 = new EnumC1071140dyq("DIALOG_ACTUAL_AND_USER", 5);
        DIALOG_ACTUAL_AND_USER = enumC1071140dyq6;
        EnumC1071140dyq[] enumC1071140dyqArr = {enumC1071140dyq, enumC1071140dyq2, enumC1071140dyq3, enumC1071140dyq4, enumC1071140dyq5, enumC1071140dyq6};
        LL = enumC1071140dyqArr;
        LLILLJJLI = new C2254308sP(enumC1071140dyqArr);
    }

    public static EnumC1071140dyq[] values() {
        return (EnumC1071140dyq[]) LL.clone();
    }

    public static EnumC1071140dyq valueOf(String str) {
        return (EnumC1071140dyq) C08FF.LIZ(EnumC1071140dyq.class, str);
    }

    public EnumC1071140dyq(String str, int i) {
    }
}
