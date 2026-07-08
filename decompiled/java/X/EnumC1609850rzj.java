package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1609850rzj {
    public static final EnumC1609850rzj APPLICATION_ATTACH;
    public static final EnumC1609850rzj BOOT_PLAY;
    public static final EnumC1609850rzj FEED_TOTAL;
    public static final /* synthetic */ EnumC1609850rzj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1609850rzj MAIN_CREATE;
    public static final EnumC1609850rzj MAIN_FOCUS;
    public static final EnumC1609850rzj MAIN_FRAME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1609850rzj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1609850rzj enumC1609850rzj = new EnumC1609850rzj("APPLICATION_ATTACH", 0, "application_attach");
        APPLICATION_ATTACH = enumC1609850rzj;
        EnumC1609850rzj enumC1609850rzj2 = new EnumC1609850rzj("MAIN_CREATE", 1, "main_create");
        MAIN_CREATE = enumC1609850rzj2;
        EnumC1609850rzj enumC1609850rzj3 = new EnumC1609850rzj("MAIN_FRAME", 2, "main_frame");
        MAIN_FRAME = enumC1609850rzj3;
        EnumC1609850rzj enumC1609850rzj4 = new EnumC1609850rzj("MAIN_FOCUS", 3, "main_focus");
        MAIN_FOCUS = enumC1609850rzj4;
        EnumC1609850rzj enumC1609850rzj5 = new EnumC1609850rzj("BOOT_PLAY", 4, "boot_play");
        BOOT_PLAY = enumC1609850rzj5;
        EnumC1609850rzj enumC1609850rzj6 = new EnumC1609850rzj("FEED_TOTAL", 5, "feed_total");
        FEED_TOTAL = enumC1609850rzj6;
        EnumC1609850rzj[] enumC1609850rzjArr = {enumC1609850rzj, enumC1609850rzj2, enumC1609850rzj3, enumC1609850rzj4, enumC1609850rzj5, enumC1609850rzj6};
        LLILLJJLI = enumC1609850rzjArr;
        LLILLL = new C2254308sP(enumC1609850rzjArr);
    }

    public static EnumC1609850rzj[] values() {
        return (EnumC1609850rzj[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1609850rzj valueOf(String str) {
        return (EnumC1609850rzj) C08FF.LIZ(EnumC1609850rzj.class, str);
    }

    public EnumC1609850rzj(String str, int i, String str2) {
        this.LL = str2;
    }
}
