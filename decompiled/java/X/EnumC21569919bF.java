package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19bF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC21569919bF {
    public static final EnumC21569919bF CUSTOM;
    public static final EnumC21569919bF DUET;
    public static final /* synthetic */ EnumC21569919bF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21569919bF REACTION;

    public static InterfaceC2044707zh<EnumC21569919bF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21569919bF enumC21569919bF = new EnumC21569919bF("CUSTOM", 0);
        CUSTOM = enumC21569919bF;
        EnumC21569919bF enumC21569919bF2 = new EnumC21569919bF("REACTION", 1);
        REACTION = enumC21569919bF2;
        EnumC21569919bF enumC21569919bF3 = new EnumC21569919bF("DUET", 2);
        DUET = enumC21569919bF3;
        EnumC21569919bF[] enumC21569919bFArr = {enumC21569919bF, enumC21569919bF2, enumC21569919bF3};
        LL = enumC21569919bFArr;
        LLILLJJLI = new C2254308sP(enumC21569919bFArr);
    }

    public static EnumC21569919bF[] values() {
        return (EnumC21569919bF[]) LL.clone();
    }

    public static EnumC21569919bF valueOf(String str) {
        return (EnumC21569919bF) C08FF.LIZ(EnumC21569919bF.class, str);
    }

    public EnumC21569919bF(String str, int i) {
    }
}
