package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC765980U2y {
    public static final EnumC765980U2y ERROR_PLAY;
    public static final EnumC765980U2y FINISH_PLAY;
    public static final EnumC765980U2y IDLE;
    public static final /* synthetic */ EnumC765980U2y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC765980U2y NO_SOURCE;
    public static final EnumC765980U2y PAUSE_PLAY;
    public static final EnumC765980U2y PLAYING;
    public static final EnumC765980U2y PRE_FINISH_PLAY;
    public static final EnumC765980U2y STOP_PLAY;
    public static final EnumC765980U2y WILL_PLAY;

    public static InterfaceC2044707zh<EnumC765980U2y> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC765980U2y enumC765980U2y = new EnumC765980U2y("IDLE", 0);
        IDLE = enumC765980U2y;
        EnumC765980U2y enumC765980U2y2 = new EnumC765980U2y("NO_SOURCE", 1);
        NO_SOURCE = enumC765980U2y2;
        EnumC765980U2y enumC765980U2y3 = new EnumC765980U2y("WILL_PLAY", 2);
        WILL_PLAY = enumC765980U2y3;
        EnumC765980U2y enumC765980U2y4 = new EnumC765980U2y("PLAYING", 3);
        PLAYING = enumC765980U2y4;
        EnumC765980U2y enumC765980U2y5 = new EnumC765980U2y("PAUSE_PLAY", 4);
        PAUSE_PLAY = enumC765980U2y5;
        EnumC765980U2y enumC765980U2y6 = new EnumC765980U2y("STOP_PLAY", 5);
        STOP_PLAY = enumC765980U2y6;
        EnumC765980U2y enumC765980U2y7 = new EnumC765980U2y("PRE_FINISH_PLAY", 6);
        PRE_FINISH_PLAY = enumC765980U2y7;
        EnumC765980U2y enumC765980U2y8 = new EnumC765980U2y("FINISH_PLAY", 7);
        FINISH_PLAY = enumC765980U2y8;
        EnumC765980U2y enumC765980U2y9 = new EnumC765980U2y("ERROR_PLAY", 8);
        ERROR_PLAY = enumC765980U2y9;
        EnumC765980U2y[] enumC765980U2yArr = {enumC765980U2y, enumC765980U2y2, enumC765980U2y3, enumC765980U2y4, enumC765980U2y5, enumC765980U2y6, enumC765980U2y7, enumC765980U2y8, enumC765980U2y9};
        LL = enumC765980U2yArr;
        LLILLJJLI = new C2254308sP(enumC765980U2yArr);
    }

    public static EnumC765980U2y[] values() {
        return (EnumC765980U2y[]) LL.clone();
    }

    public static EnumC765980U2y valueOf(String str) {
        return (EnumC765980U2y) C08FF.LIZ(EnumC765980U2y.class, str);
    }

    public EnumC765980U2y(String str, int i) {
    }
}
