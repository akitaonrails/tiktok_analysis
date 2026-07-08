package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BG {
    public static final C00BG CTA;
    public static final /* synthetic */ C00BG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00BG NAV_BAR;

    public static InterfaceC2044707zh<C00BG> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00BG c00bg = new C00BG("CTA", 0);
        CTA = c00bg;
        C00BG c00bg2 = new C00BG("NAV_BAR", 1);
        NAV_BAR = c00bg2;
        C00BG[] c00bgArr = {c00bg, c00bg2};
        LL = c00bgArr;
        LLILLJJLI = new C2254308sP(c00bgArr);
    }

    public static C00BG[] values() {
        return (C00BG[]) LL.clone();
    }

    public static C00BG valueOf(String str) {
        return (C00BG) C08FF.LIZ(C00BG.class, str);
    }

    public C00BG(String str, int i) {
    }
}
