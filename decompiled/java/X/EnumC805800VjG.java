package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VjG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC805800VjG {
    public static final C805810VjH Companion;
    public static final EnumC805800VjG IMSDK_RECEIVE;
    public static final /* synthetic */ EnumC805800VjG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC805800VjG LOGOUT;
    public static final EnumC805800VjG MIX_CHAIN_FIX;
    public static final EnumC805800VjG PUSH_RECEIVE;
    public static final EnumC805800VjG RECONNECT_WS;
    public static final EnumC805800VjG UNKNOWN;
    public final int LL;

    public static final EnumC805800VjG getByWhat(int i) {
        Companion.getClass();
        return C805810VjH.LIZ(i);
    }

    public static InterfaceC2044707zh<EnumC805800VjG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC805800VjG enumC805800VjG = new EnumC805800VjG("UNKNOWN", 0, 0);
        UNKNOWN = enumC805800VjG;
        EnumC805800VjG enumC805800VjG2 = new EnumC805800VjG("RECONNECT_WS", 1, 1);
        RECONNECT_WS = enumC805800VjG2;
        EnumC805800VjG enumC805800VjG3 = new EnumC805800VjG("PUSH_RECEIVE", 2, 2);
        PUSH_RECEIVE = enumC805800VjG3;
        EnumC805800VjG enumC805800VjG4 = new EnumC805800VjG("IMSDK_RECEIVE", 3, 3);
        IMSDK_RECEIVE = enumC805800VjG4;
        EnumC805800VjG enumC805800VjG5 = new EnumC805800VjG("MIX_CHAIN_FIX", 4, 4);
        MIX_CHAIN_FIX = enumC805800VjG5;
        EnumC805800VjG enumC805800VjG6 = new EnumC805800VjG("LOGOUT", 5, 5);
        LOGOUT = enumC805800VjG6;
        EnumC805800VjG[] enumC805800VjGArr = {enumC805800VjG, enumC805800VjG2, enumC805800VjG3, enumC805800VjG4, enumC805800VjG5, enumC805800VjG6};
        LLILLJJLI = enumC805800VjGArr;
        LLILLL = new C2254308sP(enumC805800VjGArr);
        Companion = new C805810VjH();
    }

    public static EnumC805800VjG[] values() {
        return (EnumC805800VjG[]) LLILLJJLI.clone();
    }

    public final int getWhat() {
        return this.LL;
    }

    public static EnumC805800VjG valueOf(String str) {
        return (EnumC805800VjG) C08FF.LIZ(EnumC805800VjG.class, str);
    }

    public EnumC805800VjG(String str, int i, int i2) {
        this.LL = i2;
    }
}
