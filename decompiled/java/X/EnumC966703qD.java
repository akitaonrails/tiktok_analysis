package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03qD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC966703qD {
    public static final EnumC966703qD BACK_TO_LOGISTIC;
    public static final EnumC966703qD DISMISS;
    public static final /* synthetic */ EnumC966703qD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC966703qD NONE;
    public static final EnumC966703qD POP;
    public static final EnumC966703qD PUSH_ADDRESS_PAGE;
    public static final EnumC966703qD PUSH_AREA_PAGE;

    public static InterfaceC2044707zh<EnumC966703qD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC966703qD enumC966703qD = new EnumC966703qD("PUSH_ADDRESS_PAGE", 0);
        PUSH_ADDRESS_PAGE = enumC966703qD;
        EnumC966703qD enumC966703qD2 = new EnumC966703qD("PUSH_AREA_PAGE", 1);
        PUSH_AREA_PAGE = enumC966703qD2;
        EnumC966703qD enumC966703qD3 = new EnumC966703qD("POP", 2);
        POP = enumC966703qD3;
        EnumC966703qD enumC966703qD4 = new EnumC966703qD("BACK_TO_LOGISTIC", 3);
        BACK_TO_LOGISTIC = enumC966703qD4;
        EnumC966703qD enumC966703qD5 = new EnumC966703qD("NONE", 4);
        NONE = enumC966703qD5;
        EnumC966703qD enumC966703qD6 = new EnumC966703qD("DISMISS", 5);
        DISMISS = enumC966703qD6;
        EnumC966703qD[] enumC966703qDArr = {enumC966703qD, enumC966703qD2, enumC966703qD3, enumC966703qD4, enumC966703qD5, enumC966703qD6};
        LL = enumC966703qDArr;
        LLILLJJLI = new C2254308sP(enumC966703qDArr);
    }

    public static EnumC966703qD[] values() {
        return (EnumC966703qD[]) LL.clone();
    }

    public static EnumC966703qD valueOf(String str) {
        return (EnumC966703qD) C08FF.LIZ(EnumC966703qD.class, str);
    }

    public EnumC966703qD(String str, int i) {
    }
}
