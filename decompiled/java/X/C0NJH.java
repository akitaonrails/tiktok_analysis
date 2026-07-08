package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NJH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NJH {
    public static final C0NJH LAUNCH2MAIN_DURATION;
    public static final /* synthetic */ C0NJH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0NJH MAIN2NUJ_DURATION;
    public static final C0NJH NUJ2FEED_DURATION;
    public static final C0NJH NUJ_STARTED;
    public static final C0NJH RENDER_DURATION;
    public static final C0NJH UX_DURATION;
    public final String LL;

    public static InterfaceC2044707zh<C0NJH> getEntries() {
        return LLILLL;
    }

    static {
        C0NJH c0njh = new C0NJH("LAUNCH2MAIN_DURATION", 0, "general_launch2main_duration");
        LAUNCH2MAIN_DURATION = c0njh;
        C0NJH c0njh2 = new C0NJH("MAIN2NUJ_DURATION", 1, "general_main2nuj_duration");
        MAIN2NUJ_DURATION = c0njh2;
        C0NJH c0njh3 = new C0NJH("NUJ2FEED_DURATION", 2, "general_nuj2feed_duration");
        NUJ2FEED_DURATION = c0njh3;
        C0NJH c0njh4 = new C0NJH("UX_DURATION", 3, "_ux_duration");
        UX_DURATION = c0njh4;
        C0NJH c0njh5 = new C0NJH("RENDER_DURATION", 4, "_render2show_duration");
        RENDER_DURATION = c0njh5;
        C0NJH c0njh6 = new C0NJH("NUJ_STARTED", 5, "general_nuj_started");
        NUJ_STARTED = c0njh6;
        C0NJH[] c0njhArr = {c0njh, c0njh2, c0njh3, c0njh4, c0njh5, c0njh6};
        LLILLJJLI = c0njhArr;
        LLILLL = new C2254308sP(c0njhArr);
    }

    public static C0NJH[] values() {
        return (C0NJH[]) LLILLJJLI.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static C0NJH valueOf(String str) {
        return (C0NJH) C08FF.LIZ(C0NJH.class, str);
    }

    public C0NJH(String str, int i, String str2) {
        this.LL = str2;
    }
}
