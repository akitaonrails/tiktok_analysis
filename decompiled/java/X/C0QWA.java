package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QWA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QWA {
    public static final C0QWA INPUT_CHANGE;
    public static final /* synthetic */ C0QWA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0QWA OTHER;
    public static final C0QWA OUT_ENTER;
    public static final C0QWA RETURN;
    public static final C0QWA SEARCH;

    public static InterfaceC2044707zh<C0QWA> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QWA c0qwa = new C0QWA("OUT_ENTER", 0);
        OUT_ENTER = c0qwa;
        C0QWA c0qwa2 = new C0QWA("RETURN", 1);
        RETURN = c0qwa2;
        C0QWA c0qwa3 = new C0QWA("INPUT_CHANGE", 2);
        INPUT_CHANGE = c0qwa3;
        C0QWA c0qwa4 = new C0QWA("SEARCH", 3);
        SEARCH = c0qwa4;
        C0QWA c0qwa5 = new C0QWA("OTHER", 4);
        OTHER = c0qwa5;
        C0QWA[] c0qwaArr = {c0qwa, c0qwa2, c0qwa3, c0qwa4, c0qwa5};
        LL = c0qwaArr;
        LLILLJJLI = new C2254308sP(c0qwaArr);
    }

    public static C0QWA[] values() {
        return (C0QWA[]) LL.clone();
    }

    public static C0QWA valueOf(String str) {
        return (C0QWA) C08FF.LIZ(C0QWA.class, str);
    }

    public C0QWA(String str, int i) {
    }
}
