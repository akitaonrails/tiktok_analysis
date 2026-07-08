package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1599580rjA {
    public static final EnumC1599580rjA INBOX_MODE_SWITCH;
    public static final EnumC1599580rjA INBOX_NEW_HIGH_VALUE_LIVE;
    public static final /* synthetic */ EnumC1599580rjA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1599580rjA ON_ACTIVITY_RESULT;
    public static final EnumC1599580rjA PULL_TO_REFRESH;
    public static final EnumC1599580rjA SWITCH_TAB;
    public static final EnumC1599580rjA WIDGET_INTERNAL;
    public String LL;

    public EnumC1599580rjA() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1599580rjA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1599580rjA enumC1599580rjA = new EnumC1599580rjA("WIDGET_INTERNAL", 0);
        WIDGET_INTERNAL = enumC1599580rjA;
        EnumC1599580rjA enumC1599580rjA2 = new EnumC1599580rjA("ON_ACTIVITY_RESULT", 1);
        ON_ACTIVITY_RESULT = enumC1599580rjA2;
        EnumC1599580rjA enumC1599580rjA3 = new EnumC1599580rjA("PULL_TO_REFRESH", 2);
        PULL_TO_REFRESH = enumC1599580rjA3;
        EnumC1599580rjA enumC1599580rjA4 = new EnumC1599580rjA("SWITCH_TAB", 3);
        SWITCH_TAB = enumC1599580rjA4;
        EnumC1599580rjA enumC1599580rjA5 = new EnumC1599580rjA("INBOX_MODE_SWITCH", 4);
        INBOX_MODE_SWITCH = enumC1599580rjA5;
        EnumC1599580rjA enumC1599580rjA6 = new EnumC1599580rjA("INBOX_NEW_HIGH_VALUE_LIVE", 5);
        INBOX_NEW_HIGH_VALUE_LIVE = enumC1599580rjA6;
        EnumC1599580rjA[] enumC1599580rjAArr = {enumC1599580rjA, enumC1599580rjA2, enumC1599580rjA3, enumC1599580rjA4, enumC1599580rjA5, enumC1599580rjA6};
        LLILLJJLI = enumC1599580rjAArr;
        LLILLL = new C2254308sP(enumC1599580rjAArr);
    }

    public static EnumC1599580rjA[] values() {
        return (EnumC1599580rjA[]) LLILLJJLI.clone();
    }

    public final String getDetail() {
        return this.LL;
    }

    public static EnumC1599580rjA valueOf(String str) {
        return (EnumC1599580rjA) C08FF.LIZ(EnumC1599580rjA.class, str);
    }

    public final void setDetail(String str) {
        this.LL = str;
    }

    public EnumC1599580rjA(String str, int i) {
        this.LL = "";
    }
}
