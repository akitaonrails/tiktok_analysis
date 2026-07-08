package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0usa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1720740usa {
    public static final EnumC1720740usa LINE;
    public static final EnumC1720740usa LINE_SCROLL;
    public static final /* synthetic */ EnumC1720740usa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1720740usa POWER_LIST;

    public static InterfaceC2044707zh<EnumC1720740usa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1720740usa enumC1720740usa = new EnumC1720740usa("LINE", 0);
        LINE = enumC1720740usa;
        EnumC1720740usa enumC1720740usa2 = new EnumC1720740usa("LINE_SCROLL", 1);
        LINE_SCROLL = enumC1720740usa2;
        EnumC1720740usa enumC1720740usa3 = new EnumC1720740usa("POWER_LIST", 2);
        POWER_LIST = enumC1720740usa3;
        EnumC1720740usa[] enumC1720740usaArr = {enumC1720740usa, enumC1720740usa2, enumC1720740usa3};
        LL = enumC1720740usaArr;
        LLILLJJLI = new C2254308sP(enumC1720740usaArr);
    }

    public static EnumC1720740usa[] values() {
        return (EnumC1720740usa[]) LL.clone();
    }

    public static EnumC1720740usa valueOf(String str) {
        return (EnumC1720740usa) C08FF.LIZ(EnumC1720740usa.class, str);
    }

    public EnumC1720740usa(String str, int i) {
    }
}
