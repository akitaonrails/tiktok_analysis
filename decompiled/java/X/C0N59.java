package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N59, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N59 {
    public static final C0N59 ICY_CLASH;
    public static final /* synthetic */ C0N59[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N59 NONE;
    public static final C0N59 SPECIFIC_GIFT;

    public static InterfaceC2044707zh<C0N59> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N59 c0n59 = new C0N59("NONE", 0);
        NONE = c0n59;
        C0N59 c0n592 = new C0N59("SPECIFIC_GIFT", 1);
        SPECIFIC_GIFT = c0n592;
        C0N59 c0n593 = new C0N59("ICY_CLASH", 2);
        ICY_CLASH = c0n593;
        C0N59[] c0n59Arr = {c0n59, c0n592, c0n593};
        LL = c0n59Arr;
        LLILLJJLI = new C2254308sP(c0n59Arr);
    }

    public static C0N59[] values() {
        return (C0N59[]) LL.clone();
    }

    public static C0N59 valueOf(String str) {
        return (C0N59) C08FF.LIZ(C0N59.class, str);
    }

    public C0N59(String str, int i) {
    }
}
