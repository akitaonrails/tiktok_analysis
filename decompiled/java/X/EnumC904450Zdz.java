package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zdz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC904450Zdz {
    public static final EnumC904450Zdz AWEME;
    public static final /* synthetic */ EnumC904450Zdz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC904450Zdz MEDIA;
    public final String LL;

    public static InterfaceC2044707zh<EnumC904450Zdz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC904450Zdz enumC904450Zdz = new EnumC904450Zdz("AWEME", 0, "aweme");
        AWEME = enumC904450Zdz;
        EnumC904450Zdz enumC904450Zdz2 = new EnumC904450Zdz("MEDIA", 1, "media");
        MEDIA = enumC904450Zdz2;
        EnumC904450Zdz[] enumC904450ZdzArr = {enumC904450Zdz, enumC904450Zdz2};
        LLILLJJLI = enumC904450ZdzArr;
        LLILLL = new C2254308sP(enumC904450ZdzArr);
    }

    public static EnumC904450Zdz[] values() {
        return (EnumC904450Zdz[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC904450Zdz valueOf(String str) {
        return (EnumC904450Zdz) C08FF.LIZ(EnumC904450Zdz.class, str);
    }

    public EnumC904450Zdz(String str, int i, String str2) {
        this.LL = str2;
    }
}
