package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Vy0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC814940Vy0 {
    public static final C815090VyF Companion;
    public static final EnumC814940Vy0 FEED_CACHE;
    public static final EnumC814940Vy0 LANDING_INBOX;
    public static final /* synthetic */ EnumC814940Vy0[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC814940Vy0 TESTING_SILENT;
    public static final EnumC814940Vy0 TOPVIEW_SAFEGUARD_CACHE;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC814940Vy0> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0VyF] */
    static {
        EnumC814940Vy0 enumC814940Vy0 = new EnumC814940Vy0("TESTING_SILENT", 0, 0, "silent_push_test");
        TESTING_SILENT = enumC814940Vy0;
        EnumC814940Vy0 enumC814940Vy02 = new EnumC814940Vy0("LANDING_INBOX", 1, 1, "silent_push_inbox_landing");
        LANDING_INBOX = enumC814940Vy02;
        EnumC814940Vy0 enumC814940Vy03 = new EnumC814940Vy0("FEED_CACHE", 2, 2, "silent_push_switch_upload");
        FEED_CACHE = enumC814940Vy03;
        EnumC814940Vy0 enumC814940Vy04 = new EnumC814940Vy0("TOPVIEW_SAFEGUARD_CACHE", 3, 4, "silent_push_topview_send_drop");
        TOPVIEW_SAFEGUARD_CACHE = enumC814940Vy04;
        EnumC814940Vy0[] enumC814940Vy0Arr = {enumC814940Vy0, enumC814940Vy02, enumC814940Vy03, enumC814940Vy04};
        LLILLL = enumC814940Vy0Arr;
        LLILZ = new C2254308sP(enumC814940Vy0Arr);
        Companion = new Object() { // from class: X.0VyF
        };
    }

    public static EnumC814940Vy0[] values() {
        return (EnumC814940Vy0[]) LLILLL.clone();
    }

    public final int getSceneId() {
        return this.LL;
    }

    public final String getSceneName() {
        return this.LLILLJJLI;
    }

    public static EnumC814940Vy0 valueOf(String str) {
        return (EnumC814940Vy0) C08FF.LIZ(EnumC814940Vy0.class, str);
    }

    public EnumC814940Vy0(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
