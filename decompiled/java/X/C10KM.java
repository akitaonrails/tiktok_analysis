package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10KM, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10KM {
    public static final C10KM FLOAT;
    public static final /* synthetic */ C10KM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C10KM STATIC;

    public static InterfaceC2044707zh<C10KM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C10KM c10km = new C10KM("STATIC", 0);
        STATIC = c10km;
        C10KM c10km2 = new C10KM("FLOAT", 1);
        FLOAT = c10km2;
        C10KM[] c10kmArr = {c10km, c10km2};
        LL = c10kmArr;
        LLILLJJLI = new C2254308sP(c10kmArr);
    }

    public static C10KM[] values() {
        return (C10KM[]) LL.clone();
    }

    public static C10KM valueOf(String str) {
        return (C10KM) C08FF.LIZ(C10KM.class, str);
    }

    public C10KM(String str, int i) {
    }
}
