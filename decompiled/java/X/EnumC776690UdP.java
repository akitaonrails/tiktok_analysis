package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC776690UdP {
    public static final EnumC776690UdP GAME_LIVE_ENTER_BACKGROUND;
    public static final /* synthetic */ EnumC776690UdP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC776690UdP PERFORMANCE_DATA_UPDATE;

    public static InterfaceC2044707zh<EnumC776690UdP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC776690UdP enumC776690UdP = new EnumC776690UdP("GAME_LIVE_ENTER_BACKGROUND", 0);
        GAME_LIVE_ENTER_BACKGROUND = enumC776690UdP;
        EnumC776690UdP enumC776690UdP2 = new EnumC776690UdP("PERFORMANCE_DATA_UPDATE", 1);
        PERFORMANCE_DATA_UPDATE = enumC776690UdP2;
        EnumC776690UdP[] enumC776690UdPArr = {enumC776690UdP, enumC776690UdP2};
        LL = enumC776690UdPArr;
        LLILLJJLI = new C2254308sP(enumC776690UdPArr);
    }

    public static EnumC776690UdP[] values() {
        return (EnumC776690UdP[]) LL.clone();
    }

    public static EnumC776690UdP valueOf(String str) {
        return (EnumC776690UdP) C08FF.LIZ(EnumC776690UdP.class, str);
    }

    public EnumC776690UdP(String str, int i) {
    }
}
