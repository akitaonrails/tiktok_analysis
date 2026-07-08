package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1133020fae {
    public static final EnumC1133020fae INTERACTIVE_GAME_GIFT;
    public static final /* synthetic */ EnumC1133020fae[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1133020fae MUSIC_GIFT;
    public static final EnumC1133020fae NORMAL_GIFT;
    public static final EnumC1133020fae SPECIAL_GIFT;
    public static final EnumC1133020fae STICKER_GIFT;
    public static final EnumC1133020fae UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1133020fae> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1133020fae enumC1133020fae = new EnumC1133020fae("UNKNOWN", 0, 0);
        UNKNOWN = enumC1133020fae;
        EnumC1133020fae enumC1133020fae2 = new EnumC1133020fae("NORMAL_GIFT", 1, 1);
        NORMAL_GIFT = enumC1133020fae2;
        EnumC1133020fae enumC1133020fae3 = new EnumC1133020fae("STICKER_GIFT", 2, 4);
        STICKER_GIFT = enumC1133020fae3;
        EnumC1133020fae enumC1133020fae4 = new EnumC1133020fae("SPECIAL_GIFT", 3, 2);
        SPECIAL_GIFT = enumC1133020fae4;
        EnumC1133020fae enumC1133020fae5 = new EnumC1133020fae("INTERACTIVE_GAME_GIFT", 4, 21);
        INTERACTIVE_GAME_GIFT = enumC1133020fae5;
        EnumC1133020fae enumC1133020fae6 = new EnumC1133020fae("MUSIC_GIFT", 5, 22);
        MUSIC_GIFT = enumC1133020fae6;
        EnumC1133020fae[] enumC1133020faeArr = {enumC1133020fae, enumC1133020fae2, enumC1133020fae3, enumC1133020fae4, enumC1133020fae5, enumC1133020fae6};
        LLILLJJLI = enumC1133020faeArr;
        LLILLL = new C2254308sP(enumC1133020faeArr);
    }

    public static EnumC1133020fae[] values() {
        return (EnumC1133020fae[]) LLILLJJLI.clone();
    }

    public final boolean isStickerRender() {
        return this == STICKER_GIFT || this == INTERACTIVE_GAME_GIFT || this == MUSIC_GIFT;
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1133020fae valueOf(String str) {
        return (EnumC1133020fae) C08FF.LIZ(EnumC1133020fae.class, str);
    }

    public EnumC1133020fae(String str, int i, int i2) {
        this.LL = i2;
    }
}
