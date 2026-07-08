package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bgG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC982740bgG {
    public static final C983510bhV Companion;
    public static final /* synthetic */ EnumC982740bgG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC982740bgG NORMAL;
    public static final EnumC982740bgG REMATCH;
    public static final EnumC982740bgG REMATCH_RECOMMEND;
    public final int LL;

    public static InterfaceC2044707zh<EnumC982740bgG> getEntries() {
        return LLILLL;
    }

    public static final EnumC982740bgG getTypeFromInt(Integer num) {
        Companion.getClass();
        return C983510bhV.LIZ(num);
    }

    static {
        EnumC982740bgG enumC982740bgG = new EnumC982740bgG("NORMAL", 0, 0);
        NORMAL = enumC982740bgG;
        EnumC982740bgG enumC982740bgG2 = new EnumC982740bgG("REMATCH", 1, 1);
        REMATCH = enumC982740bgG2;
        EnumC982740bgG enumC982740bgG3 = new EnumC982740bgG("REMATCH_RECOMMEND", 2, 6);
        REMATCH_RECOMMEND = enumC982740bgG3;
        EnumC982740bgG[] enumC982740bgGArr = {enumC982740bgG, enumC982740bgG2, enumC982740bgG3};
        LLILLJJLI = enumC982740bgGArr;
        LLILLL = new C2254308sP(enumC982740bgGArr);
        Companion = new C983510bhV();
    }

    public static EnumC982740bgG[] values() {
        return (EnumC982740bgG[]) LLILLJJLI.clone();
    }

    public final boolean isNormal() {
        return this == NORMAL;
    }

    public final boolean isRematch() {
        return this == REMATCH || this == REMATCH_RECOMMEND;
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC982740bgG valueOf(String str) {
        return (EnumC982740bgG) C08FF.LIZ(EnumC982740bgG.class, str);
    }

    public EnumC982740bgG(String str, int i, int i2) {
        this.LL = i2;
    }
}
