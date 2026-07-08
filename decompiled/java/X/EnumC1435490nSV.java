package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nSV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1435490nSV {
    public static final EnumC1435490nSV AUTH;
    public static final EnumC1435490nSV COMPILE;
    public static final EnumC1435490nSV COVER_EXTRACT;
    public static final /* synthetic */ EnumC1435490nSV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1435490nSV NONE;
    public static final EnumC1435490nSV UPLOAD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1435490nSV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1435490nSV enumC1435490nSV = new EnumC1435490nSV("COVER_EXTRACT", 0, "cover_extract");
        COVER_EXTRACT = enumC1435490nSV;
        EnumC1435490nSV enumC1435490nSV2 = new EnumC1435490nSV("AUTH", 1, "auth");
        AUTH = enumC1435490nSV2;
        EnumC1435490nSV enumC1435490nSV3 = new EnumC1435490nSV("COMPILE", 2, "compile");
        COMPILE = enumC1435490nSV3;
        EnumC1435490nSV enumC1435490nSV4 = new EnumC1435490nSV("UPLOAD", 3, "upload");
        UPLOAD = enumC1435490nSV4;
        EnumC1435490nSV enumC1435490nSV5 = new EnumC1435490nSV("NONE", 4, "none");
        NONE = enumC1435490nSV5;
        EnumC1435490nSV[] enumC1435490nSVArr = {enumC1435490nSV, enumC1435490nSV2, enumC1435490nSV3, enumC1435490nSV4, enumC1435490nSV5};
        LLILLJJLI = enumC1435490nSVArr;
        LLILLL = new C2254308sP(enumC1435490nSVArr);
    }

    public static EnumC1435490nSV[] values() {
        return (EnumC1435490nSV[]) LLILLJJLI.clone();
    }

    public final String getState() {
        return this.LL;
    }

    public static EnumC1435490nSV valueOf(String str) {
        return (EnumC1435490nSV) C08FF.LIZ(EnumC1435490nSV.class, str);
    }

    public EnumC1435490nSV(String str, int i, String str2) {
        this.LL = str2;
    }
}
