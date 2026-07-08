package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00IV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IV {
    public static final C00IV EDITPAGE;
    public static final /* synthetic */ C00IV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00IV RECORDPAGE;
    public static final C00IV REPLACEMUSICPAGE;

    public static InterfaceC2044707zh<C00IV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00IV c00iv = new C00IV("RECORDPAGE", 0);
        RECORDPAGE = c00iv;
        C00IV c00iv2 = new C00IV("EDITPAGE", 1);
        EDITPAGE = c00iv2;
        C00IV c00iv3 = new C00IV("REPLACEMUSICPAGE", 2);
        REPLACEMUSICPAGE = c00iv3;
        C00IV[] c00ivArr = {c00iv, c00iv2, c00iv3};
        LL = c00ivArr;
        LLILLJJLI = new C2254308sP(c00ivArr);
    }

    public static C00IV[] values() {
        return (C00IV[]) LL.clone();
    }

    public static C00IV valueOf(String str) {
        return (C00IV) C08FF.LIZ(C00IV.class, str);
    }

    public C00IV(String str, int i) {
    }
}
