package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lLP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1354210lLP {
    public static final EnumC1354210lLP EXACTLY_RATIO;
    public static final EnumC1354210lLP EXACTLY_VALUE;
    public static final /* synthetic */ EnumC1354210lLP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1354210lLP WRAP_CONTENT;

    public static InterfaceC2044707zh<EnumC1354210lLP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1354210lLP enumC1354210lLP = new EnumC1354210lLP("EXACTLY_RATIO", 0);
        EXACTLY_RATIO = enumC1354210lLP;
        EnumC1354210lLP enumC1354210lLP2 = new EnumC1354210lLP("EXACTLY_VALUE", 1);
        EXACTLY_VALUE = enumC1354210lLP2;
        EnumC1354210lLP enumC1354210lLP3 = new EnumC1354210lLP("WRAP_CONTENT", 2);
        WRAP_CONTENT = enumC1354210lLP3;
        EnumC1354210lLP[] enumC1354210lLPArr = {enumC1354210lLP, enumC1354210lLP2, enumC1354210lLP3};
        LL = enumC1354210lLPArr;
        LLILLJJLI = new C2254308sP(enumC1354210lLPArr);
    }

    public static EnumC1354210lLP[] values() {
        return (EnumC1354210lLP[]) LL.clone();
    }

    public static EnumC1354210lLP valueOf(String str) {
        return (EnumC1354210lLP) C08FF.LIZ(EnumC1354210lLP.class, str);
    }

    public EnumC1354210lLP(String str, int i) {
    }
}
