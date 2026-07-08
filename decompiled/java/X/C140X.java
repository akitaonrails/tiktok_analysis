package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.140X, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C140X {
    public static final C140X AVI;
    public static final C140X BMP;
    public static final C140X GIF;
    public static final C140X HEIC;
    public static final C140X HEIF;
    public static final C140X JPEG;
    public static final C140X JPG;
    public static final /* synthetic */ C140X[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C140X MKV;
    public static final C140X MP4;
    public static final C140X MPEG;
    public static final C140X PNG;
    public static final C140X QUICKTIME;
    public static final C140X THREEGPP;
    public static final C140X THREEGPP2;
    public static final C140X TS;
    public static final C140X WEBM;
    public static final C140X WEBP;
    public final String LL;

    public static InterfaceC2044707zh<C140X> getEntries() {
        return LLILLL;
    }

    static {
        C140X c140x = new C140X("JPG", 0, "image/jpg");
        JPG = c140x;
        C140X c140x2 = new C140X("JPEG", 1, "image/jpeg");
        JPEG = c140x2;
        C140X c140x3 = new C140X("PNG", 2, "image/png");
        PNG = c140x3;
        C140X c140x4 = new C140X("GIF", 3, "image/gif");
        GIF = c140x4;
        C140X c140x5 = new C140X("WEBP", 4, "image/webp");
        WEBP = c140x5;
        C140X c140x6 = new C140X("HEIC", 5, "image/heic");
        HEIC = c140x6;
        C140X c140x7 = new C140X("HEIF", 6, "image/heif");
        HEIF = c140x7;
        C140X c140x8 = new C140X("BMP", 7, "image/x-ms-bmp");
        BMP = c140x8;
        C140X c140x9 = new C140X("MP4", 8, "video/mp4");
        MP4 = c140x9;
        C140X c140x10 = new C140X("MKV", 9, "video/x-matroska");
        MKV = c140x10;
        C140X c140x11 = new C140X("TS", 10, "video/mp2ts");
        TS = c140x11;
        C140X c140x12 = new C140X("AVI", 11, "video/avi");
        AVI = c140x12;
        C140X c140x13 = new C140X("MPEG", 12, "video/mpeg");
        MPEG = c140x13;
        C140X c140x14 = new C140X("THREEGPP", 13, "video/3gpp");
        THREEGPP = c140x14;
        C140X c140x15 = new C140X("THREEGPP2", 14, "video/3gpp2");
        THREEGPP2 = c140x15;
        C140X c140x16 = new C140X("QUICKTIME", 15, "video/quicktime");
        QUICKTIME = c140x16;
        C140X c140x17 = new C140X("WEBM", 16, "video/webm");
        WEBM = c140x17;
        C140X[] c140xArr = {c140x, c140x2, c140x3, c140x4, c140x5, c140x6, c140x7, c140x8, c140x9, c140x10, c140x11, c140x12, c140x13, c140x14, c140x15, c140x16, c140x17};
        LLILLJJLI = c140xArr;
        LLILLL = new C2254308sP(c140xArr);
    }

    public static C140X[] values() {
        return (C140X[]) LLILLJJLI.clone();
    }

    public final String getMimeType() {
        return this.LL;
    }

    public static C140X valueOf(String str) {
        return (C140X) C08FF.LIZ(C140X.class, str);
    }

    public C140X(String str, int i, String str2) {
        this.LL = str2;
    }
}
