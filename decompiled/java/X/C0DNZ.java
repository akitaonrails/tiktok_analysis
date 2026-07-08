package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DNZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DNZ {
    public static final C0DNZ CLICK_BACK;
    public static final C0DNZ CLICK_SEND;
    public static final /* synthetic */ C0DNZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0DNZ SHOW;
    public final String LL;

    public static InterfaceC2044707zh<C0DNZ> getEntries() {
        return LLILLL;
    }

    static {
        C0DNZ c0dnz = new C0DNZ("SHOW", 0, "show");
        SHOW = c0dnz;
        C0DNZ c0dnz2 = new C0DNZ("CLICK_SEND", 1, "click_send");
        CLICK_SEND = c0dnz2;
        C0DNZ c0dnz3 = new C0DNZ("CLICK_BACK", 2, "click_back");
        CLICK_BACK = c0dnz3;
        C0DNZ[] c0dnzArr = {c0dnz, c0dnz2, c0dnz3};
        LLILLJJLI = c0dnzArr;
        LLILLL = new C2254308sP(c0dnzArr);
    }

    public static C0DNZ[] values() {
        return (C0DNZ[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static C0DNZ valueOf(String str) {
        return (C0DNZ) C08FF.LIZ(C0DNZ.class, str);
    }

    public C0DNZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
