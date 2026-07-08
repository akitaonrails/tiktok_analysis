package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CL2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CL2 {
    public static final C0CL2 FOLDABLE;
    public static final /* synthetic */ C0CL2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0CL2 TABLET;
    public static final C0CL2 UG_NEW;

    public static InterfaceC2044707zh<C0CL2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0CL2 c0cl2 = new C0CL2("UG_NEW", 0);
        UG_NEW = c0cl2;
        C0CL2 c0cl22 = new C0CL2("TABLET", 1);
        TABLET = c0cl22;
        C0CL2 c0cl23 = new C0CL2("FOLDABLE", 2);
        FOLDABLE = c0cl23;
        C0CL2[] c0cl2Arr = {c0cl2, c0cl22, c0cl23};
        LL = c0cl2Arr;
        LLILLJJLI = new C2254308sP(c0cl2Arr);
    }

    public static C0CL2[] values() {
        return (C0CL2[]) LL.clone();
    }

    public static C0CL2 valueOf(String str) {
        return (C0CL2) C08FF.LIZ(C0CL2.class, str);
    }

    public C0CL2(String str, int i) {
    }
}
