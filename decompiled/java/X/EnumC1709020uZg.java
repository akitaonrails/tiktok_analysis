package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1709020uZg {
    public static final EnumC1709020uZg ECP_SELECTION;
    public static final EnumC1709020uZg FIRST_PAY;
    public static final /* synthetic */ EnumC1709020uZg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1709020uZg ONE_STEP_CHECKOUT;
    public static final EnumC1709020uZg OSP;
    public static final EnumC1709020uZg SECOND_PAY;

    public static InterfaceC2044707zh<EnumC1709020uZg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1709020uZg enumC1709020uZg = new EnumC1709020uZg("OSP", 0);
        OSP = enumC1709020uZg;
        EnumC1709020uZg enumC1709020uZg2 = new EnumC1709020uZg("FIRST_PAY", 1);
        FIRST_PAY = enumC1709020uZg2;
        EnumC1709020uZg enumC1709020uZg3 = new EnumC1709020uZg("SECOND_PAY", 2);
        SECOND_PAY = enumC1709020uZg3;
        EnumC1709020uZg enumC1709020uZg4 = new EnumC1709020uZg("ONE_STEP_CHECKOUT", 3);
        ONE_STEP_CHECKOUT = enumC1709020uZg4;
        EnumC1709020uZg enumC1709020uZg5 = new EnumC1709020uZg("ECP_SELECTION", 4);
        ECP_SELECTION = enumC1709020uZg5;
        EnumC1709020uZg[] enumC1709020uZgArr = {enumC1709020uZg, enumC1709020uZg2, enumC1709020uZg3, enumC1709020uZg4, enumC1709020uZg5};
        LL = enumC1709020uZgArr;
        LLILLJJLI = new C2254308sP(enumC1709020uZgArr);
    }

    public static EnumC1709020uZg[] values() {
        return (EnumC1709020uZg[]) LL.clone();
    }

    public static EnumC1709020uZg valueOf(String str) {
        return (EnumC1709020uZg) C08FF.LIZ(EnumC1709020uZg.class, str);
    }

    public EnumC1709020uZg(String str, int i) {
    }
}
