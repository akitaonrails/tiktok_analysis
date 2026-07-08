package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Sud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC736410Sud {
    public static final /* synthetic */ EnumC736410Sud[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC736410Sud MUTUAL;
    public static final EnumC736410Sud NO_RELATION;
    public static final EnumC736410Sud SINGLE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC736410Sud> getEntries() {
        return LLILLL;
    }

    static {
        EnumC736410Sud enumC736410Sud = new EnumC736410Sud("SINGLE", 0, "single");
        SINGLE = enumC736410Sud;
        EnumC736410Sud enumC736410Sud2 = new EnumC736410Sud("MUTUAL", 1, "mutual");
        MUTUAL = enumC736410Sud2;
        EnumC736410Sud enumC736410Sud3 = new EnumC736410Sud("NO_RELATION", 2, "");
        NO_RELATION = enumC736410Sud3;
        EnumC736410Sud[] enumC736410SudArr = {enumC736410Sud, enumC736410Sud2, enumC736410Sud3};
        LLILLJJLI = enumC736410SudArr;
        LLILLL = new C2254308sP(enumC736410SudArr);
    }

    public static EnumC736410Sud[] values() {
        return (EnumC736410Sud[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC736410Sud valueOf(String str) {
        return (EnumC736410Sud) C08FF.LIZ(EnumC736410Sud.class, str);
    }

    public EnumC736410Sud(String str, int i, String str2) {
        this.LL = str2;
    }
}
