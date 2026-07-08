package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00B4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00B4 {
    public static final /* synthetic */ C00B4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00B4 SHOW;
    public final String LL = "show";

    public static InterfaceC2044707zh<C00B4> getEntries() {
        return LLILLL;
    }

    static {
        C00B4 c00b4 = new C00B4();
        SHOW = c00b4;
        C00B4[] c00b4Arr = {c00b4};
        LLILLJJLI = c00b4Arr;
        LLILLL = new C2254308sP(c00b4Arr);
    }

    public static C00B4[] values() {
        return (C00B4[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C00B4 valueOf(String str) {
        return (C00B4) C08FF.LIZ(C00B4.class, str);
    }
}
