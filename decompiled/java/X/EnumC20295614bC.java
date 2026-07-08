package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14bC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20295614bC {
    public static final EnumC20295614bC LL;
    public static final EnumC20295614bC LLILLJJLI;
    public static final EnumC20295614bC LLILLL;
    public static final /* synthetic */ EnumC20295614bC[] LLILZ;

    static {
        EnumC20295614bC enumC20295614bC = new EnumC20295614bC("FLASH", 0);
        LL = enumC20295614bC;
        EnumC20295614bC enumC20295614bC2 = new EnumC20295614bC("AUTO", 1);
        LLILLJJLI = enumC20295614bC2;
        EnumC20295614bC enumC20295614bC3 = new EnumC20295614bC("NONE", 2);
        LLILLL = enumC20295614bC3;
        EnumC20295614bC[] enumC20295614bCArr = {enumC20295614bC, enumC20295614bC2, enumC20295614bC3};
        LLILZ = enumC20295614bCArr;
        new C2254308sP(enumC20295614bCArr);
    }

    public static EnumC20295614bC[] values() {
        return (EnumC20295614bC[]) LLILZ.clone();
    }

    public static EnumC20295614bC valueOf(String str) {
        return (EnumC20295614bC) C08FF.LIZ(EnumC20295614bC.class, str);
    }

    public EnumC20295614bC(String str, int i) {
    }
}
