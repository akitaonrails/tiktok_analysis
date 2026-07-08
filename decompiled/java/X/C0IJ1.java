package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IJ1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IJ1 {
    public static final C0IJ1 LIGHTNESS;
    public static final /* synthetic */ C0IJ1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0IJ1 RENDER_VIEW;

    public static InterfaceC2044707zh<C0IJ1> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0IJ1 c0ij1 = new C0IJ1("LIGHTNESS", 0);
        LIGHTNESS = c0ij1;
        C0IJ1 c0ij12 = new C0IJ1("RENDER_VIEW", 1);
        RENDER_VIEW = c0ij12;
        C0IJ1[] c0ij1Arr = {c0ij1, c0ij12};
        LL = c0ij1Arr;
        LLILLJJLI = new C2254308sP(c0ij1Arr);
    }

    public static C0IJ1[] values() {
        return (C0IJ1[]) LL.clone();
    }

    public static C0IJ1 valueOf(String str) {
        return (C0IJ1) C08FF.LIZ(C0IJ1.class, str);
    }

    public C0IJ1(String str, int i) {
    }
}
