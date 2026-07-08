package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15VY, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15VY {
    public static final C15VY DOWN;
    public static final /* synthetic */ C15VY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C15VY UP;

    public static InterfaceC2044707zh<C15VY> getEntries() {
        return LLILLJJLI;
    }

    static {
        C15VY c15vy = new C15VY("DOWN", 0);
        DOWN = c15vy;
        C15VY c15vy2 = new C15VY("UP", 1);
        UP = c15vy2;
        C15VY[] c15vyArr = {c15vy, c15vy2};
        LL = c15vyArr;
        LLILLJJLI = new C2254308sP(c15vyArr);
    }

    public static C15VY[] values() {
        return (C15VY[]) LL.clone();
    }

    public static C15VY valueOf(String str) {
        return (C15VY) C08FF.LIZ(C15VY.class, str);
    }

    public C15VY(String str, int i) {
    }
}
