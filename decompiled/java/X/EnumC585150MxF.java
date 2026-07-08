package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC585150MxF {
    public static final EnumC585150MxF BUFFERING;
    public static final EnumC585150MxF FAILED;
    public static final EnumC585150MxF FINISHED;
    public static final EnumC585150MxF IDLE;
    public static final /* synthetic */ EnumC585150MxF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC585150MxF PAUSED;
    public static final EnumC585150MxF PLAYING;
    public static final EnumC585150MxF PREPARED;

    public static InterfaceC2044707zh<EnumC585150MxF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC585150MxF enumC585150MxF = new EnumC585150MxF("IDLE", 0);
        IDLE = enumC585150MxF;
        EnumC585150MxF enumC585150MxF2 = new EnumC585150MxF("PREPARED", 1);
        PREPARED = enumC585150MxF2;
        EnumC585150MxF enumC585150MxF3 = new EnumC585150MxF("PLAYING", 2);
        PLAYING = enumC585150MxF3;
        EnumC585150MxF enumC585150MxF4 = new EnumC585150MxF("BUFFERING", 3);
        BUFFERING = enumC585150MxF4;
        EnumC585150MxF enumC585150MxF5 = new EnumC585150MxF("PAUSED", 4);
        PAUSED = enumC585150MxF5;
        EnumC585150MxF enumC585150MxF6 = new EnumC585150MxF("FINISHED", 5);
        FINISHED = enumC585150MxF6;
        EnumC585150MxF enumC585150MxF7 = new EnumC585150MxF("FAILED", 6);
        FAILED = enumC585150MxF7;
        EnumC585150MxF[] enumC585150MxFArr = {enumC585150MxF, enumC585150MxF2, enumC585150MxF3, enumC585150MxF4, enumC585150MxF5, enumC585150MxF6, enumC585150MxF7};
        LL = enumC585150MxFArr;
        LLILLJJLI = new C2254308sP(enumC585150MxFArr);
    }

    public static EnumC585150MxF[] values() {
        return (EnumC585150MxF[]) LL.clone();
    }

    public static EnumC585150MxF valueOf(String str) {
        return (EnumC585150MxF) C08FF.LIZ(EnumC585150MxF.class, str);
    }

    public EnumC585150MxF(String str, int i) {
    }
}
