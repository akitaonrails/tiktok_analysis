package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NX5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NX5 {
    public static final /* synthetic */ C0NX5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0NX5 STATE_DEFAULT;
    public static final C0NX5 STATE_TO_VERIFY;
    public static final C0NX5 STATE_VERIFIED;
    public static final C0NX5 STATE_VERIFYING;

    public static InterfaceC2044707zh<C0NX5> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NX5 c0nx5 = new C0NX5("STATE_DEFAULT", 0);
        STATE_DEFAULT = c0nx5;
        C0NX5 c0nx52 = new C0NX5("STATE_TO_VERIFY", 1);
        STATE_TO_VERIFY = c0nx52;
        C0NX5 c0nx53 = new C0NX5("STATE_VERIFYING", 2);
        STATE_VERIFYING = c0nx53;
        C0NX5 c0nx54 = new C0NX5("STATE_VERIFIED", 3);
        STATE_VERIFIED = c0nx54;
        C0NX5[] c0nx5Arr = {c0nx5, c0nx52, c0nx53, c0nx54};
        LL = c0nx5Arr;
        LLILLJJLI = new C2254308sP(c0nx5Arr);
    }

    public static C0NX5[] values() {
        return (C0NX5[]) LL.clone();
    }

    public static C0NX5 valueOf(String str) {
        return (C0NX5) C08FF.LIZ(C0NX5.class, str);
    }

    public C0NX5(String str, int i) {
    }
}
