package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1805800x5m {
    public static final C1805790x5l Companion;
    public static final EnumC1805800x5m GLOBAL;
    public static final EnumC1805800x5m LIVE_DETAIL;
    public static final /* synthetic */ EnumC1805800x5m[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1805800x5m OTHERS;
    public static final EnumC1805800x5m PROFILE;
    public static final EnumC1805800x5m UG_TASK;
    public static final EnumC1805800x5m VIDEO_GIFTING;
    public static final EnumC1805800x5m WALLET;
    public static final EnumC1805800x5m WS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1805800x5m> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1805800x5m enumC1805800x5m = new EnumC1805800x5m("LIVE_DETAIL", 0, "live_detail");
        LIVE_DETAIL = enumC1805800x5m;
        EnumC1805800x5m enumC1805800x5m2 = new EnumC1805800x5m("VIDEO_GIFTING", 1, "video_gifting");
        VIDEO_GIFTING = enumC1805800x5m2;
        EnumC1805800x5m enumC1805800x5m3 = new EnumC1805800x5m("WALLET", 2, "wallet");
        WALLET = enumC1805800x5m3;
        EnumC1805800x5m enumC1805800x5m4 = new EnumC1805800x5m("UG_TASK", 3, "ug_task");
        UG_TASK = enumC1805800x5m4;
        EnumC1805800x5m enumC1805800x5m5 = new EnumC1805800x5m("PROFILE", 4, "profile");
        PROFILE = enumC1805800x5m5;
        EnumC1805800x5m enumC1805800x5m6 = new EnumC1805800x5m("GLOBAL", 5, "global");
        GLOBAL = enumC1805800x5m6;
        EnumC1805800x5m enumC1805800x5m7 = new EnumC1805800x5m("WS", 6, "ws");
        WS = enumC1805800x5m7;
        EnumC1805800x5m enumC1805800x5m8 = new EnumC1805800x5m("OTHERS", 7, "other");
        OTHERS = enumC1805800x5m8;
        EnumC1805800x5m[] enumC1805800x5mArr = {enumC1805800x5m, enumC1805800x5m2, enumC1805800x5m3, enumC1805800x5m4, enumC1805800x5m5, enumC1805800x5m6, enumC1805800x5m7, enumC1805800x5m8};
        LLILLJJLI = enumC1805800x5mArr;
        LLILLL = new C2254308sP(enumC1805800x5mArr);
        Companion = new C1805790x5l();
    }

    public static EnumC1805800x5m[] values() {
        return (EnumC1805800x5m[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1805800x5m valueOf(String str) {
        return (EnumC1805800x5m) C08FF.LIZ(EnumC1805800x5m.class, str);
    }

    public EnumC1805800x5m(String str, int i, String str2) {
        this.LL = str2;
    }
}
