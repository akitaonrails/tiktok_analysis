package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC979240bac {
    public static final EnumC979240bac ACTIVITY_CONTEXT_NULL;
    public static final /* synthetic */ EnumC979240bac[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC979240bac NORMAL_ERROR;
    public static final EnumC979240bac NOTICEBOARD_NOT_READY;
    public static final EnumC979240bac NO_GUESTS;
    public static final EnumC979240bac ON_GOING;
    public static final EnumC979240bac PARAM_ERROR;
    public static final EnumC979240bac TIME_OUT;

    public static InterfaceC2044707zh<EnumC979240bac> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC979240bac enumC979240bac = new EnumC979240bac("NORMAL_ERROR", 0);
        NORMAL_ERROR = enumC979240bac;
        EnumC979240bac enumC979240bac2 = new EnumC979240bac("PARAM_ERROR", 1);
        PARAM_ERROR = enumC979240bac2;
        EnumC979240bac enumC979240bac3 = new EnumC979240bac("NO_GUESTS", 2);
        NO_GUESTS = enumC979240bac3;
        EnumC979240bac enumC979240bac4 = new EnumC979240bac("NOTICEBOARD_NOT_READY", 3);
        NOTICEBOARD_NOT_READY = enumC979240bac4;
        EnumC979240bac enumC979240bac5 = new EnumC979240bac("ACTIVITY_CONTEXT_NULL", 4);
        ACTIVITY_CONTEXT_NULL = enumC979240bac5;
        EnumC979240bac enumC979240bac6 = new EnumC979240bac("TIME_OUT", 5);
        TIME_OUT = enumC979240bac6;
        EnumC979240bac enumC979240bac7 = new EnumC979240bac("ON_GOING", 6);
        ON_GOING = enumC979240bac7;
        EnumC979240bac[] enumC979240bacArr = {enumC979240bac, enumC979240bac2, enumC979240bac3, enumC979240bac4, enumC979240bac5, enumC979240bac6, enumC979240bac7};
        LL = enumC979240bacArr;
        LLILLJJLI = new C2254308sP(enumC979240bacArr);
    }

    public static EnumC979240bac[] values() {
        return (EnumC979240bac[]) LL.clone();
    }

    public static EnumC979240bac valueOf(String str) {
        return (EnumC979240bac) C08FF.LIZ(EnumC979240bac.class, str);
    }

    public EnumC979240bac(String str, int i) {
    }
}
