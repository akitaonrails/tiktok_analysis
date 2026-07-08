package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1574490r4h {
    public static final C1574570r4p Companion;
    public static final EnumC1574490r4h HOMEPAGE_SERIES;
    public static final /* synthetic */ EnumC1574490r4h[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1574490r4h OTHERS_HOMEPAGE;
    public static final EnumC1574490r4h RECOMMENDED_DRAMA;
    public static final EnumC1574490r4h SEARCH_VIDEO_CARD;
    public static final EnumC1574490r4h SERIES_CENTER;
    public static final EnumC1574490r4h SERIES_DISCOVER;
    public static final EnumC1574490r4h SERIES_MYLIST;
    public static final EnumC1574490r4h THREE_COLUMN_CATEGORY;
    public static final EnumC1574490r4h THREE_COLUMN_SKYLIGHT;

    public static InterfaceC2044707zh<EnumC1574490r4h> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0r4p] */
    static {
        EnumC1574490r4h enumC1574490r4h = new EnumC1574490r4h("SERIES_DISCOVER", 0);
        SERIES_DISCOVER = enumC1574490r4h;
        EnumC1574490r4h enumC1574490r4h2 = new EnumC1574490r4h("SERIES_MYLIST", 1);
        SERIES_MYLIST = enumC1574490r4h2;
        EnumC1574490r4h enumC1574490r4h3 = new EnumC1574490r4h("SERIES_CENTER", 2);
        SERIES_CENTER = enumC1574490r4h3;
        EnumC1574490r4h enumC1574490r4h4 = new EnumC1574490r4h("HOMEPAGE_SERIES", 3);
        HOMEPAGE_SERIES = enumC1574490r4h4;
        EnumC1574490r4h enumC1574490r4h5 = new EnumC1574490r4h("RECOMMENDED_DRAMA", 4);
        RECOMMENDED_DRAMA = enumC1574490r4h5;
        EnumC1574490r4h enumC1574490r4h6 = new EnumC1574490r4h("SEARCH_VIDEO_CARD", 5);
        SEARCH_VIDEO_CARD = enumC1574490r4h6;
        EnumC1574490r4h enumC1574490r4h7 = new EnumC1574490r4h("THREE_COLUMN_SKYLIGHT", 6);
        THREE_COLUMN_SKYLIGHT = enumC1574490r4h7;
        EnumC1574490r4h enumC1574490r4h8 = new EnumC1574490r4h("THREE_COLUMN_CATEGORY", 7);
        THREE_COLUMN_CATEGORY = enumC1574490r4h8;
        EnumC1574490r4h enumC1574490r4h9 = new EnumC1574490r4h("OTHERS_HOMEPAGE", 8);
        OTHERS_HOMEPAGE = enumC1574490r4h9;
        EnumC1574490r4h[] enumC1574490r4hArr = {enumC1574490r4h, enumC1574490r4h2, enumC1574490r4h3, enumC1574490r4h4, enumC1574490r4h5, enumC1574490r4h6, enumC1574490r4h7, enumC1574490r4h8, enumC1574490r4h9};
        LL = enumC1574490r4hArr;
        LLILLJJLI = new C2254308sP(enumC1574490r4hArr);
        Companion = new Object() { // from class: X.0r4p
        };
    }

    public static EnumC1574490r4h[] values() {
        return (EnumC1574490r4h[]) LL.clone();
    }

    public static EnumC1574490r4h valueOf(String str) {
        return (EnumC1574490r4h) C08FF.LIZ(EnumC1574490r4h.class, str);
    }

    public EnumC1574490r4h(String str, int i) {
    }
}
