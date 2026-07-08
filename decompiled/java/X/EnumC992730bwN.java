package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992730bwN {
    public static final EnumC992730bwN DISMISS_ON_CLICK;
    public static final EnumC992730bwN DISMISS_ON_TIME_OUT;
    public static final EnumC992730bwN DISMISS_ON_UNSPECIFIED;
    public static final /* synthetic */ EnumC992730bwN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC992730bwN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992730bwN enumC992730bwN = new EnumC992730bwN("DISMISS_ON_CLICK", 0);
        DISMISS_ON_CLICK = enumC992730bwN;
        EnumC992730bwN enumC992730bwN2 = new EnumC992730bwN("DISMISS_ON_TIME_OUT", 1);
        DISMISS_ON_TIME_OUT = enumC992730bwN2;
        EnumC992730bwN enumC992730bwN3 = new EnumC992730bwN("DISMISS_ON_UNSPECIFIED", 2);
        DISMISS_ON_UNSPECIFIED = enumC992730bwN3;
        EnumC992730bwN[] enumC992730bwNArr = {enumC992730bwN, enumC992730bwN2, enumC992730bwN3};
        LL = enumC992730bwNArr;
        LLILLJJLI = new C2254308sP(enumC992730bwNArr);
    }

    public static EnumC992730bwN[] values() {
        return (EnumC992730bwN[]) LL.clone();
    }

    public static EnumC992730bwN valueOf(String str) {
        return (EnumC992730bwN) C08FF.LIZ(EnumC992730bwN.class, str);
    }

    public EnumC992730bwN(String str, int i) {
    }
}
