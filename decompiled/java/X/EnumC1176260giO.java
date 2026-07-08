package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0giO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1176260giO implements Serializable {
    public static final EnumC1176260giO BACK_TO_HOTEL;
    public static final EnumC1176260giO CATEGORY_CHANGE;
    public static final EnumC1176260giO FILTER_CHANGE;
    public static final EnumC1176260giO FIRST_HIGHLIGHT_REFRESH;
    public static final EnumC1176260giO FIRST_REFRESH;
    public static final /* synthetic */ EnumC1176260giO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1176260giO NEARBY;
    public static final EnumC1176260giO SCENE_UNKNOWN;
    public static final EnumC1176260giO SEARCH;
    public static final EnumC1176260giO SILENCE_REFRESH;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1176260giO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1176260giO enumC1176260giO = new EnumC1176260giO("SCENE_UNKNOWN", 0, 0);
        SCENE_UNKNOWN = enumC1176260giO;
        EnumC1176260giO enumC1176260giO2 = new EnumC1176260giO("NEARBY", 1, 1);
        NEARBY = enumC1176260giO2;
        EnumC1176260giO enumC1176260giO3 = new EnumC1176260giO("SEARCH", 2, 2);
        SEARCH = enumC1176260giO3;
        EnumC1176260giO enumC1176260giO4 = new EnumC1176260giO("SILENCE_REFRESH", 3, 3);
        SILENCE_REFRESH = enumC1176260giO4;
        EnumC1176260giO enumC1176260giO5 = new EnumC1176260giO("CATEGORY_CHANGE", 4, 4);
        CATEGORY_CHANGE = enumC1176260giO5;
        EnumC1176260giO enumC1176260giO6 = new EnumC1176260giO("FILTER_CHANGE", 5, 5);
        FILTER_CHANGE = enumC1176260giO6;
        EnumC1176260giO enumC1176260giO7 = new EnumC1176260giO("FIRST_REFRESH", 6, 6);
        FIRST_REFRESH = enumC1176260giO7;
        EnumC1176260giO enumC1176260giO8 = new EnumC1176260giO("FIRST_HIGHLIGHT_REFRESH", 7, 7);
        FIRST_HIGHLIGHT_REFRESH = enumC1176260giO8;
        EnumC1176260giO enumC1176260giO9 = new EnumC1176260giO("BACK_TO_HOTEL", 8, 8);
        BACK_TO_HOTEL = enumC1176260giO9;
        EnumC1176260giO[] enumC1176260giOArr = {enumC1176260giO, enumC1176260giO2, enumC1176260giO3, enumC1176260giO4, enumC1176260giO5, enumC1176260giO6, enumC1176260giO7, enumC1176260giO8, enumC1176260giO9};
        LLILLJJLI = enumC1176260giOArr;
        LLILLL = new C2254308sP(enumC1176260giOArr);
    }

    public static EnumC1176260giO[] values() {
        return (EnumC1176260giO[]) LLILLJJLI.clone();
    }

    public final int getScene() {
        return this.LL;
    }

    public static EnumC1176260giO valueOf(String str) {
        return (EnumC1176260giO) C08FF.LIZ(EnumC1176260giO.class, str);
    }

    public EnumC1176260giO(String str, int i, int i2) {
        this.LL = i2;
    }
}
