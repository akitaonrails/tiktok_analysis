package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BL {
    public static final /* synthetic */ C00BL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00BL SEA_PDP;
    public final String LL = "pdp_sea";

    public static InterfaceC2044707zh<C00BL> getEntries() {
        return LLILLL;
    }

    static {
        C00BL c00bl = new C00BL();
        SEA_PDP = c00bl;
        C00BL[] c00blArr = {c00bl};
        LLILLJJLI = c00blArr;
        LLILLL = new C2254308sP(c00blArr);
    }

    public static C00BL[] values() {
        return (C00BL[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C00BL valueOf(String str) {
        return (C00BL) C08FF.LIZ(C00BL.class, str);
    }
}
