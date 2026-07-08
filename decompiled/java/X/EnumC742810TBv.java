package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC742810TBv {
    public static final EnumC742810TBv FOREST_DOWNLOAD_FAILED;
    public static final EnumC742810TBv INVALID_LOCAL_FILE;
    public static final EnumC742810TBv LIGHTEN_DISPLAY_FAILED;
    public static final /* synthetic */ EnumC742810TBv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC742810TBv LOTTIE_COMPOSITION_FAILED;
    public static final EnumC742810TBv REQUEST_CANCELLED;

    public static InterfaceC2044707zh<EnumC742810TBv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC742810TBv enumC742810TBv = new EnumC742810TBv("FOREST_DOWNLOAD_FAILED", 0);
        FOREST_DOWNLOAD_FAILED = enumC742810TBv;
        EnumC742810TBv enumC742810TBv2 = new EnumC742810TBv("INVALID_LOCAL_FILE", 1);
        INVALID_LOCAL_FILE = enumC742810TBv2;
        EnumC742810TBv enumC742810TBv3 = new EnumC742810TBv("REQUEST_CANCELLED", 2);
        REQUEST_CANCELLED = enumC742810TBv3;
        EnumC742810TBv enumC742810TBv4 = new EnumC742810TBv("LIGHTEN_DISPLAY_FAILED", 3);
        LIGHTEN_DISPLAY_FAILED = enumC742810TBv4;
        EnumC742810TBv enumC742810TBv5 = new EnumC742810TBv("LOTTIE_COMPOSITION_FAILED", 4);
        LOTTIE_COMPOSITION_FAILED = enumC742810TBv5;
        EnumC742810TBv[] enumC742810TBvArr = {enumC742810TBv, enumC742810TBv2, enumC742810TBv3, enumC742810TBv4, enumC742810TBv5};
        LL = enumC742810TBvArr;
        LLILLJJLI = new C2254308sP(enumC742810TBvArr);
    }

    public static EnumC742810TBv[] values() {
        return (EnumC742810TBv[]) LL.clone();
    }

    public static EnumC742810TBv valueOf(String str) {
        return (EnumC742810TBv) C08FF.LIZ(EnumC742810TBv.class, str);
    }

    public EnumC742810TBv(String str, int i) {
    }
}
