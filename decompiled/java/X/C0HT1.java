package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HT1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HT1 {
    public static final C0HT1 ADD_TO_STORY;
    public static final C0HT1 CLOSE;
    public static final C0HT1 DOWNLOAD;
    public static final /* synthetic */ C0HT1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0HT1 REPORT;
    public static final C0HT1 SEND_TO;
    public final String LL;

    public static InterfaceC2044707zh<C0HT1> getEntries() {
        return LLILLL;
    }

    static {
        C0HT1 c0ht1 = new C0HT1("CLOSE", 0, "close");
        CLOSE = c0ht1;
        C0HT1 c0ht12 = new C0HT1("SEND_TO", 1, "send_to");
        SEND_TO = c0ht12;
        C0HT1 c0ht13 = new C0HT1("ADD_TO_STORY", 2, "add_to_story");
        ADD_TO_STORY = c0ht13;
        C0HT1 c0ht14 = new C0HT1("DOWNLOAD", 3, "download");
        DOWNLOAD = c0ht14;
        C0HT1 c0ht15 = new C0HT1("REPORT", 4, "report");
        REPORT = c0ht15;
        C0HT1[] c0ht1Arr = {c0ht1, c0ht12, c0ht13, c0ht14, c0ht15};
        LLILLJJLI = c0ht1Arr;
        LLILLL = new C2254308sP(c0ht1Arr);
    }

    public static C0HT1[] values() {
        return (C0HT1[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static C0HT1 valueOf(String str) {
        return (C0HT1) C08FF.LIZ(C0HT1.class, str);
    }

    public C0HT1(String str, int i, String str2) {
        this.LL = str2;
    }
}
