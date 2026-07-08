package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008P, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008P {
    public static final C008P CAN_HOLD_MORE;
    public static final C008P EXCEEDS;
    public static final C008P JUST_FULL;
    public static final /* synthetic */ C008P[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C008P> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008P c008p = new C008P("CAN_HOLD_MORE", 0);
        CAN_HOLD_MORE = c008p;
        C008P c008p2 = new C008P("JUST_FULL", 1);
        JUST_FULL = c008p2;
        C008P c008p3 = new C008P("EXCEEDS", 2);
        EXCEEDS = c008p3;
        C008P[] c008pArr = {c008p, c008p2, c008p3};
        LL = c008pArr;
        LLILLJJLI = new C2254308sP(c008pArr);
    }

    public static C008P[] values() {
        return (C008P[]) LL.clone();
    }

    public static C008P valueOf(String str) {
        return (C008P) C08FF.LIZ(C008P.class, str);
    }

    public C008P(String str, int i) {
    }
}
