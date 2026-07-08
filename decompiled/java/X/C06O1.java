package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06O1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06O1 {
    public static final C06O1 CLICK;
    public static final C06O1 CLOSE;
    public static final /* synthetic */ C06O1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C06O1 SHOW;
    public final String LL;

    public static InterfaceC2044707zh<C06O1> getEntries() {
        return LLILLL;
    }

    static {
        C06O1 c06o1 = new C06O1("CLICK", 0, "click");
        CLICK = c06o1;
        C06O1 c06o12 = new C06O1("CLOSE", 1, "close");
        CLOSE = c06o12;
        C06O1 c06o13 = new C06O1("SHOW", 2, "show");
        SHOW = c06o13;
        C06O1[] c06o1Arr = {c06o1, c06o12, c06o13};
        LLILLJJLI = c06o1Arr;
        LLILLL = new C2254308sP(c06o1Arr);
    }

    public static C06O1[] values() {
        return (C06O1[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C06O1 valueOf(String str) {
        return (C06O1) C08FF.LIZ(C06O1.class, str);
    }

    public C06O1(String str, int i, String str2) {
        this.LL = str2;
    }
}
