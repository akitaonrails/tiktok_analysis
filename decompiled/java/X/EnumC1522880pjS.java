package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pjS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1522880pjS {
    public static final EnumC1522880pjS HEIF;
    public static final EnumC1522880pjS JPG;
    public static final /* synthetic */ EnumC1522880pjS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1522880pjS PNG;
    public static final EnumC1522880pjS WEBP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1522880pjS> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1522880pjS enumC1522880pjS = new EnumC1522880pjS("PNG", 0, "png");
        PNG = enumC1522880pjS;
        EnumC1522880pjS enumC1522880pjS2 = new EnumC1522880pjS("WEBP", 1, "webp");
        WEBP = enumC1522880pjS2;
        EnumC1522880pjS enumC1522880pjS3 = new EnumC1522880pjS("HEIF", 2, "heif");
        HEIF = enumC1522880pjS3;
        EnumC1522880pjS enumC1522880pjS4 = new EnumC1522880pjS("JPG", 3, "jpg");
        JPG = enumC1522880pjS4;
        EnumC1522880pjS[] enumC1522880pjSArr = {enumC1522880pjS, enumC1522880pjS2, enumC1522880pjS3, enumC1522880pjS4};
        LLILLJJLI = enumC1522880pjSArr;
        LLILLL = new C2254308sP(enumC1522880pjSArr);
    }

    public static EnumC1522880pjS[] values() {
        return (EnumC1522880pjS[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1522880pjS valueOf(String str) {
        return (EnumC1522880pjS) C08FF.LIZ(EnumC1522880pjS.class, str);
    }

    public EnumC1522880pjS(String str, int i, String str2) {
        this.LL = str2;
    }
}
