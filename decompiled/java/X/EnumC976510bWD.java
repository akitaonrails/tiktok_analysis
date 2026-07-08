package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bWD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC976510bWD {
    public static final EnumC976510bWD CANCEL_BUTTON;
    public static final EnumC976510bWD CANCEL_FROM_JSB;
    public static final C976520bWE Companion;
    public static final EnumC976510bWD HOSTS_LIST_CHANGED;
    public static final /* synthetic */ EnumC976510bWD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC976510bWD MIC_ROOM_START;
    public static final EnumC976510bWD TIME_OUT;
    public static final EnumC976510bWD UNKNOWN;

    public static InterfaceC2044707zh<EnumC976510bWD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC976510bWD enumC976510bWD = new EnumC976510bWD("CANCEL_BUTTON", 0);
        CANCEL_BUTTON = enumC976510bWD;
        EnumC976510bWD enumC976510bWD2 = new EnumC976510bWD("HOSTS_LIST_CHANGED", 1);
        HOSTS_LIST_CHANGED = enumC976510bWD2;
        EnumC976510bWD enumC976510bWD3 = new EnumC976510bWD("MIC_ROOM_START", 2);
        MIC_ROOM_START = enumC976510bWD3;
        EnumC976510bWD enumC976510bWD4 = new EnumC976510bWD("TIME_OUT", 3);
        TIME_OUT = enumC976510bWD4;
        EnumC976510bWD enumC976510bWD5 = new EnumC976510bWD("CANCEL_FROM_JSB", 4);
        CANCEL_FROM_JSB = enumC976510bWD5;
        EnumC976510bWD enumC976510bWD6 = new EnumC976510bWD("UNKNOWN", 5);
        UNKNOWN = enumC976510bWD6;
        EnumC976510bWD[] enumC976510bWDArr = {enumC976510bWD, enumC976510bWD2, enumC976510bWD3, enumC976510bWD4, enumC976510bWD5, enumC976510bWD6};
        LL = enumC976510bWDArr;
        LLILLJJLI = new C2254308sP(enumC976510bWDArr);
        Companion = new C976520bWE();
    }

    public static EnumC976510bWD[] values() {
        return (EnumC976510bWD[]) LL.clone();
    }

    public static EnumC976510bWD valueOf(String str) {
        return (EnumC976510bWD) C08FF.LIZ(EnumC976510bWD.class, str);
    }

    public EnumC976510bWD(String str, int i) {
    }
}
