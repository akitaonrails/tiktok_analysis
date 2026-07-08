package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S43, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S43 {
    public static final C0S43 CLEAN_MODE_CLOSE;
    public static final C0S43 CLEAN_MODE_OPEN;
    public static final /* synthetic */ C0S43[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final C0S42 LL;

    public static InterfaceC2044707zh<C0S43> getEntries() {
        return LLILLL;
    }

    static {
        C0S43 c0s43 = new C0S43("CLEAN_MODE_CLOSE", 0, C0S42.RISK_ASYNC_CLEAN_MODE_CLOSE);
        CLEAN_MODE_CLOSE = c0s43;
        C0S43 c0s432 = new C0S43("CLEAN_MODE_OPEN", 1, C0S42.RISK_ASYNC_CLEAN_MODE_OPEN);
        CLEAN_MODE_OPEN = c0s432;
        C0S43[] c0s43Arr = {c0s43, c0s432};
        LLILLJJLI = c0s43Arr;
        LLILLL = new C2254308sP(c0s43Arr);
    }

    public static C0S43[] values() {
        return (C0S43[]) LLILLJJLI.clone();
    }

    public final C0S42 getSkipType() {
        return this.LL;
    }

    public static C0S43 valueOf(String str) {
        return (C0S43) C08FF.LIZ(C0S43.class, str);
    }

    public C0S43(String str, int i, C0S42 c0s42) {
        this.LL = c0s42;
    }
}
