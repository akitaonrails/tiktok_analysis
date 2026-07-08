package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XE2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XE2 {
    public static final C0XE2 FIRST_STEP;
    public static final C0XE2 LAST_STEP;
    public static final /* synthetic */ C0XE2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0XE2 NORMAL;

    public static InterfaceC2044707zh<C0XE2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0XE2 c0xe2 = new C0XE2("FIRST_STEP", 0);
        FIRST_STEP = c0xe2;
        C0XE2 c0xe22 = new C0XE2("NORMAL", 1);
        NORMAL = c0xe22;
        C0XE2 c0xe23 = new C0XE2("LAST_STEP", 2);
        LAST_STEP = c0xe23;
        C0XE2[] c0xe2Arr = {c0xe2, c0xe22, c0xe23};
        LL = c0xe2Arr;
        LLILLJJLI = new C2254308sP(c0xe2Arr);
    }

    public static C0XE2[] values() {
        return (C0XE2[]) LL.clone();
    }

    public static C0XE2 valueOf(String str) {
        return (C0XE2) C08FF.LIZ(C0XE2.class, str);
    }

    public C0XE2(String str, int i) {
    }
}
