package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CE {
    public static final C00CE IS_DIRECT_LIVE;
    public static final /* synthetic */ C00CE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 1;

    public static InterfaceC2044707zh<C00CE> getEntries() {
        return LLILLL;
    }

    static {
        C00CE c00ce = new C00CE();
        IS_DIRECT_LIVE = c00ce;
        C00CE[] c00ceArr = {c00ce};
        LLILLJJLI = c00ceArr;
        LLILLL = new C2254308sP(c00ceArr);
    }

    public static C00CE[] values() {
        return (C00CE[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00CE valueOf(String str) {
        return (C00CE) C08FF.LIZ(C00CE.class, str);
    }
}
