package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1184240gvG {
    public static final EnumC1184240gvG IMAGE;
    public static final /* synthetic */ EnumC1184240gvG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1184240gvG MAP;
    public static final EnumC1184240gvG OTHER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1184240gvG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1184240gvG enumC1184240gvG = new EnumC1184240gvG("OTHER", 0, 0);
        OTHER = enumC1184240gvG;
        EnumC1184240gvG enumC1184240gvG2 = new EnumC1184240gvG("IMAGE", 1, 1);
        IMAGE = enumC1184240gvG2;
        EnumC1184240gvG enumC1184240gvG3 = new EnumC1184240gvG("MAP", 2, 3);
        MAP = enumC1184240gvG3;
        EnumC1184240gvG[] enumC1184240gvGArr = {enumC1184240gvG, enumC1184240gvG2, enumC1184240gvG3};
        LLILLJJLI = enumC1184240gvGArr;
        LLILLL = new C2254308sP(enumC1184240gvGArr);
    }

    public static EnumC1184240gvG[] values() {
        return (EnumC1184240gvG[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1184240gvG valueOf(String str) {
        return (EnumC1184240gvG) C08FF.LIZ(EnumC1184240gvG.class, str);
    }

    public EnumC1184240gvG(String str, int i, int i2) {
        this.LL = i2;
    }
}
