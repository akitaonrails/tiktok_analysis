package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b2Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC958120b2Y {
    public static final EnumC958120b2Y CO_HOST_ANCHOR_INFO;
    public static final EnumC958120b2Y CO_HOST_BACKGROUND;
    public static final EnumC958120b2Y CO_HOST_TITLE_BAR;
    public static final /* synthetic */ EnumC958120b2Y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC958120b2Y MUTE_BUTTON;
    public final String LL;

    public static InterfaceC2044707zh<EnumC958120b2Y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC958120b2Y enumC958120b2Y = new EnumC958120b2Y("CO_HOST_ANCHOR_INFO", 0, "cohost_anchor_info");
        CO_HOST_ANCHOR_INFO = enumC958120b2Y;
        EnumC958120b2Y enumC958120b2Y2 = new EnumC958120b2Y("CO_HOST_TITLE_BAR", 1, "cohost_title_bar");
        CO_HOST_TITLE_BAR = enumC958120b2Y2;
        EnumC958120b2Y enumC958120b2Y3 = new EnumC958120b2Y("CO_HOST_BACKGROUND", 2, "cohost_background");
        CO_HOST_BACKGROUND = enumC958120b2Y3;
        EnumC958120b2Y enumC958120b2Y4 = new EnumC958120b2Y("MUTE_BUTTON", 3, "cohost_mute_button");
        MUTE_BUTTON = enumC958120b2Y4;
        EnumC958120b2Y[] enumC958120b2YArr = {enumC958120b2Y, enumC958120b2Y2, enumC958120b2Y3, enumC958120b2Y4};
        LLILLJJLI = enumC958120b2YArr;
        LLILLL = new C2254308sP(enumC958120b2YArr);
    }

    public static EnumC958120b2Y[] values() {
        return (EnumC958120b2Y[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC958120b2Y valueOf(String str) {
        return (EnumC958120b2Y) C08FF.LIZ(EnumC958120b2Y.class, str);
    }

    public EnumC958120b2Y(String str, int i, String str2) {
        this.LL = str2;
    }
}
