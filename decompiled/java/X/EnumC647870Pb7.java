package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pb7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC647870Pb7 {
    public static final EnumC647870Pb7 FAILED;
    public static final /* synthetic */ EnumC647870Pb7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC647870Pb7 LOADING;
    public static final EnumC647870Pb7 SUCCEED;

    public static InterfaceC2044707zh<EnumC647870Pb7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC647870Pb7 enumC647870Pb7 = new EnumC647870Pb7("LOADING", 0);
        LOADING = enumC647870Pb7;
        EnumC647870Pb7 enumC647870Pb72 = new EnumC647870Pb7("SUCCEED", 1);
        SUCCEED = enumC647870Pb72;
        EnumC647870Pb7 enumC647870Pb73 = new EnumC647870Pb7("FAILED", 2);
        FAILED = enumC647870Pb73;
        EnumC647870Pb7[] enumC647870Pb7Arr = {enumC647870Pb7, enumC647870Pb72, enumC647870Pb73};
        LL = enumC647870Pb7Arr;
        LLILLJJLI = new C2254308sP(enumC647870Pb7Arr);
    }

    public static EnumC647870Pb7[] values() {
        return (EnumC647870Pb7[]) LL.clone();
    }

    public static EnumC647870Pb7 valueOf(String str) {
        return (EnumC647870Pb7) C08FF.LIZ(EnumC647870Pb7.class, str);
    }

    public EnumC647870Pb7(String str, int i) {
    }
}
