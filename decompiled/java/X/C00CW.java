package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CW {
    public static final /* synthetic */ C00CW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00CW STYLE_ACTION;
    public static final C00CW STYLE_GREY;
    public static final C00CW STYLE_NORMAL;

    public static InterfaceC2044707zh<C00CW> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00CW c00cw = new C00CW("STYLE_ACTION", 0);
        STYLE_ACTION = c00cw;
        C00CW c00cw2 = new C00CW("STYLE_NORMAL", 1);
        STYLE_NORMAL = c00cw2;
        C00CW c00cw3 = new C00CW("STYLE_GREY", 2);
        STYLE_GREY = c00cw3;
        C00CW[] c00cwArr = {c00cw, c00cw2, c00cw3};
        LL = c00cwArr;
        LLILLJJLI = new C2254308sP(c00cwArr);
    }

    public static C00CW[] values() {
        return (C00CW[]) LL.clone();
    }

    public static C00CW valueOf(String str) {
        return (C00CW) C08FF.LIZ(C00CW.class, str);
    }

    public C00CW(String str, int i) {
    }
}
