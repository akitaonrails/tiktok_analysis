package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12KB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12KB {
    public static final C12KB BOTTOM;
    public static final C12KN Companion;
    public static final C12KB LEFT;
    public static final /* synthetic */ C12KB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C12KB RIGHT;
    public static final C12KB TOP;
    public final int LL;

    public static InterfaceC2044707zh<C12KB> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.12KN] */
    static {
        C12KB c12kb = new C12KB("LEFT", 0, 1);
        LEFT = c12kb;
        C12KB c12kb2 = new C12KB("TOP", 1, 2);
        TOP = c12kb2;
        C12KB c12kb3 = new C12KB("RIGHT", 2, 4);
        RIGHT = c12kb3;
        C12KB c12kb4 = new C12KB("BOTTOM", 3, 8);
        BOTTOM = c12kb4;
        C12KB[] c12kbArr = {c12kb, c12kb2, c12kb3, c12kb4};
        LLILLJJLI = c12kbArr;
        LLILLL = new C2254308sP(c12kbArr);
        Companion = new Object() { // from class: X.12KN
        };
    }

    public static C12KB[] values() {
        return (C12KB[]) LLILLJJLI.clone();
    }

    public final int getGravity() {
        return this.LL;
    }

    public static C12KB valueOf(String str) {
        return (C12KB) C08FF.LIZ(C12KB.class, str);
    }

    public C12KB(String str, int i, int i2) {
        this.LL = i2;
    }
}
