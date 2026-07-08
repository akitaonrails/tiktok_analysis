package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC669620QOi {
    public static final C669650QOl Companion;
    public static final EnumC669620QOi ECOM_LIVE;
    public static final EnumC669620QOi ECOM_VIDEO;
    public static final EnumC669620QOi HASHTAG;
    public static final EnumC669620QOi LIVE;
    public static final /* synthetic */ EnumC669620QOi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final Map<String, EnumC669620QOi> MAP;
    public static final EnumC669620QOi ORDER;
    public static final EnumC669620QOi PHOTO;
    public static final EnumC669620QOi PLACE;
    public static final EnumC669620QOi ROOM_PRODUCTS;
    public static final EnumC669620QOi SHOP;
    public static final EnumC669620QOi SOUND;
    public static final EnumC669620QOi STORE;
    public static final EnumC669620QOi TOP;
    public static final EnumC669620QOi USER;
    public static final EnumC669620QOi VIDEO;
    public String LL;

    public static InterfaceC2044707zh<EnumC669620QOi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC669620QOi enumC669620QOi = new EnumC669620QOi("TOP", 0, "general");
        TOP = enumC669620QOi;
        EnumC669620QOi enumC669620QOi2 = new EnumC669620QOi("USER", 1, "user");
        USER = enumC669620QOi2;
        EnumC669620QOi enumC669620QOi3 = new EnumC669620QOi("VIDEO", 2, "video");
        VIDEO = enumC669620QOi3;
        EnumC669620QOi enumC669620QOi4 = new EnumC669620QOi("PHOTO", 3, "photos");
        PHOTO = enumC669620QOi4;
        EnumC669620QOi enumC669620QOi5 = new EnumC669620QOi("SOUND", 4, "music");
        SOUND = enumC669620QOi5;
        EnumC669620QOi enumC669620QOi6 = new EnumC669620QOi("LIVE", 5, "live");
        LIVE = enumC669620QOi6;
        EnumC669620QOi enumC669620QOi7 = new EnumC669620QOi("SHOP", 6, "shop");
        SHOP = enumC669620QOi7;
        EnumC669620QOi enumC669620QOi8 = new EnumC669620QOi("HASHTAG", 7, "hashtag");
        HASHTAG = enumC669620QOi8;
        EnumC669620QOi enumC669620QOi9 = new EnumC669620QOi("PLACE", 8, "place");
        PLACE = enumC669620QOi9;
        EnumC669620QOi enumC669620QOi10 = new EnumC669620QOi("STORE", 9, "store");
        STORE = enumC669620QOi10;
        EnumC669620QOi enumC669620QOi11 = new EnumC669620QOi("ECOM_LIVE", 10, "ecom_live");
        ECOM_LIVE = enumC669620QOi11;
        EnumC669620QOi enumC669620QOi12 = new EnumC669620QOi("ECOM_VIDEO", 11, "ecom_video");
        ECOM_VIDEO = enumC669620QOi12;
        EnumC669620QOi enumC669620QOi13 = new EnumC669620QOi("ROOM_PRODUCTS", 12, "room_products");
        ROOM_PRODUCTS = enumC669620QOi13;
        EnumC669620QOi enumC669620QOi14 = new EnumC669620QOi("ORDER", 13, "order");
        ORDER = enumC669620QOi14;
        EnumC669620QOi[] enumC669620QOiArr = {enumC669620QOi, enumC669620QOi2, enumC669620QOi3, enumC669620QOi4, enumC669620QOi5, enumC669620QOi6, enumC669620QOi7, enumC669620QOi8, enumC669620QOi9, enumC669620QOi10, enumC669620QOi11, enumC669620QOi12, enumC669620QOi13, enumC669620QOi14};
        LLILLJJLI = enumC669620QOiArr;
        LLILLL = new C2254308sP(enumC669620QOiArr);
        Companion = new C669650QOl();
        EnumC669620QOi[] enumC669620QOiArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC669620QOiArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC669620QOi enumC669620QOi15 : enumC669620QOiArrValues) {
            linkedHashMap.put(enumC669620QOi15.LL, enumC669620QOi15);
        }
        MAP = linkedHashMap;
    }

    public static EnumC669620QOi[] values() {
        return (EnumC669620QOi[]) LLILLJJLI.clone();
    }

    public final String getTabName() {
        return this.LL;
    }

    public static EnumC669620QOi valueOf(String str) {
        return (EnumC669620QOi) C08FF.LIZ(EnumC669620QOi.class, str);
    }

    public final void setTabName(String str) {
        this.LL = str;
    }

    public EnumC669620QOi(String str, int i, String str2) {
        this.LL = str2;
    }
}
