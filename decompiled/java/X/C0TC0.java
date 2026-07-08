package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TC0, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TC0 implements C0TCZ {
    public static final C0TC0 CONNECT_STATE_FALL_BACK_RTMP;
    public static final C0TC0 CONNECT_STATE_LEAVE;
    public static final C0TC5 Companion;
    public static final /* synthetic */ C0TC0[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0TC0 STATE_TIME_OUT;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C0TC0> getEntries() {
        return LLILZ;
    }

    @Override // X.C0TCZ
    public boolean isSinkDisconnectManually() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0TC5] */
    static {
        C0TC0 c0tc0 = new C0TC0("CONNECT_STATE_FALL_BACK_RTMP", 0, -2, "source fall back to rtmp");
        CONNECT_STATE_FALL_BACK_RTMP = c0tc0;
        C0TC0 c0tc02 = new C0TC0("CONNECT_STATE_LEAVE", 1, 1, "source disconnect manually");
        CONNECT_STATE_LEAVE = c0tc02;
        C0TC0 c0tc03 = new C0TC0("STATE_TIME_OUT", 2, 999, "source heart beat time out");
        STATE_TIME_OUT = c0tc03;
        C0TC0[] c0tc0Arr = {c0tc0, c0tc02, c0tc03};
        LLILLL = c0tc0Arr;
        LLILZ = new C2254308sP(c0tc0Arr);
        Companion = new Object() { // from class: X.0TC5
        };
    }

    public static C0TC0[] values() {
        return (C0TC0[]) LLILLL.clone();
    }

    @Override // X.C0TCZ
    public boolean isSourceTryAgain() {
        return this == CONNECT_STATE_LEAVE;
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

    public static C0TC0 valueOf(String str) {
        return (C0TC0) C08FF.LIZ(C0TC0.class, str);
    }

    public C0TC0(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
