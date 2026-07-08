package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dtI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1067700dtI {
    public static final /* synthetic */ EnumC1067700dtI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1067700dtI TYPE_COLLECT;
    public static final EnumC1067700dtI TYPE_MORE;
    public static final EnumC1067700dtI TYPE_NONE;
    public static final EnumC1067700dtI TYPE_REPORT;
    public static final EnumC1067700dtI TYPE_SHARE;

    public static InterfaceC2044707zh<EnumC1067700dtI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1067700dtI enumC1067700dtI = new EnumC1067700dtI("TYPE_NONE", 0);
        TYPE_NONE = enumC1067700dtI;
        EnumC1067700dtI enumC1067700dtI2 = new EnumC1067700dtI("TYPE_REPORT", 1);
        TYPE_REPORT = enumC1067700dtI2;
        EnumC1067700dtI enumC1067700dtI3 = new EnumC1067700dtI("TYPE_SHARE", 2);
        TYPE_SHARE = enumC1067700dtI3;
        EnumC1067700dtI enumC1067700dtI4 = new EnumC1067700dtI("TYPE_COLLECT", 3);
        TYPE_COLLECT = enumC1067700dtI4;
        EnumC1067700dtI enumC1067700dtI5 = new EnumC1067700dtI("TYPE_MORE", 4);
        TYPE_MORE = enumC1067700dtI5;
        EnumC1067700dtI[] enumC1067700dtIArr = {enumC1067700dtI, enumC1067700dtI2, enumC1067700dtI3, enumC1067700dtI4, enumC1067700dtI5};
        LL = enumC1067700dtIArr;
        LLILLJJLI = new C2254308sP(enumC1067700dtIArr);
    }

    public static EnumC1067700dtI[] values() {
        return (EnumC1067700dtI[]) LL.clone();
    }

    public static EnumC1067700dtI valueOf(String str) {
        return (EnumC1067700dtI) C08FF.LIZ(EnumC1067700dtI.class, str);
    }

    public EnumC1067700dtI(String str, int i) {
    }
}
