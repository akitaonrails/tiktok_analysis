package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hSF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1204690hSF {
    public static final EnumC1204690hSF CONTENT_INSUFFICIENT;
    public static final C1204980hSi Companion;
    public static final EnumC1204690hSF FIRST_ENTER_INTRO;
    public static final EnumC1204690hSF GPS_SUPPORTED_REGIONS;
    public static final /* synthetic */ EnumC1204690hSF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1204690hSF NON_GPS_SUPPORTED_REGIONS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1204690hSF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1204690hSF enumC1204690hSF = new EnumC1204690hSF("GPS_SUPPORTED_REGIONS", 0, "GPSSupportedRegions");
        GPS_SUPPORTED_REGIONS = enumC1204690hSF;
        EnumC1204690hSF enumC1204690hSF2 = new EnumC1204690hSF("NON_GPS_SUPPORTED_REGIONS", 1, "NonGPSSupportedRegions");
        NON_GPS_SUPPORTED_REGIONS = enumC1204690hSF2;
        EnumC1204690hSF enumC1204690hSF3 = new EnumC1204690hSF("FIRST_ENTER_INTRO", 2, "FirstEnterIntro");
        FIRST_ENTER_INTRO = enumC1204690hSF3;
        EnumC1204690hSF enumC1204690hSF4 = new EnumC1204690hSF("CONTENT_INSUFFICIENT", 3, "ContentInsufficient");
        CONTENT_INSUFFICIENT = enumC1204690hSF4;
        EnumC1204690hSF[] enumC1204690hSFArr = {enumC1204690hSF, enumC1204690hSF2, enumC1204690hSF3, enumC1204690hSF4};
        LLILLJJLI = enumC1204690hSFArr;
        LLILLL = new C2254308sP(enumC1204690hSFArr);
        Companion = new C1204980hSi();
    }

    public static EnumC1204690hSF[] values() {
        return (EnumC1204690hSF[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1204690hSF valueOf(String str) {
        return (EnumC1204690hSF) C08FF.LIZ(EnumC1204690hSF.class, str);
    }

    public EnumC1204690hSF(String str, int i, String str2) {
        this.LL = str2;
    }
}
