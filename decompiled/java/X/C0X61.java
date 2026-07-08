package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X61, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X61 {
    public static final C0X61 AJAX_HOOK;
    public static final /* synthetic */ C0X61[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0X61 RESOURCE_INTERCEPT;

    public static InterfaceC2044707zh<C0X61> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0X61 c0x61 = new C0X61("RESOURCE_INTERCEPT", 0);
        RESOURCE_INTERCEPT = c0x61;
        C0X61 c0x612 = new C0X61("AJAX_HOOK", 1);
        AJAX_HOOK = c0x612;
        C0X61[] c0x61Arr = {c0x61, c0x612};
        LL = c0x61Arr;
        LLILLJJLI = new C2254308sP(c0x61Arr);
    }

    public static C0X61[] values() {
        return (C0X61[]) LL.clone();
    }

    public static C0X61 valueOf(String str) {
        return (C0X61) C08FF.LIZ(C0X61.class, str);
    }

    public C0X61(String str, int i) {
    }
}
