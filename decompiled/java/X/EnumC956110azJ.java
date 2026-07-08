package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0azJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC956110azJ {
    public static final /* synthetic */ EnumC956110azJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC956110azJ NUDGABLE;
    public static final EnumC956110azJ NUDGED;
    public static final EnumC956110azJ NUDGING;
    public static final EnumC956110azJ UNAVAILABLE;

    public static InterfaceC2044707zh<EnumC956110azJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC956110azJ enumC956110azJ = new EnumC956110azJ("NUDGABLE", 0);
        NUDGABLE = enumC956110azJ;
        EnumC956110azJ enumC956110azJ2 = new EnumC956110azJ("NUDGING", 1);
        NUDGING = enumC956110azJ2;
        EnumC956110azJ enumC956110azJ3 = new EnumC956110azJ("NUDGED", 2);
        NUDGED = enumC956110azJ3;
        EnumC956110azJ enumC956110azJ4 = new EnumC956110azJ("UNAVAILABLE", 3);
        UNAVAILABLE = enumC956110azJ4;
        EnumC956110azJ[] enumC956110azJArr = {enumC956110azJ, enumC956110azJ2, enumC956110azJ3, enumC956110azJ4};
        LL = enumC956110azJArr;
        LLILLJJLI = new C2254308sP(enumC956110azJArr);
    }

    public static EnumC956110azJ[] values() {
        return (EnumC956110azJ[]) LL.clone();
    }

    public static EnumC956110azJ valueOf(String str) {
        return (EnumC956110azJ) C08FF.LIZ(EnumC956110azJ.class, str);
    }

    public EnumC956110azJ(String str, int i) {
    }
}
