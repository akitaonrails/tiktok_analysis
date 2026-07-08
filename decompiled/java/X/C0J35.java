package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0J35, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J35 {
    public static final C0J35 BOTTOM;
    public static final /* synthetic */ C0J35[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0J35 TOP;

    public static InterfaceC2044707zh<C0J35> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0J35 c0j35 = new C0J35("BOTTOM", 0);
        BOTTOM = c0j35;
        C0J35 c0j352 = new C0J35("TOP", 1);
        TOP = c0j352;
        C0J35[] c0j35Arr = {c0j35, c0j352};
        LL = c0j35Arr;
        LLILLJJLI = new C2254308sP(c0j35Arr);
    }

    public static C0J35[] values() {
        return (C0J35[]) LL.clone();
    }

    public static C0J35 valueOf(String str) {
        return (C0J35) C08FF.LIZ(C0J35.class, str);
    }

    public C0J35(String str, int i) {
    }
}
