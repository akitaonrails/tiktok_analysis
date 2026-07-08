package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1254700iku {
    public static final /* synthetic */ EnumC1254700iku[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1254700iku STICKER_DESIGNER;
    public static final EnumC1254700iku STICKER_DETAIL;
    public static final EnumC1254700iku STICKER_EDIT;
    public static final EnumC1254700iku STICKER_EDIT_V2;
    public static final EnumC1254700iku STICKER_FLASH_FOLLOW;
    public static final EnumC1254700iku STICKER_SHOOT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1254700iku> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1254700iku enumC1254700iku = new EnumC1254700iku("STICKER_DETAIL", 0, 501);
        STICKER_DETAIL = enumC1254700iku;
        EnumC1254700iku enumC1254700iku2 = new EnumC1254700iku("STICKER_SHOOT", 1, 502);
        STICKER_SHOOT = enumC1254700iku2;
        EnumC1254700iku enumC1254700iku3 = new EnumC1254700iku("STICKER_EDIT", 2, 503);
        STICKER_EDIT = enumC1254700iku3;
        EnumC1254700iku enumC1254700iku4 = new EnumC1254700iku("STICKER_EDIT_V2", 3, 504);
        STICKER_EDIT_V2 = enumC1254700iku4;
        EnumC1254700iku enumC1254700iku5 = new EnumC1254700iku("STICKER_FLASH_FOLLOW", 4, 505);
        STICKER_FLASH_FOLLOW = enumC1254700iku5;
        EnumC1254700iku enumC1254700iku6 = new EnumC1254700iku("STICKER_DESIGNER", 5, 506);
        STICKER_DESIGNER = enumC1254700iku6;
        EnumC1254700iku[] enumC1254700ikuArr = {enumC1254700iku, enumC1254700iku2, enumC1254700iku3, enumC1254700iku4, enumC1254700iku5, enumC1254700iku6};
        LLILLJJLI = enumC1254700ikuArr;
        LLILLL = new C2254308sP(enumC1254700ikuArr);
    }

    public static EnumC1254700iku[] values() {
        return (EnumC1254700iku[]) LLILLJJLI.clone();
    }

    public final int getSceneId() {
        return this.LL;
    }

    public static EnumC1254700iku valueOf(String str) {
        return (EnumC1254700iku) C08FF.LIZ(EnumC1254700iku.class, str);
    }

    public EnumC1254700iku(String str, int i, int i2) {
        this.LL = i2;
    }
}
