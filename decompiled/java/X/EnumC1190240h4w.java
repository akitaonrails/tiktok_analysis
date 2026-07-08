package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1190240h4w {
    public static final /* synthetic */ EnumC1190240h4w[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1190240h4w POIREVIEWSOURCE_GOOGLE;
    public static final EnumC1190240h4w POIREVIEWSOURCE_TABELOG;
    public static final EnumC1190240h4w POIREVIEWSOURCE_TIKTOKORDER;
    public static final EnumC1190240h4w POIREVIEWSOURCE_TRIPADVISOR;
    public static final EnumC1190240h4w PoiReviewSource_TikTok;
    public static final EnumC1190240h4w PoiReviewSource_Unknown;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1190240h4w> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1190240h4w enumC1190240h4w = new EnumC1190240h4w("PoiReviewSource_Unknown", 0, 1);
        PoiReviewSource_Unknown = enumC1190240h4w;
        EnumC1190240h4w enumC1190240h4w2 = new EnumC1190240h4w("PoiReviewSource_TikTok", 1, 2);
        PoiReviewSource_TikTok = enumC1190240h4w2;
        EnumC1190240h4w enumC1190240h4w3 = new EnumC1190240h4w("POIREVIEWSOURCE_GOOGLE", 2, 3);
        POIREVIEWSOURCE_GOOGLE = enumC1190240h4w3;
        EnumC1190240h4w enumC1190240h4w4 = new EnumC1190240h4w("POIREVIEWSOURCE_TIKTOKORDER", 3, 5);
        POIREVIEWSOURCE_TIKTOKORDER = enumC1190240h4w4;
        EnumC1190240h4w enumC1190240h4w5 = new EnumC1190240h4w("POIREVIEWSOURCE_TRIPADVISOR", 4, 6);
        POIREVIEWSOURCE_TRIPADVISOR = enumC1190240h4w5;
        EnumC1190240h4w enumC1190240h4w6 = new EnumC1190240h4w("POIREVIEWSOURCE_TABELOG", 5, 7);
        POIREVIEWSOURCE_TABELOG = enumC1190240h4w6;
        EnumC1190240h4w[] enumC1190240h4wArr = {enumC1190240h4w, enumC1190240h4w2, enumC1190240h4w3, enumC1190240h4w4, enumC1190240h4w5, enumC1190240h4w6};
        LLILLJJLI = enumC1190240h4wArr;
        LLILLL = new C2254308sP(enumC1190240h4wArr);
    }

    public static EnumC1190240h4w[] values() {
        return (EnumC1190240h4w[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1190240h4w valueOf(String str) {
        return (EnumC1190240h4w) C08FF.LIZ(EnumC1190240h4w.class, str);
    }

    public EnumC1190240h4w(String str, int i, int i2) {
        this.LL = i2;
    }
}
