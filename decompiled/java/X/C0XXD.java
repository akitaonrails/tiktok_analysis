package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XXD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XXD {
    public static final C0XXD FINISHED;
    public static final C0XXD IN_PROGRESS;
    public static final /* synthetic */ C0XXD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0XXD NOT_APPLICABLE;

    public static InterfaceC2044707zh<C0XXD> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0XXD c0xxd = new C0XXD("NOT_APPLICABLE", 0);
        NOT_APPLICABLE = c0xxd;
        C0XXD c0xxd2 = new C0XXD("IN_PROGRESS", 1);
        IN_PROGRESS = c0xxd2;
        C0XXD c0xxd3 = new C0XXD("FINISHED", 2);
        FINISHED = c0xxd3;
        C0XXD[] c0xxdArr = {c0xxd, c0xxd2, c0xxd3};
        LL = c0xxdArr;
        LLILLJJLI = new C2254308sP(c0xxdArr);
    }

    public static C0XXD[] values() {
        return (C0XXD[]) LL.clone();
    }

    public static C0XXD valueOf(String str) {
        return (C0XXD) C08FF.LIZ(C0XXD.class, str);
    }

    public C0XXD(String str, int i) {
    }
}
