package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EnN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC375190EnN {
    public static final EnumC375190EnN FREE;
    public static final /* synthetic */ EnumC375190EnN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC375190EnN MODE_16_9;
    public static final EnumC375190EnN MODE_1_1;
    public static final EnumC375190EnN MODE_3_4;
    public static final EnumC375190EnN MODE_4_3;
    public static final EnumC375190EnN MODE_9_16;
    public static final EnumC375190EnN ORIGIN;

    public static InterfaceC2044707zh<EnumC375190EnN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC375190EnN enumC375190EnN = new EnumC375190EnN("FREE", 0);
        FREE = enumC375190EnN;
        EnumC375190EnN enumC375190EnN2 = new EnumC375190EnN("MODE_9_16", 1);
        MODE_9_16 = enumC375190EnN2;
        EnumC375190EnN enumC375190EnN3 = new EnumC375190EnN("MODE_3_4", 2);
        MODE_3_4 = enumC375190EnN3;
        EnumC375190EnN enumC375190EnN4 = new EnumC375190EnN("MODE_1_1", 3);
        MODE_1_1 = enumC375190EnN4;
        EnumC375190EnN enumC375190EnN5 = new EnumC375190EnN("MODE_4_3", 4);
        MODE_4_3 = enumC375190EnN5;
        EnumC375190EnN enumC375190EnN6 = new EnumC375190EnN("MODE_16_9", 5);
        MODE_16_9 = enumC375190EnN6;
        EnumC375190EnN enumC375190EnN7 = new EnumC375190EnN("ORIGIN", 6);
        ORIGIN = enumC375190EnN7;
        EnumC375190EnN[] enumC375190EnNArr = {enumC375190EnN, enumC375190EnN2, enumC375190EnN3, enumC375190EnN4, enumC375190EnN5, enumC375190EnN6, enumC375190EnN7};
        LL = enumC375190EnNArr;
        LLILLJJLI = new C2254308sP(enumC375190EnNArr);
    }

    public static EnumC375190EnN[] values() {
        return (EnumC375190EnN[]) LL.clone();
    }

    public static EnumC375190EnN valueOf(String str) {
        return (EnumC375190EnN) C08FF.LIZ(EnumC375190EnN.class, str);
    }

    public EnumC375190EnN(String str, int i) {
    }
}
