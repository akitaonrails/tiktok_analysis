package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1769260w8q {
    public static final EnumC1769260w8q BEYOND_TIME_LIMIT;
    public static final EnumC1769260w8q CLICK_BUBBLE;
    public static final EnumC1769260w8q CLICK_SWITCH_TAB;
    public static final /* synthetic */ EnumC1769260w8q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1769260w8q NUMBER_REDDOT_LOCAL_CLEANUP;
    public static final EnumC1769260w8q OTHER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1769260w8q> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1769260w8q enumC1769260w8q = new EnumC1769260w8q("CLICK_BUBBLE", 0, "click_bubble");
        CLICK_BUBBLE = enumC1769260w8q;
        EnumC1769260w8q enumC1769260w8q2 = new EnumC1769260w8q("CLICK_SWITCH_TAB", 1, "click_switch_tab");
        CLICK_SWITCH_TAB = enumC1769260w8q2;
        EnumC1769260w8q enumC1769260w8q3 = new EnumC1769260w8q("BEYOND_TIME_LIMIT", 2, "beyond_time_limit");
        BEYOND_TIME_LIMIT = enumC1769260w8q3;
        EnumC1769260w8q enumC1769260w8q4 = new EnumC1769260w8q("NUMBER_REDDOT_LOCAL_CLEANUP", 3, "number_reddot_local_cleanup");
        NUMBER_REDDOT_LOCAL_CLEANUP = enumC1769260w8q4;
        EnumC1769260w8q enumC1769260w8q5 = new EnumC1769260w8q("OTHER", 4, "other");
        OTHER = enumC1769260w8q5;
        EnumC1769260w8q[] enumC1769260w8qArr = {enumC1769260w8q, enumC1769260w8q2, enumC1769260w8q3, enumC1769260w8q4, enumC1769260w8q5};
        LLILLJJLI = enumC1769260w8qArr;
        LLILLL = new C2254308sP(enumC1769260w8qArr);
    }

    public static EnumC1769260w8q[] values() {
        return (EnumC1769260w8q[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1769260w8q valueOf(String str) {
        return (EnumC1769260w8q) C08FF.LIZ(EnumC1769260w8q.class, str);
    }

    public EnumC1769260w8q(String str, int i, String str2) {
        this.LL = str2;
    }
}
