package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EnO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC375200EnO {
    public static final EnumC375200EnO FREE;
    public static final /* synthetic */ EnumC375200EnO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC375200EnO MODE_16_9;
    public static final EnumC375200EnO MODE_1_1;
    public static final EnumC375200EnO MODE_3_4;
    public static final EnumC375200EnO MODE_4_3;
    public static final EnumC375200EnO MODE_9_16;
    public static final EnumC375200EnO ORIGIN;

    public static InterfaceC2044707zh<EnumC375200EnO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC375200EnO enumC375200EnO = new EnumC375200EnO("FREE", 0);
        FREE = enumC375200EnO;
        EnumC375200EnO enumC375200EnO2 = new EnumC375200EnO("MODE_9_16", 1);
        MODE_9_16 = enumC375200EnO2;
        EnumC375200EnO enumC375200EnO3 = new EnumC375200EnO("MODE_3_4", 2);
        MODE_3_4 = enumC375200EnO3;
        EnumC375200EnO enumC375200EnO4 = new EnumC375200EnO("MODE_1_1", 3);
        MODE_1_1 = enumC375200EnO4;
        EnumC375200EnO enumC375200EnO5 = new EnumC375200EnO("MODE_4_3", 4);
        MODE_4_3 = enumC375200EnO5;
        EnumC375200EnO enumC375200EnO6 = new EnumC375200EnO("MODE_16_9", 5);
        MODE_16_9 = enumC375200EnO6;
        EnumC375200EnO enumC375200EnO7 = new EnumC375200EnO("ORIGIN", 6);
        ORIGIN = enumC375200EnO7;
        EnumC375200EnO[] enumC375200EnOArr = {enumC375200EnO, enumC375200EnO2, enumC375200EnO3, enumC375200EnO4, enumC375200EnO5, enumC375200EnO6, enumC375200EnO7};
        LL = enumC375200EnOArr;
        LLILLJJLI = new C2254308sP(enumC375200EnOArr);
    }

    public static EnumC375200EnO[] values() {
        return (EnumC375200EnO[]) LL.clone();
    }

    public static EnumC375200EnO valueOf(String str) {
        return (EnumC375200EnO) C08FF.LIZ(EnumC375200EnO.class, str);
    }

    public EnumC375200EnO(String str, int i) {
    }
}
