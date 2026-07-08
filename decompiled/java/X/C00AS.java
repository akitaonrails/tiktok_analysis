package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00AS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AS {
    public static final C00AS HIDE_TAB;
    public static final /* synthetic */ C00AS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00AS SHOW_TAB;
    public static final C00AS UNASSIGNED;

    public static InterfaceC2044707zh<C00AS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00AS c00as = new C00AS("UNASSIGNED", 0);
        UNASSIGNED = c00as;
        C00AS c00as2 = new C00AS("SHOW_TAB", 1);
        SHOW_TAB = c00as2;
        C00AS c00as3 = new C00AS("HIDE_TAB", 2);
        HIDE_TAB = c00as3;
        C00AS[] c00asArr = {c00as, c00as2, c00as3};
        LL = c00asArr;
        LLILLJJLI = new C2254308sP(c00asArr);
    }

    public static C00AS[] values() {
        return (C00AS[]) LL.clone();
    }

    public static C00AS valueOf(String str) {
        return (C00AS) C08FF.LIZ(C00AS.class, str);
    }

    public C00AS(String str, int i) {
    }
}
