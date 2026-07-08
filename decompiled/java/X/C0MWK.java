package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MWK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MWK {
    public static final C0MWK CLEAR_TASK;
    public static final /* synthetic */ C0MWK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0MWK SINGLE_TASK;
    public static final C0MWK SINGLE_TOP;
    public static final C0MWK STANDARD;

    public static InterfaceC2044707zh<C0MWK> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0MWK c0mwk = new C0MWK("STANDARD", 0);
        STANDARD = c0mwk;
        C0MWK c0mwk2 = new C0MWK("SINGLE_TASK", 1);
        SINGLE_TASK = c0mwk2;
        C0MWK c0mwk3 = new C0MWK("SINGLE_TOP", 2);
        SINGLE_TOP = c0mwk3;
        C0MWK c0mwk4 = new C0MWK("CLEAR_TASK", 3);
        CLEAR_TASK = c0mwk4;
        C0MWK[] c0mwkArr = {c0mwk, c0mwk2, c0mwk3, c0mwk4};
        LL = c0mwkArr;
        LLILLJJLI = new C2254308sP(c0mwkArr);
    }

    public static C0MWK[] values() {
        return (C0MWK[]) LL.clone();
    }

    public static C0MWK valueOf(String str) {
        return (C0MWK) C08FF.LIZ(C0MWK.class, str);
    }

    public C0MWK(String str, int i) {
    }
}
