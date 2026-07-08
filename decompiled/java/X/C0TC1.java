package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TC1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TC1 implements C0TCZ {
    public static final C0TC4 Companion;
    public static final C0TC1 LIVE_STATE_DISCONNECT;
    public static final C0TC1 LIVE_STATE_FALL_BACK_RTMP;
    public static final C0TC1 LIVE_STATE_FINISH;
    public static final C0TC1 LIVE_STATE_TIME_OUT;
    public static final /* synthetic */ C0TC1[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C0TC1> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0TC4] */
    static {
        C0TC1 c0tc1 = new C0TC1("LIVE_STATE_FALL_BACK_RTMP", 0, -2, "sink fall back to rtmp");
        LIVE_STATE_FALL_BACK_RTMP = c0tc1;
        C0TC1 c0tc12 = new C0TC1("LIVE_STATE_DISCONNECT", 1, -1, "sink disconnect by reject");
        LIVE_STATE_DISCONNECT = c0tc12;
        C0TC1 c0tc13 = new C0TC1("LIVE_STATE_FINISH", 2, 4, "sink disconnect manually");
        LIVE_STATE_FINISH = c0tc13;
        C0TC1 c0tc14 = new C0TC1("LIVE_STATE_TIME_OUT", 3, 999, "sink heart beat time out");
        LIVE_STATE_TIME_OUT = c0tc14;
        C0TC1[] c0tc1Arr = {c0tc1, c0tc12, c0tc13, c0tc14};
        LLILLL = c0tc1Arr;
        LLILZ = new C2254308sP(c0tc1Arr);
        Companion = new Object() { // from class: X.0TC4
        };
    }

    public static C0TC1[] values() {
        return (C0TC1[]) LLILLL.clone();
    }

    @Override // X.C0TCZ
    public boolean isSinkDisconnectManually() {
        return this == LIVE_STATE_FINISH;
    }

    @Override // X.C0TCZ
    public boolean isSourceTryAgain() {
        return this == LIVE_STATE_DISCONNECT || this == LIVE_STATE_FINISH;
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getDes() {
        return this.LLILLJJLI;
    }

    @Override // X.C0TCZ
    public String getDescription() {
        return this.LLILLJJLI;
    }

    public static C0TC1 valueOf(String str) {
        return (C0TC1) C08FF.LIZ(C0TC1.class, str);
    }

    public C0TC1(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
