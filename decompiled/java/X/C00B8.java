package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00B8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00B8 {
    public static final C00B8 ANTICLOCKWISE;
    public static final C00B8 CLOCKWISE;
    public static final /* synthetic */ C00B8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C00B8> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00B8 c00b8 = new C00B8("CLOCKWISE", 0);
        CLOCKWISE = c00b8;
        C00B8 c00b82 = new C00B8("ANTICLOCKWISE", 1);
        ANTICLOCKWISE = c00b82;
        C00B8[] c00b8Arr = {c00b8, c00b82};
        LL = c00b8Arr;
        LLILLJJLI = new C2254308sP(c00b8Arr);
    }

    public static C00B8[] values() {
        return (C00B8[]) LL.clone();
    }

    public static C00B8 valueOf(String str) {
        return (C00B8) C08FF.LIZ(C00B8.class, str);
    }

    public C00B8(String str, int i) {
    }
}
