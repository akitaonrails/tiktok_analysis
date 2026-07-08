package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gw3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1184730gw3 {
    public static final EnumC1184730gw3 CLAIMED_STORE;
    public static final C1184920gwM Companion;
    public static final EnumC1184730gw3 INDEPENDENT;
    public static final /* synthetic */ EnumC1184730gw3[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1184730gw3 REGIONAL;
    public static final EnumC1184730gw3 UN_CLAIMED_STORE;
    public String LL;
    public String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1184730gw3> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1184730gw3 enumC1184730gw3 = new EnumC1184730gw3(0, "REGIONAL", "regional", "1");
        REGIONAL = enumC1184730gw3;
        EnumC1184730gw3 enumC1184730gw32 = new EnumC1184730gw3(1, "UN_CLAIMED_STORE", "store", "2");
        UN_CLAIMED_STORE = enumC1184730gw32;
        EnumC1184730gw3 enumC1184730gw33 = new EnumC1184730gw3(2, "CLAIMED_STORE", "store", "2");
        CLAIMED_STORE = enumC1184730gw33;
        EnumC1184730gw3 enumC1184730gw34 = new EnumC1184730gw3(3, "INDEPENDENT", "independent", "3");
        INDEPENDENT = enumC1184730gw34;
        EnumC1184730gw3[] enumC1184730gw3Arr = {enumC1184730gw3, enumC1184730gw32, enumC1184730gw33, enumC1184730gw34};
        LLILLL = enumC1184730gw3Arr;
        LLILZ = new C2254308sP(enumC1184730gw3Arr);
        Companion = new C1184920gwM();
    }

    public static EnumC1184730gw3[] values() {
        return (EnumC1184730gw3[]) LLILLL.clone();
    }

    public final String getTypeCode$poi_release() {
        return this.LLILLJJLI;
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC1184730gw3 valueOf(String str) {
        return (EnumC1184730gw3) C08FF.LIZ(EnumC1184730gw3.class, str);
    }

    public final void setTypeCode$poi_release(String str) {
        this.LLILLJJLI = str;
    }

    public final void setTypeName(String str) {
        this.LL = str;
    }

    public EnumC1184730gw3(int i, String str, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
