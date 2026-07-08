package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15UD, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15UD {
    public static final C15UD BECOME_INACTIVE;
    public static final C15UD CLICK_ICON;
    public static final C15UD ENTER_DETAIL;
    public static final /* synthetic */ C15UD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C15UD OTHER;
    public static final C15UD SWITCH_TAB;
    public final String LL;

    public static InterfaceC2044707zh<C15UD> getEntries() {
        return LLILLL;
    }

    static {
        C15UD c15ud = new C15UD("ENTER_DETAIL", 0, "enter_detail");
        ENTER_DETAIL = c15ud;
        C15UD c15ud2 = new C15UD("CLICK_ICON", 1, "click_icon");
        CLICK_ICON = c15ud2;
        C15UD c15ud3 = new C15UD("BECOME_INACTIVE", 2, "become_inactive");
        BECOME_INACTIVE = c15ud3;
        C15UD c15ud4 = new C15UD("SWITCH_TAB", 3, "switch_tab");
        SWITCH_TAB = c15ud4;
        C15UD c15ud5 = new C15UD("OTHER", 4, "other");
        OTHER = c15ud5;
        C15UD[] c15udArr = {c15ud, c15ud2, c15ud3, c15ud4, c15ud5};
        LLILLJJLI = c15udArr;
        LLILLL = new C2254308sP(c15udArr);
    }

    public static C15UD[] values() {
        return (C15UD[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static C15UD valueOf(String str) {
        return (C15UD) C08FF.LIZ(C15UD.class, str);
    }

    public C15UD(String str, int i, String str2) {
        this.LL = str2;
    }
}
