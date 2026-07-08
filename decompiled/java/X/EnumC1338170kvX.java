package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1338170kvX {
    public static final EnumC1338170kvX Custom;
    public static final EnumC1338170kvX EaseInOut;
    public static final /* synthetic */ EnumC1338170kvX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1338170kvX Linear;

    public static InterfaceC2044707zh<EnumC1338170kvX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1338170kvX enumC1338170kvX = new EnumC1338170kvX("Linear", 0);
        Linear = enumC1338170kvX;
        EnumC1338170kvX enumC1338170kvX2 = new EnumC1338170kvX("EaseInOut", 1);
        EaseInOut = enumC1338170kvX2;
        EnumC1338170kvX enumC1338170kvX3 = new EnumC1338170kvX("Custom", 2);
        Custom = enumC1338170kvX3;
        EnumC1338170kvX[] enumC1338170kvXArr = {enumC1338170kvX, enumC1338170kvX2, enumC1338170kvX3};
        LL = enumC1338170kvXArr;
        LLILLJJLI = new C2254308sP(enumC1338170kvXArr);
    }

    public static EnumC1338170kvX[] values() {
        return (EnumC1338170kvX[]) LL.clone();
    }

    public static EnumC1338170kvX valueOf(String str) {
        return (EnumC1338170kvX) C08FF.LIZ(EnumC1338170kvX.class, str);
    }

    public EnumC1338170kvX(String str, int i) {
    }
}
