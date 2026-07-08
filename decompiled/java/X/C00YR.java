package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00YR, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YR {
    public static final C00YR HIDE;
    public static final C00YR HIDE_ANIMATING;
    public static final /* synthetic */ C00YR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00YR MOVE_DOWN_AND_HIDE_ANIMATING;
    public static final C00YR MOVE_DOWN_AND_SHOWING_ANIMATING;
    public static final C00YR MOVE_DOWN_SHOWING;
    public static final C00YR SHOWING;
    public static final C00YR SHOWING_ANIMATING;
    public final int LL;

    public static InterfaceC2044707zh<C00YR> getEntries() {
        return LLILLL;
    }

    static {
        C00YR c00yr = new C00YR("MOVE_DOWN_AND_SHOWING_ANIMATING", 0, 0);
        MOVE_DOWN_AND_SHOWING_ANIMATING = c00yr;
        C00YR c00yr2 = new C00YR("MOVE_DOWN_SHOWING", 1, 1);
        MOVE_DOWN_SHOWING = c00yr2;
        C00YR c00yr3 = new C00YR("SHOWING_ANIMATING", 2, 2);
        SHOWING_ANIMATING = c00yr3;
        C00YR c00yr4 = new C00YR("SHOWING", 3, 3);
        SHOWING = c00yr4;
        C00YR c00yr5 = new C00YR("HIDE_ANIMATING", 4, 4);
        HIDE_ANIMATING = c00yr5;
        C00YR c00yr6 = new C00YR("MOVE_DOWN_AND_HIDE_ANIMATING", 5, 5);
        MOVE_DOWN_AND_HIDE_ANIMATING = c00yr6;
        C00YR c00yr7 = new C00YR("HIDE", 6, 6);
        HIDE = c00yr7;
        C00YR[] c00yrArr = {c00yr, c00yr2, c00yr3, c00yr4, c00yr5, c00yr6, c00yr7};
        LLILLJJLI = c00yrArr;
        LLILLL = new C2254308sP(c00yrArr);
    }

    public static C00YR[] values() {
        return (C00YR[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00YR valueOf(String str) {
        return (C00YR) C08FF.LIZ(C00YR.class, str);
    }

    public C00YR(String str, int i, int i2) {
        this.LL = i2;
    }
}
