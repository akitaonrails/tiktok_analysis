package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC655500PnQ {
    public static final EnumC655500PnQ CLICK_SERIES_UNMUTE_BUTTON;
    public static final EnumC655500PnQ CLICK_UNMUTE_BUTTON;
    public static final /* synthetic */ EnumC655500PnQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC655500PnQ TURN_DOWN_VOLUME;
    public static final EnumC655500PnQ TURN_UP_VOLUME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC655500PnQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC655500PnQ enumC655500PnQ = new EnumC655500PnQ("TURN_UP_VOLUME", 0, "turn_up_volume");
        TURN_UP_VOLUME = enumC655500PnQ;
        EnumC655500PnQ enumC655500PnQ2 = new EnumC655500PnQ("TURN_DOWN_VOLUME", 1, "turn_down_volume");
        TURN_DOWN_VOLUME = enumC655500PnQ2;
        EnumC655500PnQ enumC655500PnQ3 = new EnumC655500PnQ("CLICK_UNMUTE_BUTTON", 2, "click_unmute_button");
        CLICK_UNMUTE_BUTTON = enumC655500PnQ3;
        EnumC655500PnQ enumC655500PnQ4 = new EnumC655500PnQ("CLICK_SERIES_UNMUTE_BUTTON", 3, "click_series_unmute_button");
        CLICK_SERIES_UNMUTE_BUTTON = enumC655500PnQ4;
        EnumC655500PnQ[] enumC655500PnQArr = {enumC655500PnQ, enumC655500PnQ2, enumC655500PnQ3, enumC655500PnQ4};
        LLILLJJLI = enumC655500PnQArr;
        LLILLL = new C2254308sP(enumC655500PnQArr);
    }

    public static EnumC655500PnQ[] values() {
        return (EnumC655500PnQ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC655500PnQ valueOf(String str) {
        return (EnumC655500PnQ) C08FF.LIZ(EnumC655500PnQ.class, str);
    }

    public EnumC655500PnQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
