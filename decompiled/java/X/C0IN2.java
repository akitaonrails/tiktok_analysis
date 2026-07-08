package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IN2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IN2 {
    public static final C0IN2 EMPTY;
    public static final /* synthetic */ C0IN2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0IN2 OVAL;
    public static final C0IN2 RECTANGLE;

    public static InterfaceC2044707zh<C0IN2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0IN2 c0in2 = new C0IN2("EMPTY", 0);
        EMPTY = c0in2;
        C0IN2 c0in22 = new C0IN2("OVAL", 1);
        OVAL = c0in22;
        C0IN2 c0in23 = new C0IN2("RECTANGLE", 2);
        RECTANGLE = c0in23;
        C0IN2[] c0in2Arr = {c0in2, c0in22, c0in23};
        LL = c0in2Arr;
        LLILLJJLI = new C2254308sP(c0in2Arr);
    }

    public static C0IN2[] values() {
        return (C0IN2[]) LL.clone();
    }

    public static C0IN2 valueOf(String str) {
        return (C0IN2) C08FF.LIZ(C0IN2.class, str);
    }

    public C0IN2(String str, int i) {
    }
}
