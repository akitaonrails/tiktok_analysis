package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OPR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OPR {
    public static final C0OPR EMOJI_ACTION_TYPE_CANCEL;
    public static final C0OPR EMOJI_ACTION_TYPE_SEND;
    public static final C0OPR EMOJI_ACTION_TYPE_UNKNOWN;
    public static final /* synthetic */ C0OPR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0OPR> getEntries() {
        return LLILLL;
    }

    static {
        C0OPR c0opr = new C0OPR("EMOJI_ACTION_TYPE_UNKNOWN", 0, 0);
        EMOJI_ACTION_TYPE_UNKNOWN = c0opr;
        C0OPR c0opr2 = new C0OPR("EMOJI_ACTION_TYPE_SEND", 1, 1);
        EMOJI_ACTION_TYPE_SEND = c0opr2;
        C0OPR c0opr3 = new C0OPR("EMOJI_ACTION_TYPE_CANCEL", 2, 2);
        EMOJI_ACTION_TYPE_CANCEL = c0opr3;
        C0OPR[] c0oprArr = {c0opr, c0opr2, c0opr3};
        LLILLJJLI = c0oprArr;
        LLILLL = new C2254308sP(c0oprArr);
    }

    public static C0OPR[] values() {
        return (C0OPR[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0OPR valueOf(String str) {
        return (C0OPR) C08FF.LIZ(C0OPR.class, str);
    }

    public C0OPR(String str, int i, int i2) {
        this.LL = i2;
    }
}
