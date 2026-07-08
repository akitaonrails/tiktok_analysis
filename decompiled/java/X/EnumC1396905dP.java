package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05dP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1396905dP {
    public static final /* synthetic */ EnumC1396905dP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1396905dP REFRESH_CONTENT;
    public static final EnumC1396905dP REFRESH_FULL_PAGE;
    public static final EnumC1396905dP UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1396905dP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1396905dP enumC1396905dP = new EnumC1396905dP("UNKNOWN", 0, 0);
        UNKNOWN = enumC1396905dP;
        EnumC1396905dP enumC1396905dP2 = new EnumC1396905dP("REFRESH_CONTENT", 1, 1);
        REFRESH_CONTENT = enumC1396905dP2;
        EnumC1396905dP enumC1396905dP3 = new EnumC1396905dP("REFRESH_FULL_PAGE", 2, 2);
        REFRESH_FULL_PAGE = enumC1396905dP3;
        EnumC1396905dP[] enumC1396905dPArr = {enumC1396905dP, enumC1396905dP2, enumC1396905dP3};
        LLILLJJLI = enumC1396905dPArr;
        LLILLL = new C2254308sP(enumC1396905dPArr);
    }

    public static EnumC1396905dP[] values() {
        return (EnumC1396905dP[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1396905dP valueOf(String str) {
        return (EnumC1396905dP) C08FF.LIZ(EnumC1396905dP.class, str);
    }

    public EnumC1396905dP(String str, int i, int i2) {
        this.LL = i2;
    }
}
