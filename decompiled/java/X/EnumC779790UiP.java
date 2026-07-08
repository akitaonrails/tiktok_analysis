package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UiP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC779790UiP {
    public static final EnumC779790UiP CMD_CLICK_FLOAT_BALL;
    public static final EnumC779790UiP CMD_CLICK_MSG_BTN_CHECKED;
    public static final EnumC779790UiP CMD_CLICK_MSG_BTN_UNCHECKED;
    public static final EnumC779790UiP CMD_CLICK_SMALL_WINDOW;
    public static final EnumC779790UiP CMD_DRAG_MOVE_END;
    public static final EnumC779790UiP CMD_DRAG_MOVE_START;
    public static final EnumC779790UiP CMD_DRAG_ONGOING;
    public static final EnumC779790UiP CMD_HIDE_TIP;
    public static final EnumC779790UiP CMD_NEW_TIP;
    public static final EnumC779790UiP CMD_ORIENTATION_CHANGED;
    public static final EnumC779790UiP CMD_SEND_FIRST_SNAP_TIP;
    public static final EnumC779790UiP CMD_TRANSITION_TO_DESTROY;
    public static final EnumC779790UiP CMD_TRANSITION_TO_FLOATING;
    public static final EnumC779790UiP CMD_TRANSITION_TO_HIDDEN;
    public static final EnumC779790UiP CMD_TRANSITION_TO_INIT;
    public static final EnumC779790UiP CMD_TRANSITION_TO_SMALL;
    public static final /* synthetic */ EnumC779790UiP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public Object LL;

    public static InterfaceC2044707zh<EnumC779790UiP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC779790UiP enumC779790UiP = new EnumC779790UiP("CMD_NEW_TIP", 0);
        CMD_NEW_TIP = enumC779790UiP;
        EnumC779790UiP enumC779790UiP2 = new EnumC779790UiP("CMD_HIDE_TIP", 1);
        CMD_HIDE_TIP = enumC779790UiP2;
        EnumC779790UiP enumC779790UiP3 = new EnumC779790UiP("CMD_ORIENTATION_CHANGED", 2);
        CMD_ORIENTATION_CHANGED = enumC779790UiP3;
        EnumC779790UiP enumC779790UiP4 = new EnumC779790UiP("CMD_CLICK_FLOAT_BALL", 3);
        CMD_CLICK_FLOAT_BALL = enumC779790UiP4;
        EnumC779790UiP enumC779790UiP5 = new EnumC779790UiP("CMD_CLICK_MSG_BTN_CHECKED", 4);
        CMD_CLICK_MSG_BTN_CHECKED = enumC779790UiP5;
        EnumC779790UiP enumC779790UiP6 = new EnumC779790UiP("CMD_CLICK_MSG_BTN_UNCHECKED", 5);
        CMD_CLICK_MSG_BTN_UNCHECKED = enumC779790UiP6;
        EnumC779790UiP enumC779790UiP7 = new EnumC779790UiP("CMD_CLICK_SMALL_WINDOW", 6);
        CMD_CLICK_SMALL_WINDOW = enumC779790UiP7;
        EnumC779790UiP enumC779790UiP8 = new EnumC779790UiP("CMD_DRAG_MOVE_START", 7);
        CMD_DRAG_MOVE_START = enumC779790UiP8;
        EnumC779790UiP enumC779790UiP9 = new EnumC779790UiP("CMD_DRAG_ONGOING", 8);
        CMD_DRAG_ONGOING = enumC779790UiP9;
        EnumC779790UiP enumC779790UiP10 = new EnumC779790UiP("CMD_DRAG_MOVE_END", 9);
        CMD_DRAG_MOVE_END = enumC779790UiP10;
        EnumC779790UiP enumC779790UiP11 = new EnumC779790UiP("CMD_SEND_FIRST_SNAP_TIP", 10);
        CMD_SEND_FIRST_SNAP_TIP = enumC779790UiP11;
        EnumC779790UiP enumC779790UiP12 = new EnumC779790UiP("CMD_TRANSITION_TO_INIT", 11);
        CMD_TRANSITION_TO_INIT = enumC779790UiP12;
        EnumC779790UiP enumC779790UiP13 = new EnumC779790UiP("CMD_TRANSITION_TO_HIDDEN", 12);
        CMD_TRANSITION_TO_HIDDEN = enumC779790UiP13;
        EnumC779790UiP enumC779790UiP14 = new EnumC779790UiP("CMD_TRANSITION_TO_DESTROY", 13);
        CMD_TRANSITION_TO_DESTROY = enumC779790UiP14;
        EnumC779790UiP enumC779790UiP15 = new EnumC779790UiP("CMD_TRANSITION_TO_SMALL", 14);
        CMD_TRANSITION_TO_SMALL = enumC779790UiP15;
        EnumC779790UiP enumC779790UiP16 = new EnumC779790UiP("CMD_TRANSITION_TO_FLOATING", 15);
        CMD_TRANSITION_TO_FLOATING = enumC779790UiP16;
        EnumC779790UiP[] enumC779790UiPArr = {enumC779790UiP, enumC779790UiP2, enumC779790UiP3, enumC779790UiP4, enumC779790UiP5, enumC779790UiP6, enumC779790UiP7, enumC779790UiP8, enumC779790UiP9, enumC779790UiP10, enumC779790UiP11, enumC779790UiP12, enumC779790UiP13, enumC779790UiP14, enumC779790UiP15, enumC779790UiP16};
        LLILLJJLI = enumC779790UiPArr;
        LLILLL = new C2254308sP(enumC779790UiPArr);
    }

    public static EnumC779790UiP[] values() {
        return (EnumC779790UiP[]) LLILLJJLI.clone();
    }

    public final Object getParam() {
        return this.LL;
    }

    public static EnumC779790UiP valueOf(String str) {
        return (EnumC779790UiP) C08FF.LIZ(EnumC779790UiP.class, str);
    }

    public final void setParam(Object obj) {
        this.LL = obj;
    }

    public EnumC779790UiP(String str, int i) {
    }
}
