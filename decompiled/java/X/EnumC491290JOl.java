package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JOl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC491290JOl {
    public static final EnumC491290JOl FILL_INFORMATION;
    public static final /* synthetic */ EnumC491290JOl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC491290JOl SCHEDULED_FIRSTTIME;
    public static final EnumC491290JOl SCHEDULED_RETURN;
    public static final EnumC491290JOl SELECT_DATETIME;
    public static final EnumC491290JOl UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC491290JOl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC491290JOl enumC491290JOl = new EnumC491290JOl("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC491290JOl;
        EnumC491290JOl enumC491290JOl2 = new EnumC491290JOl("SELECT_DATETIME", 1, "select_datetime");
        SELECT_DATETIME = enumC491290JOl2;
        EnumC491290JOl enumC491290JOl3 = new EnumC491290JOl("FILL_INFORMATION", 2, "fill_information");
        FILL_INFORMATION = enumC491290JOl3;
        EnumC491290JOl enumC491290JOl4 = new EnumC491290JOl("SCHEDULED_RETURN", 3, "scheduled_return");
        SCHEDULED_RETURN = enumC491290JOl4;
        EnumC491290JOl enumC491290JOl5 = new EnumC491290JOl("SCHEDULED_FIRSTTIME", 4, "scheduled_firsttime");
        SCHEDULED_FIRSTTIME = enumC491290JOl5;
        EnumC491290JOl[] enumC491290JOlArr = {enumC491290JOl, enumC491290JOl2, enumC491290JOl3, enumC491290JOl4, enumC491290JOl5};
        LLILLJJLI = enumC491290JOlArr;
        LLILLL = new C2254308sP(enumC491290JOlArr);
    }

    public static EnumC491290JOl[] values() {
        return (EnumC491290JOl[]) LLILLJJLI.clone();
    }

    public final String getLogValue() {
        return this.LL;
    }

    public static EnumC491290JOl valueOf(String str) {
        return (EnumC491290JOl) C08FF.LIZ(EnumC491290JOl.class, str);
    }

    public EnumC491290JOl(String str, int i, String str2) {
        this.LL = str2;
    }
}
