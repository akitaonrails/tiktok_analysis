package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00GL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GL {
    public static final C00GL HIGH;
    public static final /* synthetic */ C00GL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00GL LOW;
    public static final C00GL NORMAL;

    public static InterfaceC2044707zh<C00GL> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00GL c00gl = new C00GL("LOW", 0);
        LOW = c00gl;
        C00GL c00gl2 = new C00GL("NORMAL", 1);
        NORMAL = c00gl2;
        C00GL c00gl3 = new C00GL("HIGH", 2);
        HIGH = c00gl3;
        C00GL[] c00glArr = {c00gl, c00gl2, c00gl3};
        LL = c00glArr;
        LLILLJJLI = new C2254308sP(c00glArr);
    }

    public static C00GL[] values() {
        return (C00GL[]) LL.clone();
    }

    public static C00GL valueOf(String str) {
        return (C00GL) C08FF.LIZ(C00GL.class, str);
    }

    public C00GL(String str, int i) {
    }
}
