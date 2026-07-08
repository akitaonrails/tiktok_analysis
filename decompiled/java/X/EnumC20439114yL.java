package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14yL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20439114yL {
    public static final EnumC20439114yL ATTR_TYPE;
    public static final EnumC20439114yL GECKO;
    public static final /* synthetic */ EnumC20439114yL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20439114yL RAW_TYPE;
    public static final EnumC20439114yL RES_TYPE;
    public static final EnumC20439114yL URL;

    public static InterfaceC2044707zh<EnumC20439114yL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20439114yL enumC20439114yL = new EnumC20439114yL("RES_TYPE", 0);
        RES_TYPE = enumC20439114yL;
        EnumC20439114yL enumC20439114yL2 = new EnumC20439114yL("ATTR_TYPE", 1);
        ATTR_TYPE = enumC20439114yL2;
        EnumC20439114yL enumC20439114yL3 = new EnumC20439114yL("GECKO", 2);
        GECKO = enumC20439114yL3;
        EnumC20439114yL enumC20439114yL4 = new EnumC20439114yL("URL", 3);
        URL = enumC20439114yL4;
        EnumC20439114yL enumC20439114yL5 = new EnumC20439114yL("RAW_TYPE", 4);
        RAW_TYPE = enumC20439114yL5;
        EnumC20439114yL[] enumC20439114yLArr = {enumC20439114yL, enumC20439114yL2, enumC20439114yL3, enumC20439114yL4, enumC20439114yL5};
        LL = enumC20439114yLArr;
        LLILLJJLI = new C2254308sP(enumC20439114yLArr);
    }

    public static EnumC20439114yL[] values() {
        return (EnumC20439114yL[]) LL.clone();
    }

    public static EnumC20439114yL valueOf(String str) {
        return (EnumC20439114yL) C08FF.LIZ(EnumC20439114yL.class, str);
    }

    public EnumC20439114yL(String str, int i) {
    }
}
