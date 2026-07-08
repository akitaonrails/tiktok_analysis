package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X5T, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X5T {
    public static final C0X5T AJAX_HOOK;
    public static final /* synthetic */ C0X5T[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0X5T RESOURCE_INTERCEPT;

    public static InterfaceC2044707zh<C0X5T> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0X5T c0x5t = new C0X5T("RESOURCE_INTERCEPT", 0);
        RESOURCE_INTERCEPT = c0x5t;
        C0X5T c0x5t2 = new C0X5T("AJAX_HOOK", 1);
        AJAX_HOOK = c0x5t2;
        C0X5T[] c0x5tArr = {c0x5t, c0x5t2};
        LL = c0x5tArr;
        LLILLJJLI = new C2254308sP(c0x5tArr);
    }

    public static C0X5T[] values() {
        return (C0X5T[]) LL.clone();
    }

    public static C0X5T valueOf(String str) {
        return (C0X5T) C08FF.LIZ(C0X5T.class, str);
    }

    public C0X5T(String str, int i) {
    }
}
