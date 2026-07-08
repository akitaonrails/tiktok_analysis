package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0P3K, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P3K {
    public static final /* synthetic */ C0P3K[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0P3K SEND_CO_LIKE_CARD;
    public static final C0P3K SEND_INLINE_MSG;
    public static final C0P3K SEND_MSG;
    public static final C0P3K SEND_REMINDER;

    public static InterfaceC2044707zh<C0P3K> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0P3K c0p3k = new C0P3K("SEND_MSG", 0);
        SEND_MSG = c0p3k;
        C0P3K c0p3k2 = new C0P3K("SEND_REMINDER", 1);
        SEND_REMINDER = c0p3k2;
        C0P3K c0p3k3 = new C0P3K("SEND_INLINE_MSG", 2);
        SEND_INLINE_MSG = c0p3k3;
        C0P3K c0p3k4 = new C0P3K("SEND_CO_LIKE_CARD", 3);
        SEND_CO_LIKE_CARD = c0p3k4;
        C0P3K[] c0p3kArr = {c0p3k, c0p3k2, c0p3k3, c0p3k4};
        LL = c0p3kArr;
        LLILLJJLI = new C2254308sP(c0p3kArr);
    }

    public static C0P3K[] values() {
        return (C0P3K[]) LL.clone();
    }

    public static C0P3K valueOf(String str) {
        return (C0P3K) C08FF.LIZ(C0P3K.class, str);
    }

    public C0P3K(String str, int i) {
    }
}
