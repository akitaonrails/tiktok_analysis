package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0II5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0II5 {
    public static final C0II5 EXIT_EXTRA_CARD;
    public static final C0II5 EXTRA_CARD;
    public static final /* synthetic */ C0II5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0II5 SURVEY_CARD;

    public static InterfaceC2044707zh<C0II5> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0II5 c0ii5 = new C0II5("SURVEY_CARD", 0);
        SURVEY_CARD = c0ii5;
        C0II5 c0ii52 = new C0II5("EXTRA_CARD", 1);
        EXTRA_CARD = c0ii52;
        C0II5 c0ii53 = new C0II5("EXIT_EXTRA_CARD", 2);
        EXIT_EXTRA_CARD = c0ii53;
        C0II5[] c0ii5Arr = {c0ii5, c0ii52, c0ii53};
        LL = c0ii5Arr;
        LLILLJJLI = new C2254308sP(c0ii5Arr);
    }

    public static C0II5[] values() {
        return (C0II5[]) LL.clone();
    }

    public static C0II5 valueOf(String str) {
        return (C0II5) C08FF.LIZ(C0II5.class, str);
    }

    public C0II5(String str, int i) {
    }
}
