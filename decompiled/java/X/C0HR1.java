package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HR1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HR1 {
    public static final C0HR1 CANCEL;
    public static final /* synthetic */ C0HR1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0HR1 SHOW;
    public static final C0HR1 TERMINATE;
    public final String LL;

    public static InterfaceC2044707zh<C0HR1> getEntries() {
        return LLILLL;
    }

    static {
        C0HR1 c0hr1 = new C0HR1("SHOW", 0, "show");
        SHOW = c0hr1;
        C0HR1 c0hr12 = new C0HR1("CANCEL", 1, "cancel");
        CANCEL = c0hr12;
        C0HR1 c0hr13 = new C0HR1("TERMINATE", 2, "terminate");
        TERMINATE = c0hr13;
        C0HR1[] c0hr1Arr = {c0hr1, c0hr12, c0hr13};
        LLILLJJLI = c0hr1Arr;
        LLILLL = new C2254308sP(c0hr1Arr);
    }

    public static C0HR1[] values() {
        return (C0HR1[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static C0HR1 valueOf(String str) {
        return (C0HR1) C08FF.LIZ(C0HR1.class, str);
    }

    public C0HR1(String str, int i, String str2) {
        this.LL = str2;
    }
}
