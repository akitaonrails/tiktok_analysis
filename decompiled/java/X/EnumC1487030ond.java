package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ond, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1487030ond {
    public static final /* synthetic */ EnumC1487030ond[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1487030ond NONE;
    public static final EnumC1487030ond SETSURFACE;
    public static final EnumC1487030ond SETSURFACECONTROL;
    public static final EnumC1487030ond SETSURFACETEXTURE;
    public static final EnumC1487030ond SETSURFACEWITHTIMEOUT;

    public static InterfaceC2044707zh<EnumC1487030ond> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1487030ond enumC1487030ond = new EnumC1487030ond("NONE", 0);
        NONE = enumC1487030ond;
        EnumC1487030ond enumC1487030ond2 = new EnumC1487030ond("SETSURFACECONTROL", 1);
        SETSURFACECONTROL = enumC1487030ond2;
        EnumC1487030ond enumC1487030ond3 = new EnumC1487030ond("SETSURFACE", 2);
        SETSURFACE = enumC1487030ond3;
        EnumC1487030ond enumC1487030ond4 = new EnumC1487030ond("SETSURFACEWITHTIMEOUT", 3);
        SETSURFACEWITHTIMEOUT = enumC1487030ond4;
        EnumC1487030ond enumC1487030ond5 = new EnumC1487030ond("SETSURFACETEXTURE", 4);
        SETSURFACETEXTURE = enumC1487030ond5;
        EnumC1487030ond[] enumC1487030ondArr = {enumC1487030ond, enumC1487030ond2, enumC1487030ond3, enumC1487030ond4, enumC1487030ond5};
        LL = enumC1487030ondArr;
        LLILLJJLI = new C2254308sP(enumC1487030ondArr);
    }

    public static EnumC1487030ond[] values() {
        return (EnumC1487030ond[]) LL.clone();
    }

    public static EnumC1487030ond valueOf(String str) {
        return (EnumC1487030ond) C08FF.LIZ(EnumC1487030ond.class, str);
    }

    public EnumC1487030ond(String str, int i) {
    }
}
