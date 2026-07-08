package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I18, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I18 {
    public static final C0I18 CONTAINER;
    public static final /* synthetic */ C0I18[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0I18 VIEW_STUB;

    public static InterfaceC2044707zh<C0I18> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0I18 c0i18 = new C0I18("VIEW_STUB", 0);
        VIEW_STUB = c0i18;
        C0I18 c0i182 = new C0I18("CONTAINER", 1);
        CONTAINER = c0i182;
        C0I18[] c0i18Arr = {c0i18, c0i182};
        LL = c0i18Arr;
        LLILLJJLI = new C2254308sP(c0i18Arr);
    }

    public static C0I18[] values() {
        return (C0I18[]) LL.clone();
    }

    public static C0I18 valueOf(String str) {
        return (C0I18) C08FF.LIZ(C0I18.class, str);
    }

    public C0I18(String str, int i) {
    }
}
