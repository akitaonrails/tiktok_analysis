package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CGL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CGL {
    public static final C0CGL DM_DEFAULT_MULTIPLE;
    public static final /* synthetic */ C0CGL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0CGL SINGLE;

    public static InterfaceC2044707zh<C0CGL> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0CGL c0cgl = new C0CGL("SINGLE", 0);
        SINGLE = c0cgl;
        C0CGL c0cgl2 = new C0CGL("DM_DEFAULT_MULTIPLE", 1);
        DM_DEFAULT_MULTIPLE = c0cgl2;
        C0CGL[] c0cglArr = {c0cgl, c0cgl2};
        LL = c0cglArr;
        LLILLJJLI = new C2254308sP(c0cglArr);
    }

    public static C0CGL[] values() {
        return (C0CGL[]) LL.clone();
    }

    public static C0CGL valueOf(String str) {
        return (C0CGL) C08FF.LIZ(C0CGL.class, str);
    }

    public C0CGL(String str, int i) {
    }
}
