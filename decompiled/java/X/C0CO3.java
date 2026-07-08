package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CO3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CO3 {
    public static final C0CO3 BOOT_FINISH;
    public static final C0CO3 IDLE;
    public static final /* synthetic */ C0CO3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0CO3 NORMAL;
    public static final C0CO3 P0;

    public static InterfaceC2044707zh<C0CO3> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0CO3 c0co3 = new C0CO3("P0", 0);
        P0 = c0co3;
        C0CO3 c0co32 = new C0CO3("NORMAL", 1);
        NORMAL = c0co32;
        C0CO3 c0co33 = new C0CO3("BOOT_FINISH", 2);
        BOOT_FINISH = c0co33;
        C0CO3 c0co34 = new C0CO3("IDLE", 3);
        IDLE = c0co34;
        C0CO3[] c0co3Arr = {c0co3, c0co32, c0co33, c0co34};
        LL = c0co3Arr;
        LLILLJJLI = new C2254308sP(c0co3Arr);
    }

    public static C0CO3[] values() {
        return (C0CO3[]) LL.clone();
    }

    public static C0CO3 valueOf(String str) {
        return (C0CO3) C08FF.LIZ(C0CO3.class, str);
    }

    public C0CO3(String str, int i) {
    }
}
