package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Dg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2261951Dg9 {
    public static final EnumC2261951Dg9 BACKGROUND_ACTIVELY_DISCONNECTED;
    public static final EnumC2261951Dg9 BACKGROUND_CONNECTED;
    public static final EnumC2261951Dg9 BACKGROUND_DISCONNECTED;
    public static final EnumC2261951Dg9 FOREGROUND_ACTIVELY_DISCONNECTED;
    public static final EnumC2261951Dg9 FOREGROUND_CONNECTED;
    public static final EnumC2261951Dg9 FOREGROUND_DISCONNECTED;
    public static final /* synthetic */ EnumC2261951Dg9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2261951Dg9 LOOP;
    public static final EnumC2261951Dg9 NO_NETWORK;
    public static final EnumC2261951Dg9 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2261951Dg9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2261951Dg9 enumC2261951Dg9 = new EnumC2261951Dg9("UNKNOWN", 0, 1);
        UNKNOWN = enumC2261951Dg9;
        EnumC2261951Dg9 enumC2261951Dg92 = new EnumC2261951Dg9("FOREGROUND_CONNECTED", 1, 100);
        FOREGROUND_CONNECTED = enumC2261951Dg92;
        EnumC2261951Dg9 enumC2261951Dg93 = new EnumC2261951Dg9("FOREGROUND_DISCONNECTED", 2, 101);
        FOREGROUND_DISCONNECTED = enumC2261951Dg93;
        EnumC2261951Dg9 enumC2261951Dg94 = new EnumC2261951Dg9("FOREGROUND_ACTIVELY_DISCONNECTED", 3, 102);
        FOREGROUND_ACTIVELY_DISCONNECTED = enumC2261951Dg94;
        EnumC2261951Dg9 enumC2261951Dg95 = new EnumC2261951Dg9("BACKGROUND_CONNECTED", 4, 103);
        BACKGROUND_CONNECTED = enumC2261951Dg95;
        EnumC2261951Dg9 enumC2261951Dg96 = new EnumC2261951Dg9("BACKGROUND_DISCONNECTED", 5, 104);
        BACKGROUND_DISCONNECTED = enumC2261951Dg96;
        EnumC2261951Dg9 enumC2261951Dg97 = new EnumC2261951Dg9("BACKGROUND_ACTIVELY_DISCONNECTED", 6, 105);
        BACKGROUND_ACTIVELY_DISCONNECTED = enumC2261951Dg97;
        EnumC2261951Dg9 enumC2261951Dg98 = new EnumC2261951Dg9("LOOP", 7, 106);
        LOOP = enumC2261951Dg98;
        EnumC2261951Dg9 enumC2261951Dg99 = new EnumC2261951Dg9("NO_NETWORK", 8, 107);
        NO_NETWORK = enumC2261951Dg99;
        EnumC2261951Dg9[] enumC2261951Dg9Arr = {enumC2261951Dg9, enumC2261951Dg92, enumC2261951Dg93, enumC2261951Dg94, enumC2261951Dg95, enumC2261951Dg96, enumC2261951Dg97, enumC2261951Dg98, enumC2261951Dg99};
        LLILLJJLI = enumC2261951Dg9Arr;
        LLILLL = new C2254308sP(enumC2261951Dg9Arr);
    }

    public static EnumC2261951Dg9[] values() {
        return (EnumC2261951Dg9[]) LLILLJJLI.clone();
    }

    public final String field() {
        switch (C2261981DgC.LIZ[ordinal()]) {
            case 1:
                return "foreground_online_time";
            case 2:
                return "foreground_offline_time";
            case 3:
                return "foreground_close_time";
            case 4:
                return "background_online_time";
            case 5:
                return "background_offline_time";
            case 6:
                return "background_close_time";
            default:
                return "prepare_time";
        }
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2261951Dg9 valueOf(String str) {
        return (EnumC2261951Dg9) C08FF.LIZ(EnumC2261951Dg9.class, str);
    }

    public EnumC2261951Dg9(String str, int i, int i2) {
        this.LL = i2;
    }
}
