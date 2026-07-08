package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NZH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NZH {
    public static final C0NZH IDLE;
    public static final /* synthetic */ C0NZH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0NZH LOADING;
    public static final C0NZH LOAD_FAILED;
    public static final C0NZH NO_MORE;

    public static InterfaceC2044707zh<C0NZH> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NZH c0nzh = new C0NZH("IDLE", 0);
        IDLE = c0nzh;
        C0NZH c0nzh2 = new C0NZH("LOADING", 1);
        LOADING = c0nzh2;
        C0NZH c0nzh3 = new C0NZH("LOAD_FAILED", 2);
        LOAD_FAILED = c0nzh3;
        C0NZH c0nzh4 = new C0NZH("NO_MORE", 3);
        NO_MORE = c0nzh4;
        C0NZH[] c0nzhArr = {c0nzh, c0nzh2, c0nzh3, c0nzh4};
        LL = c0nzhArr;
        LLILLJJLI = new C2254308sP(c0nzhArr);
    }

    public static C0NZH[] values() {
        return (C0NZH[]) LL.clone();
    }

    public static C0NZH valueOf(String str) {
        return (C0NZH) C08FF.LIZ(C0NZH.class, str);
    }

    public C0NZH(String str, int i) {
    }
}
