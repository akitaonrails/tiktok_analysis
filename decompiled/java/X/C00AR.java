package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00AR, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AR {
    public static final /* synthetic */ C00AR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00AR NORMAL_USERNAME;
    public static final C00AR ONLY_TITLE;

    public static InterfaceC2044707zh<C00AR> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00AR c00ar = new C00AR("NORMAL_USERNAME", 0);
        NORMAL_USERNAME = c00ar;
        C00AR c00ar2 = new C00AR("ONLY_TITLE", 1);
        ONLY_TITLE = c00ar2;
        C00AR[] c00arArr = {c00ar, c00ar2};
        LL = c00arArr;
        LLILLJJLI = new C2254308sP(c00arArr);
    }

    public static C00AR[] values() {
        return (C00AR[]) LL.clone();
    }

    public static C00AR valueOf(String str) {
        return (C00AR) C08FF.LIZ(C00AR.class, str);
    }

    public C00AR(String str, int i) {
    }
}
