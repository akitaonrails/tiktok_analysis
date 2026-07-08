package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1ABV, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ABV {
    public static final C1ABV HIDE;
    public static final C1ABV IDLE;
    public static final /* synthetic */ C1ABV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1ABV SHOW;
    public static final C1ABV STOP;

    public static InterfaceC2044707zh<C1ABV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1ABV c1abv = new C1ABV("IDLE", 0);
        IDLE = c1abv;
        C1ABV c1abv2 = new C1ABV("SHOW", 1);
        SHOW = c1abv2;
        C1ABV c1abv3 = new C1ABV("HIDE", 2);
        HIDE = c1abv3;
        C1ABV c1abv4 = new C1ABV("STOP", 3);
        STOP = c1abv4;
        C1ABV[] c1abvArr = {c1abv, c1abv2, c1abv3, c1abv4};
        LL = c1abvArr;
        LLILLJJLI = new C2254308sP(c1abvArr);
    }

    public static C1ABV[] values() {
        return (C1ABV[]) LL.clone();
    }

    public static C1ABV valueOf(String str) {
        return (C1ABV) C08FF.LIZ(C1ABV.class, str);
    }

    public C1ABV(String str, int i) {
    }
}
