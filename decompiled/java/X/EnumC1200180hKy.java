package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hKy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1200180hKy {
    public static final /* synthetic */ EnumC1200180hKy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1200180hKy STATUS_AGE_GRADUATION_REMINDER;
    public static final EnumC1200180hKy STATUS_FIND_NEARBY_PLACES;
    public static final EnumC1200180hKy STATUS_POI_ERROR;
    public static final EnumC1200180hKy STATUS_POI_IDLE;
    public static final EnumC1200180hKy STATUS_POI_LIST_SHOW;
    public static final EnumC1200180hKy STATUS_POI_REFRESHING;
    public static final EnumC1200180hKy STATUS_POI_REFRESH_END;
    public static final EnumC1200180hKy STATUS_POI_SELECTED;
    public static final EnumC1200180hKy STATUS_RETAG_OPT;
    public static final EnumC1200180hKy STATUS_TAP_HERE_FOR_SUGGESTION;
    public static final EnumC1200180hKy STATUS_TURN_ON_LOCATION;

    public static InterfaceC2044707zh<EnumC1200180hKy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1200180hKy enumC1200180hKy = new EnumC1200180hKy("STATUS_TURN_ON_LOCATION", 0);
        STATUS_TURN_ON_LOCATION = enumC1200180hKy;
        EnumC1200180hKy enumC1200180hKy2 = new EnumC1200180hKy("STATUS_POI_LIST_SHOW", 1);
        STATUS_POI_LIST_SHOW = enumC1200180hKy2;
        EnumC1200180hKy enumC1200180hKy3 = new EnumC1200180hKy("STATUS_POI_SELECTED", 2);
        STATUS_POI_SELECTED = enumC1200180hKy3;
        EnumC1200180hKy enumC1200180hKy4 = new EnumC1200180hKy("STATUS_POI_ERROR", 3);
        STATUS_POI_ERROR = enumC1200180hKy4;
        EnumC1200180hKy enumC1200180hKy5 = new EnumC1200180hKy("STATUS_POI_IDLE", 4);
        STATUS_POI_IDLE = enumC1200180hKy5;
        EnumC1200180hKy enumC1200180hKy6 = new EnumC1200180hKy("STATUS_POI_REFRESHING", 5);
        STATUS_POI_REFRESHING = enumC1200180hKy6;
        EnumC1200180hKy enumC1200180hKy7 = new EnumC1200180hKy("STATUS_POI_REFRESH_END", 6);
        STATUS_POI_REFRESH_END = enumC1200180hKy7;
        EnumC1200180hKy enumC1200180hKy8 = new EnumC1200180hKy("STATUS_TAP_HERE_FOR_SUGGESTION", 7);
        STATUS_TAP_HERE_FOR_SUGGESTION = enumC1200180hKy8;
        EnumC1200180hKy enumC1200180hKy9 = new EnumC1200180hKy("STATUS_AGE_GRADUATION_REMINDER", 8);
        STATUS_AGE_GRADUATION_REMINDER = enumC1200180hKy9;
        EnumC1200180hKy enumC1200180hKy10 = new EnumC1200180hKy("STATUS_RETAG_OPT", 9);
        STATUS_RETAG_OPT = enumC1200180hKy10;
        EnumC1200180hKy enumC1200180hKy11 = new EnumC1200180hKy("STATUS_FIND_NEARBY_PLACES", 10);
        STATUS_FIND_NEARBY_PLACES = enumC1200180hKy11;
        EnumC1200180hKy[] enumC1200180hKyArr = {enumC1200180hKy, enumC1200180hKy2, enumC1200180hKy3, enumC1200180hKy4, enumC1200180hKy5, enumC1200180hKy6, enumC1200180hKy7, enumC1200180hKy8, enumC1200180hKy9, enumC1200180hKy10, enumC1200180hKy11};
        LL = enumC1200180hKyArr;
        LLILLJJLI = new C2254308sP(enumC1200180hKyArr);
    }

    public static EnumC1200180hKy[] values() {
        return (EnumC1200180hKy[]) LL.clone();
    }

    public static EnumC1200180hKy valueOf(String str) {
        return (EnumC1200180hKy) C08FF.LIZ(EnumC1200180hKy.class, str);
    }

    public EnumC1200180hKy(String str, int i) {
    }
}
