package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.164J, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C164J {
    public static final C164J CLA_ORIGINAL_CAPTION_TYPE_ASR;
    public static final C164J CLA_ORIGINAL_CAPTION_TYPE_CAPCUT_CREATOR;
    public static final C164J CLA_ORIGINAL_CAPTION_TYPE_CEC;
    public static final C164J CLA_ORIGINAL_CAPTION_TYPE_CLOSED_CREATOR;
    public static final C164J CLA_ORIGINAL_CAPTION_TYPE_STICKER_CREATOR;
    public static final C164J CLA_ORIGINAL_CAPTION_TYPE_THIRD_PARTY_CREATOR;
    public static final C164J CLA_ORIGINAL_CAPTION_TYPE_UNSPECIFIED;
    public static final C164I Companion;
    public static final /* synthetic */ C164J[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final int LL;
    public String LLILLJJLI;

    public static InterfaceC2044707zh<C164J> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.164I] */
    static {
        C164J c164j = new C164J("CLA_ORIGINAL_CAPTION_TYPE_UNSPECIFIED", 0, 0, "unspecified");
        CLA_ORIGINAL_CAPTION_TYPE_UNSPECIFIED = c164j;
        C164J c164j2 = new C164J("CLA_ORIGINAL_CAPTION_TYPE_ASR", 1, 1, "asr");
        CLA_ORIGINAL_CAPTION_TYPE_ASR = c164j2;
        C164J c164j3 = new C164J("CLA_ORIGINAL_CAPTION_TYPE_CEC", 2, 2, "cec");
        CLA_ORIGINAL_CAPTION_TYPE_CEC = c164j3;
        C164J c164j4 = new C164J("CLA_ORIGINAL_CAPTION_TYPE_STICKER_CREATOR", 3, 3, "sticker_creator");
        CLA_ORIGINAL_CAPTION_TYPE_STICKER_CREATOR = c164j4;
        C164J c164j5 = new C164J("CLA_ORIGINAL_CAPTION_TYPE_CAPCUT_CREATOR", 4, 4, "capcut_creator");
        CLA_ORIGINAL_CAPTION_TYPE_CAPCUT_CREATOR = c164j5;
        C164J c164j6 = new C164J("CLA_ORIGINAL_CAPTION_TYPE_THIRD_PARTY_CREATOR", 5, 5, "tp_creator");
        CLA_ORIGINAL_CAPTION_TYPE_THIRD_PARTY_CREATOR = c164j6;
        C164J c164j7 = new C164J("CLA_ORIGINAL_CAPTION_TYPE_CLOSED_CREATOR", 6, 6, "closed_creator");
        CLA_ORIGINAL_CAPTION_TYPE_CLOSED_CREATOR = c164j7;
        C164J[] c164jArr = {c164j, c164j2, c164j3, c164j4, c164j5, c164j6, c164j7};
        LLILLL = c164jArr;
        LLILZ = new C2254308sP(c164jArr);
        Companion = new Object() { // from class: X.164I
        };
    }

    public static C164J[] values() {
        return (C164J[]) LLILLL.clone();
    }

    public final String getCaptionName() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static C164J valueOf(String str) {
        return (C164J) C08FF.LIZ(C164J.class, str);
    }

    public final void setCaptionName(String str) {
        this.LLILLJJLI = str;
    }

    public C164J(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
