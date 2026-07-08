package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vQ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1741460vQ0 {
    public static final EnumC1741460vQ0 ANCHOR_VIDEO_GUIDE;
    public static final EnumC1741460vQ0 ANCHOR_VIDEO_GUIDE_BOTTOM_BTN;
    public static final EnumC1741460vQ0 AUTO_JUMP;
    public static final EnumC1741460vQ0 DIVERSION_BACK_BUTTON;
    public static final EnumC1741460vQ0 FEED_ECCARD_ONE;
    public static final EnumC1741460vQ0 FEED_ECCARD_TWO;
    public static final /* synthetic */ EnumC1741460vQ0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1741460vQ0 NO_ANCHOR_VIDEO_GUIDE;
    public static final EnumC1741460vQ0 VSA_LARGE_CARD;
    public static final EnumC1741460vQ0 VSA_SMALL_CARD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1741460vQ0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1741460vQ0 enumC1741460vQ0 = new EnumC1741460vQ0("VSA_LARGE_CARD", 0, "c34956");
        VSA_LARGE_CARD = enumC1741460vQ0;
        EnumC1741460vQ0 enumC1741460vQ02 = new EnumC1741460vQ0("VSA_SMALL_CARD", 1, "c6820");
        VSA_SMALL_CARD = enumC1741460vQ02;
        EnumC1741460vQ0 enumC1741460vQ03 = new EnumC1741460vQ0("FEED_ECCARD_ONE", 2, "c4490");
        FEED_ECCARD_ONE = enumC1741460vQ03;
        EnumC1741460vQ0 enumC1741460vQ04 = new EnumC1741460vQ0("FEED_ECCARD_TWO", 3, "c43921");
        FEED_ECCARD_TWO = enumC1741460vQ04;
        EnumC1741460vQ0 enumC1741460vQ05 = new EnumC1741460vQ0("ANCHOR_VIDEO_GUIDE", 4, "c49744");
        ANCHOR_VIDEO_GUIDE = enumC1741460vQ05;
        EnumC1741460vQ0 enumC1741460vQ06 = new EnumC1741460vQ0("NO_ANCHOR_VIDEO_GUIDE", 5, "c6873");
        NO_ANCHOR_VIDEO_GUIDE = enumC1741460vQ06;
        EnumC1741460vQ0 enumC1741460vQ07 = new EnumC1741460vQ0("DIVERSION_BACK_BUTTON", 6, "c3657");
        DIVERSION_BACK_BUTTON = enumC1741460vQ07;
        EnumC1741460vQ0 enumC1741460vQ08 = new EnumC1741460vQ0("AUTO_JUMP", 7, "c1985");
        AUTO_JUMP = enumC1741460vQ08;
        EnumC1741460vQ0 enumC1741460vQ09 = new EnumC1741460vQ0("ANCHOR_VIDEO_GUIDE_BOTTOM_BTN", 8, "c8024");
        ANCHOR_VIDEO_GUIDE_BOTTOM_BTN = enumC1741460vQ09;
        EnumC1741460vQ0[] enumC1741460vQ0Arr = {enumC1741460vQ0, enumC1741460vQ02, enumC1741460vQ03, enumC1741460vQ04, enumC1741460vQ05, enumC1741460vQ06, enumC1741460vQ07, enumC1741460vQ08, enumC1741460vQ09};
        LLILLJJLI = enumC1741460vQ0Arr;
        LLILLL = new C2254308sP(enumC1741460vQ0Arr);
    }

    public static EnumC1741460vQ0[] values() {
        return (EnumC1741460vQ0[]) LLILLJJLI.clone();
    }

    public final String getCCode() {
        return this.LL;
    }

    public static EnumC1741460vQ0 valueOf(String str) {
        return (EnumC1741460vQ0) C08FF.LIZ(EnumC1741460vQ0.class, str);
    }

    public EnumC1741460vQ0(String str, int i, String str2) {
        this.LL = str2;
    }
}
