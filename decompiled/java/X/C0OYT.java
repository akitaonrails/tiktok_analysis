package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OYT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OYT {
    public static final C0OYU Companion;
    public static final /* synthetic */ C0OYT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0OYT STATUS_COLLAPSE;
    public static final C0OYT STATUS_EXPAND;
    public static final C0OYT STATUS_EXPAND_MORE;
    public static final C0OYT STATUS_INVISIBLE;
    public static final C0OYT STATUS_LOADING;

    public static InterfaceC2044707zh<C0OYT> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0OYT c0oyt = new C0OYT("STATUS_EXPAND", 0);
        STATUS_EXPAND = c0oyt;
        C0OYT c0oyt2 = new C0OYT("STATUS_EXPAND_MORE", 1);
        STATUS_EXPAND_MORE = c0oyt2;
        C0OYT c0oyt3 = new C0OYT("STATUS_COLLAPSE", 2);
        STATUS_COLLAPSE = c0oyt3;
        C0OYT c0oyt4 = new C0OYT("STATUS_LOADING", 3);
        STATUS_LOADING = c0oyt4;
        C0OYT c0oyt5 = new C0OYT("STATUS_INVISIBLE", 4);
        STATUS_INVISIBLE = c0oyt5;
        C0OYT[] c0oytArr = {c0oyt, c0oyt2, c0oyt3, c0oyt4, c0oyt5};
        LL = c0oytArr;
        LLILLJJLI = new C2254308sP(c0oytArr);
        Companion = new C0OYU();
    }

    public static C0OYT[] values() {
        return (C0OYT[]) LL.clone();
    }

    public static C0OYT valueOf(String str) {
        return (C0OYT) C08FF.LIZ(C0OYT.class, str);
    }

    public C0OYT(String str, int i) {
    }
}
