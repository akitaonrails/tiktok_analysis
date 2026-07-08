package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HTH, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HTH {
    public static final C0HTH BACK;
    public static final C0HTH CLOSE;
    public static final /* synthetic */ C0HTH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0HTH RETRY;
    public final String LL;

    public static InterfaceC2044707zh<C0HTH> getEntries() {
        return LLILLL;
    }

    static {
        C0HTH c0hth = new C0HTH("CLOSE", 0, "close");
        CLOSE = c0hth;
        C0HTH c0hth2 = new C0HTH("BACK", 1, "back");
        BACK = c0hth2;
        C0HTH c0hth3 = new C0HTH("RETRY", 2, "retry");
        RETRY = c0hth3;
        C0HTH[] c0hthArr = {c0hth, c0hth2, c0hth3};
        LLILLJJLI = c0hthArr;
        LLILLL = new C2254308sP(c0hthArr);
    }

    public static C0HTH[] values() {
        return (C0HTH[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static C0HTH valueOf(String str) {
        return (C0HTH) C08FF.LIZ(C0HTH.class, str);
    }

    public C0HTH(String str, int i, String str2) {
        this.LL = str2;
    }
}
