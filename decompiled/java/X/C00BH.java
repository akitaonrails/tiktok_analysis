package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BH {
    public static final /* synthetic */ C00BH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00BH TERMINAL_BIZ_TYPE_CHANGE;
    public final int LL = 1001;

    public static InterfaceC2044707zh<C00BH> getEntries() {
        return LLILLL;
    }

    static {
        C00BH c00bh = new C00BH();
        TERMINAL_BIZ_TYPE_CHANGE = c00bh;
        C00BH[] c00bhArr = {c00bh};
        LLILLJJLI = c00bhArr;
        LLILLL = new C2254308sP(c00bhArr);
    }

    public static C00BH[] values() {
        return (C00BH[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C00BH valueOf(String str) {
        return (C00BH) C08FF.LIZ(C00BH.class, str);
    }
}
