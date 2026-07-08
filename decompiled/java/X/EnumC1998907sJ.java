package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07sJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1998907sJ {
    public static final EnumC1998907sJ COMBINED;
    public static final /* synthetic */ EnumC1998907sJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1998907sJ NONE;
    public static final EnumC1998907sJ TWO_MATCH;

    public static InterfaceC2044707zh<EnumC1998907sJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1998907sJ enumC1998907sJ = new EnumC1998907sJ("NONE", 0);
        NONE = enumC1998907sJ;
        EnumC1998907sJ enumC1998907sJ2 = new EnumC1998907sJ("COMBINED", 1);
        COMBINED = enumC1998907sJ2;
        EnumC1998907sJ enumC1998907sJ3 = new EnumC1998907sJ("TWO_MATCH", 2);
        TWO_MATCH = enumC1998907sJ3;
        EnumC1998907sJ[] enumC1998907sJArr = {enumC1998907sJ, enumC1998907sJ2, enumC1998907sJ3};
        LL = enumC1998907sJArr;
        LLILLJJLI = new C2254308sP(enumC1998907sJArr);
    }

    public static EnumC1998907sJ[] values() {
        return (EnumC1998907sJ[]) LL.clone();
    }

    public static EnumC1998907sJ valueOf(String str) {
        return (EnumC1998907sJ) C08FF.LIZ(EnumC1998907sJ.class, str);
    }

    public EnumC1998907sJ(String str, int i) {
    }
}
