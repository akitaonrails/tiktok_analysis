package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0onG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1486800onG {
    public static final EnumC1486800onG INIT;
    public static final /* synthetic */ EnumC1486800onG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1486800onG PAUSE;
    public static final EnumC1486800onG RELEASE;
    public static final EnumC1486800onG RESUME;
    public static final EnumC1486800onG START;
    public static final EnumC1486800onG STOP;

    public static InterfaceC2044707zh<EnumC1486800onG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1486800onG enumC1486800onG = new EnumC1486800onG("INIT", 0);
        INIT = enumC1486800onG;
        EnumC1486800onG enumC1486800onG2 = new EnumC1486800onG("START", 1);
        START = enumC1486800onG2;
        EnumC1486800onG enumC1486800onG3 = new EnumC1486800onG("PAUSE", 2);
        PAUSE = enumC1486800onG3;
        EnumC1486800onG enumC1486800onG4 = new EnumC1486800onG("RESUME", 3);
        RESUME = enumC1486800onG4;
        EnumC1486800onG enumC1486800onG5 = new EnumC1486800onG("STOP", 4);
        STOP = enumC1486800onG5;
        EnumC1486800onG enumC1486800onG6 = new EnumC1486800onG("RELEASE", 5);
        RELEASE = enumC1486800onG6;
        EnumC1486800onG[] enumC1486800onGArr = {enumC1486800onG, enumC1486800onG2, enumC1486800onG3, enumC1486800onG4, enumC1486800onG5, enumC1486800onG6};
        LL = enumC1486800onGArr;
        LLILLJJLI = new C2254308sP(enumC1486800onGArr);
    }

    public static EnumC1486800onG[] values() {
        return (EnumC1486800onG[]) LL.clone();
    }

    public static EnumC1486800onG valueOf(String str) {
        return (EnumC1486800onG) C08FF.LIZ(EnumC1486800onG.class, str);
    }

    public EnumC1486800onG(String str, int i) {
    }
}
