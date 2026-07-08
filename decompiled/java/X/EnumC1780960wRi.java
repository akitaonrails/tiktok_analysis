package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wRi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1780960wRi {
    public static final /* synthetic */ EnumC1780960wRi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1780960wRi OUTREACH_TYPE;
    public static final EnumC1780960wRi SCENE_SINGLE;
    public static final EnumC1780960wRi SCENE_TOTAL;
    public static final EnumC1780960wRi TIME_WINDOW_ACTIVE_DAY;
    public static final EnumC1780960wRi TIME_WINDOW_CALENDAR_DAY;
    public static final EnumC1780960wRi TIME_WINDOW_SECOND;
    public static final EnumC1780960wRi TIME_WINDOW_SESSION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1780960wRi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1780960wRi enumC1780960wRi = new EnumC1780960wRi("TIME_WINDOW_CALENDAR_DAY", 0, "time_window_calendar_day");
        TIME_WINDOW_CALENDAR_DAY = enumC1780960wRi;
        EnumC1780960wRi enumC1780960wRi2 = new EnumC1780960wRi("TIME_WINDOW_ACTIVE_DAY", 1, "time_window_active_day");
        TIME_WINDOW_ACTIVE_DAY = enumC1780960wRi2;
        EnumC1780960wRi enumC1780960wRi3 = new EnumC1780960wRi("TIME_WINDOW_SESSION", 2, "time_window_session");
        TIME_WINDOW_SESSION = enumC1780960wRi3;
        EnumC1780960wRi enumC1780960wRi4 = new EnumC1780960wRi("TIME_WINDOW_SECOND", 3, "time_window_second");
        TIME_WINDOW_SECOND = enumC1780960wRi4;
        EnumC1780960wRi enumC1780960wRi5 = new EnumC1780960wRi("SCENE_SINGLE", 4, "scene_single");
        SCENE_SINGLE = enumC1780960wRi5;
        EnumC1780960wRi enumC1780960wRi6 = new EnumC1780960wRi("SCENE_TOTAL", 5, "scene_total");
        SCENE_TOTAL = enumC1780960wRi6;
        EnumC1780960wRi enumC1780960wRi7 = new EnumC1780960wRi("OUTREACH_TYPE", 6, "outreach_type");
        OUTREACH_TYPE = enumC1780960wRi7;
        EnumC1780960wRi[] enumC1780960wRiArr = {enumC1780960wRi, enumC1780960wRi2, enumC1780960wRi3, enumC1780960wRi4, enumC1780960wRi5, enumC1780960wRi6, enumC1780960wRi7};
        LLILLJJLI = enumC1780960wRiArr;
        LLILLL = new C2254308sP(enumC1780960wRiArr);
    }

    public static EnumC1780960wRi[] values() {
        return (EnumC1780960wRi[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC1780960wRi valueOf(String str) {
        return (EnumC1780960wRi) C08FF.LIZ(EnumC1780960wRi.class, str);
    }

    public EnumC1780960wRi(String str, int i, String str2) {
        this.LL = str2;
    }
}
