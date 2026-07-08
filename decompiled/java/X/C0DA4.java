package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DA4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DA4 {
    public static final C0DA4 BUILDING_TOKEN;
    public static final C0DA4 IDLE;
    public static final /* synthetic */ C0DA4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0DA4 REFRESHING;

    public static InterfaceC2044707zh<C0DA4> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0DA4 c0da4 = new C0DA4("IDLE", 0);
        IDLE = c0da4;
        C0DA4 c0da42 = new C0DA4("REFRESHING", 1);
        REFRESHING = c0da42;
        C0DA4 c0da43 = new C0DA4("BUILDING_TOKEN", 2);
        BUILDING_TOKEN = c0da43;
        C0DA4[] c0da4Arr = {c0da4, c0da42, c0da43};
        LL = c0da4Arr;
        LLILLJJLI = new C2254308sP(c0da4Arr);
    }

    public static C0DA4[] values() {
        return (C0DA4[]) LL.clone();
    }

    public static C0DA4 valueOf(String str) {
        return (C0DA4) C08FF.LIZ(C0DA4.class, str);
    }

    public C0DA4(String str, int i) {
    }
}
