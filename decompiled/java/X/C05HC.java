package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05HC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05HC {
    public static final /* synthetic */ C05HC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C05HC SUMMARY_STATS_TYPE_HISTORY_DAYS_TOGETHER;
    public static final C05HC SUMMARY_STATS_TYPE_HISTORY_TIME_SPEND_SECONDS;
    public final int LL;

    public static InterfaceC2044707zh<C05HC> getEntries() {
        return LLILLL;
    }

    static {
        C05HC c05hc = new C05HC("SUMMARY_STATS_TYPE_HISTORY_TIME_SPEND_SECONDS", 0, 1);
        SUMMARY_STATS_TYPE_HISTORY_TIME_SPEND_SECONDS = c05hc;
        C05HC c05hc2 = new C05HC("SUMMARY_STATS_TYPE_HISTORY_DAYS_TOGETHER", 1, 2);
        SUMMARY_STATS_TYPE_HISTORY_DAYS_TOGETHER = c05hc2;
        C05HC[] c05hcArr = {c05hc, c05hc2};
        LLILLJJLI = c05hcArr;
        LLILLL = new C2254308sP(c05hcArr);
    }

    public static C05HC[] values() {
        return (C05HC[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C05HC valueOf(String str) {
        return (C05HC) C08FF.LIZ(C05HC.class, str);
    }

    public C05HC(String str, int i, int i2) {
        this.LL = i2;
    }
}
