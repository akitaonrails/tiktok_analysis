package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10CR, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10CR {
    public static final C10CR BACK_PRESSED_ACTION_TYPE;
    public static final C10CR CANCEL_ACTION_TYPE;
    public static final C10CR CLOSE_BTN_ACTION_TYPE;
    public static final C10CR CONFIRM_ACTION_TYPE;
    public static final C10CR DELAY_ACTION_TYPE;
    public static final /* synthetic */ C10CR[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C10CR NOT_ACTION_TYPE;
    public static final C10CR OTHER_ACTION_TYPE;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C10CR> getEntries() {
        return LLILZ;
    }

    static {
        C10CR c10cr = new C10CR("OTHER_ACTION_TYPE", 0, -1, "other");
        OTHER_ACTION_TYPE = c10cr;
        C10CR c10cr2 = new C10CR("NOT_ACTION_TYPE", 1, 0, "no_action");
        NOT_ACTION_TYPE = c10cr2;
        C10CR c10cr3 = new C10CR("CONFIRM_ACTION_TYPE", 2, 1, "confirm");
        CONFIRM_ACTION_TYPE = c10cr3;
        C10CR c10cr4 = new C10CR("CANCEL_ACTION_TYPE", 3, 2, "cancel");
        CANCEL_ACTION_TYPE = c10cr4;
        C10CR c10cr5 = new C10CR("DELAY_ACTION_TYPE", 4, 3, "click_background");
        DELAY_ACTION_TYPE = c10cr5;
        C10CR c10cr6 = new C10CR("CLOSE_BTN_ACTION_TYPE", 5, 4, "click_close");
        CLOSE_BTN_ACTION_TYPE = c10cr6;
        C10CR c10cr7 = new C10CR("BACK_PRESSED_ACTION_TYPE", 6, 5, "back_pressed");
        BACK_PRESSED_ACTION_TYPE = c10cr7;
        C10CR[] c10crArr = {c10cr, c10cr2, c10cr3, c10cr4, c10cr5, c10cr6, c10cr7};
        LLILLL = c10crArr;
        LLILZ = new C2254308sP(c10crArr);
    }

    public static C10CR[] values() {
        return (C10CR[]) LLILLL.clone();
    }

    public final String getDisplayName() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static C10CR valueOf(String str) {
        return (C10CR) C08FF.LIZ(C10CR.class, str);
    }

    public C10CR(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
