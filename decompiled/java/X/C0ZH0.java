package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZH0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZH0 {
    public static final /* synthetic */ C0ZH0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ZH0 MUF_POST;
    public static final C0ZH0 REPOST;
    public static final C0ZH0 SHARED_FEED;

    public static InterfaceC2044707zh<C0ZH0> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZH0 c0zh0 = new C0ZH0("MUF_POST", 0);
        MUF_POST = c0zh0;
        C0ZH0 c0zh02 = new C0ZH0("REPOST", 1);
        REPOST = c0zh02;
        C0ZH0 c0zh03 = new C0ZH0("SHARED_FEED", 2);
        SHARED_FEED = c0zh03;
        C0ZH0[] c0zh0Arr = {c0zh0, c0zh02, c0zh03};
        LL = c0zh0Arr;
        LLILLJJLI = new C2254308sP(c0zh0Arr);
    }

    public static C0ZH0[] values() {
        return (C0ZH0[]) LL.clone();
    }

    public static C0ZH0 valueOf(String str) {
        return (C0ZH0) C08FF.LIZ(C0ZH0.class, str);
    }

    public C0ZH0(String str, int i) {
    }
}
