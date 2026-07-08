package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h4X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1189990h4X {
    public static final /* synthetic */ EnumC1189990h4X[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1189990h4X POI_DETAIL_PAGE;
    public static final EnumC1189990h4X REVIEW_LANDING_PAGE;

    public static InterfaceC2044707zh<EnumC1189990h4X> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1189990h4X enumC1189990h4X = new EnumC1189990h4X("POI_DETAIL_PAGE", 0);
        POI_DETAIL_PAGE = enumC1189990h4X;
        EnumC1189990h4X enumC1189990h4X2 = new EnumC1189990h4X("REVIEW_LANDING_PAGE", 1);
        REVIEW_LANDING_PAGE = enumC1189990h4X2;
        EnumC1189990h4X[] enumC1189990h4XArr = {enumC1189990h4X, enumC1189990h4X2};
        LL = enumC1189990h4XArr;
        LLILLJJLI = new C2254308sP(enumC1189990h4XArr);
    }

    public static EnumC1189990h4X[] values() {
        return (EnumC1189990h4X[]) LL.clone();
    }

    public static EnumC1189990h4X valueOf(String str) {
        return (EnumC1189990h4X) C08FF.LIZ(EnumC1189990h4X.class, str);
    }

    public EnumC1189990h4X(String str, int i) {
    }
}
