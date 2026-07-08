package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RoX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC707150RoX {
    public static final EnumC707150RoX DATE_LOCATION;
    public static final /* synthetic */ EnumC707150RoX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC707150RoX NONE;
    public static final EnumC707150RoX RISK;

    public static InterfaceC2044707zh<EnumC707150RoX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC707150RoX enumC707150RoX = new EnumC707150RoX("NONE", 0);
        NONE = enumC707150RoX;
        EnumC707150RoX enumC707150RoX2 = new EnumC707150RoX("RISK", 1);
        RISK = enumC707150RoX2;
        EnumC707150RoX enumC707150RoX3 = new EnumC707150RoX("DATE_LOCATION", 2);
        DATE_LOCATION = enumC707150RoX3;
        EnumC707150RoX[] enumC707150RoXArr = {enumC707150RoX, enumC707150RoX2, enumC707150RoX3};
        LL = enumC707150RoXArr;
        LLILLJJLI = new C2254308sP(enumC707150RoXArr);
    }

    public static EnumC707150RoX[] values() {
        return (EnumC707150RoX[]) LL.clone();
    }

    public static EnumC707150RoX valueOf(String str) {
        return (EnumC707150RoX) C08FF.LIZ(EnumC707150RoX.class, str);
    }

    public EnumC707150RoX(String str, int i) {
    }
}
