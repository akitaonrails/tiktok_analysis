package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mOR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1394530mOR {
    public static final EnumC1394530mOR AIGT;
    public static final EnumC1394530mOR CAPCUT;
    public static final /* synthetic */ EnumC1394530mOR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1394530mOR PUGC;
    public static final EnumC1394530mOR SGT;
    public static final EnumC1394530mOR UGC;
    public static final EnumC1394530mOR UGC_ALGO;
    public static final EnumC1394530mOR UGC_LABEL;

    @C040H
    public final String LL;

    public static InterfaceC2044707zh<EnumC1394530mOR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1394530mOR enumC1394530mOR = new EnumC1394530mOR("UGC", 0, "ugc");
        UGC = enumC1394530mOR;
        EnumC1394530mOR enumC1394530mOR2 = new EnumC1394530mOR("UGC_ALGO", 1, "ugc_algo");
        UGC_ALGO = enumC1394530mOR2;
        EnumC1394530mOR enumC1394530mOR3 = new EnumC1394530mOR("UGC_LABEL", 2, "ugc_label");
        UGC_LABEL = enumC1394530mOR3;
        EnumC1394530mOR enumC1394530mOR4 = new EnumC1394530mOR("PUGC", 3, "pugc");
        PUGC = enumC1394530mOR4;
        EnumC1394530mOR enumC1394530mOR5 = new EnumC1394530mOR("CAPCUT", 4, "capcut");
        CAPCUT = enumC1394530mOR5;
        EnumC1394530mOR enumC1394530mOR6 = new EnumC1394530mOR("AIGT", 5, "aigt");
        AIGT = enumC1394530mOR6;
        EnumC1394530mOR enumC1394530mOR7 = new EnumC1394530mOR("SGT", 6, "sgt");
        SGT = enumC1394530mOR7;
        EnumC1394530mOR[] enumC1394530mORArr = {enumC1394530mOR, enumC1394530mOR2, enumC1394530mOR3, enumC1394530mOR4, enumC1394530mOR5, enumC1394530mOR6, enumC1394530mOR7};
        LLILLJJLI = enumC1394530mORArr;
        LLILLL = new C2254308sP(enumC1394530mORArr);
    }

    public static EnumC1394530mOR[] values() {
        return (EnumC1394530mOR[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1394530mOR valueOf(String str) {
        return (EnumC1394530mOR) C08FF.LIZ(EnumC1394530mOR.class, str);
    }

    public EnumC1394530mOR(String str, int i, String str2) {
        this.LL = str2;
    }
}
