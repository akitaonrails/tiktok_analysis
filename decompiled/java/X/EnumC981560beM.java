package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0beM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC981560beM {
    public static final C981600beQ Companion;
    public static final EnumC981560beM DECLINE_BUTTON;
    public static final EnumC981560beM GAME_NOT_READY;
    public static final EnumC981560beM GAME_VERSION_TOO_LOW;
    public static final EnumC981560beM GIFT_ARENA;
    public static final EnumC981560beM HOSTS_GUEST_CHANGED;
    public static final EnumC981560beM HOSTS_LIST_CHANGED;
    public static final /* synthetic */ EnumC981560beM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC981560beM LOW_PERFORMANCE;
    public static final EnumC981560beM TIME_OUT;

    public static InterfaceC2044707zh<EnumC981560beM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC981560beM enumC981560beM = new EnumC981560beM("DECLINE_BUTTON", 0);
        DECLINE_BUTTON = enumC981560beM;
        EnumC981560beM enumC981560beM2 = new EnumC981560beM("HOSTS_LIST_CHANGED", 1);
        HOSTS_LIST_CHANGED = enumC981560beM2;
        EnumC981560beM enumC981560beM3 = new EnumC981560beM("HOSTS_GUEST_CHANGED", 2);
        HOSTS_GUEST_CHANGED = enumC981560beM3;
        EnumC981560beM enumC981560beM4 = new EnumC981560beM("TIME_OUT", 3);
        TIME_OUT = enumC981560beM4;
        EnumC981560beM enumC981560beM5 = new EnumC981560beM("LOW_PERFORMANCE", 4);
        LOW_PERFORMANCE = enumC981560beM5;
        EnumC981560beM enumC981560beM6 = new EnumC981560beM("GAME_NOT_READY", 5);
        GAME_NOT_READY = enumC981560beM6;
        EnumC981560beM enumC981560beM7 = new EnumC981560beM("GAME_VERSION_TOO_LOW", 6);
        GAME_VERSION_TOO_LOW = enumC981560beM7;
        EnumC981560beM enumC981560beM8 = new EnumC981560beM("GIFT_ARENA", 7);
        GIFT_ARENA = enumC981560beM8;
        EnumC981560beM[] enumC981560beMArr = {enumC981560beM, enumC981560beM2, enumC981560beM3, enumC981560beM4, enumC981560beM5, enumC981560beM6, enumC981560beM7, enumC981560beM8};
        LL = enumC981560beMArr;
        LLILLJJLI = new C2254308sP(enumC981560beMArr);
        Companion = new C981600beQ();
    }

    public static EnumC981560beM[] values() {
        return (EnumC981560beM[]) LL.clone();
    }

    public static EnumC981560beM valueOf(String str) {
        return (EnumC981560beM) C08FF.LIZ(EnumC981560beM.class, str);
    }

    public EnumC981560beM(String str, int i) {
    }
}
