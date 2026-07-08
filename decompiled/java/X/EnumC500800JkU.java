package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JkU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC500800JkU {
    public static final EnumC500800JkU LIVE_BROADCAST;
    public static final EnumC500800JkU LIVE_ROOM;
    public static final /* synthetic */ EnumC500800JkU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC500800JkU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC500800JkU enumC500800JkU = new EnumC500800JkU("LIVE_ROOM", 0);
        LIVE_ROOM = enumC500800JkU;
        EnumC500800JkU enumC500800JkU2 = new EnumC500800JkU("LIVE_BROADCAST", 1);
        LIVE_BROADCAST = enumC500800JkU2;
        EnumC500800JkU[] enumC500800JkUArr = {enumC500800JkU, enumC500800JkU2};
        LL = enumC500800JkUArr;
        LLILLJJLI = new C2254308sP(enumC500800JkUArr);
    }

    public static EnumC500800JkU[] values() {
        return (EnumC500800JkU[]) LL.clone();
    }

    public static EnumC500800JkU valueOf(String str) {
        return (EnumC500800JkU) C08FF.LIZ(EnumC500800JkU.class, str);
    }

    public EnumC500800JkU(String str, int i) {
    }
}
