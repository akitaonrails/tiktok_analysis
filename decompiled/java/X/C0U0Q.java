package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U0Q, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U0Q {
    public static final /* synthetic */ C0U0Q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0U0Q NEXT;
    public static final C0U0Q NEXT_DIALOG_CANCEL;
    public static final C0U0Q NEXT_DIALOG_CONFIRM;
    public static final C0U0Q PAUSE;
    public static final C0U0Q PIN_TOP;
    public static final C0U0Q PLAY;
    public static final C0U0Q QUEUE_REMOVE;
    public static final C0U0Q QUEUE_REMOVE_DIALOG_CANCEL;
    public static final C0U0Q QUEUE_REMOVE_DIALOG_CONFIRM;
    public static final C0U0Q VIEWER_SINGS_REMOVE;
    public final String LL;

    public static InterfaceC2044707zh<C0U0Q> getEntries() {
        return LLILLL;
    }

    static {
        C0U0Q c0u0q = new C0U0Q("PLAY", 0, "play");
        PLAY = c0u0q;
        C0U0Q c0u0q2 = new C0U0Q("PAUSE", 1, "pause");
        PAUSE = c0u0q2;
        C0U0Q c0u0q3 = new C0U0Q("NEXT", 2, "cut_off");
        NEXT = c0u0q3;
        C0U0Q c0u0q4 = new C0U0Q("NEXT_DIALOG_CONFIRM", 3, "cut_off_continue");
        NEXT_DIALOG_CONFIRM = c0u0q4;
        C0U0Q c0u0q5 = new C0U0Q("NEXT_DIALOG_CANCEL", 4, "cut_off_cancel");
        NEXT_DIALOG_CANCEL = c0u0q5;
        C0U0Q c0u0q6 = new C0U0Q("PIN_TOP", 5, "top");
        PIN_TOP = c0u0q6;
        C0U0Q c0u0q7 = new C0U0Q("QUEUE_REMOVE", 6, "remove");
        QUEUE_REMOVE = c0u0q7;
        C0U0Q c0u0q8 = new C0U0Q("QUEUE_REMOVE_DIALOG_CONFIRM", 7, "remove_continue");
        QUEUE_REMOVE_DIALOG_CONFIRM = c0u0q8;
        C0U0Q c0u0q9 = new C0U0Q("QUEUE_REMOVE_DIALOG_CANCEL", 8, "remove_cancel");
        QUEUE_REMOVE_DIALOG_CANCEL = c0u0q9;
        C0U0Q c0u0q10 = new C0U0Q("VIEWER_SINGS_REMOVE", 9, "withdraw");
        VIEWER_SINGS_REMOVE = c0u0q10;
        C0U0Q[] c0u0qArr = {c0u0q, c0u0q2, c0u0q3, c0u0q4, c0u0q5, c0u0q6, c0u0q7, c0u0q8, c0u0q9, c0u0q10};
        LLILLJJLI = c0u0qArr;
        LLILLL = new C2254308sP(c0u0qArr);
    }

    public static C0U0Q[] values() {
        return (C0U0Q[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0U0Q valueOf(String str) {
        return (C0U0Q) C08FF.LIZ(C0U0Q.class, str);
    }

    public C0U0Q(String str, int i, String str2) {
        this.LL = str2;
    }
}
