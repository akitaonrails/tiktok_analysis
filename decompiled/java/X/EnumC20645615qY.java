package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15qY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20645615qY {
    public static final /* synthetic */ EnumC20645615qY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20645615qY ON_FETCH_CALLBACK;
    public static final EnumC20645615qY ON_FIRST_SCREEN;
    public static final EnumC20645615qY ON_POPUP_DISMISS;
    public static final EnumC20645615qY ON_POP_APPEAR_RECEIVE;
    public static final EnumC20645615qY ON_START_RENDER;
    public static final EnumC20645615qY ON_START_TRIGGER;
    public static final EnumC20645615qY ON_TASK_RUN;
    public static final EnumC20645615qY ON_TASK_SHOW;
    public static final EnumC20645615qY ON_TRIGGER_CALLBACK;
    public static final EnumC20645615qY UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20645615qY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20645615qY enumC20645615qY = new EnumC20645615qY("UNKNOWN", 0, "");
        UNKNOWN = enumC20645615qY;
        EnumC20645615qY enumC20645615qY2 = new EnumC20645615qY("ON_FETCH_CALLBACK", 1, "on_fetch_callback");
        ON_FETCH_CALLBACK = enumC20645615qY2;
        EnumC20645615qY enumC20645615qY3 = new EnumC20645615qY("ON_START_RENDER", 2, "on_start_render");
        ON_START_RENDER = enumC20645615qY3;
        EnumC20645615qY enumC20645615qY4 = new EnumC20645615qY("ON_FIRST_SCREEN", 3, "on_first_screen");
        ON_FIRST_SCREEN = enumC20645615qY4;
        EnumC20645615qY enumC20645615qY5 = new EnumC20645615qY("ON_TRIGGER_CALLBACK", 4, "on_trigger_callback");
        ON_TRIGGER_CALLBACK = enumC20645615qY5;
        EnumC20645615qY enumC20645615qY6 = new EnumC20645615qY("ON_START_TRIGGER", 5, "on_start_trigger");
        ON_START_TRIGGER = enumC20645615qY6;
        EnumC20645615qY enumC20645615qY7 = new EnumC20645615qY("ON_TASK_RUN", 6, "on_task_run");
        ON_TASK_RUN = enumC20645615qY7;
        EnumC20645615qY enumC20645615qY8 = new EnumC20645615qY("ON_TASK_SHOW", 7, "on_task_show");
        ON_TASK_SHOW = enumC20645615qY8;
        EnumC20645615qY enumC20645615qY9 = new EnumC20645615qY("ON_POP_APPEAR_RECEIVE", 8, "on_pop_appear_receive");
        ON_POP_APPEAR_RECEIVE = enumC20645615qY9;
        EnumC20645615qY enumC20645615qY10 = new EnumC20645615qY("ON_POPUP_DISMISS", 9, "on_popup_dismiss");
        ON_POPUP_DISMISS = enumC20645615qY10;
        EnumC20645615qY[] enumC20645615qYArr = {enumC20645615qY, enumC20645615qY2, enumC20645615qY3, enumC20645615qY4, enumC20645615qY5, enumC20645615qY6, enumC20645615qY7, enumC20645615qY8, enumC20645615qY9, enumC20645615qY10};
        LLILLJJLI = enumC20645615qYArr;
        LLILLL = new C2254308sP(enumC20645615qYArr);
    }

    public static EnumC20645615qY[] values() {
        return (EnumC20645615qY[]) LLILLJJLI.clone();
    }

    public final String getNode() {
        return this.LL;
    }

    public static EnumC20645615qY valueOf(String str) {
        return (EnumC20645615qY) C08FF.LIZ(EnumC20645615qY.class, str);
    }

    public EnumC20645615qY(String str, int i, String str2) {
        this.LL = str2;
    }
}
