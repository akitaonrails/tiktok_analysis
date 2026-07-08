package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HKH, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HKH {
    public static final C0HKH ERROR;
    public static final C0HKH GENERATION;
    public static final /* synthetic */ C0HKH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HKH NORMAL;

    public static InterfaceC2044707zh<C0HKH> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HKH c0hkh = new C0HKH("NORMAL", 0);
        NORMAL = c0hkh;
        C0HKH c0hkh2 = new C0HKH("GENERATION", 1);
        GENERATION = c0hkh2;
        C0HKH c0hkh3 = new C0HKH("ERROR", 2);
        ERROR = c0hkh3;
        C0HKH[] c0hkhArr = {c0hkh, c0hkh2, c0hkh3};
        LL = c0hkhArr;
        LLILLJJLI = new C2254308sP(c0hkhArr);
    }

    public static C0HKH[] values() {
        return (C0HKH[]) LL.clone();
    }

    public static C0HKH valueOf(String str) {
        return (C0HKH) C08FF.LIZ(C0HKH.class, str);
    }

    public C0HKH(String str, int i) {
    }
}
