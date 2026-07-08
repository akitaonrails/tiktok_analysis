package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779510wPN {
    public static final EnumC1779510wPN LL;
    public static final EnumC1779510wPN LLILLJJLI;
    public static final EnumC1779510wPN LLILLL;
    public static final /* synthetic */ EnumC1779510wPN[] LLILZ;

    static {
        EnumC1779510wPN enumC1779510wPN = new EnumC1779510wPN("SHOWING", 0);
        LL = enumC1779510wPN;
        EnumC1779510wPN enumC1779510wPN2 = new EnumC1779510wPN("SCROLLING", 1);
        LLILLJJLI = enumC1779510wPN2;
        EnumC1779510wPN enumC1779510wPN3 = new EnumC1779510wPN("DISMISS", 2);
        LLILLL = enumC1779510wPN3;
        EnumC1779510wPN[] enumC1779510wPNArr = {enumC1779510wPN, enumC1779510wPN2, enumC1779510wPN3};
        LLILZ = enumC1779510wPNArr;
        new C2254308sP(enumC1779510wPNArr);
    }

    public static EnumC1779510wPN[] values() {
        return (EnumC1779510wPN[]) LLILZ.clone();
    }

    public static EnumC1779510wPN valueOf(String str) {
        return (EnumC1779510wPN) C08FF.LIZ(EnumC1779510wPN.class, str);
    }

    public EnumC1779510wPN(String str, int i) {
    }
}
