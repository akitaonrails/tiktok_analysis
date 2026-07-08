package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gfy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1174760gfy {
    public static final EnumC1174760gfy CHANGE_TAB;
    public static final EnumC1174760gfy CITY_INITIAL;
    public static final EnumC1174760gfy FIND_PLACES_NEARBY;
    public static final EnumC1174760gfy LANDMARK_FILTER;
    public static final EnumC1174760gfy LANDMARK_NEARBY;
    public static final /* synthetic */ EnumC1174760gfy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1174760gfy RETURN_TO;
    public static final EnumC1174760gfy SEARCH_AREA;
    public static final EnumC1174760gfy SEE_MORE;
    public static final EnumC1174760gfy YMAL;

    public static InterfaceC2044707zh<EnumC1174760gfy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1174760gfy enumC1174760gfy = new EnumC1174760gfy("SEARCH_AREA", 0);
        SEARCH_AREA = enumC1174760gfy;
        EnumC1174760gfy enumC1174760gfy2 = new EnumC1174760gfy("FIND_PLACES_NEARBY", 1);
        FIND_PLACES_NEARBY = enumC1174760gfy2;
        EnumC1174760gfy enumC1174760gfy3 = new EnumC1174760gfy("CHANGE_TAB", 2);
        CHANGE_TAB = enumC1174760gfy3;
        EnumC1174760gfy enumC1174760gfy4 = new EnumC1174760gfy("YMAL", 3);
        YMAL = enumC1174760gfy4;
        EnumC1174760gfy enumC1174760gfy5 = new EnumC1174760gfy("RETURN_TO", 4);
        RETURN_TO = enumC1174760gfy5;
        EnumC1174760gfy enumC1174760gfy6 = new EnumC1174760gfy("SEE_MORE", 5);
        SEE_MORE = enumC1174760gfy6;
        EnumC1174760gfy enumC1174760gfy7 = new EnumC1174760gfy("CITY_INITIAL", 6);
        CITY_INITIAL = enumC1174760gfy7;
        EnumC1174760gfy enumC1174760gfy8 = new EnumC1174760gfy("LANDMARK_FILTER", 7);
        LANDMARK_FILTER = enumC1174760gfy8;
        EnumC1174760gfy enumC1174760gfy9 = new EnumC1174760gfy("LANDMARK_NEARBY", 8);
        LANDMARK_NEARBY = enumC1174760gfy9;
        EnumC1174760gfy[] enumC1174760gfyArr = {enumC1174760gfy, enumC1174760gfy2, enumC1174760gfy3, enumC1174760gfy4, enumC1174760gfy5, enumC1174760gfy6, enumC1174760gfy7, enumC1174760gfy8, enumC1174760gfy9};
        LL = enumC1174760gfyArr;
        LLILLJJLI = new C2254308sP(enumC1174760gfyArr);
    }

    public static EnumC1174760gfy[] values() {
        return (EnumC1174760gfy[]) LL.clone();
    }

    public static EnumC1174760gfy valueOf(String str) {
        return (EnumC1174760gfy) C08FF.LIZ(EnumC1174760gfy.class, str);
    }

    public EnumC1174760gfy(String str, int i) {
    }
}
