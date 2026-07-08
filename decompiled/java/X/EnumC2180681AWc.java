package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2180681AWc {
    public static final EnumC2180681AWc FINISH;
    public static final EnumC2180681AWc INIT;
    public static final /* synthetic */ EnumC2180681AWc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2180681AWc PAUSE;
    public static final EnumC2180681AWc RUNNING;
    public static final EnumC2180681AWc STOP;

    public static InterfaceC2044707zh<EnumC2180681AWc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2180681AWc enumC2180681AWc = new EnumC2180681AWc("INIT", 0);
        INIT = enumC2180681AWc;
        EnumC2180681AWc enumC2180681AWc2 = new EnumC2180681AWc("RUNNING", 1);
        RUNNING = enumC2180681AWc2;
        EnumC2180681AWc enumC2180681AWc3 = new EnumC2180681AWc("PAUSE", 2);
        PAUSE = enumC2180681AWc3;
        EnumC2180681AWc enumC2180681AWc4 = new EnumC2180681AWc("STOP", 3);
        STOP = enumC2180681AWc4;
        EnumC2180681AWc enumC2180681AWc5 = new EnumC2180681AWc("FINISH", 4);
        FINISH = enumC2180681AWc5;
        EnumC2180681AWc[] enumC2180681AWcArr = {enumC2180681AWc, enumC2180681AWc2, enumC2180681AWc3, enumC2180681AWc4, enumC2180681AWc5};
        LL = enumC2180681AWcArr;
        LLILLJJLI = new C2254308sP(enumC2180681AWcArr);
    }

    public static EnumC2180681AWc[] values() {
        return (EnumC2180681AWc[]) LL.clone();
    }

    public static EnumC2180681AWc valueOf(String str) {
        return (EnumC2180681AWc) C08FF.LIZ(EnumC2180681AWc.class, str);
    }

    public EnumC2180681AWc(String str, int i) {
    }
}
