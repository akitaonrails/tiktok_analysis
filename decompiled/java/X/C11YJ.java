package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11YJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11YJ {
    public static final C11YJ AUDIO_SDK;
    public static final C11YJ BD_SERVER;
    public static final C11YJ CLIENT;
    public static final C11YK Companion;
    public static final C11YJ EFFECT_SDK;
    public static final /* synthetic */ C11YJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C11YJ LOKI_SERVER;
    public static final C11YJ MUSIC_SERVER;
    public static final C11YJ SAMI_SERVER;
    public static final C11YJ TT_SERVER;
    public static final C11YJ UNKNOWN_ERROR;
    public static final C11YJ VE_SDK;
    public final String LL;

    public static InterfaceC2044707zh<C11YJ> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.11YK] */
    static {
        C11YJ c11yj = new C11YJ("SAMI_SERVER", 0, "sami_server");
        SAMI_SERVER = c11yj;
        C11YJ c11yj2 = new C11YJ("MUSIC_SERVER", 1, "music_server");
        MUSIC_SERVER = c11yj2;
        C11YJ c11yj3 = new C11YJ("BD_SERVER", 2, "bd_server");
        BD_SERVER = c11yj3;
        C11YJ c11yj4 = new C11YJ("LOKI_SERVER", 3, "loki_server");
        LOKI_SERVER = c11yj4;
        C11YJ c11yj5 = new C11YJ("TT_SERVER", 4, "tt_server");
        TT_SERVER = c11yj5;
        C11YJ c11yj6 = new C11YJ("AUDIO_SDK", 5, "audio_sdk");
        AUDIO_SDK = c11yj6;
        C11YJ c11yj7 = new C11YJ("CLIENT", 6, "client");
        CLIENT = c11yj7;
        C11YJ c11yj8 = new C11YJ("VE_SDK", 7, "ve_sdk");
        VE_SDK = c11yj8;
        C11YJ c11yj9 = new C11YJ("EFFECT_SDK", 8, "effect_sdk");
        EFFECT_SDK = c11yj9;
        C11YJ c11yj10 = new C11YJ("UNKNOWN_ERROR", 9, "unknown_error");
        UNKNOWN_ERROR = c11yj10;
        C11YJ[] c11yjArr = {c11yj, c11yj2, c11yj3, c11yj4, c11yj5, c11yj6, c11yj7, c11yj8, c11yj9, c11yj10};
        LLILLJJLI = c11yjArr;
        LLILLL = new C2254308sP(c11yjArr);
        Companion = new Object() { // from class: X.11YK
        };
    }

    public static C11YJ[] values() {
        return (C11YJ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C11YJ valueOf(String str) {
        return (C11YJ) C08FF.LIZ(C11YJ.class, str);
    }

    public C11YJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
