package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.067L, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C067L {
    public static final C067L BUSINESS;
    public static final C067L GROUP;
    public static final /* synthetic */ C067L[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C067L SINGLE;

    public static InterfaceC2044707zh<C067L> getEntries() {
        return LLILLJJLI;
    }

    static {
        C067L c067l = new C067L("SINGLE", 0);
        SINGLE = c067l;
        C067L c067l2 = new C067L("BUSINESS", 1);
        BUSINESS = c067l2;
        C067L c067l3 = new C067L("GROUP", 2);
        GROUP = c067l3;
        C067L[] c067lArr = {c067l, c067l2, c067l3};
        LL = c067lArr;
        LLILLJJLI = new C2254308sP(c067lArr);
    }

    public static C067L[] values() {
        return (C067L[]) LL.clone();
    }

    public static C067L valueOf(String str) {
        return (C067L) C08FF.LIZ(C067L.class, str);
    }

    public C067L(String str, int i) {
    }
}
