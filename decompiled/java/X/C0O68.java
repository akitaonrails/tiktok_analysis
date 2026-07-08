package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0O68, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O68 {
    public static final C0O68 AVAILABLE;
    public static final C0O68 FAKE;
    public static final /* synthetic */ C0O68[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0O68 NOT_AVAILABLE;
    public static final C0O68 UNKNOWN;

    public static InterfaceC2044707zh<C0O68> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0O68 c0o68 = new C0O68("NOT_AVAILABLE", 0);
        NOT_AVAILABLE = c0o68;
        C0O68 c0o682 = new C0O68("FAKE", 1);
        FAKE = c0o682;
        C0O68 c0o683 = new C0O68("AVAILABLE", 2);
        AVAILABLE = c0o683;
        C0O68 c0o684 = new C0O68("UNKNOWN", 3);
        UNKNOWN = c0o684;
        C0O68[] c0o68Arr = {c0o68, c0o682, c0o683, c0o684};
        LL = c0o68Arr;
        LLILLJJLI = new C2254308sP(c0o68Arr);
    }

    public static C0O68[] values() {
        return (C0O68[]) LL.clone();
    }

    public static C0O68 valueOf(String str) {
        return (C0O68) C08FF.LIZ(C0O68.class, str);
    }

    public C0O68(String str, int i) {
    }
}
