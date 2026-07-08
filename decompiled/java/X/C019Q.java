package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.019Q, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C019Q {
    public static final /* synthetic */ C019Q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C019Q NONE;
    public static final C019Q SCORE_CHANGE;
    public static final C019Q SETTLE_END;
    public static final C019Q START;

    public static InterfaceC2044707zh<C019Q> getEntries() {
        return LLILLJJLI;
    }

    static {
        C019Q c019q = new C019Q("NONE", 0);
        NONE = c019q;
        C019Q c019q2 = new C019Q("START", 1);
        START = c019q2;
        C019Q c019q3 = new C019Q("SCORE_CHANGE", 2);
        SCORE_CHANGE = c019q3;
        C019Q c019q4 = new C019Q("SETTLE_END", 3);
        SETTLE_END = c019q4;
        C019Q[] c019qArr = {c019q, c019q2, c019q3, c019q4};
        LL = c019qArr;
        LLILLJJLI = new C2254308sP(c019qArr);
    }

    public static C019Q[] values() {
        return (C019Q[]) LL.clone();
    }

    public static C019Q valueOf(String str) {
        return (C019Q) C08FF.LIZ(C019Q.class, str);
    }

    public C019Q(String str, int i) {
    }
}
