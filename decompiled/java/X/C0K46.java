package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0K46, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K46 {
    public static final C0K46 COMMENT;
    public static final /* synthetic */ C0K46[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0K46 POST;
    public static final C0K46 REPLY;

    public static InterfaceC2044707zh<C0K46> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0K46 c0k46 = new C0K46("COMMENT", 0);
        COMMENT = c0k46;
        C0K46 c0k462 = new C0K46("POST", 1);
        POST = c0k462;
        C0K46 c0k463 = new C0K46("REPLY", 2);
        REPLY = c0k463;
        C0K46[] c0k46Arr = {c0k46, c0k462, c0k463};
        LL = c0k46Arr;
        LLILLJJLI = new C2254308sP(c0k46Arr);
    }

    public static C0K46[] values() {
        return (C0K46[]) LL.clone();
    }

    public static C0K46 valueOf(String str) {
        return (C0K46) C08FF.LIZ(C0K46.class, str);
    }

    public C0K46(String str, int i) {
    }
}
