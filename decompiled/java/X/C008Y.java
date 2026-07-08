package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008Y, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008Y {
    public static final C008Y INTERRUPT_AUDIO;
    public static final C008Y INTERRUPT_BACKGROUND;
    public static final /* synthetic */ C008Y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C008Y USER_CANCEL;
    public static final C008Y USER_FINISH;

    public static InterfaceC2044707zh<C008Y> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008Y c008y = new C008Y("USER_FINISH", 0);
        USER_FINISH = c008y;
        C008Y c008y2 = new C008Y("USER_CANCEL", 1);
        USER_CANCEL = c008y2;
        C008Y c008y3 = new C008Y("INTERRUPT_BACKGROUND", 2);
        INTERRUPT_BACKGROUND = c008y3;
        C008Y c008y4 = new C008Y("INTERRUPT_AUDIO", 3);
        INTERRUPT_AUDIO = c008y4;
        C008Y[] c008yArr = {c008y, c008y2, c008y3, c008y4};
        LL = c008yArr;
        LLILLJJLI = new C2254308sP(c008yArr);
    }

    public static C008Y[] values() {
        return (C008Y[]) LL.clone();
    }

    public static C008Y valueOf(String str) {
        return (C008Y) C08FF.LIZ(C008Y.class, str);
    }

    public C008Y(String str, int i) {
    }
}
