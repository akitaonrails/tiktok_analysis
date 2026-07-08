package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00F5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00F5 {
    public static final C00F5 CONSUME_TYPE;
    public static final C00F5 CREATE_TYPE;
    public static final /* synthetic */ C00F5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C00F5> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00F5 c00f5 = new C00F5("CONSUME_TYPE", 0);
        CONSUME_TYPE = c00f5;
        C00F5 c00f52 = new C00F5("CREATE_TYPE", 1);
        CREATE_TYPE = c00f52;
        C00F5[] c00f5Arr = {c00f5, c00f52};
        LL = c00f5Arr;
        LLILLJJLI = new C2254308sP(c00f5Arr);
    }

    public static C00F5[] values() {
        return (C00F5[]) LL.clone();
    }

    public static C00F5 valueOf(String str) {
        return (C00F5) C08FF.LIZ(C00F5.class, str);
    }

    public C00F5(String str, int i) {
    }
}
