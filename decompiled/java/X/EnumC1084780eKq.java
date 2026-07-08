package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1084780eKq {
    public static final EnumC1084780eKq EXIT_EXPLORE;
    public static final /* synthetic */ EnumC1084780eKq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1084780eKq OTHER;
    public static final EnumC1084780eKq TO_MAIN_PAGE;
    public static final EnumC1084780eKq TO_OTHER_SUBTAB;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1084780eKq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1084780eKq enumC1084780eKq = new EnumC1084780eKq("TO_MAIN_PAGE", 0, "to_main_tab");
        TO_MAIN_PAGE = enumC1084780eKq;
        EnumC1084780eKq enumC1084780eKq2 = new EnumC1084780eKq("TO_OTHER_SUBTAB", 1, "to_other_subtab");
        TO_OTHER_SUBTAB = enumC1084780eKq2;
        EnumC1084780eKq enumC1084780eKq3 = new EnumC1084780eKq("EXIT_EXPLORE", 2, "exit_explore");
        EXIT_EXPLORE = enumC1084780eKq3;
        EnumC1084780eKq enumC1084780eKq4 = new EnumC1084780eKq("OTHER", 3, "other");
        OTHER = enumC1084780eKq4;
        EnumC1084780eKq[] enumC1084780eKqArr = {enumC1084780eKq, enumC1084780eKq2, enumC1084780eKq3, enumC1084780eKq4};
        LLILLJJLI = enumC1084780eKqArr;
        LLILLL = new C2254308sP(enumC1084780eKqArr);
    }

    public static EnumC1084780eKq[] values() {
        return (EnumC1084780eKq[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1084780eKq valueOf(String str) {
        return (EnumC1084780eKq) C08FF.LIZ(EnumC1084780eKq.class, str);
    }

    public EnumC1084780eKq(String str, int i, String str2) {
        this.LL = str2;
    }
}
