package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jcU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1287920jcU {
    public static final EnumC1287920jcU Directory;
    public static final /* synthetic */ EnumC1287920jcU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1287920jcU Regular;
    public static final EnumC1287920jcU Unknown;

    public static InterfaceC2044707zh<EnumC1287920jcU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1287920jcU enumC1287920jcU = new EnumC1287920jcU("Regular", 0);
        Regular = enumC1287920jcU;
        EnumC1287920jcU enumC1287920jcU2 = new EnumC1287920jcU("Directory", 1);
        Directory = enumC1287920jcU2;
        EnumC1287920jcU enumC1287920jcU3 = new EnumC1287920jcU("Unknown", 2);
        Unknown = enumC1287920jcU3;
        EnumC1287920jcU[] enumC1287920jcUArr = {enumC1287920jcU, enumC1287920jcU2, enumC1287920jcU3};
        LL = enumC1287920jcUArr;
        LLILLJJLI = new C2254308sP(enumC1287920jcUArr);
    }

    public static EnumC1287920jcU[] values() {
        return (EnumC1287920jcU[]) LL.clone();
    }

    public static EnumC1287920jcU valueOf(String str) {
        return (EnumC1287920jcU) C08FF.LIZ(EnumC1287920jcU.class, str);
    }

    public EnumC1287920jcU(String str, int i) {
    }
}
