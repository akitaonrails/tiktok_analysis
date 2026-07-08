package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ggJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1174970ggJ implements Serializable {
    public static final EnumC1174970ggJ CHANGE_TAB;
    public static final EnumC1174970ggJ CITY_INITIAL;
    public static final EnumC1174970ggJ FIND_PLACE_NEARBY;
    public static final EnumC1174970ggJ LANDMARK_FILTER;
    public static final EnumC1174970ggJ LANDMARK_NEARBY;
    public static final /* synthetic */ EnumC1174970ggJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1174970ggJ RETURN_TO_CITY;
    public static final EnumC1174970ggJ SEARCH_AREA;
    public static final EnumC1174970ggJ SEE_MORE_NEARBY;
    public static final EnumC1174970ggJ YMAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1174970ggJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1174970ggJ enumC1174970ggJ = new EnumC1174970ggJ("YMAL", 0, 1);
        YMAL = enumC1174970ggJ;
        EnumC1174970ggJ enumC1174970ggJ2 = new EnumC1174970ggJ("SEARCH_AREA", 1, 2);
        SEARCH_AREA = enumC1174970ggJ2;
        EnumC1174970ggJ enumC1174970ggJ3 = new EnumC1174970ggJ("FIND_PLACE_NEARBY", 2, 3);
        FIND_PLACE_NEARBY = enumC1174970ggJ3;
        EnumC1174970ggJ enumC1174970ggJ4 = new EnumC1174970ggJ("SEE_MORE_NEARBY", 3, 4);
        SEE_MORE_NEARBY = enumC1174970ggJ4;
        EnumC1174970ggJ enumC1174970ggJ5 = new EnumC1174970ggJ("RETURN_TO_CITY", 4, 5);
        RETURN_TO_CITY = enumC1174970ggJ5;
        EnumC1174970ggJ enumC1174970ggJ6 = new EnumC1174970ggJ("CHANGE_TAB", 5, 6);
        CHANGE_TAB = enumC1174970ggJ6;
        EnumC1174970ggJ enumC1174970ggJ7 = new EnumC1174970ggJ("CITY_INITIAL", 6, 7);
        CITY_INITIAL = enumC1174970ggJ7;
        EnumC1174970ggJ enumC1174970ggJ8 = new EnumC1174970ggJ("LANDMARK_FILTER", 7, 8);
        LANDMARK_FILTER = enumC1174970ggJ8;
        EnumC1174970ggJ enumC1174970ggJ9 = new EnumC1174970ggJ("LANDMARK_NEARBY", 8, 9);
        LANDMARK_NEARBY = enumC1174970ggJ9;
        EnumC1174970ggJ[] enumC1174970ggJArr = {enumC1174970ggJ, enumC1174970ggJ2, enumC1174970ggJ3, enumC1174970ggJ4, enumC1174970ggJ5, enumC1174970ggJ6, enumC1174970ggJ7, enumC1174970ggJ8, enumC1174970ggJ9};
        LLILLJJLI = enumC1174970ggJArr;
        LLILLL = new C2254308sP(enumC1174970ggJArr);
    }

    public static EnumC1174970ggJ[] values() {
        return (EnumC1174970ggJ[]) LLILLJJLI.clone();
    }

    public final int getSubScene() {
        return this.LL;
    }

    public static EnumC1174970ggJ valueOf(String str) {
        return (EnumC1174970ggJ) C08FF.LIZ(EnumC1174970ggJ.class, str);
    }

    public EnumC1174970ggJ(String str, int i, int i2) {
        this.LL = i2;
    }
}
