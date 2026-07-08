package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HTz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC441770HTz {
    public static final EnumC441770HTz ESTIMATING;
    public static final /* synthetic */ EnumC441770HTz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC441770HTz TIME_OUT;
    public static final EnumC441770HTz UPDATE_REMAIN_TIME;

    public static InterfaceC2044707zh<EnumC441770HTz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC441770HTz enumC441770HTz = new EnumC441770HTz("ESTIMATING", 0);
        ESTIMATING = enumC441770HTz;
        EnumC441770HTz enumC441770HTz2 = new EnumC441770HTz("TIME_OUT", 1);
        TIME_OUT = enumC441770HTz2;
        EnumC441770HTz enumC441770HTz3 = new EnumC441770HTz("UPDATE_REMAIN_TIME", 2);
        UPDATE_REMAIN_TIME = enumC441770HTz3;
        EnumC441770HTz[] enumC441770HTzArr = {enumC441770HTz, enumC441770HTz2, enumC441770HTz3};
        LL = enumC441770HTzArr;
        LLILLJJLI = new C2254308sP(enumC441770HTzArr);
    }

    public static EnumC441770HTz[] values() {
        return (EnumC441770HTz[]) LL.clone();
    }

    public static EnumC441770HTz valueOf(String str) {
        return (EnumC441770HTz) C08FF.LIZ(EnumC441770HTz.class, str);
    }

    public EnumC441770HTz(String str, int i) {
    }
}
