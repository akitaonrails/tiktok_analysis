package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UVH, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UVH {
    public static final C0UVH DISMISS;
    public static final /* synthetic */ C0UVH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0UVH SCROLLING;
    public static final C0UVH SHOWING;

    public static InterfaceC2044707zh<C0UVH> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0UVH c0uvh = new C0UVH("SHOWING", 0);
        SHOWING = c0uvh;
        C0UVH c0uvh2 = new C0UVH("SCROLLING", 1);
        SCROLLING = c0uvh2;
        C0UVH c0uvh3 = new C0UVH("DISMISS", 2);
        DISMISS = c0uvh3;
        C0UVH[] c0uvhArr = {c0uvh, c0uvh2, c0uvh3};
        LL = c0uvhArr;
        LLILLJJLI = new C2254308sP(c0uvhArr);
    }

    public static C0UVH[] values() {
        return (C0UVH[]) LL.clone();
    }

    public static C0UVH valueOf(String str) {
        return (C0UVH) C08FF.LIZ(C0UVH.class, str);
    }

    public C0UVH(String str, int i) {
    }
}
