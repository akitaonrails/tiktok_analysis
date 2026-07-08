package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LEP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LEP {
    public static final C0LEP CLOSE_GONE;
    public static final C0LEP CLOSE_VISIBLE;
    public static final C0LEP CLOSE_VISIBLE_15S;
    public static final C0LEP CLOSE_VISIBLE_5S;
    public static final /* synthetic */ C0LEP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0LEP OTHER;
    public final int LL;

    public static InterfaceC2044707zh<C0LEP> getEntries() {
        return LLILLL;
    }

    static {
        C0LEP c0lep = new C0LEP("OTHER", 0, 0);
        OTHER = c0lep;
        C0LEP c0lep2 = new C0LEP("CLOSE_GONE", 1, 1);
        CLOSE_GONE = c0lep2;
        C0LEP c0lep3 = new C0LEP("CLOSE_VISIBLE", 2, 2);
        CLOSE_VISIBLE = c0lep3;
        C0LEP c0lep4 = new C0LEP("CLOSE_VISIBLE_5S", 3, 3);
        CLOSE_VISIBLE_5S = c0lep4;
        C0LEP c0lep5 = new C0LEP("CLOSE_VISIBLE_15S", 4, 4);
        CLOSE_VISIBLE_15S = c0lep5;
        C0LEP[] c0lepArr = {c0lep, c0lep2, c0lep3, c0lep4, c0lep5};
        LLILLJJLI = c0lepArr;
        LLILLL = new C2254308sP(c0lepArr);
    }

    public static C0LEP[] values() {
        return (C0LEP[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0LEP valueOf(String str) {
        return (C0LEP) C08FF.LIZ(C0LEP.class, str);
    }

    public C0LEP(String str, int i, int i2) {
        this.LL = i2;
    }
}
