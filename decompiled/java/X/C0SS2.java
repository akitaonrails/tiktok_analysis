package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SS2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SS2 {
    public static final C0SS2 DOWN;
    public static final C0SS2 LEFT;
    public static final /* synthetic */ C0SS2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0SS2 RIGHT;
    public static final C0SS2 UNKNOWN;
    public static final C0SS2 UP;

    public static InterfaceC2044707zh<C0SS2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0SS2 c0ss2 = new C0SS2("UNKNOWN", 0);
        UNKNOWN = c0ss2;
        C0SS2 c0ss22 = new C0SS2("LEFT", 1);
        LEFT = c0ss22;
        C0SS2 c0ss23 = new C0SS2("RIGHT", 2);
        RIGHT = c0ss23;
        C0SS2 c0ss24 = new C0SS2("UP", 3);
        UP = c0ss24;
        C0SS2 c0ss25 = new C0SS2("DOWN", 4);
        DOWN = c0ss25;
        C0SS2[] c0ss2Arr = {c0ss2, c0ss22, c0ss23, c0ss24, c0ss25};
        LL = c0ss2Arr;
        LLILLJJLI = new C2254308sP(c0ss2Arr);
    }

    public static C0SS2[] values() {
        return (C0SS2[]) LL.clone();
    }

    public static C0SS2 valueOf(String str) {
        return (C0SS2) C08FF.LIZ(C0SS2.class, str);
    }

    public C0SS2(String str, int i) {
    }
}
