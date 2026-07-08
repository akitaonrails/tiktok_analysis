package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17sJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21166117sJ {
    public static final EnumC21166117sJ FE;
    public static final /* synthetic */ EnumC21166117sJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21166117sJ NA;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21166117sJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21166117sJ enumC21166117sJ = new EnumC21166117sJ("NA", 0, "na");
        NA = enumC21166117sJ;
        EnumC21166117sJ enumC21166117sJ2 = new EnumC21166117sJ("FE", 1, "fe");
        FE = enumC21166117sJ2;
        EnumC21166117sJ[] enumC21166117sJArr = {enumC21166117sJ, enumC21166117sJ2};
        LLILLJJLI = enumC21166117sJArr;
        LLILLL = new C2254308sP(enumC21166117sJArr);
    }

    public static EnumC21166117sJ[] values() {
        return (EnumC21166117sJ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC21166117sJ valueOf(String str) {
        return (EnumC21166117sJ) C08FF.LIZ(EnumC21166117sJ.class, str);
    }

    public EnumC21166117sJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
