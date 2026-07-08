package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1156000gBi {
    public static final EnumC1156000gBi CACHE;
    public static final /* synthetic */ EnumC1156000gBi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1156000gBi MEMORY;
    public static final EnumC1156000gBi NETWORK;

    public static InterfaceC2044707zh<EnumC1156000gBi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1156000gBi enumC1156000gBi = new EnumC1156000gBi("CACHE", 0);
        CACHE = enumC1156000gBi;
        EnumC1156000gBi enumC1156000gBi2 = new EnumC1156000gBi("NETWORK", 1);
        NETWORK = enumC1156000gBi2;
        EnumC1156000gBi enumC1156000gBi3 = new EnumC1156000gBi("MEMORY", 2);
        MEMORY = enumC1156000gBi3;
        EnumC1156000gBi[] enumC1156000gBiArr = {enumC1156000gBi, enumC1156000gBi2, enumC1156000gBi3};
        LL = enumC1156000gBiArr;
        LLILLJJLI = new C2254308sP(enumC1156000gBiArr);
    }

    public static EnumC1156000gBi[] values() {
        return (EnumC1156000gBi[]) LL.clone();
    }

    public static EnumC1156000gBi valueOf(String str) {
        return (EnumC1156000gBi) C08FF.LIZ(EnumC1156000gBi.class, str);
    }

    public EnumC1156000gBi(String str, int i) {
    }
}
