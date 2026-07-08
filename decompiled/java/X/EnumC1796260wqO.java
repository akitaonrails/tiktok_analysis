package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wqO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1796260wqO {
    public static final EnumC1796260wqO APP_LOG;
    public static final EnumC1796260wqO BOTH;
    public static final /* synthetic */ EnumC1796260wqO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1796260wqO MONITOR;

    public static InterfaceC2044707zh<EnumC1796260wqO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1796260wqO enumC1796260wqO = new EnumC1796260wqO("MONITOR", 0);
        MONITOR = enumC1796260wqO;
        EnumC1796260wqO enumC1796260wqO2 = new EnumC1796260wqO("APP_LOG", 1);
        APP_LOG = enumC1796260wqO2;
        EnumC1796260wqO enumC1796260wqO3 = new EnumC1796260wqO("BOTH", 2);
        BOTH = enumC1796260wqO3;
        EnumC1796260wqO[] enumC1796260wqOArr = {enumC1796260wqO, enumC1796260wqO2, enumC1796260wqO3};
        LL = enumC1796260wqOArr;
        LLILLJJLI = new C2254308sP(enumC1796260wqOArr);
    }

    public static EnumC1796260wqO[] values() {
        return (EnumC1796260wqO[]) LL.clone();
    }

    public static EnumC1796260wqO valueOf(String str) {
        return (EnumC1796260wqO) C08FF.LIZ(EnumC1796260wqO.class, str);
    }

    public EnumC1796260wqO(String str, int i) {
    }
}
