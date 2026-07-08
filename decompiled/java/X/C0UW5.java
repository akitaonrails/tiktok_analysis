package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UW5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UW5 {
    public static final C0UW5 HIGH_PING_BITRATE_ADJUST_MODULE;
    public static final C0UW5 HIGH_PING_TIPS_MODULE;
    public static final /* synthetic */ C0UW5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0UW5> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0UW5 c0uw5 = new C0UW5("HIGH_PING_TIPS_MODULE", 0);
        HIGH_PING_TIPS_MODULE = c0uw5;
        C0UW5 c0uw52 = new C0UW5("HIGH_PING_BITRATE_ADJUST_MODULE", 1);
        HIGH_PING_BITRATE_ADJUST_MODULE = c0uw52;
        C0UW5[] c0uw5Arr = {c0uw5, c0uw52};
        LL = c0uw5Arr;
        LLILLJJLI = new C2254308sP(c0uw5Arr);
    }

    public static C0UW5[] values() {
        return (C0UW5[]) LL.clone();
    }

    public static C0UW5 valueOf(String str) {
        return (C0UW5) C08FF.LIZ(C0UW5.class, str);
    }

    public C0UW5(String str, int i) {
    }
}
