package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IOB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IOB {
    public static final C0IOB HIDE;
    public static final C0IOB IDLE;
    public static final /* synthetic */ C0IOB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0IOB SHOW;

    public static InterfaceC2044707zh<C0IOB> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0IOB c0iob = new C0IOB("IDLE", 0);
        IDLE = c0iob;
        C0IOB c0iob2 = new C0IOB("SHOW", 1);
        SHOW = c0iob2;
        C0IOB c0iob3 = new C0IOB("HIDE", 2);
        HIDE = c0iob3;
        C0IOB[] c0iobArr = {c0iob, c0iob2, c0iob3};
        LL = c0iobArr;
        LLILLJJLI = new C2254308sP(c0iobArr);
    }

    public static C0IOB[] values() {
        return (C0IOB[]) LL.clone();
    }

    public static C0IOB valueOf(String str) {
        return (C0IOB) C08FF.LIZ(C0IOB.class, str);
    }

    public C0IOB(String str, int i) {
    }
}
