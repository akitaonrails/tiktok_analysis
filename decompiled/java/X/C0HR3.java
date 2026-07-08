package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HR3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HR3 {
    public static final C0HR3 CANCEL;
    public static final C0HR3 CLOSE;
    public static final C0HR3 HIDE;
    public static final /* synthetic */ C0HR3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0HR3> getEntries() {
        return LLILLL;
    }

    static {
        C0HR3 c0hr3 = new C0HR3("CANCEL", 0, "cancel");
        CANCEL = c0hr3;
        C0HR3 c0hr32 = new C0HR3("CLOSE", 1, "close");
        CLOSE = c0hr32;
        C0HR3 c0hr33 = new C0HR3("HIDE", 2, "hide");
        HIDE = c0hr33;
        C0HR3[] c0hr3Arr = {c0hr3, c0hr32, c0hr33};
        LLILLJJLI = c0hr3Arr;
        LLILLL = new C2254308sP(c0hr3Arr);
    }

    public static C0HR3[] values() {
        return (C0HR3[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static C0HR3 valueOf(String str) {
        return (C0HR3) C08FF.LIZ(C0HR3.class, str);
    }

    public C0HR3(String str, int i, String str2) {
        this.LL = str2;
    }
}
