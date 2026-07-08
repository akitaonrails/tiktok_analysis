package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Uk5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC780830Uk5 {
    public static final /* synthetic */ EnumC780830Uk5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC780830Uk5 LOCAL;
    public static final EnumC780830Uk5 P0;
    public static final EnumC780830Uk5 P1;
    public static final EnumC780830Uk5 P2;

    public static InterfaceC2044707zh<EnumC780830Uk5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC780830Uk5 enumC780830Uk5 = new EnumC780830Uk5("P0", 0);
        P0 = enumC780830Uk5;
        EnumC780830Uk5 enumC780830Uk52 = new EnumC780830Uk5("P1", 1);
        P1 = enumC780830Uk52;
        EnumC780830Uk5 enumC780830Uk53 = new EnumC780830Uk5("P2", 2);
        P2 = enumC780830Uk53;
        EnumC780830Uk5 enumC780830Uk54 = new EnumC780830Uk5("LOCAL", 3);
        LOCAL = enumC780830Uk54;
        EnumC780830Uk5[] enumC780830Uk5Arr = {enumC780830Uk5, enumC780830Uk52, enumC780830Uk53, enumC780830Uk54};
        LL = enumC780830Uk5Arr;
        LLILLJJLI = new C2254308sP(enumC780830Uk5Arr);
    }

    public static EnumC780830Uk5[] values() {
        return (EnumC780830Uk5[]) LL.clone();
    }

    public static EnumC780830Uk5 valueOf(String str) {
        return (EnumC780830Uk5) C08FF.LIZ(EnumC780830Uk5.class, str);
    }

    public EnumC780830Uk5(String str, int i) {
    }
}
