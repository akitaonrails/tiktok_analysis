package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1761630vwX {
    public static final EnumC1761630vwX LL;
    public static final EnumC1761630vwX LLILLJJLI;
    public static final EnumC1761630vwX LLILLL;
    public static final EnumC1761630vwX LLILZ;
    public static final /* synthetic */ EnumC1761630vwX[] LLILZIL;

    static {
        EnumC1761630vwX enumC1761630vwX = new EnumC1761630vwX("NO_DATA", 0);
        LL = enumC1761630vwX;
        EnumC1761630vwX enumC1761630vwX2 = new EnumC1761630vwX("HIDDEN_HALF_SCREEN", 1);
        LLILLJJLI = enumC1761630vwX2;
        EnumC1761630vwX enumC1761630vwX3 = new EnumC1761630vwX("VISIBLE", 2);
        LLILLL = enumC1761630vwX3;
        EnumC1761630vwX enumC1761630vwX4 = new EnumC1761630vwX("SCROLLED_AWAY", 3);
        LLILZ = enumC1761630vwX4;
        EnumC1761630vwX[] enumC1761630vwXArr = {enumC1761630vwX, enumC1761630vwX2, enumC1761630vwX3, enumC1761630vwX4};
        LLILZIL = enumC1761630vwXArr;
        new C2254308sP(enumC1761630vwXArr);
    }

    public static EnumC1761630vwX[] values() {
        return (EnumC1761630vwX[]) LLILZIL.clone();
    }

    public static EnumC1761630vwX valueOf(String str) {
        return (EnumC1761630vwX) C08FF.LIZ(EnumC1761630vwX.class, str);
    }

    public EnumC1761630vwX(String str, int i) {
    }
}
