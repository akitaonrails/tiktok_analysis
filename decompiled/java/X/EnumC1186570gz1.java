package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gz1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1186570gz1 {
    public static final EnumC1186570gz1 FRIEND_PAGE;
    public static final /* synthetic */ EnumC1186570gz1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1186570gz1 POI_DETAIL_PAGE;
    public static final EnumC1186570gz1 PROFILE_PAGE;
    public static final EnumC1186570gz1 REVIEW_LANDING_PAGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1186570gz1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1186570gz1 enumC1186570gz1 = new EnumC1186570gz1("FRIEND_PAGE", 0, 1);
        FRIEND_PAGE = enumC1186570gz1;
        EnumC1186570gz1 enumC1186570gz12 = new EnumC1186570gz1("PROFILE_PAGE", 1, 2);
        PROFILE_PAGE = enumC1186570gz12;
        EnumC1186570gz1 enumC1186570gz13 = new EnumC1186570gz1("POI_DETAIL_PAGE", 2, 3);
        POI_DETAIL_PAGE = enumC1186570gz13;
        EnumC1186570gz1 enumC1186570gz14 = new EnumC1186570gz1("REVIEW_LANDING_PAGE", 3, 4);
        REVIEW_LANDING_PAGE = enumC1186570gz14;
        EnumC1186570gz1[] enumC1186570gz1Arr = {enumC1186570gz1, enumC1186570gz12, enumC1186570gz13, enumC1186570gz14};
        LLILLJJLI = enumC1186570gz1Arr;
        LLILLL = new C2254308sP(enumC1186570gz1Arr);
    }

    public static EnumC1186570gz1[] values() {
        return (EnumC1186570gz1[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1186570gz1 valueOf(String str) {
        return (EnumC1186570gz1) C08FF.LIZ(EnumC1186570gz1.class, str);
    }

    public EnumC1186570gz1(String str, int i, int i2) {
        this.LL = i2;
    }
}
