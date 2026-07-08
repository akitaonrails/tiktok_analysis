package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EE1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EE1 {
    public static final C0EE1 DOWN;
    public static final /* synthetic */ C0EE1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0EE1 UP;

    public static InterfaceC2044707zh<C0EE1> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0EE1 c0ee1 = new C0EE1("UP", 0);
        UP = c0ee1;
        C0EE1 c0ee12 = new C0EE1("DOWN", 1);
        DOWN = c0ee12;
        C0EE1[] c0ee1Arr = {c0ee1, c0ee12};
        LL = c0ee1Arr;
        LLILLJJLI = new C2254308sP(c0ee1Arr);
    }

    public static C0EE1[] values() {
        return (C0EE1[]) LL.clone();
    }

    public static C0EE1 valueOf(String str) {
        return (C0EE1) C08FF.LIZ(C0EE1.class, str);
    }

    public C0EE1(String str, int i) {
    }
}
