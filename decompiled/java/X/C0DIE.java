package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DIE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DIE {
    public static final C0DIE APPEND;
    public static final C0DIE COMPLETE_CHANGE;
    public static final C0DIE IDENTICAL;
    public static final /* synthetic */ C0DIE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0DIE TAIL_REPLACE;

    public static InterfaceC2044707zh<C0DIE> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0DIE c0die = new C0DIE("IDENTICAL", 0);
        IDENTICAL = c0die;
        C0DIE c0die2 = new C0DIE("APPEND", 1);
        APPEND = c0die2;
        C0DIE c0die3 = new C0DIE("TAIL_REPLACE", 2);
        TAIL_REPLACE = c0die3;
        C0DIE c0die4 = new C0DIE("COMPLETE_CHANGE", 3);
        COMPLETE_CHANGE = c0die4;
        C0DIE[] c0dieArr = {c0die, c0die2, c0die3, c0die4};
        LL = c0dieArr;
        LLILLJJLI = new C2254308sP(c0dieArr);
    }

    public static C0DIE[] values() {
        return (C0DIE[]) LL.clone();
    }

    public static C0DIE valueOf(String str) {
        return (C0DIE) C08FF.LIZ(C0DIE.class, str);
    }

    public C0DIE(String str, int i) {
    }
}
