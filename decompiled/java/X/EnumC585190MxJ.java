package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MxJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC585190MxJ {
    public static final EnumC585190MxJ BUFFERING;
    public static final EnumC585190MxJ COMPLETED;
    public static final /* synthetic */ EnumC585190MxJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC585190MxJ PAUSED;
    public static final EnumC585190MxJ PLAYING;
    public static final EnumC585190MxJ PREPARED;
    public static final EnumC585190MxJ PREPARING;
    public static final EnumC585190MxJ STOPPED;
    public static final EnumC585190MxJ UNKNOWN;

    public static InterfaceC2044707zh<EnumC585190MxJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC585190MxJ enumC585190MxJ = new EnumC585190MxJ("PREPARING", 0);
        PREPARING = enumC585190MxJ;
        EnumC585190MxJ enumC585190MxJ2 = new EnumC585190MxJ("PREPARED", 1);
        PREPARED = enumC585190MxJ2;
        EnumC585190MxJ enumC585190MxJ3 = new EnumC585190MxJ("STOPPED", 2);
        STOPPED = enumC585190MxJ3;
        EnumC585190MxJ enumC585190MxJ4 = new EnumC585190MxJ("PLAYING", 3);
        PLAYING = enumC585190MxJ4;
        EnumC585190MxJ enumC585190MxJ5 = new EnumC585190MxJ("BUFFERING", 4);
        BUFFERING = enumC585190MxJ5;
        EnumC585190MxJ enumC585190MxJ6 = new EnumC585190MxJ("PAUSED", 5);
        PAUSED = enumC585190MxJ6;
        EnumC585190MxJ enumC585190MxJ7 = new EnumC585190MxJ("COMPLETED", 6);
        COMPLETED = enumC585190MxJ7;
        EnumC585190MxJ enumC585190MxJ8 = new EnumC585190MxJ("UNKNOWN", 7);
        UNKNOWN = enumC585190MxJ8;
        EnumC585190MxJ[] enumC585190MxJArr = {enumC585190MxJ, enumC585190MxJ2, enumC585190MxJ3, enumC585190MxJ4, enumC585190MxJ5, enumC585190MxJ6, enumC585190MxJ7, enumC585190MxJ8};
        LL = enumC585190MxJArr;
        LLILLJJLI = new C2254308sP(enumC585190MxJArr);
    }

    public static EnumC585190MxJ[] values() {
        return (EnumC585190MxJ[]) LL.clone();
    }

    public static EnumC585190MxJ valueOf(String str) {
        return (EnumC585190MxJ) C08FF.LIZ(EnumC585190MxJ.class, str);
    }

    public EnumC585190MxJ(String str, int i) {
    }
}
