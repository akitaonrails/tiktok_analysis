package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UO3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UO3 {
    public static final C0UO3 HOST_WITH_SCREEN_SHOT_BANNED_KEY;
    public static final C0UO3 L0_HOST_WITH_AGE_CHECK_UNFINISHED_KEY;
    public static final C0UO3 L0_HOST_WITH_LIVE_TASK_UNFINISHED_KEY;
    public static final C0UO3 L1_HOST_FIRST_ENTER_PREVIEW_LIVE_KEY;
    public static final /* synthetic */ C0UO3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0UO3> getEntries() {
        return LLILLL;
    }

    static {
        C0UO3 c0uo3 = new C0UO3("L0_HOST_WITH_LIVE_TASK_UNFINISHED_KEY", 0, "pm_LOPV2_goLIVEPage_goLIVEBanner");
        L0_HOST_WITH_LIVE_TASK_UNFINISHED_KEY = c0uo3;
        C0UO3 c0uo32 = new C0UO3("L0_HOST_WITH_AGE_CHECK_UNFINISHED_KEY", 1, "pm_LOPV3_goLIVEPage_ageBanner");
        L0_HOST_WITH_AGE_CHECK_UNFINISHED_KEY = c0uo32;
        C0UO3 c0uo33 = new C0UO3("L1_HOST_FIRST_ENTER_PREVIEW_LIVE_KEY", 2, "pm_LOPV4_goLIVEPage_completeBanner");
        L1_HOST_FIRST_ENTER_PREVIEW_LIVE_KEY = c0uo33;
        C0UO3 c0uo34 = new C0UO3("HOST_WITH_SCREEN_SHOT_BANNED_KEY", 3, "pm_LOPV5_goLIVEPage_progressHoldBanner");
        HOST_WITH_SCREEN_SHOT_BANNED_KEY = c0uo34;
        C0UO3[] c0uo3Arr = {c0uo3, c0uo32, c0uo33, c0uo34};
        LLILLJJLI = c0uo3Arr;
        LLILLL = new C2254308sP(c0uo3Arr);
    }

    public static C0UO3[] values() {
        return (C0UO3[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static C0UO3 valueOf(String str) {
        return (C0UO3) C08FF.LIZ(C0UO3.class, str);
    }

    public C0UO3(String str, int i, String str2) {
        this.LL = str2;
    }
}
