package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0II9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0II9 {
    public static final /* synthetic */ C0II9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0II9 MODERATOR_NORMAL_LIVE;
    public static final C0II9 NON_SUBSCRIBER_FORBIDDEN_LIVE;
    public static final C0II9 NON_SUBSCRIBER_TRIAL_LIVE;
    public static final C0II9 NOT_SUB_ONLY_LIVE;
    public static final C0II9 SUBSCRIBER_NORMAL_LIVE;
    public static final C0II9 SUBSCRIBER_VIP_RESTRICTION;

    public static InterfaceC2044707zh<C0II9> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0II9 c0ii9 = new C0II9("NOT_SUB_ONLY_LIVE", 0);
        NOT_SUB_ONLY_LIVE = c0ii9;
        C0II9 c0ii92 = new C0II9("SUBSCRIBER_NORMAL_LIVE", 1);
        SUBSCRIBER_NORMAL_LIVE = c0ii92;
        C0II9 c0ii93 = new C0II9("NON_SUBSCRIBER_TRIAL_LIVE", 2);
        NON_SUBSCRIBER_TRIAL_LIVE = c0ii93;
        C0II9 c0ii94 = new C0II9("NON_SUBSCRIBER_FORBIDDEN_LIVE", 3);
        NON_SUBSCRIBER_FORBIDDEN_LIVE = c0ii94;
        C0II9 c0ii95 = new C0II9("SUBSCRIBER_VIP_RESTRICTION", 4);
        SUBSCRIBER_VIP_RESTRICTION = c0ii95;
        C0II9 c0ii96 = new C0II9("MODERATOR_NORMAL_LIVE", 5);
        MODERATOR_NORMAL_LIVE = c0ii96;
        C0II9[] c0ii9Arr = {c0ii9, c0ii92, c0ii93, c0ii94, c0ii95, c0ii96};
        LL = c0ii9Arr;
        LLILLJJLI = new C2254308sP(c0ii9Arr);
    }

    public static C0II9[] values() {
        return (C0II9[]) LL.clone();
    }

    public static C0II9 valueOf(String str) {
        return (C0II9) C08FF.LIZ(C0II9.class, str);
    }

    public C0II9(String str, int i) {
    }
}
