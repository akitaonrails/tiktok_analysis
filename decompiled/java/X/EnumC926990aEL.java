package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aEL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC926990aEL {
    public static final EnumC926990aEL AUTO_REQUEST;
    public static final EnumC926990aEL EMPTY_MASK;
    public static final EnumC926990aEL EMPTY_MASK_DIRECTLY;
    public static final EnumC926990aEL INVITE_PRE_APPROVE_SUCCESS;
    public static final EnumC926990aEL LINKED_POP_ACTION_SHEET_DIALOG;
    public static final /* synthetic */ EnumC926990aEL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC926990aEL MANAGE_PANEL;
    public static final EnumC926990aEL SETTING_DIALOG;
    public static final EnumC926990aEL TOOLBAR;

    public static InterfaceC2044707zh<EnumC926990aEL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC926990aEL enumC926990aEL = new EnumC926990aEL("EMPTY_MASK", 0);
        EMPTY_MASK = enumC926990aEL;
        EnumC926990aEL enumC926990aEL2 = new EnumC926990aEL("TOOLBAR", 1);
        TOOLBAR = enumC926990aEL2;
        EnumC926990aEL enumC926990aEL3 = new EnumC926990aEL("LINKED_POP_ACTION_SHEET_DIALOG", 2);
        LINKED_POP_ACTION_SHEET_DIALOG = enumC926990aEL3;
        EnumC926990aEL enumC926990aEL4 = new EnumC926990aEL("AUTO_REQUEST", 3);
        AUTO_REQUEST = enumC926990aEL4;
        EnumC926990aEL enumC926990aEL5 = new EnumC926990aEL("SETTING_DIALOG", 4);
        SETTING_DIALOG = enumC926990aEL5;
        EnumC926990aEL enumC926990aEL6 = new EnumC926990aEL("EMPTY_MASK_DIRECTLY", 5);
        EMPTY_MASK_DIRECTLY = enumC926990aEL6;
        EnumC926990aEL enumC926990aEL7 = new EnumC926990aEL("INVITE_PRE_APPROVE_SUCCESS", 6);
        INVITE_PRE_APPROVE_SUCCESS = enumC926990aEL7;
        EnumC926990aEL enumC926990aEL8 = new EnumC926990aEL("MANAGE_PANEL", 7);
        MANAGE_PANEL = enumC926990aEL8;
        EnumC926990aEL[] enumC926990aELArr = {enumC926990aEL, enumC926990aEL2, enumC926990aEL3, enumC926990aEL4, enumC926990aEL5, enumC926990aEL6, enumC926990aEL7, enumC926990aEL8};
        LL = enumC926990aELArr;
        LLILLJJLI = new C2254308sP(enumC926990aELArr);
    }

    public static EnumC926990aEL[] values() {
        return (EnumC926990aEL[]) LL.clone();
    }

    public static EnumC926990aEL valueOf(String str) {
        return (EnumC926990aEL) C08FF.LIZ(EnumC926990aEL.class, str);
    }

    public EnumC926990aEL(String str, int i) {
    }
}
