package X;

import Y.AkS73S1200000_26;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.GalleryLRUCacheInfo;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListShopReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.PlatformLinkInfo;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewCardUI;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTranslation;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.viewobject.ReviewItem;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.0vuu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760620vuu extends C11SY {
    public static final Map<String, C1760620vuu> LJIILL = new LinkedHashMap();
    public final C1760700vv2 LIZJ;
    public final C1760710vv3 LIZLLL;
    public final C1760690vv1 LJ;
    public final C1760720vv4 LJFF;
    public final C1760600vus LJI;
    public final C1760610vut LJII;
    public final C1407090mih LJIIIIZZ;
    public final C1760480vug LJIIIZ;
    public final C1760490vuh LJIIJ;
    public AwS605S0100000_26 LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0vv4, X.11T3] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0vv1, X.11T3] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0vv3, X.11T3] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0vv2, X.11T3] */
    public C1760620vuu() {
        ?? r7 = new C11T3<ReviewApi.ReviewRequest, ListReviewData, ReviewApi.ReviewRequest, ListReviewData>() { // from class: X.0vv2
            @Override // X.C11T3
            public final C11NZ<ListReviewData> requestActual(ReviewApi.ReviewRequest reviewRequest) {
                ReviewApi.LIZ.getClass();
                return ((ReviewApi) C1760770vv9.LIZIZ.create(ReviewApi.class)).LJI(reviewRequest).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0vv6
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        T t;
                        Response response = (Response) obj;
                        if (response.isCodeOK() && (t = response.data) != null) {
                            return t;
                        }
                        C1AF0.LIZJ(String.valueOf(response.code));
                        throw new C04IS(response, "code is not ok | data is null");
                    }
                });
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertKeyActual(Object obj) {
                return obj;
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertValActual(Object obj, Object obj2) {
                return obj2;
            }
        };
        this.LIZJ = r7;
        ?? r6 = new C11T3<ReviewApi.ReviewRequest, n, ReviewApi.ReviewRequest, n>() { // from class: X.0vv3
            @Override // X.C11T3
            public final C11NZ<n> requestActual(ReviewApi.ReviewRequest reviewRequest) {
                ReviewApi.LIZ.getClass();
                return ((ReviewApi) C1760770vv9.LIZIZ.create(ReviewApi.class)).LJII(reviewRequest).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0vv7
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        T t;
                        final Response response = (Response) obj;
                        if (response.isCodeOK() && (t = response.data) != null) {
                            return t;
                        }
                        C1AF0.LIZJ(String.valueOf(response.code));
                        final String str = "code is not ok | data is null";
                        throw new RuntimeException(response, str) { // from class: X.0vvA
                            public static final int $stable = 8;
                            public final Response<n> LL;

                            public final Response<n> getResponse() {
                                return this.LL;
                            }

                            {
                                super(str);
                                this.LL = response;
                            }
                        };
                    }
                });
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertKeyActual(Object obj) {
                return obj;
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertValActual(Object obj, Object obj2) {
                return obj2;
            }
        };
        this.LIZLLL = r6;
        ?? r5 = new C11T3<ReviewApi.ListShopReviewRequest, ListShopReviewData, ReviewApi.ListShopReviewRequest, ListShopReviewData>() { // from class: X.0vv1
            @Override // X.C11T3
            public final C11NZ<ListShopReviewData> requestActual(ReviewApi.ListShopReviewRequest listShopReviewRequest) {
                ReviewApi.LIZ.getClass();
                return ((ReviewApi) C1760770vv9.LIZIZ.create(ReviewApi.class)).LIZJ(listShopReviewRequest).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0vv0
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        T t;
                        Response response = (Response) obj;
                        if (response.isCodeOK() && (t = response.data) != null) {
                            return t;
                        }
                        C1AF0.LIZJ(String.valueOf(response.code));
                        throw new RuntimeException(response, "code is not ok | data is null") { // from class: X.0vuz
                            public static final int $stable = 8;
                            public final Response<ListShopReviewData> LL;

                            public final Response<ListShopReviewData> getResponse() {
                                return this.LL;
                            }

                            {
                                super(str);
                                this.LL = response;
                            }
                        };
                    }
                });
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertKeyActual(Object obj) {
                return obj;
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertValActual(Object obj, Object obj2) {
                return obj2;
            }
        };
        this.LJ = r5;
        ?? r4 = new C11T3<ReviewApi.ListShopReviewRequest, n, ReviewApi.ListShopReviewRequest, n>() { // from class: X.0vv4
            @Override // X.C11T3
            public final C11NZ<n> requestActual(ReviewApi.ListShopReviewRequest listShopReviewRequest) {
                ReviewApi.LIZ.getClass();
                return ((ReviewApi) C1760770vv9.LIZIZ.create(ReviewApi.class)).LIZ(listShopReviewRequest).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0vv8
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        T t;
                        final Response response = (Response) obj;
                        if (response.isCodeOK() && (t = response.data) != null) {
                            return t;
                        }
                        C1AF0.LIZJ(String.valueOf(response.code));
                        final String str = "code is not ok | data is null";
                        throw new RuntimeException(response, str) { // from class: X.0vvB
                            public static final int $stable = 8;
                            public final Response<n> LL;

                            public final Response<n> getResponse() {
                                return this.LL;
                            }

                            {
                                super(str);
                                this.LL = response;
                            }
                        };
                    }
                });
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertKeyActual(Object obj) {
                return obj;
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertValActual(Object obj, Object obj2) {
                return obj2;
            }
        };
        this.LJFF = r4;
        C1760600vus c1760600vus = new C1760600vus();
        this.LJI = c1760600vus;
        C1760610vut c1760610vut = new C1760610vut();
        this.LJII = c1760610vut;
        this.LJIIIIZZ = new C1407090mih();
        C1760480vug c1760480vug = new C1760480vug();
        this.LJIIIZ = c1760480vug;
        C1760490vuh c1760490vuh = new C1760490vuh();
        this.LJIIJ = c1760490vuh;
        C11TE.LJJIJ(this, r7, c1760600vus);
        C11TE.LJJIJ(this, r5, c1760610vut);
        C11TE.LJJIJ(this, r6, c1760480vug);
        C11TE.LJJIJ(this, r4, c1760490vuh);
    }

    public final C11NZ<Pair<List<C1761300vw0>, C1761680vwc>> LJJIJIL(ReviewApi.ReviewRequest reviewRequest, String str, Integer num, String str2, int i, boolean z, Integer num2) {
        Type type;
        Integer num3;
        Type type2;
        List<ReviewItemStruct> list;
        if (C123100dR.LIZ(str2) && !this.LJIILIIL) {
            this.LJIILIIL = true;
            ArrayList arrayList = new ArrayList();
            C212391189t.LIZ.getClass();
            String strLIZ = C212391189t.LIZ("product_review_gallery", str2);
            int type3 = EnumC1760580vuq.PDP_REVIEW_GALLERY.getType();
            if (num2 != null && num2.intValue() == type3) {
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type2 = C2371409Qy.LIZJ(C13LE.LJII(ProductDetailReview.class));
                    } else {
                        type2 = new TypeToken<ProductDetailReview>() { // from class: X.0vux
                        }.getType();
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, strLIZ, type2);
                    if (!(objFromJson instanceof ProductDetailReview)) {
                        objFromJson = null;
                    }
                    ProductDetailReview productDetailReview = (ProductDetailReview) objFromJson;
                    if (productDetailReview != null && (list = productDetailReview.reviewItems) != null) {
                        Iterator<ReviewItemStruct> it2 = list.iterator();
                        while (it2.hasNext()) {
                            LJJIJLIJ(it2.next(), arrayList, str, num, productDetailReview.reviewABTest, productDetailReview.platformLinkInfo, null);
                        }
                    }
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                try {
                    Gson gsonLJFF2 = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                        C13JX c13jx = KTypeProjection.LIZJ;
                        C13JW c13jwLJII = C13LE.LJII(ReviewItem.ReviewCellVO.class);
                        c13jx.getClass();
                        type = C2371409Qy.LIZJ(C13LE.LJIIIIZZ(ReviewItem.ReviewCellVO[].class, C13JX.LIZ(c13jwLJII)));
                    } else {
                        type = new TypeToken<ReviewItem.ReviewCellVO[]>() { // from class: X.0vuv
                        }.getType();
                    }
                    Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, strLIZ, type);
                    if (!(objFromJson2 instanceof ReviewItem.ReviewCellVO[])) {
                        objFromJson2 = null;
                    }
                    ReviewItem.ReviewCellVO[] reviewCellVOArr = (ReviewItem.ReviewCellVO[]) objFromJson2;
                    if (reviewCellVOArr != null) {
                        for (ReviewItem.ReviewCellVO reviewCellVO : reviewCellVOArr) {
                            ReviewItemStruct reviewItemStruct = reviewCellVO.struct;
                            ReviewCardUI reviewCardUI = reviewCellVO.reviewABTest;
                            PlatformLinkInfo platformLinkInfo = reviewCellVO.platformLinkInfo;
                            C1407170mip c1407170mip = EnumC1407150min.Companion;
                            ReviewTranslation reviewTranslation = reviewItemStruct.translation;
                            if (reviewTranslation != null) {
                                num3 = reviewTranslation.translationType;
                            } else {
                                num3 = null;
                            }
                            c1407170mip.getClass();
                            LJJIJLIJ(reviewItemStruct, arrayList, str, num, reviewCardUI, platformLinkInfo, C1407170mip.LIZIZ(num3));
                        }
                    }
                } catch (s e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            if (!arrayList.isEmpty()) {
                return C11NZ.LJJJJZ(new Pair(arrayList, new C1761680vwc(z, i)));
            }
        }
        return new C11T7(AFwS311S0000000_25.get$arr$(69), C1639420slQ.LIZ(this.LIZJ, this.LJI)).request(reviewRequest).LJJJJZI(new AkS73S1200000_26(this, str, num, 0));
    }

    public final C11NZ<Pair<List<C1761300vw0>, C1761680vwc>> LJJIJL(ReviewApi.ListShopReviewRequest listShopReviewRequest, String str, Integer num, String str2, int i, boolean z, Integer num2) {
        Type type;
        Type type2;
        List<ShopReviewItemStruct> list;
        C212391189t.LIZ.getClass();
        String strLIZ = C212391189t.LIZ("product_review_gallery", str2);
        if (C123100dR.LIZ(str2) && !this.LJIILIIL) {
            this.LJIILIIL = true;
            ArrayList arrayList = new ArrayList();
            int type3 = EnumC1760580vuq.SHOP_TAB_REVIEW_GALLERY.getType();
            if (num2 != null && num2.intValue() == type3) {
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type2 = C2371409Qy.LIZJ(C13LE.LJII(GalleryLRUCacheInfo.class));
                    } else {
                        type2 = new TypeToken<GalleryLRUCacheInfo>() { // from class: X.0vuy
                        }.getType();
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, strLIZ, type2);
                    if (!(objFromJson instanceof GalleryLRUCacheInfo)) {
                        objFromJson = null;
                    }
                    GalleryLRUCacheInfo galleryLRUCacheInfo = (GalleryLRUCacheInfo) objFromJson;
                    if (galleryLRUCacheInfo != null && (list = galleryLRUCacheInfo.reviewItem) != null) {
                        Iterator<ShopReviewItemStruct> it2 = list.iterator();
                        while (it2.hasNext()) {
                            ReviewItemStruct reviewItemStruct = it2.next().reviewItemStruct;
                            if (reviewItemStruct != null) {
                                LJJIJLIJ(reviewItemStruct, arrayList, str, num, galleryLRUCacheInfo.reviewCardUIAb, null, null);
                            }
                        }
                    }
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                try {
                    Gson gsonLJFF2 = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                        C13JX c13jx = KTypeProjection.LIZJ;
                        C13JW c13jwLJII = C13LE.LJII(ReviewItem.ReviewCellVO.class);
                        c13jx.getClass();
                        type = C2371409Qy.LIZJ(C13LE.LJIIIIZZ(ReviewItem.ReviewCellVO[].class, C13JX.LIZ(c13jwLJII)));
                    } else {
                        type = new TypeToken<ReviewItem.ReviewCellVO[]>() { // from class: X.0vuw
                        }.getType();
                    }
                    Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, strLIZ, type);
                    if (!(objFromJson2 instanceof ReviewItem.ReviewCellVO[])) {
                        objFromJson2 = null;
                    }
                    ReviewItem.ReviewCellVO[] reviewCellVOArr = (ReviewItem.ReviewCellVO[]) objFromJson2;
                    if (reviewCellVOArr != null) {
                        for (ReviewItem.ReviewCellVO reviewCellVO : reviewCellVOArr) {
                            LJJIJLIJ(reviewCellVO.struct, arrayList, str, num, reviewCellVO.reviewABTest, reviewCellVO.platformLinkInfo, null);
                        }
                    }
                } catch (s e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            if (!arrayList.isEmpty()) {
                return C11NZ.LJJJJZ(new Pair(arrayList, new C1761680vwc(z, i)));
            }
        }
        return new C11T7(AFwS311S0000000_25.get$arr$(69), C1639420slQ.LIZ(this.LJ, this.LJII)).request(listShopReviewRequest).LJJJJZI(new AkS73S1200000_26(this, str, num, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJLIJ(com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct r49, java.util.List<X.C1761300vw0> r50, java.lang.String r51, java.lang.Integer r52, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewCardUI r53, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.PlatformLinkInfo r54, X.EnumC1407150min r55) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1760620vuu.LJJIJLIJ(com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct, java.util.List, java.lang.String, java.lang.Integer, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewCardUI, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.PlatformLinkInfo, X.0min):void");
    }
}
