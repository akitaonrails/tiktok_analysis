package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wEO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1772700wEO {
    public static final /* synthetic */ EnumC1772700wEO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1772700wEO V1;
    public static final EnumC1772700wEO V2;

    public static InterfaceC2044707zh<EnumC1772700wEO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1772700wEO enumC1772700wEO = new EnumC1772700wEO("V1", 0);
        V1 = enumC1772700wEO;
        EnumC1772700wEO enumC1772700wEO2 = new EnumC1772700wEO("V2", 1);
        V2 = enumC1772700wEO2;
        EnumC1772700wEO[] enumC1772700wEOArr = {enumC1772700wEO, enumC1772700wEO2};
        LL = enumC1772700wEOArr;
        LLILLJJLI = new C2254308sP(enumC1772700wEOArr);
    }

    public static EnumC1772700wEO[] values() {
        return (EnumC1772700wEO[]) LL.clone();
    }

    public static EnumC1772700wEO valueOf(String str) {
        return (EnumC1772700wEO) C08FF.LIZ(EnumC1772700wEO.class, str);
    }

    public EnumC1772700wEO(String str, int i) {
    }
}
