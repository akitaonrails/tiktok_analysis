package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U9E, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U9E {
    public static final /* synthetic */ C0U9E[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0U9E MORE_V1;
    public static final C0U9E MORE_V2;
    public static final C0U9E NONE;
    public static final C0U9E NORMAL;
    public static final C0U9E NO_RESULT_TIP;
    public static final C0U9E RECOMMEND_STICKER;
    public static final C0U9E SEARCH_OP2;
    public static final C0U9E TRENDING_TIP;
    public final int LL;

    public static InterfaceC2044707zh<C0U9E> getEntries() {
        return LLILLL;
    }

    static {
        C0U9E c0u9e = new C0U9E("NONE", 0, 0);
        NONE = c0u9e;
        C0U9E c0u9e2 = new C0U9E("NORMAL", 1, 1);
        NORMAL = c0u9e2;
        C0U9E c0u9e3 = new C0U9E("MORE_V1", 2, 2);
        MORE_V1 = c0u9e3;
        C0U9E c0u9e4 = new C0U9E("MORE_V2", 3, 3);
        MORE_V2 = c0u9e4;
        C0U9E c0u9e5 = new C0U9E("RECOMMEND_STICKER", 4, 4);
        RECOMMEND_STICKER = c0u9e5;
        C0U9E c0u9e6 = new C0U9E("SEARCH_OP2", 5, 5);
        SEARCH_OP2 = c0u9e6;
        C0U9E c0u9e7 = new C0U9E("TRENDING_TIP", 6, 6);
        TRENDING_TIP = c0u9e7;
        C0U9E c0u9e8 = new C0U9E("NO_RESULT_TIP", 7, 7);
        NO_RESULT_TIP = c0u9e8;
        C0U9E[] c0u9eArr = {c0u9e, c0u9e2, c0u9e3, c0u9e4, c0u9e5, c0u9e6, c0u9e7, c0u9e8};
        LLILLJJLI = c0u9eArr;
        LLILLL = new C2254308sP(c0u9eArr);
    }

    public static C0U9E[] values() {
        return (C0U9E[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0U9E valueOf(String str) {
        return (C0U9E) C08FF.LIZ(C0U9E.class, str);
    }

    public C0U9E(String str, int i, int i2) {
        this.LL = i2;
    }
}
