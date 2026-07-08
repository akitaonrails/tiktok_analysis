package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC619890OTb {
    public static final EnumC619890OTb CONTAINER_BOTTOM;
    public static final EnumC619890OTb CONTAINER_LEFT;
    public static final EnumC619890OTb CONTAINER_RIGHT;
    public static final EnumC619890OTb CREATOR_INPUT_BASE;
    public static final EnumC619890OTb EDIT_INPUT;
    public static final EnumC619890OTb EDIT_PREVIEW;
    public static final EnumC619890OTb FULLSCREEN_TOP_BAR;
    public static final EnumC619890OTb GAMEPLAY_BACKGROUND;
    public static final EnumC619890OTb HYBRID_CONTAINER;
    public static final /* synthetic */ EnumC619890OTb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC619890OTb PAGE_LIST;
    public static final EnumC619890OTb PAGE_TITLE;
    public static final EnumC619890OTb QUICK_PUBLISH;
    public static final EnumC619890OTb TOPIC_CONTAINER;
    public static final EnumC619890OTb VOICE_PANEL;

    public static InterfaceC2044707zh<EnumC619890OTb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC619890OTb enumC619890OTb = new EnumC619890OTb("PAGE_TITLE", 0);
        PAGE_TITLE = enumC619890OTb;
        EnumC619890OTb enumC619890OTb2 = new EnumC619890OTb("PAGE_LIST", 1);
        PAGE_LIST = enumC619890OTb2;
        EnumC619890OTb enumC619890OTb3 = new EnumC619890OTb("QUICK_PUBLISH", 2);
        QUICK_PUBLISH = enumC619890OTb3;
        EnumC619890OTb enumC619890OTb4 = new EnumC619890OTb("CONTAINER_LEFT", 3);
        CONTAINER_LEFT = enumC619890OTb4;
        EnumC619890OTb enumC619890OTb5 = new EnumC619890OTb("CONTAINER_RIGHT", 4);
        CONTAINER_RIGHT = enumC619890OTb5;
        EnumC619890OTb enumC619890OTb6 = new EnumC619890OTb("CONTAINER_BOTTOM", 5);
        CONTAINER_BOTTOM = enumC619890OTb6;
        EnumC619890OTb enumC619890OTb7 = new EnumC619890OTb("TOPIC_CONTAINER", 6);
        TOPIC_CONTAINER = enumC619890OTb7;
        EnumC619890OTb enumC619890OTb8 = new EnumC619890OTb("FULLSCREEN_TOP_BAR", 7);
        FULLSCREEN_TOP_BAR = enumC619890OTb8;
        EnumC619890OTb enumC619890OTb9 = new EnumC619890OTb("GAMEPLAY_BACKGROUND", 8);
        GAMEPLAY_BACKGROUND = enumC619890OTb9;
        EnumC619890OTb enumC619890OTb10 = new EnumC619890OTb("HYBRID_CONTAINER", 9);
        HYBRID_CONTAINER = enumC619890OTb10;
        EnumC619890OTb enumC619890OTb11 = new EnumC619890OTb("CREATOR_INPUT_BASE", 10);
        CREATOR_INPUT_BASE = enumC619890OTb11;
        EnumC619890OTb enumC619890OTb12 = new EnumC619890OTb("EDIT_INPUT", 11);
        EDIT_INPUT = enumC619890OTb12;
        EnumC619890OTb enumC619890OTb13 = new EnumC619890OTb("EDIT_PREVIEW", 12);
        EDIT_PREVIEW = enumC619890OTb13;
        EnumC619890OTb enumC619890OTb14 = new EnumC619890OTb("VOICE_PANEL", 13);
        VOICE_PANEL = enumC619890OTb14;
        EnumC619890OTb[] enumC619890OTbArr = {enumC619890OTb, enumC619890OTb2, enumC619890OTb3, enumC619890OTb4, enumC619890OTb5, enumC619890OTb6, enumC619890OTb7, enumC619890OTb8, enumC619890OTb9, enumC619890OTb10, enumC619890OTb11, enumC619890OTb12, enumC619890OTb13, enumC619890OTb14};
        LL = enumC619890OTbArr;
        LLILLJJLI = new C2254308sP(enumC619890OTbArr);
    }

    public static EnumC619890OTb[] values() {
        return (EnumC619890OTb[]) LL.clone();
    }

    public static EnumC619890OTb valueOf(String str) {
        return (EnumC619890OTb) C08FF.LIZ(EnumC619890OTb.class, str);
    }

    public EnumC619890OTb(String str, int i) {
    }
}
