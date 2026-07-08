package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15BK, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15BK {
    public static final C15BK ADD;
    public static final /* synthetic */ C15BK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C15BK MOVE;
    public static final C15BK REMOVE;

    public static InterfaceC2044707zh<C15BK> getEntries() {
        return LLILLJJLI;
    }

    static {
        C15BK c15bk = new C15BK("ADD", 0);
        ADD = c15bk;
        C15BK c15bk2 = new C15BK("REMOVE", 1);
        REMOVE = c15bk2;
        C15BK c15bk3 = new C15BK("MOVE", 2);
        MOVE = c15bk3;
        C15BK[] c15bkArr = {c15bk, c15bk2, c15bk3};
        LL = c15bkArr;
        LLILLJJLI = new C2254308sP(c15bkArr);
    }

    public static C15BK[] values() {
        return (C15BK[]) LL.clone();
    }

    public static C15BK valueOf(String str) {
        return (C15BK) C08FF.LIZ(C15BK.class, str);
    }

    public C15BK(String str, int i) {
    }
}
