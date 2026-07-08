package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FHM, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FHM {
    public static final C0FHM GONE;
    public static final C0FHM INVISIBLE;
    public static final /* synthetic */ C0FHM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0FHM VISIBLE;
    public final int LL;

    public static InterfaceC2044707zh<C0FHM> getEntries() {
        return LLILLL;
    }

    static {
        C0FHM c0fhm = new C0FHM("GONE", 0, 0);
        GONE = c0fhm;
        C0FHM c0fhm2 = new C0FHM("VISIBLE", 1, 2);
        VISIBLE = c0fhm2;
        C0FHM c0fhm3 = new C0FHM("INVISIBLE", 2, 3);
        INVISIBLE = c0fhm3;
        C0FHM[] c0fhmArr = {c0fhm, c0fhm2, c0fhm3};
        LLILLJJLI = c0fhmArr;
        LLILLL = new C2254308sP(c0fhmArr);
    }

    public static C0FHM[] values() {
        return (C0FHM[]) LLILLJJLI.clone();
    }

    public final boolean isVisible() {
        return this == VISIBLE;
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0FHM valueOf(String str) {
        return (C0FHM) C08FF.LIZ(C0FHM.class, str);
    }

    public C0FHM(String str, int i, int i2) {
        this.LL = i2;
    }
}
