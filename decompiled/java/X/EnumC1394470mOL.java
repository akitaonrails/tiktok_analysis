package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mOL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1394470mOL {
    public static final EnumC1394470mOL AIGT;
    public static final EnumC1394470mOL AUTOCUT_ALGO;
    public static final EnumC1394470mOL CAPCUT;
    public static final /* synthetic */ EnumC1394470mOL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1394470mOL MV_INHOUSE;
    public static final EnumC1394470mOL PUGC;
    public static final EnumC1394470mOL SGT;
    public static final EnumC1394470mOL UGC;
    public static final EnumC1394470mOL UGC_ALGO;
    public static final EnumC1394470mOL UGC_LABEL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1394470mOL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1394470mOL enumC1394470mOL = new EnumC1394470mOL("UGC", 0, "ugc");
        UGC = enumC1394470mOL;
        EnumC1394470mOL enumC1394470mOL2 = new EnumC1394470mOL("UGC_ALGO", 1, "ugc_algo");
        UGC_ALGO = enumC1394470mOL2;
        EnumC1394470mOL enumC1394470mOL3 = new EnumC1394470mOL("UGC_LABEL", 2, "ugc_label");
        UGC_LABEL = enumC1394470mOL3;
        EnumC1394470mOL enumC1394470mOL4 = new EnumC1394470mOL("PUGC", 3, "pugc");
        PUGC = enumC1394470mOL4;
        EnumC1394470mOL enumC1394470mOL5 = new EnumC1394470mOL("AUTOCUT_ALGO", 4, "autocut_algo");
        AUTOCUT_ALGO = enumC1394470mOL5;
        EnumC1394470mOL enumC1394470mOL6 = new EnumC1394470mOL("MV_INHOUSE", 5, "mv_inhouse");
        MV_INHOUSE = enumC1394470mOL6;
        EnumC1394470mOL enumC1394470mOL7 = new EnumC1394470mOL("CAPCUT", 6, "capcut");
        CAPCUT = enumC1394470mOL7;
        EnumC1394470mOL enumC1394470mOL8 = new EnumC1394470mOL("AIGT", 7, "aigt");
        AIGT = enumC1394470mOL8;
        EnumC1394470mOL enumC1394470mOL9 = new EnumC1394470mOL("SGT", 8, "sgt");
        SGT = enumC1394470mOL9;
        EnumC1394470mOL[] enumC1394470mOLArr = {enumC1394470mOL, enumC1394470mOL2, enumC1394470mOL3, enumC1394470mOL4, enumC1394470mOL5, enumC1394470mOL6, enumC1394470mOL7, enumC1394470mOL8, enumC1394470mOL9};
        LLILLJJLI = enumC1394470mOLArr;
        LLILLL = new C2254308sP(enumC1394470mOLArr);
    }

    public static EnumC1394470mOL[] values() {
        return (EnumC1394470mOL[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1394470mOL valueOf(String str) {
        return (EnumC1394470mOL) C08FF.LIZ(EnumC1394470mOL.class, str);
    }

    public EnumC1394470mOL(String str, int i, String str2) {
        this.LL = str2;
    }
}
