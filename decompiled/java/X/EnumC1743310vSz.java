package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vSz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1743310vSz {
    public static final /* synthetic */ EnumC1743310vSz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1743310vSz STYLE_CYCLE;
    public static final EnumC1743310vSz STYLE_DEFAULT;
    public static final EnumC1743310vSz STYLE_FLOAT_SEA;
    public static final EnumC1743310vSz STYLE_FLOAT_US;

    public static InterfaceC2044707zh<EnumC1743310vSz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1743310vSz enumC1743310vSz = new EnumC1743310vSz("STYLE_DEFAULT", 0);
        STYLE_DEFAULT = enumC1743310vSz;
        EnumC1743310vSz enumC1743310vSz2 = new EnumC1743310vSz("STYLE_CYCLE", 1);
        STYLE_CYCLE = enumC1743310vSz2;
        EnumC1743310vSz enumC1743310vSz3 = new EnumC1743310vSz("STYLE_FLOAT_US", 2);
        STYLE_FLOAT_US = enumC1743310vSz3;
        EnumC1743310vSz enumC1743310vSz4 = new EnumC1743310vSz("STYLE_FLOAT_SEA", 3);
        STYLE_FLOAT_SEA = enumC1743310vSz4;
        EnumC1743310vSz[] enumC1743310vSzArr = {enumC1743310vSz, enumC1743310vSz2, enumC1743310vSz3, enumC1743310vSz4};
        LL = enumC1743310vSzArr;
        LLILLJJLI = new C2254308sP(enumC1743310vSzArr);
    }

    public static EnumC1743310vSz[] values() {
        return (EnumC1743310vSz[]) LL.clone();
    }

    public static EnumC1743310vSz valueOf(String str) {
        return (EnumC1743310vSz) C08FF.LIZ(EnumC1743310vSz.class, str);
    }

    public EnumC1743310vSz(String str, int i) {
    }
}
