package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0omz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1486630omz {
    public static final EnumC1486630omz LLILLJJLI;
    public static final EnumC1486630omz LLILLL;
    public static final EnumC1486630omz LLILZ;
    public static final EnumC1486630omz LLILZIL;
    public static final /* synthetic */ EnumC1486630omz[] LLILZLL;
    public final String LL;

    static {
        EnumC1486630omz enumC1486630omz = new EnumC1486630omz("UNKNOWN", 0, "unknown");
        LLILLJJLI = enumC1486630omz;
        EnumC1486630omz enumC1486630omz2 = new EnumC1486630omz("GOOD", 1, "good");
        LLILLL = enumC1486630omz2;
        EnumC1486630omz enumC1486630omz3 = new EnumC1486630omz("BORDERLINE_WEAK", 2, "borderline_weak");
        LLILZ = enumC1486630omz3;
        EnumC1486630omz enumC1486630omz4 = new EnumC1486630omz("WEAK", 3, "weak");
        LLILZIL = enumC1486630omz4;
        EnumC1486630omz[] enumC1486630omzArr = {enumC1486630omz, enumC1486630omz2, enumC1486630omz3, enumC1486630omz4};
        LLILZLL = enumC1486630omzArr;
        new C2254308sP(enumC1486630omzArr);
    }

    public static EnumC1486630omz[] values() {
        return (EnumC1486630omz[]) LLILZLL.clone();
    }

    public static EnumC1486630omz valueOf(String str) {
        return (EnumC1486630omz) C08FF.LIZ(EnumC1486630omz.class, str);
    }

    public EnumC1486630omz(String str, int i, String str2) {
        this.LL = str2;
    }
}
