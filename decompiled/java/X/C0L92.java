package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L92, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L92 {
    public static final C0L92 FAILED;
    public static final /* synthetic */ C0L92[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0L92 START;
    public static final C0L92 SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<C0L92> getEntries() {
        return LLILLL;
    }

    static {
        C0L92 c0l92 = new C0L92("START", 0, "start");
        START = c0l92;
        C0L92 c0l922 = new C0L92("SUCCESS", 1, "success");
        SUCCESS = c0l922;
        C0L92 c0l923 = new C0L92("FAILED", 2, "failed");
        FAILED = c0l923;
        C0L92[] c0l92Arr = {c0l92, c0l922, c0l923};
        LLILLJJLI = c0l92Arr;
        LLILLL = new C2254308sP(c0l92Arr);
    }

    public static C0L92[] values() {
        return (C0L92[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0L92 valueOf(String str) {
        return (C0L92) C08FF.LIZ(C0L92.class, str);
    }

    public C0L92(String str, int i, String str2) {
        this.LL = str2;
    }
}
