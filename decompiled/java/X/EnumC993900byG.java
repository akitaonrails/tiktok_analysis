package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993900byG {
    public static final EnumC993900byG BTM;
    public static final EnumC993900byG CURRENT_PAGE;
    public static final EnumC993900byG ENABLE_LOCATION;
    public static final /* synthetic */ EnumC993900byG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC993900byG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993900byG enumC993900byG = new EnumC993900byG("CURRENT_PAGE", 0, 1);
        CURRENT_PAGE = enumC993900byG;
        EnumC993900byG enumC993900byG2 = new EnumC993900byG("BTM", 1, 2);
        BTM = enumC993900byG2;
        EnumC993900byG enumC993900byG3 = new EnumC993900byG("ENABLE_LOCATION", 2, 3);
        ENABLE_LOCATION = enumC993900byG3;
        EnumC993900byG[] enumC993900byGArr = {enumC993900byG, enumC993900byG2, enumC993900byG3};
        LLILLJJLI = enumC993900byGArr;
        LLILLL = new C2254308sP(enumC993900byGArr);
    }

    public static EnumC993900byG[] values() {
        return (EnumC993900byG[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC993900byG valueOf(String str) {
        return (EnumC993900byG) C08FF.LIZ(EnumC993900byG.class, str);
    }

    public EnumC993900byG(String str, int i, int i2) {
        this.LL = i2;
    }
}
