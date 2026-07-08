package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bgF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC982730bgF {
    public static final EnumC982730bgF ANCHOR_BANNED;
    public static final EnumC982730bgF ANCHOR_CLOSED;
    public static final C983330bhD Companion;
    public static final EnumC982730bgF HAS_PERMISSION;
    public static final /* synthetic */ EnumC982730bgF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC982730bgF NO_PERMISSION;
    public static final EnumC982730bgF UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC982730bgF> getEntries() {
        return LLILLL;
    }

    public static final EnumC982730bgF getTypeFromInt(Integer num) {
        Companion.getClass();
        return C983330bhD.LIZ(num);
    }

    static {
        EnumC982730bgF enumC982730bgF = new EnumC982730bgF("UNKNOWN", 0, 0);
        UNKNOWN = enumC982730bgF;
        EnumC982730bgF enumC982730bgF2 = new EnumC982730bgF("NO_PERMISSION", 1, 1);
        NO_PERMISSION = enumC982730bgF2;
        EnumC982730bgF enumC982730bgF3 = new EnumC982730bgF("ANCHOR_CLOSED", 2, 2);
        ANCHOR_CLOSED = enumC982730bgF3;
        EnumC982730bgF enumC982730bgF4 = new EnumC982730bgF("HAS_PERMISSION", 3, 3);
        HAS_PERMISSION = enumC982730bgF4;
        EnumC982730bgF enumC982730bgF5 = new EnumC982730bgF("ANCHOR_BANNED", 4, 4);
        ANCHOR_BANNED = enumC982730bgF5;
        EnumC982730bgF[] enumC982730bgFArr = {enumC982730bgF, enumC982730bgF2, enumC982730bgF3, enumC982730bgF4, enumC982730bgF5};
        LLILLJJLI = enumC982730bgFArr;
        LLILLL = new C2254308sP(enumC982730bgFArr);
        Companion = new C983330bhD();
    }

    public static EnumC982730bgF[] values() {
        return (EnumC982730bgF[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC982730bgF valueOf(String str) {
        return (EnumC982730bgF) C08FF.LIZ(EnumC982730bgF.class, str);
    }

    public EnumC982730bgF(String str, int i, int i2) {
        this.LL = i2;
    }
}
