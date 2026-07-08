package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CAJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CAJ {
    public static final C0CAJ APPLICATION;
    public static final C0CAJ FEED_UI_TO_VIDEO;
    public static final /* synthetic */ C0CAJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0CAJ MAIN_ACT_CREATE;
    public static final C0CAJ OTHER;
    public static final C0CAJ RESUME_TO_FOCUS;
    public final String LL;

    public static InterfaceC2044707zh<C0CAJ> getEntries() {
        return LLILLL;
    }

    static {
        C0CAJ c0caj = new C0CAJ("APPLICATION", 0, "application_");
        APPLICATION = c0caj;
        C0CAJ c0caj2 = new C0CAJ("MAIN_ACT_CREATE", 1, "main_act_");
        MAIN_ACT_CREATE = c0caj2;
        C0CAJ c0caj3 = new C0CAJ("RESUME_TO_FOCUS", 2, "resume_to_focus_");
        RESUME_TO_FOCUS = c0caj3;
        C0CAJ c0caj4 = new C0CAJ("FEED_UI_TO_VIDEO", 3, "ui_to_video_");
        FEED_UI_TO_VIDEO = c0caj4;
        C0CAJ c0caj5 = new C0CAJ("OTHER", 4, "other_");
        OTHER = c0caj5;
        C0CAJ[] c0cajArr = {c0caj, c0caj2, c0caj3, c0caj4, c0caj5};
        LLILLJJLI = c0cajArr;
        LLILLL = new C2254308sP(c0cajArr);
    }

    public static C0CAJ[] values() {
        return (C0CAJ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0CAJ valueOf(String str) {
        return (C0CAJ) C08FF.LIZ(C0CAJ.class, str);
    }

    public C0CAJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
