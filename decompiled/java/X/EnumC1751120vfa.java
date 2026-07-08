package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vfa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1751120vfa {
    public static final /* synthetic */ EnumC1751120vfa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1751120vfa NOTICE;
    public static final EnumC1751120vfa SELLER_MESSAGE;
    public static final EnumC1751120vfa TAB_LIST;

    public static InterfaceC2044707zh<EnumC1751120vfa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1751120vfa enumC1751120vfa = new EnumC1751120vfa("TAB_LIST", 0);
        TAB_LIST = enumC1751120vfa;
        EnumC1751120vfa enumC1751120vfa2 = new EnumC1751120vfa("NOTICE", 1);
        NOTICE = enumC1751120vfa2;
        EnumC1751120vfa enumC1751120vfa3 = new EnumC1751120vfa("SELLER_MESSAGE", 2);
        SELLER_MESSAGE = enumC1751120vfa3;
        EnumC1751120vfa[] enumC1751120vfaArr = {enumC1751120vfa, enumC1751120vfa2, enumC1751120vfa3};
        LL = enumC1751120vfaArr;
        LLILLJJLI = new C2254308sP(enumC1751120vfaArr);
    }

    public static EnumC1751120vfa[] values() {
        return (EnumC1751120vfa[]) LL.clone();
    }

    public static EnumC1751120vfa valueOf(String str) {
        return (EnumC1751120vfa) C08FF.LIZ(EnumC1751120vfa.class, str);
    }

    public EnumC1751120vfa(String str, int i) {
    }
}
