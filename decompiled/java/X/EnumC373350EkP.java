package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EkP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC373350EkP {
    public static final EnumC373350EkP AFTER_DRAFT_RECOVER;
    public static final EnumC373350EkP AUTO_CUTOUT;
    public static final EnumC373350EkP CUTOUT_FAIL;
    public static final EnumC373350EkP EXIT_EP;
    public static final EnumC373350EkP INTERNET_ERROR;
    public static final EnumC373350EkP INTERRUPTED;
    public static final /* synthetic */ EnumC373350EkP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC373350EkP NO_OBJECT;
    public static final EnumC373350EkP RESET;
    public static final EnumC373350EkP UNDO_AFTER_APPLY;
    public static final EnumC373350EkP UNDO_DURING_LOADING;
    public static final EnumC373350EkP UNLIKE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC373350EkP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC373350EkP enumC373350EkP = new EnumC373350EkP("RESET", 0, "reset");
        RESET = enumC373350EkP;
        EnumC373350EkP enumC373350EkP2 = new EnumC373350EkP("AUTO_CUTOUT", 1, "autocut");
        AUTO_CUTOUT = enumC373350EkP2;
        EnumC373350EkP enumC373350EkP3 = new EnumC373350EkP("NO_OBJECT", 2, "no_object");
        NO_OBJECT = enumC373350EkP3;
        EnumC373350EkP enumC373350EkP4 = new EnumC373350EkP("CUTOUT_FAIL", 3, "cutout_fail");
        CUTOUT_FAIL = enumC373350EkP4;
        EnumC373350EkP enumC373350EkP5 = new EnumC373350EkP("INTERNET_ERROR", 4, "no_internet");
        INTERNET_ERROR = enumC373350EkP5;
        EnumC373350EkP enumC373350EkP6 = new EnumC373350EkP("UNLIKE", 5, "unselect_after_apply");
        UNLIKE = enumC373350EkP6;
        EnumC373350EkP enumC373350EkP7 = new EnumC373350EkP("EXIT_EP", 6, "unselect_after_exit_ep");
        EXIT_EP = enumC373350EkP7;
        EnumC373350EkP enumC373350EkP8 = new EnumC373350EkP("INTERRUPTED", 7, "cancel_during_loading");
        INTERRUPTED = enumC373350EkP8;
        EnumC373350EkP enumC373350EkP9 = new EnumC373350EkP("UNDO_AFTER_APPLY", 8, "undo_after_apply");
        UNDO_AFTER_APPLY = enumC373350EkP9;
        EnumC373350EkP enumC373350EkP10 = new EnumC373350EkP("UNDO_DURING_LOADING", 9, "undo_during_loading");
        UNDO_DURING_LOADING = enumC373350EkP10;
        EnumC373350EkP enumC373350EkP11 = new EnumC373350EkP("AFTER_DRAFT_RECOVER", 10, "unselect_after_draft_recover");
        AFTER_DRAFT_RECOVER = enumC373350EkP11;
        EnumC373350EkP[] enumC373350EkPArr = {enumC373350EkP, enumC373350EkP2, enumC373350EkP3, enumC373350EkP4, enumC373350EkP5, enumC373350EkP6, enumC373350EkP7, enumC373350EkP8, enumC373350EkP9, enumC373350EkP10, enumC373350EkP11};
        LLILLJJLI = enumC373350EkPArr;
        LLILLL = new C2254308sP(enumC373350EkPArr);
    }

    public static EnumC373350EkP[] values() {
        return (EnumC373350EkP[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC373350EkP valueOf(String str) {
        return (EnumC373350EkP) C08FF.LIZ(EnumC373350EkP.class, str);
    }

    public EnumC373350EkP(String str, int i, String str2) {
        this.LL = str2;
    }
}
