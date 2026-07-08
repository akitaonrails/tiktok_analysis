package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC040200Ci {
    public static final /* synthetic */ EnumC040200Ci[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC040200Ci LYNX;
    public static final EnumC040200Ci NATIVE;
    public static final EnumC040200Ci WEB;

    public static InterfaceC2044707zh<EnumC040200Ci> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC040200Ci enumC040200Ci = new EnumC040200Ci("LYNX", 0);
        LYNX = enumC040200Ci;
        EnumC040200Ci enumC040200Ci2 = new EnumC040200Ci("NATIVE", 1);
        NATIVE = enumC040200Ci2;
        EnumC040200Ci enumC040200Ci3 = new EnumC040200Ci("WEB", 2);
        WEB = enumC040200Ci3;
        EnumC040200Ci[] enumC040200CiArr = {enumC040200Ci, enumC040200Ci2, enumC040200Ci3};
        LL = enumC040200CiArr;
        LLILLJJLI = new C2254308sP(enumC040200CiArr);
    }

    public static EnumC040200Ci[] values() {
        return (EnumC040200Ci[]) LL.clone();
    }

    public static EnumC040200Ci valueOf(String str) {
        return (EnumC040200Ci) C08FF.LIZ(EnumC040200Ci.class, str);
    }

    public EnumC040200Ci(String str, int i) {
    }
}
