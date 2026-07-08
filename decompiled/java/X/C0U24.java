package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U24, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U24 {
    public static final /* synthetic */ C0U24[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0U24 NOT_REQUESTED;
    public static final C0U24 REQUESTED;
    public static final C0U24 REQUESTING;

    public static InterfaceC2044707zh<C0U24> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0U24 c0u24 = new C0U24("NOT_REQUESTED", 0);
        NOT_REQUESTED = c0u24;
        C0U24 c0u242 = new C0U24("REQUESTED", 1);
        REQUESTED = c0u242;
        C0U24 c0u243 = new C0U24("REQUESTING", 2);
        REQUESTING = c0u243;
        C0U24[] c0u24Arr = {c0u24, c0u242, c0u243};
        LL = c0u24Arr;
        LLILLJJLI = new C2254308sP(c0u24Arr);
    }

    public static C0U24[] values() {
        return (C0U24[]) LL.clone();
    }

    public static C0U24 valueOf(String str) {
        return (C0U24) C08FF.LIZ(C0U24.class, str);
    }

    public C0U24(String str, int i) {
    }
}
