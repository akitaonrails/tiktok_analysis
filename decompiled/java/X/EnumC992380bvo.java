package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992380bvo {
    public static final /* synthetic */ EnumC992380bvo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992380bvo PAYIN_CASHIER;
    public static final EnumC992380bvo PAYIN_NATIVE_CASHIER;

    public static InterfaceC2044707zh<EnumC992380bvo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992380bvo enumC992380bvo = new EnumC992380bvo("PAYIN_CASHIER", 0);
        PAYIN_CASHIER = enumC992380bvo;
        EnumC992380bvo enumC992380bvo2 = new EnumC992380bvo("PAYIN_NATIVE_CASHIER", 1);
        PAYIN_NATIVE_CASHIER = enumC992380bvo2;
        EnumC992380bvo[] enumC992380bvoArr = {enumC992380bvo, enumC992380bvo2};
        LL = enumC992380bvoArr;
        LLILLJJLI = new C2254308sP(enumC992380bvoArr);
    }

    public static EnumC992380bvo[] values() {
        return (EnumC992380bvo[]) LL.clone();
    }

    public static EnumC992380bvo valueOf(String str) {
        return (EnumC992380bvo) C08FF.LIZ(EnumC992380bvo.class, str);
    }

    public EnumC992380bvo(String str, int i) {
    }
}
