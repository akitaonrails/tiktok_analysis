package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1BwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2221151BwX {
    public static final EnumC2221151BwX ARCH;
    public static final /* synthetic */ EnumC2221151BwX[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC2221151BwX PKG;
    public static final EnumC2221151BwX PLUGIN;
    public static final EnumC2221151BwX TEMP;
    public static final EnumC2221151BwX USER;
    public final String LL;
    public final boolean LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2221151BwX> getEntries() {
        return LLILZ;
    }

    static {
        EnumC2221151BwX enumC2221151BwX = new EnumC2221151BwX("USER", 0, "ttfile://user", true);
        USER = enumC2221151BwX;
        EnumC2221151BwX enumC2221151BwX2 = new EnumC2221151BwX("TEMP", 1, "ttfile://temp", false);
        TEMP = enumC2221151BwX2;
        EnumC2221151BwX enumC2221151BwX3 = new EnumC2221151BwX("PLUGIN", 2, "ttpluginfile://", false);
        PLUGIN = enumC2221151BwX3;
        EnumC2221151BwX enumC2221151BwX4 = new EnumC2221151BwX("ARCH", 3, "ttfile://arch", true);
        ARCH = enumC2221151BwX4;
        EnumC2221151BwX enumC2221151BwX5 = new EnumC2221151BwX("PKG", 4, "", false);
        PKG = enumC2221151BwX5;
        EnumC2221151BwX[] enumC2221151BwXArr = {enumC2221151BwX, enumC2221151BwX2, enumC2221151BwX3, enumC2221151BwX4, enumC2221151BwX5};
        LLILLL = enumC2221151BwXArr;
        LLILZ = new C2254308sP(enumC2221151BwXArr);
    }

    public static EnumC2221151BwX[] values() {
        return (EnumC2221151BwX[]) LLILLL.clone();
    }

    public final String getDir() {
        return this.LL;
    }

    public final boolean getWritable() {
        return this.LLILLJJLI;
    }

    public static EnumC2221151BwX valueOf(String str) {
        return (EnumC2221151BwX) C08FF.LIZ(EnumC2221151BwX.class, str);
    }

    public EnumC2221151BwX(String str, int i, String str2, boolean z) {
        this.LL = str2;
        this.LLILLJJLI = z;
    }
}
