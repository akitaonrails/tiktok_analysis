package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00IU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IU {
    public static final C00IU EDITPAGE;
    public static final /* synthetic */ C00IU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00IU RECORDPAGE;
    public static final C00IU REPLACEMUSICPAGE;

    public static InterfaceC2044707zh<C00IU> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00IU c00iu = new C00IU("RECORDPAGE", 0);
        RECORDPAGE = c00iu;
        C00IU c00iu2 = new C00IU("EDITPAGE", 1);
        EDITPAGE = c00iu2;
        C00IU c00iu3 = new C00IU("REPLACEMUSICPAGE", 2);
        REPLACEMUSICPAGE = c00iu3;
        C00IU[] c00iuArr = {c00iu, c00iu2, c00iu3};
        LL = c00iuArr;
        LLILLJJLI = new C2254308sP(c00iuArr);
    }

    public static C00IU[] values() {
        return (C00IU[]) LL.clone();
    }

    public static C00IU valueOf(String str) {
        return (C00IU) C08FF.LIZ(C00IU.class, str);
    }

    public C00IU(String str, int i) {
    }
}
