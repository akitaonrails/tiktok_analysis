package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YTJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YTJ {
    public static final C0YTJ ADDED_AND_STARTED;
    public static final /* synthetic */ C0YTJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0YTJ STARTED;

    public static InterfaceC2044707zh<C0YTJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0YTJ c0ytj = new C0YTJ("STARTED", 0);
        STARTED = c0ytj;
        C0YTJ c0ytj2 = new C0YTJ("ADDED_AND_STARTED", 1);
        ADDED_AND_STARTED = c0ytj2;
        C0YTJ[] c0ytjArr = {c0ytj, c0ytj2};
        LL = c0ytjArr;
        LLILLJJLI = new C2254308sP(c0ytjArr);
    }

    public static C0YTJ[] values() {
        return (C0YTJ[]) LL.clone();
    }

    public static C0YTJ valueOf(String str) {
        return (C0YTJ) C08FF.LIZ(C0YTJ.class, str);
    }

    public C0YTJ(String str, int i) {
    }
}
