package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11bI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19531811bI {
    public static final EnumC19531811bI ERROR;
    public static final /* synthetic */ EnumC19531811bI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19531811bI LOADING;
    public static final EnumC19531811bI STOP;

    public static InterfaceC2044707zh<EnumC19531811bI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19531811bI enumC19531811bI = new EnumC19531811bI("STOP", 0);
        STOP = enumC19531811bI;
        EnumC19531811bI enumC19531811bI2 = new EnumC19531811bI("LOADING", 1);
        LOADING = enumC19531811bI2;
        EnumC19531811bI enumC19531811bI3 = new EnumC19531811bI("ERROR", 2);
        ERROR = enumC19531811bI3;
        EnumC19531811bI[] enumC19531811bIArr = {enumC19531811bI, enumC19531811bI2, enumC19531811bI3};
        LL = enumC19531811bIArr;
        LLILLJJLI = new C2254308sP(enumC19531811bIArr);
    }

    public static EnumC19531811bI[] values() {
        return (EnumC19531811bI[]) LL.clone();
    }

    public static EnumC19531811bI valueOf(String str) {
        return (EnumC19531811bI) C08FF.LIZ(EnumC19531811bI.class, str);
    }

    public EnumC19531811bI(String str, int i) {
    }
}
