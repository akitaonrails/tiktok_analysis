package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11Wy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19515811Wy {
    public static final EnumC19515811Wy BADGE;
    public static final /* synthetic */ EnumC19515811Wy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19515811Wy TOP_DESIGNER_RANKING;
    public static final EnumC19515811Wy TOP_EFFECT_RANKING;
    public static final EnumC19515811Wy UNKNOWN_POPUP_BANNER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19515811Wy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19515811Wy enumC19515811Wy = new EnumC19515811Wy("BADGE", 0, 999);
        BADGE = enumC19515811Wy;
        EnumC19515811Wy enumC19515811Wy2 = new EnumC19515811Wy("UNKNOWN_POPUP_BANNER", 1, 0);
        UNKNOWN_POPUP_BANNER = enumC19515811Wy2;
        EnumC19515811Wy enumC19515811Wy3 = new EnumC19515811Wy("TOP_EFFECT_RANKING", 2, 1);
        TOP_EFFECT_RANKING = enumC19515811Wy3;
        EnumC19515811Wy enumC19515811Wy4 = new EnumC19515811Wy("TOP_DESIGNER_RANKING", 3, 2);
        TOP_DESIGNER_RANKING = enumC19515811Wy4;
        EnumC19515811Wy[] enumC19515811WyArr = {enumC19515811Wy, enumC19515811Wy2, enumC19515811Wy3, enumC19515811Wy4};
        LLILLJJLI = enumC19515811WyArr;
        LLILLL = new C2254308sP(enumC19515811WyArr);
    }

    public static EnumC19515811Wy[] values() {
        return (EnumC19515811Wy[]) LLILLJJLI.clone();
    }

    public final int getBannerType() {
        return this.LL;
    }

    public static EnumC19515811Wy valueOf(String str) {
        return (EnumC19515811Wy) C08FF.LIZ(EnumC19515811Wy.class, str);
    }

    public EnumC19515811Wy(String str, int i, int i2) {
        this.LL = i2;
    }
}
