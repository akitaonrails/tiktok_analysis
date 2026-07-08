package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05TC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05TC {
    public static final C05TC HIDE_AWEME;
    public static final /* synthetic */ C05TC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C05TC SHOW_AWEME;
    public static final C05TC SHOW_AWEME_INSTANT;

    public static InterfaceC2044707zh<C05TC> getEntries() {
        return LLILLJJLI;
    }

    static {
        C05TC c05tc = new C05TC("SHOW_AWEME", 0);
        SHOW_AWEME = c05tc;
        C05TC c05tc2 = new C05TC("SHOW_AWEME_INSTANT", 1);
        SHOW_AWEME_INSTANT = c05tc2;
        C05TC c05tc3 = new C05TC("HIDE_AWEME", 2);
        HIDE_AWEME = c05tc3;
        C05TC[] c05tcArr = {c05tc, c05tc2, c05tc3};
        LL = c05tcArr;
        LLILLJJLI = new C2254308sP(c05tcArr);
    }

    public static C05TC[] values() {
        return (C05TC[]) LL.clone();
    }

    public static C05TC valueOf(String str) {
        return (C05TC) C08FF.LIZ(C05TC.class, str);
    }

    public C05TC(String str, int i) {
    }
}
