package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zoy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC911260Zoy {
    public static final /* synthetic */ EnumC911260Zoy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC911260Zoy MISSING_RESOURCE;
    public static final EnumC911260Zoy NO_ERROR;
    public static final EnumC911260Zoy PLAYER_ERROR;
    public static final EnumC911260Zoy UNKNOWN_ERROR;
    public final int LL;

    public static InterfaceC2044707zh<EnumC911260Zoy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC911260Zoy enumC911260Zoy = new EnumC911260Zoy("UNKNOWN_ERROR", 0, -1);
        UNKNOWN_ERROR = enumC911260Zoy;
        EnumC911260Zoy enumC911260Zoy2 = new EnumC911260Zoy("NO_ERROR", 1, 0);
        NO_ERROR = enumC911260Zoy2;
        EnumC911260Zoy enumC911260Zoy3 = new EnumC911260Zoy("PLAYER_ERROR", 2, 1);
        PLAYER_ERROR = enumC911260Zoy3;
        EnumC911260Zoy enumC911260Zoy4 = new EnumC911260Zoy("MISSING_RESOURCE", 3, 2);
        MISSING_RESOURCE = enumC911260Zoy4;
        EnumC911260Zoy[] enumC911260ZoyArr = {enumC911260Zoy, enumC911260Zoy2, enumC911260Zoy3, enumC911260Zoy4};
        LLILLJJLI = enumC911260ZoyArr;
        LLILLL = new C2254308sP(enumC911260ZoyArr);
    }

    public static EnumC911260Zoy[] values() {
        return (EnumC911260Zoy[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC911260Zoy valueOf(String str) {
        return (EnumC911260Zoy) C08FF.LIZ(EnumC911260Zoy.class, str);
    }

    public EnumC911260Zoy(String str, int i, int i2) {
        this.LL = i2;
    }
}
