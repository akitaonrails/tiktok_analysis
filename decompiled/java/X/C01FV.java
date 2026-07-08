package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01FV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01FV {
    public static final C01FV ANCHOR;
    public static final C01FV AUDIENCE;
    public static final C01FV GUEST;
    public static final /* synthetic */ C01FV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C01FV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C01FV c01fv = new C01FV("ANCHOR", 0);
        ANCHOR = c01fv;
        C01FV c01fv2 = new C01FV("GUEST", 1);
        GUEST = c01fv2;
        C01FV c01fv3 = new C01FV("AUDIENCE", 2);
        AUDIENCE = c01fv3;
        C01FV[] c01fvArr = {c01fv, c01fv2, c01fv3};
        LL = c01fvArr;
        LLILLJJLI = new C2254308sP(c01fvArr);
    }

    public static C01FV[] values() {
        return (C01FV[]) LL.clone();
    }

    public static C01FV valueOf(String str) {
        return (C01FV) C08FF.LIZ(C01FV.class, str);
    }

    public C01FV(String str, int i) {
    }
}
