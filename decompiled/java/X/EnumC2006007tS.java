package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2006007tS {
    public static final EnumC2006007tS GLOBAL_FIND_SIMILAR_RECOMMEND_FROM_FEED;
    public static final EnumC2006007tS GLOBAL_FIND_SIMILAR_RECOMMEND_FROM_PDP;
    public static final /* synthetic */ EnumC2006007tS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2006007tS LOW_SUPPLIER_RECOMMEND_COMMON_MALL_GUIDANCE;
    public static final EnumC2006007tS LOW_SUPPLIER_RECOMMEND_PROFILE_PAGE_STORE_GUIDANCE;
    public static final EnumC2006007tS LOW_SUPPLIER_RECOMMEND_PROFILE_PAGE_STORE_TAB_STORE_GUIDANCE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2006007tS> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2006007tS enumC2006007tS = new EnumC2006007tS("LOW_SUPPLIER_RECOMMEND_PROFILE_PAGE_STORE_TAB_STORE_GUIDANCE", 0, 1);
        LOW_SUPPLIER_RECOMMEND_PROFILE_PAGE_STORE_TAB_STORE_GUIDANCE = enumC2006007tS;
        EnumC2006007tS enumC2006007tS2 = new EnumC2006007tS("LOW_SUPPLIER_RECOMMEND_PROFILE_PAGE_STORE_GUIDANCE", 1, 2);
        LOW_SUPPLIER_RECOMMEND_PROFILE_PAGE_STORE_GUIDANCE = enumC2006007tS2;
        EnumC2006007tS enumC2006007tS3 = new EnumC2006007tS("LOW_SUPPLIER_RECOMMEND_COMMON_MALL_GUIDANCE", 2, 3);
        LOW_SUPPLIER_RECOMMEND_COMMON_MALL_GUIDANCE = enumC2006007tS3;
        EnumC2006007tS enumC2006007tS4 = new EnumC2006007tS("GLOBAL_FIND_SIMILAR_RECOMMEND_FROM_PDP", 3, 4);
        GLOBAL_FIND_SIMILAR_RECOMMEND_FROM_PDP = enumC2006007tS4;
        EnumC2006007tS enumC2006007tS5 = new EnumC2006007tS("GLOBAL_FIND_SIMILAR_RECOMMEND_FROM_FEED", 4, 5);
        GLOBAL_FIND_SIMILAR_RECOMMEND_FROM_FEED = enumC2006007tS5;
        EnumC2006007tS[] enumC2006007tSArr = {enumC2006007tS, enumC2006007tS2, enumC2006007tS3, enumC2006007tS4, enumC2006007tS5};
        LLILLJJLI = enumC2006007tSArr;
        LLILLL = new C2254308sP(enumC2006007tSArr);
    }

    public static EnumC2006007tS[] values() {
        return (EnumC2006007tS[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC2006007tS valueOf(String str) {
        return (EnumC2006007tS) C08FF.LIZ(EnumC2006007tS.class, str);
    }

    public EnumC2006007tS(String str, int i, int i2) {
        this.LL = i2;
    }
}
