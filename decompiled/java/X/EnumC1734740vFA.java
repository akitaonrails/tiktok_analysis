package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vFA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1734740vFA {
    public static final /* synthetic */ EnumC1734740vFA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1734740vFA NEW_SUBMIT;
    public static final EnumC1734740vFA NO_SUBMIT;
    public static final EnumC1734740vFA PRIOR_SUBMIT;
    public static final EnumC1734740vFA SUBMIT_FAIL;

    public static InterfaceC2044707zh<EnumC1734740vFA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1734740vFA enumC1734740vFA = new EnumC1734740vFA("NO_SUBMIT", 0);
        NO_SUBMIT = enumC1734740vFA;
        EnumC1734740vFA enumC1734740vFA2 = new EnumC1734740vFA("NEW_SUBMIT", 1);
        NEW_SUBMIT = enumC1734740vFA2;
        EnumC1734740vFA enumC1734740vFA3 = new EnumC1734740vFA("PRIOR_SUBMIT", 2);
        PRIOR_SUBMIT = enumC1734740vFA3;
        EnumC1734740vFA enumC1734740vFA4 = new EnumC1734740vFA("SUBMIT_FAIL", 3);
        SUBMIT_FAIL = enumC1734740vFA4;
        EnumC1734740vFA[] enumC1734740vFAArr = {enumC1734740vFA, enumC1734740vFA2, enumC1734740vFA3, enumC1734740vFA4};
        LL = enumC1734740vFAArr;
        LLILLJJLI = new C2254308sP(enumC1734740vFAArr);
    }

    public static EnumC1734740vFA[] values() {
        return (EnumC1734740vFA[]) LL.clone();
    }

    public final String toReportValue() {
        int i = C1734780vFE.LIZ[ordinal()];
        if (i == 1 || i == 2) {
            return "no_submit";
        }
        if (i == 3) {
            return "new_submit";
        }
        if (i == 4) {
            return "prior_submit";
        }
        throw new C1954807lC();
    }

    public static EnumC1734740vFA valueOf(String str) {
        return (EnumC1734740vFA) C08FF.LIZ(EnumC1734740vFA.class, str);
    }

    public EnumC1734740vFA(String str, int i) {
    }
}
