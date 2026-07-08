package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GsU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429320GsU {
    public static final EnumC429320GsU BOTH_SIDE_RIPPLE;
    public static final EnumC429320GsU LEFT_RIPPLE;
    public static final /* synthetic */ EnumC429320GsU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429320GsU NONE_RIPPLE;
    public static final EnumC429320GsU RIGHT_RIPPLE;

    public static InterfaceC2044707zh<EnumC429320GsU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429320GsU enumC429320GsU = new EnumC429320GsU("NONE_RIPPLE", 0);
        NONE_RIPPLE = enumC429320GsU;
        EnumC429320GsU enumC429320GsU2 = new EnumC429320GsU("LEFT_RIPPLE", 1);
        LEFT_RIPPLE = enumC429320GsU2;
        EnumC429320GsU enumC429320GsU3 = new EnumC429320GsU("RIGHT_RIPPLE", 2);
        RIGHT_RIPPLE = enumC429320GsU3;
        EnumC429320GsU enumC429320GsU4 = new EnumC429320GsU("BOTH_SIDE_RIPPLE", 3);
        BOTH_SIDE_RIPPLE = enumC429320GsU4;
        EnumC429320GsU[] enumC429320GsUArr = {enumC429320GsU, enumC429320GsU2, enumC429320GsU3, enumC429320GsU4};
        LL = enumC429320GsUArr;
        LLILLJJLI = new C2254308sP(enumC429320GsUArr);
    }

    public static EnumC429320GsU[] values() {
        return (EnumC429320GsU[]) LL.clone();
    }

    public static EnumC429320GsU valueOf(String str) {
        return (EnumC429320GsU) C08FF.LIZ(EnumC429320GsU.class, str);
    }

    public EnumC429320GsU(String str, int i) {
    }
}
