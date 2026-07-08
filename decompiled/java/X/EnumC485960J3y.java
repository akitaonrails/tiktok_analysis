package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0J3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC485960J3y {
    public static final EnumC485960J3y FIRST_FRAME;
    public static final EnumC485960J3y FIRST_SEI;
    public static final EnumC485960J3y LAYOUT_RENDERED;
    public static final /* synthetic */ EnumC485960J3y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC485960J3y SEI_LOADED;
    public static final EnumC485960J3y SHARED_BG_DOWNLOAD_LOCAL;
    public static final EnumC485960J3y SHARED_BG_FETCH;
    public static final EnumC485960J3y SHARED_BG_LOADED;
    public static final EnumC485960J3y SHARED_BG_RES_NOT_READY;
    public static final EnumC485960J3y SHARED_BG_RES_READY;
    public static final EnumC485960J3y SHARED_BG_STICKER;

    public static InterfaceC2044707zh<EnumC485960J3y> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC485960J3y enumC485960J3y = new EnumC485960J3y("FIRST_FRAME", 0);
        FIRST_FRAME = enumC485960J3y;
        EnumC485960J3y enumC485960J3y2 = new EnumC485960J3y("FIRST_SEI", 1);
        FIRST_SEI = enumC485960J3y2;
        EnumC485960J3y enumC485960J3y3 = new EnumC485960J3y("SEI_LOADED", 2);
        SEI_LOADED = enumC485960J3y3;
        EnumC485960J3y enumC485960J3y4 = new EnumC485960J3y("LAYOUT_RENDERED", 3);
        LAYOUT_RENDERED = enumC485960J3y4;
        EnumC485960J3y enumC485960J3y5 = new EnumC485960J3y("SHARED_BG_FETCH", 4);
        SHARED_BG_FETCH = enumC485960J3y5;
        EnumC485960J3y enumC485960J3y6 = new EnumC485960J3y("SHARED_BG_RES_READY", 5);
        SHARED_BG_RES_READY = enumC485960J3y6;
        EnumC485960J3y enumC485960J3y7 = new EnumC485960J3y("SHARED_BG_RES_NOT_READY", 6);
        SHARED_BG_RES_NOT_READY = enumC485960J3y7;
        EnumC485960J3y enumC485960J3y8 = new EnumC485960J3y("SHARED_BG_DOWNLOAD_LOCAL", 7);
        SHARED_BG_DOWNLOAD_LOCAL = enumC485960J3y8;
        EnumC485960J3y enumC485960J3y9 = new EnumC485960J3y("SHARED_BG_LOADED", 8);
        SHARED_BG_LOADED = enumC485960J3y9;
        EnumC485960J3y enumC485960J3y10 = new EnumC485960J3y("SHARED_BG_STICKER", 9);
        SHARED_BG_STICKER = enumC485960J3y10;
        EnumC485960J3y[] enumC485960J3yArr = {enumC485960J3y, enumC485960J3y2, enumC485960J3y3, enumC485960J3y4, enumC485960J3y5, enumC485960J3y6, enumC485960J3y7, enumC485960J3y8, enumC485960J3y9, enumC485960J3y10};
        LL = enumC485960J3yArr;
        LLILLJJLI = new C2254308sP(enumC485960J3yArr);
    }

    public static EnumC485960J3y[] values() {
        return (EnumC485960J3y[]) LL.clone();
    }

    public static EnumC485960J3y valueOf(String str) {
        return (EnumC485960J3y) C08FF.LIZ(EnumC485960J3y.class, str);
    }

    public EnumC485960J3y(String str, int i) {
    }
}
