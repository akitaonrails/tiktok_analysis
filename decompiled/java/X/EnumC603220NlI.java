package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC603220NlI {
    public static final EnumC603220NlI CLICK;
    public static final EnumC603220NlI COLD_START;
    public static final EnumC603220NlI DOWN;
    public static final /* synthetic */ EnumC603220NlI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC603220NlI UP;

    public static InterfaceC2044707zh<EnumC603220NlI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC603220NlI enumC603220NlI = new EnumC603220NlI("CLICK", 0);
        CLICK = enumC603220NlI;
        EnumC603220NlI enumC603220NlI2 = new EnumC603220NlI("UP", 1);
        UP = enumC603220NlI2;
        EnumC603220NlI enumC603220NlI3 = new EnumC603220NlI("DOWN", 2);
        DOWN = enumC603220NlI3;
        EnumC603220NlI enumC603220NlI4 = new EnumC603220NlI("COLD_START", 3);
        COLD_START = enumC603220NlI4;
        EnumC603220NlI[] enumC603220NlIArr = {enumC603220NlI, enumC603220NlI2, enumC603220NlI3, enumC603220NlI4};
        LL = enumC603220NlIArr;
        LLILLJJLI = new C2254308sP(enumC603220NlIArr);
    }

    public static EnumC603220NlI[] values() {
        return (EnumC603220NlI[]) LL.clone();
    }

    public static EnumC603220NlI valueOf(String str) {
        return (EnumC603220NlI) C08FF.LIZ(EnumC603220NlI.class, str);
    }

    public EnumC603220NlI(String str, int i) {
    }
}
