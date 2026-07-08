package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC585160MxG {
    public static final EnumC585160MxG IDLE;
    public static final /* synthetic */ EnumC585160MxG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC585160MxG PAUSED;
    public static final EnumC585160MxG PLAYING;
    public static final EnumC585160MxG PREPARED;
    public static final EnumC585160MxG STOPPED;

    public static InterfaceC2044707zh<EnumC585160MxG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC585160MxG enumC585160MxG = new EnumC585160MxG("IDLE", 0);
        IDLE = enumC585160MxG;
        EnumC585160MxG enumC585160MxG2 = new EnumC585160MxG("PREPARED", 1);
        PREPARED = enumC585160MxG2;
        EnumC585160MxG enumC585160MxG3 = new EnumC585160MxG("PLAYING", 2);
        PLAYING = enumC585160MxG3;
        EnumC585160MxG enumC585160MxG4 = new EnumC585160MxG("PAUSED", 3);
        PAUSED = enumC585160MxG4;
        EnumC585160MxG enumC585160MxG5 = new EnumC585160MxG("STOPPED", 4);
        STOPPED = enumC585160MxG5;
        EnumC585160MxG[] enumC585160MxGArr = {enumC585160MxG, enumC585160MxG2, enumC585160MxG3, enumC585160MxG4, enumC585160MxG5};
        LL = enumC585160MxGArr;
        LLILLJJLI = new C2254308sP(enumC585160MxGArr);
    }

    public static EnumC585160MxG[] values() {
        return (EnumC585160MxG[]) LL.clone();
    }

    public static EnumC585160MxG valueOf(String str) {
        return (EnumC585160MxG) C08FF.LIZ(EnumC585160MxG.class, str);
    }

    public EnumC585160MxG(String str, int i) {
    }
}
