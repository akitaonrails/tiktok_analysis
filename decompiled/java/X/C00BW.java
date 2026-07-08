package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BW {
    public static final C00BW FAILURE;
    public static final /* synthetic */ C00BW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00BW RUNNING;
    public static final C00BW SUCCESS;
    public static final C00BW UNKNOWN;

    public static InterfaceC2044707zh<C00BW> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00BW c00bw = new C00BW("SUCCESS", 0);
        SUCCESS = c00bw;
        C00BW c00bw2 = new C00BW("FAILURE", 1);
        FAILURE = c00bw2;
        C00BW c00bw3 = new C00BW("RUNNING", 2);
        RUNNING = c00bw3;
        C00BW c00bw4 = new C00BW("UNKNOWN", 3);
        UNKNOWN = c00bw4;
        C00BW[] c00bwArr = {c00bw, c00bw2, c00bw3, c00bw4};
        LL = c00bwArr;
        LLILLJJLI = new C2254308sP(c00bwArr);
    }

    public static C00BW[] values() {
        return (C00BW[]) LL.clone();
    }

    public static C00BW valueOf(String str) {
        return (C00BW) C08FF.LIZ(C00BW.class, str);
    }

    public C00BW(String str, int i) {
    }
}
