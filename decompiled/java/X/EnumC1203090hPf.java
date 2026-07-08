package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hPf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1203090hPf {
    public static final /* synthetic */ EnumC1203090hPf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1203090hPf MAP_TYPE_HYBRID;
    public static final EnumC1203090hPf MAP_TYPE_NONE;
    public static final EnumC1203090hPf MAP_TYPE_NORMAL;
    public static final EnumC1203090hPf MAP_TYPE_SATELLITE;
    public static final EnumC1203090hPf MAP_TYPE_TERRAIN;

    public static InterfaceC2044707zh<EnumC1203090hPf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1203090hPf enumC1203090hPf = new EnumC1203090hPf("MAP_TYPE_NONE", 0);
        MAP_TYPE_NONE = enumC1203090hPf;
        EnumC1203090hPf enumC1203090hPf2 = new EnumC1203090hPf("MAP_TYPE_NORMAL", 1);
        MAP_TYPE_NORMAL = enumC1203090hPf2;
        EnumC1203090hPf enumC1203090hPf3 = new EnumC1203090hPf("MAP_TYPE_SATELLITE", 2);
        MAP_TYPE_SATELLITE = enumC1203090hPf3;
        EnumC1203090hPf enumC1203090hPf4 = new EnumC1203090hPf("MAP_TYPE_TERRAIN", 3);
        MAP_TYPE_TERRAIN = enumC1203090hPf4;
        EnumC1203090hPf enumC1203090hPf5 = new EnumC1203090hPf("MAP_TYPE_HYBRID", 4);
        MAP_TYPE_HYBRID = enumC1203090hPf5;
        EnumC1203090hPf[] enumC1203090hPfArr = {enumC1203090hPf, enumC1203090hPf2, enumC1203090hPf3, enumC1203090hPf4, enumC1203090hPf5};
        LL = enumC1203090hPfArr;
        LLILLJJLI = new C2254308sP(enumC1203090hPfArr);
    }

    public static EnumC1203090hPf[] values() {
        return (EnumC1203090hPf[]) LL.clone();
    }

    public static EnumC1203090hPf valueOf(String str) {
        return (EnumC1203090hPf) C08FF.LIZ(EnumC1203090hPf.class, str);
    }

    public EnumC1203090hPf(String str, int i) {
    }
}
