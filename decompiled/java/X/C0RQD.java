package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RQD, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RQD {
    public static final C0RQD IS_CLEAN;
    public static final C0RQD IS_LANDSCAPE_CLEAN;
    public static final C0RQD IS_NOT_CLEAN;
    public static final /* synthetic */ C0RQD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0RQD> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0RQD c0rqd = new C0RQD("IS_NOT_CLEAN", 0);
        IS_NOT_CLEAN = c0rqd;
        C0RQD c0rqd2 = new C0RQD("IS_CLEAN", 1);
        IS_CLEAN = c0rqd2;
        C0RQD c0rqd3 = new C0RQD("IS_LANDSCAPE_CLEAN", 2);
        IS_LANDSCAPE_CLEAN = c0rqd3;
        C0RQD[] c0rqdArr = {c0rqd, c0rqd2, c0rqd3};
        LL = c0rqdArr;
        LLILLJJLI = new C2254308sP(c0rqdArr);
    }

    public static C0RQD[] values() {
        return (C0RQD[]) LL.clone();
    }

    public static C0RQD valueOf(String str) {
        return (C0RQD) C08FF.LIZ(C0RQD.class, str);
    }

    public C0RQD(String str, int i) {
    }
}
