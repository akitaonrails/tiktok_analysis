package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KX7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KX7 {
    public static final C0KX7 FILL_REMAINING;
    public static final C0KX7 FIXED;
    public static final /* synthetic */ C0KX7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0KX7> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0KX7 c0kx7 = new C0KX7("FIXED", 0);
        FIXED = c0kx7;
        C0KX7 c0kx72 = new C0KX7("FILL_REMAINING", 1);
        FILL_REMAINING = c0kx72;
        C0KX7[] c0kx7Arr = {c0kx7, c0kx72};
        LL = c0kx7Arr;
        LLILLJJLI = new C2254308sP(c0kx7Arr);
    }

    public static C0KX7[] values() {
        return (C0KX7[]) LL.clone();
    }

    public static C0KX7 valueOf(String str) {
        return (C0KX7) C08FF.LIZ(C0KX7.class, str);
    }

    public C0KX7(String str, int i) {
    }
}
