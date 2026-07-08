package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00IT, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IT {
    public static final /* synthetic */ C00IT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00IT Navi;
    public static final C00IT ViewInst;

    public static InterfaceC2044707zh<C00IT> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00IT c00it = new C00IT("Navi", 0);
        Navi = c00it;
        C00IT c00it2 = new C00IT("ViewInst", 1);
        ViewInst = c00it2;
        C00IT[] c00itArr = {c00it, c00it2};
        LL = c00itArr;
        LLILLJJLI = new C2254308sP(c00itArr);
    }

    public static C00IT[] values() {
        return (C00IT[]) LL.clone();
    }

    public static C00IT valueOf(String str) {
        return (C00IT) C08FF.LIZ(C00IT.class, str);
    }

    public C00IT(String str, int i) {
    }
}
