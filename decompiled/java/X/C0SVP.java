package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SVP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SVP {
    public static final /* synthetic */ C0SVP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0SVP STYLE_FOLD_BUTTON;
    public static final C0SVP STYLE_NO_BUTTON;
    public static final C0SVP STYLE_UNFOLD_CAPSULE;
    public final int LL;

    public static InterfaceC2044707zh<C0SVP> getEntries() {
        return LLILLL;
    }

    static {
        C0SVP c0svp = new C0SVP("STYLE_FOLD_BUTTON", 0, 0);
        STYLE_FOLD_BUTTON = c0svp;
        C0SVP c0svp2 = new C0SVP("STYLE_UNFOLD_CAPSULE", 1, 1);
        STYLE_UNFOLD_CAPSULE = c0svp2;
        C0SVP c0svp3 = new C0SVP("STYLE_NO_BUTTON", 2, 2);
        STYLE_NO_BUTTON = c0svp3;
        C0SVP[] c0svpArr = {c0svp, c0svp2, c0svp3};
        LLILLJJLI = c0svpArr;
        LLILLL = new C2254308sP(c0svpArr);
    }

    public static C0SVP[] values() {
        return (C0SVP[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0SVP valueOf(String str) {
        return (C0SVP) C08FF.LIZ(C0SVP.class, str);
    }

    public C0SVP(String str, int i, int i2) {
        this.LL = i2;
    }
}
