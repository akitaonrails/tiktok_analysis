package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06D2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06D2 {
    public static final C06D2 ACTION_BAR;
    public static final C06D2 INLINE_MSG;
    public static final /* synthetic */ C06D2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C06D2 SA_TAB;
    public final String LL;

    public static InterfaceC2044707zh<C06D2> getEntries() {
        return LLILLL;
    }

    static {
        C06D2 c06d2 = new C06D2("ACTION_BAR", 0, "action_bar");
        ACTION_BAR = c06d2;
        C06D2 c06d22 = new C06D2("SA_TAB", 1, "sa_tab");
        SA_TAB = c06d22;
        C06D2 c06d23 = new C06D2("INLINE_MSG", 2, "inline_message");
        INLINE_MSG = c06d23;
        C06D2[] c06d2Arr = {c06d2, c06d22, c06d23};
        LLILLJJLI = c06d2Arr;
        LLILLL = new C2254308sP(c06d2Arr);
    }

    public static C06D2[] values() {
        return (C06D2[]) LLILLJJLI.clone();
    }

    public final String getEnterMethod() {
        return this.LL;
    }

    public static C06D2 valueOf(String str) {
        return (C06D2) C08FF.LIZ(C06D2.class, str);
    }

    public C06D2(String str, int i, String str2) {
        this.LL = str2;
    }
}
