package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CUZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CUZ {
    public static final C0CUZ CHECK_AB;
    public static final C0CUZ CHECK_DID;
    public static final C0CUZ CHECK_LOGIN;
    public static final C0CUZ HOOK_UPDATE_AB;
    public static final /* synthetic */ C0CUZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0CUZ LOOP_CHECK_AB;
    public static final C0CUZ LOOP_CHECK_DID;
    public static final C0CUZ RESET_TAB;
    public final String LL;

    public static InterfaceC2044707zh<C0CUZ> getEntries() {
        return LLILLL;
    }

    static {
        C0CUZ c0cuz = new C0CUZ("CHECK_DID", 0, "check_did");
        CHECK_DID = c0cuz;
        C0CUZ c0cuz2 = new C0CUZ("LOOP_CHECK_DID", 1, "loop_check_did");
        LOOP_CHECK_DID = c0cuz2;
        C0CUZ c0cuz3 = new C0CUZ("CHECK_AB", 2, "check_ab");
        CHECK_AB = c0cuz3;
        C0CUZ c0cuz4 = new C0CUZ("HOOK_UPDATE_AB", 3, "hook_update_ab");
        HOOK_UPDATE_AB = c0cuz4;
        C0CUZ c0cuz5 = new C0CUZ("LOOP_CHECK_AB", 4, "loop_check_ab");
        LOOP_CHECK_AB = c0cuz5;
        C0CUZ c0cuz6 = new C0CUZ("CHECK_LOGIN", 5, "check_login");
        CHECK_LOGIN = c0cuz6;
        C0CUZ c0cuz7 = new C0CUZ("RESET_TAB", 6, "reset_tab");
        RESET_TAB = c0cuz7;
        C0CUZ[] c0cuzArr = {c0cuz, c0cuz2, c0cuz3, c0cuz4, c0cuz5, c0cuz6, c0cuz7};
        LLILLJJLI = c0cuzArr;
        LLILLL = new C2254308sP(c0cuzArr);
    }

    public static C0CUZ[] values() {
        return (C0CUZ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0CUZ valueOf(String str) {
        return (C0CUZ) C08FF.LIZ(C0CUZ.class, str);
    }

    public C0CUZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
