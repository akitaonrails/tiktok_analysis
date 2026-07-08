package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0W3U, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W3U {
    public static final /* synthetic */ C0W3U[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0W3U LTR;
    public static final C0W3U RTL;

    public static InterfaceC2044707zh<C0W3U> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0W3U c0w3u = new C0W3U("LTR", 0);
        LTR = c0w3u;
        C0W3U c0w3u2 = new C0W3U("RTL", 1);
        RTL = c0w3u2;
        C0W3U[] c0w3uArr = {c0w3u, c0w3u2};
        LL = c0w3uArr;
        LLILLJJLI = new C2254308sP(c0w3uArr);
    }

    public static C0W3U[] values() {
        return (C0W3U[]) LL.clone();
    }

    public static C0W3U valueOf(String str) {
        return (C0W3U) C08FF.LIZ(C0W3U.class, str);
    }

    public C0W3U(String str, int i) {
    }
}
