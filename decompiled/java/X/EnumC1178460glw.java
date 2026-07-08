package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0glw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1178460glw {
    public static final EnumC1178460glw CLICK_FINISH_POI;
    public static final EnumC1178460glw FIND_NEARBY_PLACE;
    public static final /* synthetic */ EnumC1178460glw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1178460glw REQUEST_GPS;
    public static final EnumC1178460glw REQUEST_GPS_IN_QUIZ;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1178460glw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1178460glw enumC1178460glw = new EnumC1178460glw("REQUEST_GPS", 0, "request_gps");
        REQUEST_GPS = enumC1178460glw;
        EnumC1178460glw enumC1178460glw2 = new EnumC1178460glw("REQUEST_GPS_IN_QUIZ", 1, "request_gps_in_quiz");
        REQUEST_GPS_IN_QUIZ = enumC1178460glw2;
        EnumC1178460glw enumC1178460glw3 = new EnumC1178460glw("CLICK_FINISH_POI", 2, "click_finished_poi");
        CLICK_FINISH_POI = enumC1178460glw3;
        EnumC1178460glw enumC1178460glw4 = new EnumC1178460glw("FIND_NEARBY_PLACE", 3, "find_nearby_places");
        FIND_NEARBY_PLACE = enumC1178460glw4;
        EnumC1178460glw[] enumC1178460glwArr = {enumC1178460glw, enumC1178460glw2, enumC1178460glw3, enumC1178460glw4};
        LLILLJJLI = enumC1178460glwArr;
        LLILLL = new C2254308sP(enumC1178460glwArr);
    }

    public static EnumC1178460glw[] values() {
        return (EnumC1178460glw[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1178460glw valueOf(String str) {
        return (EnumC1178460glw) C08FF.LIZ(EnumC1178460glw.class, str);
    }

    public EnumC1178460glw(String str, int i, String str2) {
        this.LL = str2;
    }
}
