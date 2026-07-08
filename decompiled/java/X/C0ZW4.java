package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZW4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZW4 {
    public static final C0ZW4 BLUR;
    public static final /* synthetic */ C0ZW4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ZW4 MOSAIC;
    public static final C0ZW4 NONE;

    public static InterfaceC2044707zh<C0ZW4> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZW4 c0zw4 = new C0ZW4("NONE", 0);
        NONE = c0zw4;
        C0ZW4 c0zw42 = new C0ZW4("BLUR", 1);
        BLUR = c0zw42;
        C0ZW4 c0zw43 = new C0ZW4("MOSAIC", 2);
        MOSAIC = c0zw43;
        C0ZW4[] c0zw4Arr = {c0zw4, c0zw42, c0zw43};
        LL = c0zw4Arr;
        LLILLJJLI = new C2254308sP(c0zw4Arr);
    }

    public static C0ZW4[] values() {
        return (C0ZW4[]) LL.clone();
    }

    public static C0ZW4 valueOf(String str) {
        return (C0ZW4) C08FF.LIZ(C0ZW4.class, str);
    }

    public C0ZW4(String str, int i) {
    }
}
