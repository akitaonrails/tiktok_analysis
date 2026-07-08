package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TDH, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TDH {
    public static final /* synthetic */ C0TDH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0TDH STATE_END;
    public static final C0TDH STATE_IDLE;
    public static final C0TDH STATE_START;
    public static final C0TDH STATE_VOTED;

    public static InterfaceC2044707zh<C0TDH> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0TDH c0tdh = new C0TDH("STATE_IDLE", 0);
        STATE_IDLE = c0tdh;
        C0TDH c0tdh2 = new C0TDH("STATE_START", 1);
        STATE_START = c0tdh2;
        C0TDH c0tdh3 = new C0TDH("STATE_VOTED", 2);
        STATE_VOTED = c0tdh3;
        C0TDH c0tdh4 = new C0TDH("STATE_END", 3);
        STATE_END = c0tdh4;
        C0TDH[] c0tdhArr = {c0tdh, c0tdh2, c0tdh3, c0tdh4};
        LL = c0tdhArr;
        LLILLJJLI = new C2254308sP(c0tdhArr);
    }

    public static C0TDH[] values() {
        return (C0TDH[]) LL.clone();
    }

    public final boolean isHasVoted() {
        return this == STATE_VOTED;
    }

    public final boolean isVoting() {
        return this == STATE_START;
    }

    public static C0TDH valueOf(String str) {
        return (C0TDH) C08FF.LIZ(C0TDH.class, str);
    }

    public C0TDH(String str, int i) {
    }
}
