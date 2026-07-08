package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0esX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1105670esX {
    public static final EnumC1105670esX COMMENT;
    public static final EnumC1105670esX EC;
    public static final EnumC1105670esX GIFT;
    public static final /* synthetic */ EnumC1105670esX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1105670esX PDP;
    public static final EnumC1105670esX PROFILE;
    public static final EnumC1105670esX SHARE;
    public static final EnumC1105670esX TOP_VIEWER;

    public static InterfaceC2044707zh<EnumC1105670esX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1105670esX enumC1105670esX = new EnumC1105670esX("GIFT", 0);
        GIFT = enumC1105670esX;
        EnumC1105670esX enumC1105670esX2 = new EnumC1105670esX("SHARE", 1);
        SHARE = enumC1105670esX2;
        EnumC1105670esX enumC1105670esX3 = new EnumC1105670esX("TOP_VIEWER", 2);
        TOP_VIEWER = enumC1105670esX3;
        EnumC1105670esX enumC1105670esX4 = new EnumC1105670esX("PROFILE", 3);
        PROFILE = enumC1105670esX4;
        EnumC1105670esX enumC1105670esX5 = new EnumC1105670esX("EC", 4);
        EC = enumC1105670esX5;
        EnumC1105670esX enumC1105670esX6 = new EnumC1105670esX("PDP", 5);
        PDP = enumC1105670esX6;
        EnumC1105670esX enumC1105670esX7 = new EnumC1105670esX("COMMENT", 6);
        COMMENT = enumC1105670esX7;
        EnumC1105670esX[] enumC1105670esXArr = {enumC1105670esX, enumC1105670esX2, enumC1105670esX3, enumC1105670esX4, enumC1105670esX5, enumC1105670esX6, enumC1105670esX7};
        LL = enumC1105670esXArr;
        LLILLJJLI = new C2254308sP(enumC1105670esXArr);
    }

    public static EnumC1105670esX[] values() {
        return (EnumC1105670esX[]) LL.clone();
    }

    public static EnumC1105670esX valueOf(String str) {
        return (EnumC1105670esX) C08FF.LIZ(EnumC1105670esX.class, str);
    }

    public EnumC1105670esX(String str, int i) {
    }
}
