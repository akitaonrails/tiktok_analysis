package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0H73, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H73 {
    public static final /* synthetic */ C0H73[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0H73 Loading;
    public static final C0H73 Normal;
    public static final C0H73 Retry;

    public static InterfaceC2044707zh<C0H73> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0H73 c0h73 = new C0H73("Normal", 0);
        Normal = c0h73;
        C0H73 c0h732 = new C0H73("Loading", 1);
        Loading = c0h732;
        C0H73 c0h733 = new C0H73("Retry", 2);
        Retry = c0h733;
        C0H73[] c0h73Arr = {c0h73, c0h732, c0h733};
        LL = c0h73Arr;
        LLILLJJLI = new C2254308sP(c0h73Arr);
    }

    public static C0H73[] values() {
        return (C0H73[]) LL.clone();
    }

    public static C0H73 valueOf(String str) {
        return (C0H73) C08FF.LIZ(C0H73.class, str);
    }

    public C0H73(String str, int i) {
    }
}
