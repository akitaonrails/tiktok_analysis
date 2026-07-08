package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15dF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20563115dF {
    public static final EnumC20563115dF CONTAINER_VIEW_DIMENSION_ZERO;
    public static final EnumC20563115dF CONTAINER_VIEW_EMPTY;
    public static final EnumC20563115dF CONTAINER_VIEW_INVISIBLE;
    public static final /* synthetic */ EnumC20563115dF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20563115dF OTHER;
    public static final EnumC20563115dF VIDEO_DIMENSION_INVALID;
    public static final EnumC20563115dF VIDEO_EMPTY;
    public static final EnumC20563115dF VIDEO_VIEW_DIMENSION_ZERO;
    public static final EnumC20563115dF VIDEO_VIEW_EMPTY;
    public static final EnumC20563115dF VIDEO_VIEW_INVISIBLE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20563115dF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20563115dF enumC20563115dF = new EnumC20563115dF("VIDEO_VIEW_EMPTY", 0, "video_view_empty");
        VIDEO_VIEW_EMPTY = enumC20563115dF;
        EnumC20563115dF enumC20563115dF2 = new EnumC20563115dF("VIDEO_VIEW_INVISIBLE", 1, "video_view_invisible");
        VIDEO_VIEW_INVISIBLE = enumC20563115dF2;
        EnumC20563115dF enumC20563115dF3 = new EnumC20563115dF("VIDEO_VIEW_DIMENSION_ZERO", 2, "video_view_dimension_zero");
        VIDEO_VIEW_DIMENSION_ZERO = enumC20563115dF3;
        EnumC20563115dF enumC20563115dF4 = new EnumC20563115dF("CONTAINER_VIEW_EMPTY", 3, "container_view_empty");
        CONTAINER_VIEW_EMPTY = enumC20563115dF4;
        EnumC20563115dF enumC20563115dF5 = new EnumC20563115dF("CONTAINER_VIEW_INVISIBLE", 4, "container_view_invisible");
        CONTAINER_VIEW_INVISIBLE = enumC20563115dF5;
        EnumC20563115dF enumC20563115dF6 = new EnumC20563115dF("CONTAINER_VIEW_DIMENSION_ZERO", 5, "container_view_dimension_zero");
        CONTAINER_VIEW_DIMENSION_ZERO = enumC20563115dF6;
        EnumC20563115dF enumC20563115dF7 = new EnumC20563115dF("VIDEO_EMPTY", 6, "video_empty");
        VIDEO_EMPTY = enumC20563115dF7;
        EnumC20563115dF enumC20563115dF8 = new EnumC20563115dF("VIDEO_DIMENSION_INVALID", 7, "video_dimension_invalid");
        VIDEO_DIMENSION_INVALID = enumC20563115dF8;
        EnumC20563115dF enumC20563115dF9 = new EnumC20563115dF("OTHER", 8, "other");
        OTHER = enumC20563115dF9;
        EnumC20563115dF[] enumC20563115dFArr = {enumC20563115dF, enumC20563115dF2, enumC20563115dF3, enumC20563115dF4, enumC20563115dF5, enumC20563115dF6, enumC20563115dF7, enumC20563115dF8, enumC20563115dF9};
        LLILLJJLI = enumC20563115dFArr;
        LLILLL = new C2254308sP(enumC20563115dFArr);
    }

    public static EnumC20563115dF[] values() {
        return (EnumC20563115dF[]) LLILLJJLI.clone();
    }

    public final String getStr() {
        return this.LL;
    }

    public static EnumC20563115dF valueOf(String str) {
        return (EnumC20563115dF) C08FF.LIZ(EnumC20563115dF.class, str);
    }

    public EnumC20563115dF(String str, int i, String str2) {
        this.LL = str2;
    }
}
