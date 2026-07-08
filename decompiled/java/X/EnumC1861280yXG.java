package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yXG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1861280yXG {
    public static final EnumC1861280yXG ABOVE_BOTTOM;
    public static final EnumC1861280yXG ABOVE_TOP;
    public static final EnumC1861280yXG BELOW_BOTTOM;
    public static final EnumC1861280yXG FULLY_VISIBLE;
    public static final /* synthetic */ EnumC1861280yXG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1861280yXG PARTIAL_BOTTOM;

    public static InterfaceC2044707zh<EnumC1861280yXG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1861280yXG enumC1861280yXG = new EnumC1861280yXG("ABOVE_TOP", 0);
        ABOVE_TOP = enumC1861280yXG;
        EnumC1861280yXG enumC1861280yXG2 = new EnumC1861280yXG("ABOVE_BOTTOM", 1);
        ABOVE_BOTTOM = enumC1861280yXG2;
        EnumC1861280yXG enumC1861280yXG3 = new EnumC1861280yXG("FULLY_VISIBLE", 2);
        FULLY_VISIBLE = enumC1861280yXG3;
        EnumC1861280yXG enumC1861280yXG4 = new EnumC1861280yXG("BELOW_BOTTOM", 3);
        BELOW_BOTTOM = enumC1861280yXG4;
        EnumC1861280yXG enumC1861280yXG5 = new EnumC1861280yXG("PARTIAL_BOTTOM", 4);
        PARTIAL_BOTTOM = enumC1861280yXG5;
        EnumC1861280yXG[] enumC1861280yXGArr = {enumC1861280yXG, enumC1861280yXG2, enumC1861280yXG3, enumC1861280yXG4, enumC1861280yXG5};
        LL = enumC1861280yXGArr;
        LLILLJJLI = new C2254308sP(enumC1861280yXGArr);
    }

    public static EnumC1861280yXG[] values() {
        return (EnumC1861280yXG[]) LL.clone();
    }

    public static EnumC1861280yXG valueOf(String str) {
        return (EnumC1861280yXG) C08FF.LIZ(EnumC1861280yXG.class, str);
    }

    public EnumC1861280yXG(String str, int i) {
    }
}
