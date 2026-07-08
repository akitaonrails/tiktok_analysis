package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UO4, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UO4 {
    public static final C0UO4 HOST_WITH_SCREEN_SHOT_BANNED_KEY;
    public static final C0UO4 L0_HOST_WITH_AGE_CHECK_UNFINISHED_KEY;
    public static final C0UO4 L0_HOST_WITH_LIVE_TASK_UNFINISHED_KEY;
    public static final C0UO4 L1_HOST_FIRST_ENTER_PREVIEW_LIVE_KEY;
    public static final /* synthetic */ C0UO4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0UO4> getEntries() {
        return LLILLL;
    }

    static {
        C0UO4 c0uo4 = new C0UO4("L0_HOST_WITH_LIVE_TASK_UNFINISHED_KEY", 0, "pm_LOPV2_goLIVEPage_goLIVEBanner");
        L0_HOST_WITH_LIVE_TASK_UNFINISHED_KEY = c0uo4;
        C0UO4 c0uo42 = new C0UO4("L0_HOST_WITH_AGE_CHECK_UNFINISHED_KEY", 1, "pm_LOPV3_goLIVEPage_ageBanner");
        L0_HOST_WITH_AGE_CHECK_UNFINISHED_KEY = c0uo42;
        C0UO4 c0uo43 = new C0UO4("L1_HOST_FIRST_ENTER_PREVIEW_LIVE_KEY", 2, "pm_LOPV4_goLIVEPage_completeBanner");
        L1_HOST_FIRST_ENTER_PREVIEW_LIVE_KEY = c0uo43;
        C0UO4 c0uo44 = new C0UO4("HOST_WITH_SCREEN_SHOT_BANNED_KEY", 3, "pm_LOPV5_goLIVEPage_progressHoldBanner");
        HOST_WITH_SCREEN_SHOT_BANNED_KEY = c0uo44;
        C0UO4[] c0uo4Arr = {c0uo4, c0uo42, c0uo43, c0uo44};
        LLILLJJLI = c0uo4Arr;
        LLILLL = new C2254308sP(c0uo4Arr);
    }

    public static C0UO4[] values() {
        return (C0UO4[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static C0UO4 valueOf(String str) {
        return (C0UO4) C08FF.LIZ(C0UO4.class, str);
    }

    public C0UO4(String str, int i, String str2) {
        this.LL = str2;
    }
}
