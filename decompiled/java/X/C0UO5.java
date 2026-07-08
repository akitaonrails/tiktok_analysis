package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UO5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UO5 {
    public static final C0UO5 L0_FIRST_ENTER_KEY;
    public static final C0UO5 L0_TASK_KEY;
    public static final C0UO5 L1_COMPLETE_KEY;
    public static final C0UO5 L1_TASK_KEY;
    public static final C0UO5 L2_COMPLETE_KEY;
    public static final /* synthetic */ C0UO5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0UO5 TNS_STAGE1_KEY;
    public static final C0UO5 TNS_STAGE2_KEY;
    public final String LL;

    public static InterfaceC2044707zh<C0UO5> getEntries() {
        return LLILLL;
    }

    static {
        C0UO5 c0uo5 = new C0UO5("L0_FIRST_ENTER_KEY", 0, "pm_onboard_full_exp_title");
        L0_FIRST_ENTER_KEY = c0uo5;
        C0UO5 c0uo52 = new C0UO5("L0_TASK_KEY", 1, "pm_onboard_task_to_complete_stage_1");
        L0_TASK_KEY = c0uo52;
        C0UO5 c0uo53 = new C0UO5("L1_COMPLETE_KEY", 2, "pm_onboard_stage_1_completed_banner");
        L1_COMPLETE_KEY = c0uo53;
        C0UO5 c0uo54 = new C0UO5("L1_TASK_KEY", 3, "pm_onboard_task_to_complete_stage_2");
        L1_TASK_KEY = c0uo54;
        C0UO5 c0uo55 = new C0UO5("L2_COMPLETE_KEY", 4, "pm_onboard_stage_2_completed_banner");
        L2_COMPLETE_KEY = c0uo55;
        C0UO5 c0uo56 = new C0UO5("TNS_STAGE1_KEY", 5, "pm_onboard_unable_complete_stage_1_banner");
        TNS_STAGE1_KEY = c0uo56;
        C0UO5 c0uo57 = new C0UO5("TNS_STAGE2_KEY", 6, "pm_onboard_unable_complete_stage_2_banner");
        TNS_STAGE2_KEY = c0uo57;
        C0UO5[] c0uo5Arr = {c0uo5, c0uo52, c0uo53, c0uo54, c0uo55, c0uo56, c0uo57};
        LLILLJJLI = c0uo5Arr;
        LLILLL = new C2254308sP(c0uo5Arr);
    }

    public static C0UO5[] values() {
        return (C0UO5[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static C0UO5 valueOf(String str) {
        return (C0UO5) C08FF.LIZ(C0UO5.class, str);
    }

    public C0UO5(String str, int i, String str2) {
        this.LL = str2;
    }
}
