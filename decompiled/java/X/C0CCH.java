package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CCH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CCH {
    public static final C0CCH IDLE;
    public static final /* synthetic */ C0CCH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0CCH START_INTRO;

    public static InterfaceC2044707zh<C0CCH> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0CCH c0cch = new C0CCH("IDLE", 0);
        IDLE = c0cch;
        C0CCH c0cch2 = new C0CCH("START_INTRO", 1);
        START_INTRO = c0cch2;
        C0CCH[] c0cchArr = {c0cch, c0cch2};
        LL = c0cchArr;
        LLILLJJLI = new C2254308sP(c0cchArr);
    }

    public static C0CCH[] values() {
        return (C0CCH[]) LL.clone();
    }

    public static C0CCH valueOf(String str) {
        return (C0CCH) C08FF.LIZ(C0CCH.class, str);
    }

    public C0CCH(String str, int i) {
    }
}
