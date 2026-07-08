package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1984507pz {
    public static final EnumC1984507pz BUILDING_TOKEN;
    public static final EnumC1984507pz COMPLETING;
    public static final /* synthetic */ EnumC1984507pz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1984507pz PRECHECK;

    public static InterfaceC2044707zh<EnumC1984507pz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1984507pz enumC1984507pz = new EnumC1984507pz("PRECHECK", 0);
        PRECHECK = enumC1984507pz;
        EnumC1984507pz enumC1984507pz2 = new EnumC1984507pz("BUILDING_TOKEN", 1);
        BUILDING_TOKEN = enumC1984507pz2;
        EnumC1984507pz enumC1984507pz3 = new EnumC1984507pz("COMPLETING", 2);
        COMPLETING = enumC1984507pz3;
        EnumC1984507pz[] enumC1984507pzArr = {enumC1984507pz, enumC1984507pz2, enumC1984507pz3};
        LL = enumC1984507pzArr;
        LLILLJJLI = new C2254308sP(enumC1984507pzArr);
    }

    public static EnumC1984507pz[] values() {
        return (EnumC1984507pz[]) LL.clone();
    }

    public static EnumC1984507pz valueOf(String str) {
        return (EnumC1984507pz) C08FF.LIZ(EnumC1984507pz.class, str);
    }

    public EnumC1984507pz(String str, int i) {
    }
}
