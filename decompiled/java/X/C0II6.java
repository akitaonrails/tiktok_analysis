package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0II6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0II6 {
    public static final C0II6 LIVE_END_HALF_SCREEN_CARD;
    public static final C0II6 LIVE_SURVEY_CARD;
    public static final /* synthetic */ C0II6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0II6> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0II6 c0ii6 = new C0II6("LIVE_SURVEY_CARD", 0);
        LIVE_SURVEY_CARD = c0ii6;
        C0II6 c0ii62 = new C0II6("LIVE_END_HALF_SCREEN_CARD", 1);
        LIVE_END_HALF_SCREEN_CARD = c0ii62;
        C0II6[] c0ii6Arr = {c0ii6, c0ii62};
        LL = c0ii6Arr;
        LLILLJJLI = new C2254308sP(c0ii6Arr);
    }

    public static C0II6[] values() {
        return (C0II6[]) LL.clone();
    }

    public static C0II6 valueOf(String str) {
        return (C0II6) C08FF.LIZ(C0II6.class, str);
    }

    public C0II6(String str, int i) {
    }
}
