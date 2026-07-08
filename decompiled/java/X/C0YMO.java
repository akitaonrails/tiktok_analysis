package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YMO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YMO {
    public static final C0YMO HEART_BEAT;
    public static final C0YMO IM_BIZ;
    public static final /* synthetic */ C0YMO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0YMO NET;
    public static final C0YMO WS;

    public static InterfaceC2044707zh<C0YMO> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0YMO c0ymo = new C0YMO("HEART_BEAT", 0);
        HEART_BEAT = c0ymo;
        C0YMO c0ymo2 = new C0YMO("IM_BIZ", 1);
        IM_BIZ = c0ymo2;
        C0YMO c0ymo3 = new C0YMO("NET", 2);
        NET = c0ymo3;
        C0YMO c0ymo4 = new C0YMO("WS", 3);
        WS = c0ymo4;
        C0YMO[] c0ymoArr = {c0ymo, c0ymo2, c0ymo3, c0ymo4};
        LL = c0ymoArr;
        LLILLJJLI = new C2254308sP(c0ymoArr);
    }

    public static C0YMO[] values() {
        return (C0YMO[]) LL.clone();
    }

    public static C0YMO valueOf(String str) {
        return (C0YMO) C08FF.LIZ(C0YMO.class, str);
    }

    public C0YMO(String str, int i) {
    }
}
