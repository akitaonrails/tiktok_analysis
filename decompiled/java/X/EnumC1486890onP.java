package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0onP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1486890onP {
    public static final EnumC1486890onP INIT;
    public static final /* synthetic */ EnumC1486890onP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1486890onP PAUSE;
    public static final EnumC1486890onP RELEASE;
    public static final EnumC1486890onP RESUME;
    public static final EnumC1486890onP START;
    public static final EnumC1486890onP STOP;

    public static InterfaceC2044707zh<EnumC1486890onP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1486890onP enumC1486890onP = new EnumC1486890onP("INIT", 0);
        INIT = enumC1486890onP;
        EnumC1486890onP enumC1486890onP2 = new EnumC1486890onP("START", 1);
        START = enumC1486890onP2;
        EnumC1486890onP enumC1486890onP3 = new EnumC1486890onP("PAUSE", 2);
        PAUSE = enumC1486890onP3;
        EnumC1486890onP enumC1486890onP4 = new EnumC1486890onP("RESUME", 3);
        RESUME = enumC1486890onP4;
        EnumC1486890onP enumC1486890onP5 = new EnumC1486890onP("STOP", 4);
        STOP = enumC1486890onP5;
        EnumC1486890onP enumC1486890onP6 = new EnumC1486890onP("RELEASE", 5);
        RELEASE = enumC1486890onP6;
        EnumC1486890onP[] enumC1486890onPArr = {enumC1486890onP, enumC1486890onP2, enumC1486890onP3, enumC1486890onP4, enumC1486890onP5, enumC1486890onP6};
        LL = enumC1486890onPArr;
        LLILLJJLI = new C2254308sP(enumC1486890onPArr);
    }

    public static EnumC1486890onP[] values() {
        return (EnumC1486890onP[]) LL.clone();
    }

    public static EnumC1486890onP valueOf(String str) {
        return (EnumC1486890onP) C08FF.LIZ(EnumC1486890onP.class, str);
    }

    public EnumC1486890onP(String str, int i) {
    }
}
