package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XR9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XR9 {
    public static final /* synthetic */ C0XR9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0XR9 LOGIN_ITEM_SUBTITLE;
    public static final C0XR9 LOGIN_ITEM_TOOLTIP;
    public static final C0XR9 NONE;

    public static InterfaceC2044707zh<C0XR9> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0XR9 c0xr9 = new C0XR9("NONE", 0);
        NONE = c0xr9;
        C0XR9 c0xr92 = new C0XR9("LOGIN_ITEM_SUBTITLE", 1);
        LOGIN_ITEM_SUBTITLE = c0xr92;
        C0XR9 c0xr93 = new C0XR9("LOGIN_ITEM_TOOLTIP", 2);
        LOGIN_ITEM_TOOLTIP = c0xr93;
        C0XR9[] c0xr9Arr = {c0xr9, c0xr92, c0xr93};
        LL = c0xr9Arr;
        LLILLJJLI = new C2254308sP(c0xr9Arr);
    }

    public static C0XR9[] values() {
        return (C0XR9[]) LL.clone();
    }

    public static C0XR9 valueOf(String str) {
        return (C0XR9) C08FF.LIZ(C0XR9.class, str);
    }

    public C0XR9(String str, int i) {
    }
}
