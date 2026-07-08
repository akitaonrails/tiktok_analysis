package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Aq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC035800Aq {
    public static final /* synthetic */ EnumC035800Aq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC035800Aq MINI_PDP;
    public static final EnumC035800Aq SKU_PANEL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC035800Aq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC035800Aq enumC035800Aq = new EnumC035800Aq("SKU_PANEL", 0, 0);
        SKU_PANEL = enumC035800Aq;
        EnumC035800Aq enumC035800Aq2 = new EnumC035800Aq("MINI_PDP", 1, 1);
        MINI_PDP = enumC035800Aq2;
        EnumC035800Aq[] enumC035800AqArr = {enumC035800Aq, enumC035800Aq2};
        LLILLJJLI = enumC035800AqArr;
        LLILLL = new C2254308sP(enumC035800AqArr);
    }

    public static EnumC035800Aq[] values() {
        return (EnumC035800Aq[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC035800Aq valueOf(String str) {
        return (EnumC035800Aq) C08FF.LIZ(EnumC035800Aq.class, str);
    }

    public EnumC035800Aq(String str, int i, int i2) {
        this.LL = i2;
    }
}
