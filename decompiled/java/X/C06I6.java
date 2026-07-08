package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06I6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06I6 {
    public static final C06I6 FAIL;
    public static final /* synthetic */ C06I6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C06I6 LOADING;
    public static final C06I6 NONE;
    public static final C06I6 SUCCESS;

    public static InterfaceC2044707zh<C06I6> getEntries() {
        return LLILLJJLI;
    }

    static {
        C06I6 c06i6 = new C06I6("NONE", 0);
        NONE = c06i6;
        C06I6 c06i62 = new C06I6("LOADING", 1);
        LOADING = c06i62;
        C06I6 c06i63 = new C06I6("SUCCESS", 2);
        SUCCESS = c06i63;
        C06I6 c06i64 = new C06I6("FAIL", 3);
        FAIL = c06i64;
        C06I6[] c06i6Arr = {c06i6, c06i62, c06i63, c06i64};
        LL = c06i6Arr;
        LLILLJJLI = new C2254308sP(c06i6Arr);
    }

    public static C06I6[] values() {
        return (C06I6[]) LL.clone();
    }

    public static C06I6 valueOf(String str) {
        return (C06I6) C08FF.LIZ(C06I6.class, str);
    }

    public C06I6(String str, int i) {
    }
}
