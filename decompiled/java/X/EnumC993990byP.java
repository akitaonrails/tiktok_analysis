package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993990byP {
    public static final EnumC993990byP AMAZON;
    public static final EnumC993990byP GP;
    public static final /* synthetic */ EnumC993990byP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC993990byP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993990byP enumC993990byP = new EnumC993990byP("GP", 0, "GP");
        GP = enumC993990byP;
        EnumC993990byP enumC993990byP2 = new EnumC993990byP("AMAZON", 1, "AMAZON");
        AMAZON = enumC993990byP2;
        EnumC993990byP[] enumC993990byPArr = {enumC993990byP, enumC993990byP2};
        LLILLJJLI = enumC993990byPArr;
        LLILLL = new C2254308sP(enumC993990byPArr);
    }

    public static EnumC993990byP[] values() {
        return (EnumC993990byP[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC993990byP valueOf(String str) {
        return (EnumC993990byP) C08FF.LIZ(EnumC993990byP.class, str);
    }

    public EnumC993990byP(String str, int i, String str2) {
        this.LL = str2;
    }
}
