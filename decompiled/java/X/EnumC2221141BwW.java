package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1BwW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2221141BwW {
    public static final EnumC2221141BwW ARCH;
    public static final /* synthetic */ EnumC2221141BwW[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC2221141BwW PKG;
    public static final EnumC2221141BwW PLUGIN;
    public static final EnumC2221141BwW TEMP;
    public static final EnumC2221141BwW USER;
    public final String LL;
    public final boolean LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2221141BwW> getEntries() {
        return LLILZ;
    }

    static {
        EnumC2221141BwW enumC2221141BwW = new EnumC2221141BwW("USER", 0, "ttfile://user", true);
        USER = enumC2221141BwW;
        EnumC2221141BwW enumC2221141BwW2 = new EnumC2221141BwW("TEMP", 1, "ttfile://temp", false);
        TEMP = enumC2221141BwW2;
        EnumC2221141BwW enumC2221141BwW3 = new EnumC2221141BwW("PLUGIN", 2, "ttpluginfile://", false);
        PLUGIN = enumC2221141BwW3;
        EnumC2221141BwW enumC2221141BwW4 = new EnumC2221141BwW("ARCH", 3, "ttfile://arch", true);
        ARCH = enumC2221141BwW4;
        EnumC2221141BwW enumC2221141BwW5 = new EnumC2221141BwW("PKG", 4, "", false);
        PKG = enumC2221141BwW5;
        EnumC2221141BwW[] enumC2221141BwWArr = {enumC2221141BwW, enumC2221141BwW2, enumC2221141BwW3, enumC2221141BwW4, enumC2221141BwW5};
        LLILLL = enumC2221141BwWArr;
        LLILZ = new C2254308sP(enumC2221141BwWArr);
    }

    public static EnumC2221141BwW[] values() {
        return (EnumC2221141BwW[]) LLILLL.clone();
    }

    public final String getDir() {
        return this.LL;
    }

    public final boolean getWritable() {
        return this.LLILLJJLI;
    }

    public static EnumC2221141BwW valueOf(String str) {
        return (EnumC2221141BwW) C08FF.LIZ(EnumC2221141BwW.class, str);
    }

    public EnumC2221141BwW(String str, int i, String str2, boolean z) {
        this.LL = str2;
        this.LLILLJJLI = z;
    }
}
