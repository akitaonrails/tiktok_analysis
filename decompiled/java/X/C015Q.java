package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.015Q, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C015Q {
    public static final C015Q HORIZONTAL;
    public static final /* synthetic */ C015Q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C015Q VERTICAL;

    public static InterfaceC2044707zh<C015Q> getEntries() {
        return LLILLJJLI;
    }

    static {
        C015Q c015q = new C015Q("VERTICAL", 0);
        VERTICAL = c015q;
        C015Q c015q2 = new C015Q("HORIZONTAL", 1);
        HORIZONTAL = c015q2;
        C015Q[] c015qArr = {c015q, c015q2};
        LL = c015qArr;
        LLILLJJLI = new C2254308sP(c015qArr);
    }

    public static C015Q[] values() {
        return (C015Q[]) LL.clone();
    }

    public static C015Q valueOf(String str) {
        return (C015Q) C08FF.LIZ(C015Q.class, str);
    }

    public C015Q(String str, int i) {
    }
}
