package X;

/* JADX INFO: renamed from: X.0D20, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D20 {
    public static final /* synthetic */ int LIZ = 0;

    public static C0D21 LIZ(C0D21 c0d21) {
        C0D3K pageData = c0d21.getPageData();
        return new C0D21(pageData.copy(pageData.productId, pageData.entrySpuImageUrls, pageData.shopHeader, pageData.productMedia, pageData.priceInfo, pageData.titleRating, pageData.skuSelection, pageData.descriptionInfo, pageData.logisticsInfo, pageData.dealsInfo, pageData.reviewInfo, C332190D0n.INSTANCE, pageData.bottomBar));
    }

    public static C0D21 LIZIZ(C0D21 c0d21, InterfaceC332200D0o interfaceC332200D0o) {
        C0D3K pageData = c0d21.getPageData();
        return new C0D21(pageData.copy(pageData.productId, pageData.entrySpuImageUrls, pageData.shopHeader, pageData.productMedia, pageData.priceInfo, pageData.titleRating, pageData.skuSelection, pageData.descriptionInfo, pageData.logisticsInfo, pageData.dealsInfo, pageData.reviewInfo, interfaceC332200D0o, pageData.bottomBar));
    }
}
