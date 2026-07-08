package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w8L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1768950w8L {
    public static final EnumC1768950w8L AFTER_FREEZE_TIME;
    public static final EnumC1768950w8L BACKGROUND_CLEAR_BADGE;
    public static final EnumC1768950w8L BYTESYNC_PUSH;
    public static final EnumC1768950w8L CLICK_SHOP_TAB;
    public static final EnumC1768950w8L COLD_START;
    public static final EnumC1768950w8L DEBUG_FYP;
    public static final EnumC1768950w8L FEED_VIDEO_SEARCH;
    public static final EnumC1768950w8L GENERAL_SEARCH;
    public static final EnumC1768950w8L HOME_TAB_VIDEO_CHANGE;
    public static final /* synthetic */ EnumC1768950w8L[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1768950w8L PITAYA_TRIGGER_IMMEDIATELY;
    public static final EnumC1768950w8L PITAYA_TRIGGER_PENDING_ENTRANCE_SHOW;
    public static final EnumC1768950w8L SHOP_TAB_SHOW;
    public static final EnumC1768950w8L UG_BACK_FYP_SHOW_BUBBLE;
    public static final EnumC1768950w8L UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1768950w8L> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1768950w8L enumC1768950w8L = new EnumC1768950w8L("DEBUG_FYP", 0, -2);
        DEBUG_FYP = enumC1768950w8L;
        EnumC1768950w8L enumC1768950w8L2 = new EnumC1768950w8L("UNKNOWN", 1, -1);
        UNKNOWN = enumC1768950w8L2;
        EnumC1768950w8L enumC1768950w8L3 = new EnumC1768950w8L("COLD_START", 2, 0);
        COLD_START = enumC1768950w8L3;
        EnumC1768950w8L enumC1768950w8L4 = new EnumC1768950w8L("BYTESYNC_PUSH", 3, 1);
        BYTESYNC_PUSH = enumC1768950w8L4;
        EnumC1768950w8L enumC1768950w8L5 = new EnumC1768950w8L("SHOP_TAB_SHOW", 4, 2);
        SHOP_TAB_SHOW = enumC1768950w8L5;
        EnumC1768950w8L enumC1768950w8L6 = new EnumC1768950w8L("CLICK_SHOP_TAB", 5, 3);
        CLICK_SHOP_TAB = enumC1768950w8L6;
        EnumC1768950w8L enumC1768950w8L7 = new EnumC1768950w8L("HOME_TAB_VIDEO_CHANGE", 6, 4);
        HOME_TAB_VIDEO_CHANGE = enumC1768950w8L7;
        EnumC1768950w8L enumC1768950w8L8 = new EnumC1768950w8L("FEED_VIDEO_SEARCH", 7, 5);
        FEED_VIDEO_SEARCH = enumC1768950w8L8;
        EnumC1768950w8L enumC1768950w8L9 = new EnumC1768950w8L("GENERAL_SEARCH", 8, 6);
        GENERAL_SEARCH = enumC1768950w8L9;
        EnumC1768950w8L enumC1768950w8L10 = new EnumC1768950w8L("AFTER_FREEZE_TIME", 9, 7);
        AFTER_FREEZE_TIME = enumC1768950w8L10;
        EnumC1768950w8L enumC1768950w8L11 = new EnumC1768950w8L("PITAYA_TRIGGER_IMMEDIATELY", 10, 8);
        PITAYA_TRIGGER_IMMEDIATELY = enumC1768950w8L11;
        EnumC1768950w8L enumC1768950w8L12 = new EnumC1768950w8L("PITAYA_TRIGGER_PENDING_ENTRANCE_SHOW", 11, 9);
        PITAYA_TRIGGER_PENDING_ENTRANCE_SHOW = enumC1768950w8L12;
        EnumC1768950w8L enumC1768950w8L13 = new EnumC1768950w8L("UG_BACK_FYP_SHOW_BUBBLE", 12, 10);
        UG_BACK_FYP_SHOW_BUBBLE = enumC1768950w8L13;
        EnumC1768950w8L enumC1768950w8L14 = new EnumC1768950w8L("BACKGROUND_CLEAR_BADGE", 13, 101);
        BACKGROUND_CLEAR_BADGE = enumC1768950w8L14;
        EnumC1768950w8L[] enumC1768950w8LArr = {enumC1768950w8L, enumC1768950w8L2, enumC1768950w8L3, enumC1768950w8L4, enumC1768950w8L5, enumC1768950w8L6, enumC1768950w8L7, enumC1768950w8L8, enumC1768950w8L9, enumC1768950w8L10, enumC1768950w8L11, enumC1768950w8L12, enumC1768950w8L13, enumC1768950w8L14};
        LLILLJJLI = enumC1768950w8LArr;
        LLILLL = new C2254308sP(enumC1768950w8LArr);
    }

    public static EnumC1768950w8L[] values() {
        return (EnumC1768950w8L[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1768950w8L valueOf(String str) {
        return (EnumC1768950w8L) C08FF.LIZ(EnumC1768950w8L.class, str);
    }

    public EnumC1768950w8L(String str, int i, int i2) {
        this.LL = i2;
    }
}
