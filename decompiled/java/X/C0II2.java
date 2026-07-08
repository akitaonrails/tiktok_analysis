package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0II2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0II2 {
    public static final /* synthetic */ C0II2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0II2 START;
    public static final C0II2 STOP;
    public static final C0II2 SWITCH_AO;
    public static final C0II2 SWITCH_NORMAL;

    public static InterfaceC2044707zh<C0II2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0II2 c0ii2 = new C0II2("START", 0);
        START = c0ii2;
        C0II2 c0ii22 = new C0II2("STOP", 1);
        STOP = c0ii22;
        C0II2 c0ii23 = new C0II2("SWITCH_AO", 2);
        SWITCH_AO = c0ii23;
        C0II2 c0ii24 = new C0II2("SWITCH_NORMAL", 3);
        SWITCH_NORMAL = c0ii24;
        C0II2[] c0ii2Arr = {c0ii2, c0ii22, c0ii23, c0ii24};
        LL = c0ii2Arr;
        LLILLJJLI = new C2254308sP(c0ii2Arr);
    }

    public static C0II2[] values() {
        return (C0II2[]) LL.clone();
    }

    public static C0II2 valueOf(String str) {
        return (C0II2) C08FF.LIZ(C0II2.class, str);
    }

    public C0II2(String str, int i) {
    }
}
