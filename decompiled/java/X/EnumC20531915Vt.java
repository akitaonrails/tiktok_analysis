package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Vt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20531915Vt {
    public static final EnumC20531915Vt AUTO_REFRESH;
    public static final EnumC20531915Vt CHANGE_TAB;
    public static final EnumC20531915Vt DISAPPEAR;
    public static final EnumC20531915Vt ENTER_BACKGROUND;
    public static final EnumC20531915Vt FAILED;
    public static final EnumC20531915Vt INVISIBLE;
    public static final /* synthetic */ EnumC20531915Vt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20531915Vt NORMAL;
    public static final EnumC20531915Vt TIMEOUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20531915Vt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20531915Vt enumC20531915Vt = new EnumC20531915Vt("NORMAL", 0, "normal");
        NORMAL = enumC20531915Vt;
        EnumC20531915Vt enumC20531915Vt2 = new EnumC20531915Vt("TIMEOUT", 1, "timeout");
        TIMEOUT = enumC20531915Vt2;
        EnumC20531915Vt enumC20531915Vt3 = new EnumC20531915Vt("FAILED", 2, "failed");
        FAILED = enumC20531915Vt3;
        EnumC20531915Vt enumC20531915Vt4 = new EnumC20531915Vt("CHANGE_TAB", 3, "change_tab");
        CHANGE_TAB = enumC20531915Vt4;
        EnumC20531915Vt enumC20531915Vt5 = new EnumC20531915Vt("DISAPPEAR", 4, "disappear");
        DISAPPEAR = enumC20531915Vt5;
        EnumC20531915Vt enumC20531915Vt6 = new EnumC20531915Vt("ENTER_BACKGROUND", 5, "enter_background");
        ENTER_BACKGROUND = enumC20531915Vt6;
        EnumC20531915Vt enumC20531915Vt7 = new EnumC20531915Vt("AUTO_REFRESH", 6, "auto_refresh");
        AUTO_REFRESH = enumC20531915Vt7;
        EnumC20531915Vt enumC20531915Vt8 = new EnumC20531915Vt("INVISIBLE", 7, "invisible");
        INVISIBLE = enumC20531915Vt8;
        EnumC20531915Vt[] enumC20531915VtArr = {enumC20531915Vt, enumC20531915Vt2, enumC20531915Vt3, enumC20531915Vt4, enumC20531915Vt5, enumC20531915Vt6, enumC20531915Vt7, enumC20531915Vt8};
        LLILLJJLI = enumC20531915VtArr;
        LLILLL = new C2254308sP(enumC20531915VtArr);
    }

    public static EnumC20531915Vt[] values() {
        return (EnumC20531915Vt[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20531915Vt valueOf(String str) {
        return (EnumC20531915Vt) C08FF.LIZ(EnumC20531915Vt.class, str);
    }

    public EnumC20531915Vt(String str, int i, String str2) {
        this.LL = str2;
    }
}
