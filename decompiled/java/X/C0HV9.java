package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HV9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HV9 {
    public static final C0HV9 CAMERA_BTN;
    public static final C0HV9 EMOJI_BTN;
    public static final /* synthetic */ C0HV9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0HV9 SCALING_ALBUM_BTN;
    public static final C0HV9 SCALING_MENTION_BTN;
    public static final C0HV9 SCALING_SEND_BTN;
    public static final C0HV9 VOICE_RECORD_BTN;
    public static final C0HV9 VOICE_RECORD_DELETE_BTN;
    public final String LL;

    public static InterfaceC2044707zh<C0HV9> getEntries() {
        return LLILLL;
    }

    static {
        C0HV9 c0hv9 = new C0HV9("SCALING_MENTION_BTN", 0, "scaling_mention_btn");
        SCALING_MENTION_BTN = c0hv9;
        C0HV9 c0hv92 = new C0HV9("SCALING_SEND_BTN", 1, "scaling_send_btn");
        SCALING_SEND_BTN = c0hv92;
        C0HV9 c0hv93 = new C0HV9("EMOJI_BTN", 2, "emoji_btn");
        EMOJI_BTN = c0hv93;
        C0HV9 c0hv94 = new C0HV9("SCALING_ALBUM_BTN", 3, "scaling_album_btn");
        SCALING_ALBUM_BTN = c0hv94;
        C0HV9 c0hv95 = new C0HV9("CAMERA_BTN", 4, "camera_btn");
        CAMERA_BTN = c0hv95;
        C0HV9 c0hv96 = new C0HV9("VOICE_RECORD_BTN", 5, "voice_record_btn");
        VOICE_RECORD_BTN = c0hv96;
        C0HV9 c0hv97 = new C0HV9("VOICE_RECORD_DELETE_BTN", 6, "voice_record_delete_btn");
        VOICE_RECORD_DELETE_BTN = c0hv97;
        C0HV9[] c0hv9Arr = {c0hv9, c0hv92, c0hv93, c0hv94, c0hv95, c0hv96, c0hv97};
        LLILLJJLI = c0hv9Arr;
        LLILLL = new C2254308sP(c0hv9Arr);
    }

    public static C0HV9[] values() {
        return (C0HV9[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static C0HV9 valueOf(String str) {
        return (C0HV9) C08FF.LIZ(C0HV9.class, str);
    }

    public C0HV9(String str, int i, String str2) {
        this.LL = str2;
    }
}
