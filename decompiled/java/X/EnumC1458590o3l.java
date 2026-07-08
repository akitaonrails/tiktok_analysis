package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0o3l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1458590o3l {
    public static final EnumC1458590o3l AUTH_KEY;
    public static final EnumC1458590o3l FRAME;
    public static final /* synthetic */ EnumC1458590o3l[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1458590o3l REQUEST_MUSIC_TIME_OUT;
    public static final EnumC1458590o3l SKIP_SPEECH_DETECTION;
    public static final EnumC1458590o3l TIME_OUT;
    public static final EnumC1458590o3l UNDERSTANDING_RESULT_EMPTY;
    public static final EnumC1458590o3l UPLOAD;
    public static final EnumC1458590o3l ZIP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1458590o3l> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1458590o3l enumC1458590o3l = new EnumC1458590o3l("FRAME", 0, "frame");
        FRAME = enumC1458590o3l;
        EnumC1458590o3l enumC1458590o3l2 = new EnumC1458590o3l("ZIP", 1, "zip");
        ZIP = enumC1458590o3l2;
        EnumC1458590o3l enumC1458590o3l3 = new EnumC1458590o3l("AUTH_KEY", 2, "auth_key");
        AUTH_KEY = enumC1458590o3l3;
        EnumC1458590o3l enumC1458590o3l4 = new EnumC1458590o3l("UPLOAD", 3, "upload");
        UPLOAD = enumC1458590o3l4;
        EnumC1458590o3l enumC1458590o3l5 = new EnumC1458590o3l("TIME_OUT", 4, "time_out");
        TIME_OUT = enumC1458590o3l5;
        EnumC1458590o3l enumC1458590o3l6 = new EnumC1458590o3l("SKIP_SPEECH_DETECTION", 5, "skip_speech_detection");
        SKIP_SPEECH_DETECTION = enumC1458590o3l6;
        EnumC1458590o3l enumC1458590o3l7 = new EnumC1458590o3l("UNDERSTANDING_RESULT_EMPTY", 6, "understanding_result_empty");
        UNDERSTANDING_RESULT_EMPTY = enumC1458590o3l7;
        EnumC1458590o3l enumC1458590o3l8 = new EnumC1458590o3l("REQUEST_MUSIC_TIME_OUT", 7, "request_music_time_out");
        REQUEST_MUSIC_TIME_OUT = enumC1458590o3l8;
        EnumC1458590o3l[] enumC1458590o3lArr = {enumC1458590o3l, enumC1458590o3l2, enumC1458590o3l3, enumC1458590o3l4, enumC1458590o3l5, enumC1458590o3l6, enumC1458590o3l7, enumC1458590o3l8};
        LLILLJJLI = enumC1458590o3lArr;
        LLILLL = new C2254308sP(enumC1458590o3lArr);
    }

    public static EnumC1458590o3l[] values() {
        return (EnumC1458590o3l[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1458590o3l valueOf(String str) {
        return (EnumC1458590o3l) C08FF.LIZ(EnumC1458590o3l.class, str);
    }

    public EnumC1458590o3l(String str, int i, String str2) {
        this.LL = str2;
    }
}
