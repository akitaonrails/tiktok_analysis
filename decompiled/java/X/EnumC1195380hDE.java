package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hDE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1195380hDE {
    public static final EnumC1195380hDE LLILLJJLI;
    public static final EnumC1195380hDE LLILLL;
    public static final EnumC1195380hDE LLILZ;
    public static final EnumC1195380hDE LLILZIL;
    public static final /* synthetic */ EnumC1195380hDE[] LLILZLL;
    public final int LL;

    static {
        EnumC1195380hDE enumC1195380hDE = new EnumC1195380hDE("NO_DATA", 0, 1);
        LLILLJJLI = enumC1195380hDE;
        EnumC1195380hDE enumC1195380hDE2 = new EnumC1195380hDE("NO_POI_ID", 1, 2);
        LLILLL = enumC1195380hDE2;
        EnumC1195380hDE enumC1195380hDE3 = new EnumC1195380hDE("NO_POI_NAME", 2, 3);
        LLILZ = enumC1195380hDE3;
        EnumC1195380hDE enumC1195380hDE4 = new EnumC1195380hDE("NO_ICON", 3, 4);
        LLILZIL = enumC1195380hDE4;
        EnumC1195380hDE[] enumC1195380hDEArr = {enumC1195380hDE, enumC1195380hDE2, enumC1195380hDE3, enumC1195380hDE4};
        LLILZLL = enumC1195380hDEArr;
        new C2254308sP(enumC1195380hDEArr);
    }

    public static EnumC1195380hDE[] values() {
        return (EnumC1195380hDE[]) LLILZLL.clone();
    }

    public static EnumC1195380hDE valueOf(String str) {
        return (EnumC1195380hDE) C08FF.LIZ(EnumC1195380hDE.class, str);
    }

    public EnumC1195380hDE(String str, int i, int i2) {
        this.LL = i2;
    }
}
