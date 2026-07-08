package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14ZQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZQ {
    public static final C14ZQ BIND_BACKGROUND;
    public static final C14ZQ BIND_BANNER;
    public static final C14ZQ BIND_MASK;
    public static final C14ZQ INSERT;
    public static final /* synthetic */ C14ZQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C14ZQ PAGER_SWIPE;

    public static InterfaceC2044707zh<C14ZQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C14ZQ c14zq = new C14ZQ("INSERT", 0);
        INSERT = c14zq;
        C14ZQ c14zq2 = new C14ZQ("BIND_BACKGROUND", 1);
        BIND_BACKGROUND = c14zq2;
        C14ZQ c14zq3 = new C14ZQ("BIND_BANNER", 2);
        BIND_BANNER = c14zq3;
        C14ZQ c14zq4 = new C14ZQ("BIND_MASK", 3);
        BIND_MASK = c14zq4;
        C14ZQ c14zq5 = new C14ZQ("PAGER_SWIPE", 4);
        PAGER_SWIPE = c14zq5;
        C14ZQ[] c14zqArr = {c14zq, c14zq2, c14zq3, c14zq4, c14zq5};
        LL = c14zqArr;
        LLILLJJLI = new C2254308sP(c14zqArr);
    }

    public static C14ZQ[] values() {
        return (C14ZQ[]) LL.clone();
    }

    public static C14ZQ valueOf(String str) {
        return (C14ZQ) C08FF.LIZ(C14ZQ.class, str);
    }

    public C14ZQ(String str, int i) {
    }
}
