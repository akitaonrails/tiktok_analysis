package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vuq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1760580vuq {
    public static final /* synthetic */ EnumC1760580vuq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1760580vuq OLD_REVIEW_GALLERY;
    public static final EnumC1760580vuq PDP_REVIEW_GALLERY;
    public static final EnumC1760580vuq SA_REVIEW_GALLERY;
    public static final EnumC1760580vuq SHOP_TAB_REVIEW_GALLERY;
    public static final EnumC1760580vuq US_REVIEW_GALLERY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1760580vuq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1760580vuq enumC1760580vuq = new EnumC1760580vuq("OLD_REVIEW_GALLERY", 0, 0);
        OLD_REVIEW_GALLERY = enumC1760580vuq;
        EnumC1760580vuq enumC1760580vuq2 = new EnumC1760580vuq("SA_REVIEW_GALLERY", 1, 3);
        SA_REVIEW_GALLERY = enumC1760580vuq2;
        EnumC1760580vuq enumC1760580vuq3 = new EnumC1760580vuq("US_REVIEW_GALLERY", 2, 1);
        US_REVIEW_GALLERY = enumC1760580vuq3;
        EnumC1760580vuq enumC1760580vuq4 = new EnumC1760580vuq("SHOP_TAB_REVIEW_GALLERY", 3, 2);
        SHOP_TAB_REVIEW_GALLERY = enumC1760580vuq4;
        EnumC1760580vuq enumC1760580vuq5 = new EnumC1760580vuq("PDP_REVIEW_GALLERY", 4, 4);
        PDP_REVIEW_GALLERY = enumC1760580vuq5;
        EnumC1760580vuq[] enumC1760580vuqArr = {enumC1760580vuq, enumC1760580vuq2, enumC1760580vuq3, enumC1760580vuq4, enumC1760580vuq5};
        LLILLJJLI = enumC1760580vuqArr;
        LLILLL = new C2254308sP(enumC1760580vuqArr);
    }

    public static EnumC1760580vuq[] values() {
        return (EnumC1760580vuq[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1760580vuq valueOf(String str) {
        return (EnumC1760580vuq) C08FF.LIZ(EnumC1760580vuq.class, str);
    }

    public EnumC1760580vuq(String str, int i, int i2) {
        this.LL = i2;
    }
}
