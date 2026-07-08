package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X4S, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X4S {
    public static final C0X4S AGE_GATE;
    public static final C0X4S COLD_START;
    public static final C0X4S COMMENT;
    public static final C0X4S INSTALL;
    public static final /* synthetic */ C0X4S[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0X4S LOGGED;
    public static final C0X4S MUSIC_SHARE;
    public static final C0X4S STICKER_SHARE;
    public static final C0X4S VIDEO_SHARE;
    public final String LL;

    public static InterfaceC2044707zh<C0X4S> getEntries() {
        return LLILLL;
    }

    static {
        C0X4S c0x4s = new C0X4S("LOGGED", 0, "logged");
        LOGGED = c0x4s;
        C0X4S c0x4s2 = new C0X4S("MUSIC_SHARE", 1, "share");
        MUSIC_SHARE = c0x4s2;
        C0X4S c0x4s3 = new C0X4S("STICKER_SHARE", 2, "share");
        STICKER_SHARE = c0x4s3;
        C0X4S c0x4s4 = new C0X4S("VIDEO_SHARE", 3, "share");
        VIDEO_SHARE = c0x4s4;
        C0X4S c0x4s5 = new C0X4S("COMMENT", 4, "comment");
        COMMENT = c0x4s5;
        C0X4S c0x4s6 = new C0X4S("COLD_START", 5, "cold_start");
        COLD_START = c0x4s6;
        C0X4S c0x4s7 = new C0X4S("INSTALL", 6, "install");
        INSTALL = c0x4s7;
        C0X4S c0x4s8 = new C0X4S("AGE_GATE", 7, "pass_agegate_13");
        AGE_GATE = c0x4s8;
        C0X4S[] c0x4sArr = {c0x4s, c0x4s2, c0x4s3, c0x4s4, c0x4s5, c0x4s6, c0x4s7, c0x4s8};
        LLILLJJLI = c0x4sArr;
        LLILLL = new C2254308sP(c0x4sArr);
    }

    public static C0X4S[] values() {
        return (C0X4S[]) LLILLJJLI.clone();
    }

    public final String getReportName() {
        return this.LL;
    }

    public static C0X4S valueOf(String str) {
        return (C0X4S) C08FF.LIZ(C0X4S.class, str);
    }

    public C0X4S(String str, int i, String str2) {
        this.LL = str2;
    }
}
