package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03RT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03RT {
    public static final C03RT DONE;
    public static final /* synthetic */ C03RT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C03RT PRELOADING;

    public static InterfaceC2044707zh<C03RT> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03RT c03rt = new C03RT("PRELOADING", 0);
        PRELOADING = c03rt;
        C03RT c03rt2 = new C03RT("DONE", 1);
        DONE = c03rt2;
        C03RT[] c03rtArr = {c03rt, c03rt2};
        LL = c03rtArr;
        LLILLJJLI = new C2254308sP(c03rtArr);
    }

    public static C03RT[] values() {
        return (C03RT[]) LL.clone();
    }

    public static C03RT valueOf(String str) {
        return (C03RT) C08FF.LIZ(C03RT.class, str);
    }

    public C03RT(String str, int i) {
    }
}
