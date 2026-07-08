package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TH2, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TH2 {
    public static final C0TH2 BROWSING;
    public static final C0TH2 CASTING;
    public static final C0TH2 CHOOSING;
    public static final C0TH2 ERROR;
    public static final C0TH2 INIT;
    public static final /* synthetic */ C0TH2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0TH2 MEDIA_PROJECTION_PERMISSION_REJECT;
    public static final C0TH2 NOTIFICATION_PERMISSIONS_ERROR;
    public static final C0TH2 STOPPED;

    public static InterfaceC2044707zh<C0TH2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0TH2 c0th2 = new C0TH2("INIT", 0);
        INIT = c0th2;
        C0TH2 c0th22 = new C0TH2("BROWSING", 1);
        BROWSING = c0th22;
        C0TH2 c0th23 = new C0TH2("CHOOSING", 2);
        CHOOSING = c0th23;
        C0TH2 c0th24 = new C0TH2("MEDIA_PROJECTION_PERMISSION_REJECT", 3);
        MEDIA_PROJECTION_PERMISSION_REJECT = c0th24;
        C0TH2 c0th25 = new C0TH2("CASTING", 4);
        CASTING = c0th25;
        C0TH2 c0th26 = new C0TH2("STOPPED", 5);
        STOPPED = c0th26;
        C0TH2 c0th27 = new C0TH2("ERROR", 6);
        ERROR = c0th27;
        C0TH2 c0th28 = new C0TH2("NOTIFICATION_PERMISSIONS_ERROR", 7);
        NOTIFICATION_PERMISSIONS_ERROR = c0th28;
        C0TH2[] c0th2Arr = {c0th2, c0th22, c0th23, c0th24, c0th25, c0th26, c0th27, c0th28};
        LL = c0th2Arr;
        LLILLJJLI = new C2254308sP(c0th2Arr);
    }

    public static C0TH2[] values() {
        return (C0TH2[]) LL.clone();
    }

    public static C0TH2 valueOf(String str) {
        return (C0TH2) C08FF.LIZ(C0TH2.class, str);
    }

    public C0TH2(String str, int i) {
    }
}
