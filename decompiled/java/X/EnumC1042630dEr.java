package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1042630dEr {
    public static final /* synthetic */ EnumC1042630dEr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1042630dEr NO_BOOT;
    public static final EnumC1042630dEr NO_PRECONNET;
    public static final EnumC1042630dEr PRECONNECT_BEFORE_ENTER;
    public static final EnumC1042630dEr PRECONNET_AFTER_ENTER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1042630dEr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1042630dEr enumC1042630dEr = new EnumC1042630dEr("NO_BOOT", 0, 0);
        NO_BOOT = enumC1042630dEr;
        EnumC1042630dEr enumC1042630dEr2 = new EnumC1042630dEr("NO_PRECONNET", 1, 0);
        NO_PRECONNET = enumC1042630dEr2;
        EnumC1042630dEr enumC1042630dEr3 = new EnumC1042630dEr("PRECONNECT_BEFORE_ENTER", 2, 1);
        PRECONNECT_BEFORE_ENTER = enumC1042630dEr3;
        EnumC1042630dEr enumC1042630dEr4 = new EnumC1042630dEr("PRECONNET_AFTER_ENTER", 3, 2);
        PRECONNET_AFTER_ENTER = enumC1042630dEr4;
        EnumC1042630dEr[] enumC1042630dErArr = {enumC1042630dEr, enumC1042630dEr2, enumC1042630dEr3, enumC1042630dEr4};
        LLILLJJLI = enumC1042630dErArr;
        LLILLL = new C2254308sP(enumC1042630dErArr);
    }

    public static EnumC1042630dEr[] values() {
        return (EnumC1042630dEr[]) LLILLJJLI.clone();
    }

    public final int getState() {
        return this.LL;
    }

    public static EnumC1042630dEr valueOf(String str) {
        return (EnumC1042630dEr) C08FF.LIZ(EnumC1042630dEr.class, str);
    }

    public EnumC1042630dEr(String str, int i, int i2) {
        this.LL = i2;
    }
}
