package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1ANg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2178381ANg {
    public static final EnumC2178381ANg INITIALIZED;
    public static final /* synthetic */ EnumC2178381ANg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2178381ANg PAUSED;
    public static final EnumC2178381ANg RELEASED;
    public static final EnumC2178381ANg RESUMED;
    public static final EnumC2178381ANg START;

    public static InterfaceC2044707zh<EnumC2178381ANg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2178381ANg enumC2178381ANg = new EnumC2178381ANg("INITIALIZED", 0);
        INITIALIZED = enumC2178381ANg;
        EnumC2178381ANg enumC2178381ANg2 = new EnumC2178381ANg("START", 1);
        START = enumC2178381ANg2;
        EnumC2178381ANg enumC2178381ANg3 = new EnumC2178381ANg("PAUSED", 2);
        PAUSED = enumC2178381ANg3;
        EnumC2178381ANg enumC2178381ANg4 = new EnumC2178381ANg("RESUMED", 3);
        RESUMED = enumC2178381ANg4;
        EnumC2178381ANg enumC2178381ANg5 = new EnumC2178381ANg("RELEASED", 4);
        RELEASED = enumC2178381ANg5;
        EnumC2178381ANg[] enumC2178381ANgArr = {enumC2178381ANg, enumC2178381ANg2, enumC2178381ANg3, enumC2178381ANg4, enumC2178381ANg5};
        LL = enumC2178381ANgArr;
        LLILLJJLI = new C2254308sP(enumC2178381ANgArr);
    }

    public static EnumC2178381ANg[] values() {
        return (EnumC2178381ANg[]) LL.clone();
    }

    public static EnumC2178381ANg valueOf(String str) {
        return (EnumC2178381ANg) C08FF.LIZ(EnumC2178381ANg.class, str);
    }

    public EnumC2178381ANg(String str, int i) {
    }
}
