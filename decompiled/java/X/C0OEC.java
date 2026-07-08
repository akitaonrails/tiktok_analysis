package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OEC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OEC {
    public static final C0OEC FREQUENCY_CONTROL;
    public static final C0OEC GHOST_ENTRANCE_NOT_INTERESTED;
    public static final C0OEC GHOST_TAB_NOT_INTERESTED;
    public static final /* synthetic */ C0OEC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0OEC> getEntries() {
        return LLILLL;
    }

    static {
        C0OEC c0oec = new C0OEC("GHOST_TAB_NOT_INTERESTED", 0, 0);
        GHOST_TAB_NOT_INTERESTED = c0oec;
        C0OEC c0oec2 = new C0OEC("GHOST_ENTRANCE_NOT_INTERESTED", 1, 1);
        GHOST_ENTRANCE_NOT_INTERESTED = c0oec2;
        C0OEC c0oec3 = new C0OEC("FREQUENCY_CONTROL", 2, 2);
        FREQUENCY_CONTROL = c0oec3;
        C0OEC[] c0oecArr = {c0oec, c0oec2, c0oec3};
        LLILLJJLI = c0oecArr;
        LLILLL = new C2254308sP(c0oecArr);
    }

    public static C0OEC[] values() {
        return (C0OEC[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0OEC valueOf(String str) {
        return (C0OEC) C08FF.LIZ(C0OEC.class, str);
    }

    public C0OEC(String str, int i, int i2) {
        this.LL = i2;
    }
}
