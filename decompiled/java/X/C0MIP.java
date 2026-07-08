package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MIP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MIP {
    public static final C0MIP FAILED;
    public static final C0MIP FINISHED;
    public static final C0MIP GENERATING;
    public static final /* synthetic */ C0MIP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0MIP NOT_STARTED;
    public static final C0MIP SCANNING;

    public static InterfaceC2044707zh<C0MIP> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0MIP c0mip = new C0MIP("SCANNING", 0);
        SCANNING = c0mip;
        C0MIP c0mip2 = new C0MIP("GENERATING", 1);
        GENERATING = c0mip2;
        C0MIP c0mip3 = new C0MIP("FAILED", 2);
        FAILED = c0mip3;
        C0MIP c0mip4 = new C0MIP("FINISHED", 3);
        FINISHED = c0mip4;
        C0MIP c0mip5 = new C0MIP("NOT_STARTED", 4);
        NOT_STARTED = c0mip5;
        C0MIP[] c0mipArr = {c0mip, c0mip2, c0mip3, c0mip4, c0mip5};
        LL = c0mipArr;
        LLILLJJLI = new C2254308sP(c0mipArr);
    }

    public static C0MIP[] values() {
        return (C0MIP[]) LL.clone();
    }

    public static C0MIP valueOf(String str) {
        return (C0MIP) C08FF.LIZ(C0MIP.class, str);
    }

    public C0MIP(String str, int i) {
    }
}
