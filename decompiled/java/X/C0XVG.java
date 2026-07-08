package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XVG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XVG {
    public static final C0XVG ACCOUNT_AFTER_SWITCH_ACCOUNT_HOOK;
    public static final C0XVG COMPLIANCE_HOOK;
    public static final C0XVG EARLY_RESTART;
    public static final /* synthetic */ C0XVG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0XVG LOGIN_RESTART_HOOK;
    public static final C0XVG NEW_USER_DIALOG_CLEAN_HOOK;
    public static final C0XVG REFRESH_AWEME_USER;
    public static final C0XVG SOCIAL_AUTH_KEVA_UPDATE_HOOK;
    public static final C0XVG UPDATE_USER_CONTEXT_HOOK;
    public final int LL;

    public static InterfaceC2044707zh<C0XVG> getEntries() {
        return LLILLL;
    }

    static {
        C0XVG c0xvg = new C0XVG("REFRESH_AWEME_USER", 0, 1);
        REFRESH_AWEME_USER = c0xvg;
        C0XVG c0xvg2 = new C0XVG("ACCOUNT_AFTER_SWITCH_ACCOUNT_HOOK", 1, 5);
        ACCOUNT_AFTER_SWITCH_ACCOUNT_HOOK = c0xvg2;
        C0XVG c0xvg3 = new C0XVG("EARLY_RESTART", 2, 6);
        EARLY_RESTART = c0xvg3;
        C0XVG c0xvg4 = new C0XVG("COMPLIANCE_HOOK", 3, 10);
        COMPLIANCE_HOOK = c0xvg4;
        C0XVG c0xvg5 = new C0XVG("NEW_USER_DIALOG_CLEAN_HOOK", 4, 10);
        NEW_USER_DIALOG_CLEAN_HOOK = c0xvg5;
        C0XVG c0xvg6 = new C0XVG("SOCIAL_AUTH_KEVA_UPDATE_HOOK", 5, 10);
        SOCIAL_AUTH_KEVA_UPDATE_HOOK = c0xvg6;
        C0XVG c0xvg7 = new C0XVG("UPDATE_USER_CONTEXT_HOOK", 6, 10);
        UPDATE_USER_CONTEXT_HOOK = c0xvg7;
        C0XVG c0xvg8 = new C0XVG("LOGIN_RESTART_HOOK", 7, 999);
        LOGIN_RESTART_HOOK = c0xvg8;
        C0XVG[] c0xvgArr = {c0xvg, c0xvg2, c0xvg3, c0xvg4, c0xvg5, c0xvg6, c0xvg7, c0xvg8};
        LLILLJJLI = c0xvgArr;
        LLILLL = new C2254308sP(c0xvgArr);
    }

    public static C0XVG[] values() {
        return (C0XVG[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0XVG valueOf(String str) {
        return (C0XVG) C08FF.LIZ(C0XVG.class, str);
    }

    public C0XVG(String str, int i, int i2) {
        this.LL = i2;
    }
}
