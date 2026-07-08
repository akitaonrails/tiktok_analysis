package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HkI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC449720HkI {
    public static final EnumC449720HkI AIMOJI;
    public static final EnumC449720HkI AISELF;
    public static final EnumC449720HkI FAV_STICKER;
    public static final EnumC449720HkI GIPHY;
    public static final /* synthetic */ EnumC449720HkI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC449720HkI POPULAR_STICKER;
    public static final EnumC449720HkI SET_STICKERS;
    public static final EnumC449720HkI STREAK_STICKER;
    public static final EnumC449720HkI SYSTEM_EMOJI;

    public static InterfaceC2044707zh<EnumC449720HkI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC449720HkI enumC449720HkI = new EnumC449720HkI("SYSTEM_EMOJI", 0);
        SYSTEM_EMOJI = enumC449720HkI;
        EnumC449720HkI enumC449720HkI2 = new EnumC449720HkI("FAV_STICKER", 1);
        FAV_STICKER = enumC449720HkI2;
        EnumC449720HkI enumC449720HkI3 = new EnumC449720HkI("POPULAR_STICKER", 2);
        POPULAR_STICKER = enumC449720HkI3;
        EnumC449720HkI enumC449720HkI4 = new EnumC449720HkI("GIPHY", 3);
        GIPHY = enumC449720HkI4;
        EnumC449720HkI enumC449720HkI5 = new EnumC449720HkI("SET_STICKERS", 4);
        SET_STICKERS = enumC449720HkI5;
        EnumC449720HkI enumC449720HkI6 = new EnumC449720HkI("AIMOJI", 5);
        AIMOJI = enumC449720HkI6;
        EnumC449720HkI enumC449720HkI7 = new EnumC449720HkI("AISELF", 6);
        AISELF = enumC449720HkI7;
        EnumC449720HkI enumC449720HkI8 = new EnumC449720HkI("STREAK_STICKER", 7);
        STREAK_STICKER = enumC449720HkI8;
        EnumC449720HkI[] enumC449720HkIArr = {enumC449720HkI, enumC449720HkI2, enumC449720HkI3, enumC449720HkI4, enumC449720HkI5, enumC449720HkI6, enumC449720HkI7, enumC449720HkI8};
        LL = enumC449720HkIArr;
        LLILLJJLI = new C2254308sP(enumC449720HkIArr);
    }

    public static EnumC449720HkI[] values() {
        return (EnumC449720HkI[]) LL.clone();
    }

    public static EnumC449720HkI valueOf(String str) {
        return (EnumC449720HkI) C08FF.LIZ(EnumC449720HkI.class, str);
    }

    public EnumC449720HkI(String str, int i) {
    }
}
