package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0In3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC476910In3 {
    public static final EnumC476910In3 BACK_TO_FEED;
    public static final EnumC476910In3 BUTTON;
    public static final EnumC476910In3 CLICK_TAB;
    public static final C477130InP Companion;
    public static final EnumC476910In3 DEFAULT;
    public static final EnumC476910In3 DRAW;
    public static final EnumC476910In3 ENTER_ROOM;
    public static final EnumC476910In3 EXIT;
    public static final /* synthetic */ EnumC476910In3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC476910In3 NULL;
    public static final EnumC476910In3 OTHER_ROOM_ACTION;
    public static final EnumC476910In3 SKYLIGHT_EMPTY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC476910In3> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0InP] */
    static {
        EnumC476910In3 enumC476910In3 = new EnumC476910In3("NULL", 0, "");
        NULL = enumC476910In3;
        EnumC476910In3 enumC476910In32 = new EnumC476910In3(LivePreviewCTASmartDisplayManager.DEFAULT, 1, "default");
        DEFAULT = enumC476910In32;
        EnumC476910In3 enumC476910In33 = new EnumC476910In3("DRAW", 2, "draw");
        DRAW = enumC476910In33;
        EnumC476910In3 enumC476910In34 = new EnumC476910In3("EXIT", 3, "exit");
        EXIT = enumC476910In34;
        EnumC476910In3 enumC476910In35 = new EnumC476910In3("BACK_TO_FEED", 4, "back_to_feed");
        BACK_TO_FEED = enumC476910In35;
        EnumC476910In3 enumC476910In36 = new EnumC476910In3("BUTTON", 5, "button");
        BUTTON = enumC476910In36;
        EnumC476910In3 enumC476910In37 = new EnumC476910In3("ENTER_ROOM", 6, "enter_room");
        ENTER_ROOM = enumC476910In37;
        EnumC476910In3 enumC476910In38 = new EnumC476910In3("CLICK_TAB", 7, "click_tab");
        CLICK_TAB = enumC476910In38;
        EnumC476910In3 enumC476910In39 = new EnumC476910In3("SKYLIGHT_EMPTY", 8, "skylight_empty");
        SKYLIGHT_EMPTY = enumC476910In39;
        EnumC476910In3 enumC476910In310 = new EnumC476910In3("OTHER_ROOM_ACTION", 9, "other_room_action");
        OTHER_ROOM_ACTION = enumC476910In310;
        EnumC476910In3[] enumC476910In3Arr = {enumC476910In3, enumC476910In32, enumC476910In33, enumC476910In34, enumC476910In35, enumC476910In36, enumC476910In37, enumC476910In38, enumC476910In39, enumC476910In310};
        LLILLJJLI = enumC476910In3Arr;
        LLILLL = new C2254308sP(enumC476910In3Arr);
        Companion = new Object() { // from class: X.0InP
        };
    }

    public static EnumC476910In3[] values() {
        return (EnumC476910In3[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC476910In3 valueOf(String str) {
        return (EnumC476910In3) C08FF.LIZ(EnumC476910In3.class, str);
    }

    public EnumC476910In3(String str, int i, String str2) {
        this.LL = str2;
    }
}
