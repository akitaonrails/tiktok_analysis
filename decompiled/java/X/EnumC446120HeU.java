package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HeU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC446120HeU {
    public static final /* synthetic */ EnumC446120HeU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC446120HeU REJECT_BLACK_WORD;
    public static final EnumC446120HeU REJECT_DOUBLE_CHECK;
    public static final EnumC446120HeU REJECT_IMSDK;
    public static final EnumC446120HeU REJECT_NO_TIP;
    public static final EnumC446120HeU REJECT_PRIVACY;
    public static final EnumC446120HeU REJECT_SHARK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC446120HeU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC446120HeU enumC446120HeU = new EnumC446120HeU("REJECT_IMSDK", 0, "-1");
        REJECT_IMSDK = enumC446120HeU;
        EnumC446120HeU enumC446120HeU2 = new EnumC446120HeU("REJECT_SHARK", 1, "3");
        REJECT_SHARK = enumC446120HeU2;
        EnumC446120HeU enumC446120HeU3 = new EnumC446120HeU("REJECT_PRIVACY", 2, "100");
        REJECT_PRIVACY = enumC446120HeU3;
        EnumC446120HeU enumC446120HeU4 = new EnumC446120HeU("REJECT_BLACK_WORD", 3, "101");
        REJECT_BLACK_WORD = enumC446120HeU4;
        EnumC446120HeU enumC446120HeU5 = new EnumC446120HeU("REJECT_NO_TIP", 4, "102");
        REJECT_NO_TIP = enumC446120HeU5;
        EnumC446120HeU enumC446120HeU6 = new EnumC446120HeU("REJECT_DOUBLE_CHECK", 5, "103");
        REJECT_DOUBLE_CHECK = enumC446120HeU6;
        EnumC446120HeU[] enumC446120HeUArr = {enumC446120HeU, enumC446120HeU2, enumC446120HeU3, enumC446120HeU4, enumC446120HeU5, enumC446120HeU6};
        LLILLJJLI = enumC446120HeUArr;
        LLILLL = new C2254308sP(enumC446120HeUArr);
    }

    public static EnumC446120HeU[] values() {
        return (EnumC446120HeU[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC446120HeU valueOf(String str) {
        return (EnumC446120HeU) C08FF.LIZ(EnumC446120HeU.class, str);
    }

    public EnumC446120HeU(String str, int i, String str2) {
        this.LL = str2;
    }
}
