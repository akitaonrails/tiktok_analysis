package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pgr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1521270pgr implements InterfaceC1491700ovA {
    public static final EnumC1521270pgr APP_SDK_INJECTED;
    public static final EnumC1521270pgr ATTACHED;
    public static final EnumC1521270pgr BLANK_DETECT_END;
    public static final EnumC1521270pgr BLANK_DETECT_START;
    public static final EnumC1521270pgr CREATED;
    public static final EnumC1521270pgr DESTROYED;
    public static final EnumC1521270pgr DETACHED;
    public static final /* synthetic */ EnumC1521270pgr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1521270pgr ON_LOAD_URL;
    public static final EnumC1521270pgr ON_PAGE_FINISHED;
    public static final EnumC1521270pgr ON_PAGE_PROGRESS_FINISHED;
    public static final EnumC1521270pgr ON_PAGE_SHOW_END;
    public static final EnumC1521270pgr ON_PAGE_SHOW_START;
    public static final EnumC1521270pgr ON_PAGE_STARTED;
    public static final EnumC1521270pgr REPORTED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1521270pgr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1521270pgr enumC1521270pgr = new EnumC1521270pgr("CREATED", 0, "web_view_created");
        CREATED = enumC1521270pgr;
        EnumC1521270pgr enumC1521270pgr2 = new EnumC1521270pgr("ATTACHED", 1, "web_view_attached");
        ATTACHED = enumC1521270pgr2;
        EnumC1521270pgr enumC1521270pgr3 = new EnumC1521270pgr("DETACHED", 2, "web_view_detached");
        DETACHED = enumC1521270pgr3;
        EnumC1521270pgr enumC1521270pgr4 = new EnumC1521270pgr("DESTROYED", 3, "web_view_destroyed");
        DESTROYED = enumC1521270pgr4;
        EnumC1521270pgr enumC1521270pgr5 = new EnumC1521270pgr("REPORTED", 4, "web_view_reported");
        REPORTED = enumC1521270pgr5;
        EnumC1521270pgr enumC1521270pgr6 = new EnumC1521270pgr("ON_LOAD_URL", 5, "web_view_load_url");
        ON_LOAD_URL = enumC1521270pgr6;
        EnumC1521270pgr enumC1521270pgr7 = new EnumC1521270pgr("ON_PAGE_STARTED", 6, "web_view_page_started");
        ON_PAGE_STARTED = enumC1521270pgr7;
        EnumC1521270pgr enumC1521270pgr8 = new EnumC1521270pgr("ON_PAGE_FINISHED", 7, "web_view_page_finished");
        ON_PAGE_FINISHED = enumC1521270pgr8;
        EnumC1521270pgr enumC1521270pgr9 = new EnumC1521270pgr("ON_PAGE_SHOW_START", 8, "web_view_show_start");
        ON_PAGE_SHOW_START = enumC1521270pgr9;
        EnumC1521270pgr enumC1521270pgr10 = new EnumC1521270pgr("ON_PAGE_SHOW_END", 9, "web_view_show_end");
        ON_PAGE_SHOW_END = enumC1521270pgr10;
        EnumC1521270pgr enumC1521270pgr11 = new EnumC1521270pgr("ON_PAGE_PROGRESS_FINISHED", 10, "web_view_progress_finished");
        ON_PAGE_PROGRESS_FINISHED = enumC1521270pgr11;
        EnumC1521270pgr enumC1521270pgr12 = new EnumC1521270pgr("APP_SDK_INJECTED", 11, "web_view_sdk_injected");
        APP_SDK_INJECTED = enumC1521270pgr12;
        EnumC1521270pgr enumC1521270pgr13 = new EnumC1521270pgr("BLANK_DETECT_START", 12, "web_view_blank_detect_start");
        BLANK_DETECT_START = enumC1521270pgr13;
        EnumC1521270pgr enumC1521270pgr14 = new EnumC1521270pgr("BLANK_DETECT_END", 13, "web_view_blank_detect_end");
        BLANK_DETECT_END = enumC1521270pgr14;
        EnumC1521270pgr[] enumC1521270pgrArr = {enumC1521270pgr, enumC1521270pgr2, enumC1521270pgr3, enumC1521270pgr4, enumC1521270pgr5, enumC1521270pgr6, enumC1521270pgr7, enumC1521270pgr8, enumC1521270pgr9, enumC1521270pgr10, enumC1521270pgr11, enumC1521270pgr12, enumC1521270pgr13, enumC1521270pgr14};
        LLILLJJLI = enumC1521270pgrArr;
        LLILLL = new C2254308sP(enumC1521270pgrArr);
    }

    public static EnumC1521270pgr[] values() {
        return (EnumC1521270pgr[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    @Override // X.InterfaceC1491700ovA
    public String key() {
        return this.LL;
    }

    public static EnumC1521270pgr valueOf(String str) {
        return (EnumC1521270pgr) C08FF.LIZ(EnumC1521270pgr.class, str);
    }

    public EnumC1521270pgr(String str, int i, String str2) {
        this.LL = str2;
    }
}
