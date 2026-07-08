package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xVP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1821690xVP {
    public static final EnumC1821690xVP FAILURE;
    public static final EnumC1821690xVP INIT;
    public static final /* synthetic */ EnumC1821690xVP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1821690xVP LOADING;
    public static final EnumC1821690xVP SUCCESS;

    public static InterfaceC2044707zh<EnumC1821690xVP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1821690xVP enumC1821690xVP = new EnumC1821690xVP("INIT", 0);
        INIT = enumC1821690xVP;
        EnumC1821690xVP enumC1821690xVP2 = new EnumC1821690xVP("LOADING", 1);
        LOADING = enumC1821690xVP2;
        EnumC1821690xVP enumC1821690xVP3 = new EnumC1821690xVP("SUCCESS", 2);
        SUCCESS = enumC1821690xVP3;
        EnumC1821690xVP enumC1821690xVP4 = new EnumC1821690xVP("FAILURE", 3);
        FAILURE = enumC1821690xVP4;
        EnumC1821690xVP[] enumC1821690xVPArr = {enumC1821690xVP, enumC1821690xVP2, enumC1821690xVP3, enumC1821690xVP4};
        LL = enumC1821690xVPArr;
        LLILLJJLI = new C2254308sP(enumC1821690xVPArr);
    }

    public static EnumC1821690xVP[] values() {
        return (EnumC1821690xVP[]) LL.clone();
    }

    public static EnumC1821690xVP valueOf(String str) {
        return (EnumC1821690xVP) C08FF.LIZ(EnumC1821690xVP.class, str);
    }

    public EnumC1821690xVP(String str, int i) {
    }
}
