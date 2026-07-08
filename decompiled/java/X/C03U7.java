package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03U7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03U7 {
    public static final C03U7 CLOSE_BY_USER;
    public static final /* synthetic */ C03U7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C03U7 QUIT_NATIVE_DIALOG;
    public static final C03U7 QUIT_RETENTION_DIALOG;
    public static final C03U7 UNKNOWN;

    public static InterfaceC2044707zh<C03U7> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03U7 c03u7 = new C03U7("CLOSE_BY_USER", 0);
        CLOSE_BY_USER = c03u7;
        C03U7 c03u72 = new C03U7("QUIT_RETENTION_DIALOG", 1);
        QUIT_RETENTION_DIALOG = c03u72;
        C03U7 c03u73 = new C03U7("QUIT_NATIVE_DIALOG", 2);
        QUIT_NATIVE_DIALOG = c03u73;
        C03U7 c03u74 = new C03U7("UNKNOWN", 3);
        UNKNOWN = c03u74;
        C03U7[] c03u7Arr = {c03u7, c03u72, c03u73, c03u74};
        LL = c03u7Arr;
        LLILLJJLI = new C2254308sP(c03u7Arr);
    }

    public static C03U7[] values() {
        return (C03U7[]) LL.clone();
    }

    public static C03U7 valueOf(String str) {
        return (C03U7) C08FF.LIZ(C03U7.class, str);
    }

    public C03U7(String str, int i) {
    }
}
