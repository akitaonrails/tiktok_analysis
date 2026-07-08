package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0soY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641360soY {
    public static final EnumC1641360soY EMOJI;
    public static final EnumC1641360soY FAVORITE;
    public static final /* synthetic */ EnumC1641360soY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1641360soY SEARCH;
    public static final EnumC1641360soY STICKER;
    public static final EnumC1641360soY STICKER_SET;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1641360soY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1641360soY enumC1641360soY = new EnumC1641360soY("STICKER", 0, "sticker");
        STICKER = enumC1641360soY;
        EnumC1641360soY enumC1641360soY2 = new EnumC1641360soY("SEARCH", 1, "Search");
        SEARCH = enumC1641360soY2;
        EnumC1641360soY enumC1641360soY3 = new EnumC1641360soY("EMOJI", 2, "emoji");
        EMOJI = enumC1641360soY3;
        EnumC1641360soY enumC1641360soY4 = new EnumC1641360soY("STICKER_SET", 3, "sticker_set");
        STICKER_SET = enumC1641360soY4;
        EnumC1641360soY enumC1641360soY5 = new EnumC1641360soY("FAVORITE", 4, "favorite");
        FAVORITE = enumC1641360soY5;
        EnumC1641360soY[] enumC1641360soYArr = {enumC1641360soY, enumC1641360soY2, enumC1641360soY3, enumC1641360soY4, enumC1641360soY5};
        LLILLJJLI = enumC1641360soYArr;
        LLILLL = new C2254308sP(enumC1641360soYArr);
    }

    public static EnumC1641360soY[] values() {
        return (EnumC1641360soY[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC1641360soY valueOf(String str) {
        return (EnumC1641360soY) C08FF.LIZ(EnumC1641360soY.class, str);
    }

    public EnumC1641360soY(String str, int i, String str2) {
        this.LL = str2;
    }
}
