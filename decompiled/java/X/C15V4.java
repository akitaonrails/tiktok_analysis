package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15V4, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15V4 {
    public static final C15V4 DATA_BUILD;
    public static final /* synthetic */ C15V4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C15V4 PAGE_APPEAR;
    public static final C15V4 PAGE_BUILD;
    public static final C15V4 START;

    public static InterfaceC2044707zh<C15V4> getEntries() {
        return LLILLJJLI;
    }

    static {
        C15V4 c15v4 = new C15V4("START", 0);
        START = c15v4;
        C15V4 c15v42 = new C15V4("PAGE_BUILD", 1);
        PAGE_BUILD = c15v42;
        C15V4 c15v43 = new C15V4("PAGE_APPEAR", 2);
        PAGE_APPEAR = c15v43;
        C15V4 c15v44 = new C15V4("DATA_BUILD", 3);
        DATA_BUILD = c15v44;
        C15V4[] c15v4Arr = {c15v4, c15v42, c15v43, c15v44};
        LL = c15v4Arr;
        LLILLJJLI = new C2254308sP(c15v4Arr);
    }

    public static C15V4[] values() {
        return (C15V4[]) LL.clone();
    }

    public static C15V4 valueOf(String str) {
        return (C15V4) C08FF.LIZ(C15V4.class, str);
    }

    public C15V4(String str, int i) {
    }
}
