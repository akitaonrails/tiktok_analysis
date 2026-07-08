package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1905950zhJ {
    public static final EnumC1905950zhJ CELL;
    public static final EnumC1905950zhJ COMMON;
    public static final EnumC1905950zhJ LEFT;
    public static final /* synthetic */ EnumC1905950zhJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1905950zhJ MIDDLE;
    public static final EnumC1905950zhJ RIGHT;

    public static InterfaceC2044707zh<EnumC1905950zhJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1905950zhJ enumC1905950zhJ = new EnumC1905950zhJ("LEFT", 0);
        LEFT = enumC1905950zhJ;
        EnumC1905950zhJ enumC1905950zhJ2 = new EnumC1905950zhJ("MIDDLE", 1);
        MIDDLE = enumC1905950zhJ2;
        EnumC1905950zhJ enumC1905950zhJ3 = new EnumC1905950zhJ("RIGHT", 2);
        RIGHT = enumC1905950zhJ3;
        EnumC1905950zhJ enumC1905950zhJ4 = new EnumC1905950zhJ("COMMON", 3);
        COMMON = enumC1905950zhJ4;
        EnumC1905950zhJ enumC1905950zhJ5 = new EnumC1905950zhJ("CELL", 4);
        CELL = enumC1905950zhJ5;
        EnumC1905950zhJ[] enumC1905950zhJArr = {enumC1905950zhJ, enumC1905950zhJ2, enumC1905950zhJ3, enumC1905950zhJ4, enumC1905950zhJ5};
        LL = enumC1905950zhJArr;
        LLILLJJLI = new C2254308sP(enumC1905950zhJArr);
    }

    public static EnumC1905950zhJ[] values() {
        return (EnumC1905950zhJ[]) LL.clone();
    }

    public static EnumC1905950zhJ valueOf(String str) {
        return (EnumC1905950zhJ) C08FF.LIZ(EnumC1905950zhJ.class, str);
    }

    public EnumC1905950zhJ(String str, int i) {
    }
}
