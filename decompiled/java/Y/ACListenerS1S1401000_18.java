package Y;

import X.C1171260gaK;
import X.C1175120ggY;
import X.C1180060goW;
import X.C1189060h32;
import X.C1190820h5s;
import X.C1191160h6Q;
import X.C1191390h6n;
import X.C1202300hOO;
import X.C123100dR;
import X.C1558360qeg;
import X.C259800zU;
import X.C418440Gaw;
import X.C444830HcP;
import X.C497820Jfg;
import X.C814420VxA;
import X.EnumC1190240h4w;
import X.InterfaceC665370Q7z;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListMainUIAssem;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivityForReviews;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ACListenerS1S1401000_18 implements View.OnClickListener {
    public final int $t;
    public int i5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS1S1401000_18 aCListenerS1S1401000_18, View view) {
        ((CollectionListMainUIAssem) aCListenerS1S1401000_18.l1).Jo((CollectionDetail) aCListenerS1S1401000_18.l2, aCListenerS1S1401000_18.i5, ((C1171260gaK) aCListenerS1S1401000_18.l3).getLayoutPosition(), aCListenerS1S1401000_18.s0, (Map) aCListenerS1S1401000_18.l4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$1(ACListenerS1S1401000_18 aCListenerS1S1401000_18, View view) {
        C1202300hOO c1202300hOO;
        String str;
        String str2;
        String reviewId;
        String str3;
        String poiId;
        String str4;
        Float fValueOf;
        String str5;
        Integer num;
        int iLongValue;
        int size;
        int length;
        String str6;
        int value;
        String str7;
        String str8;
        boolean wantTranslate;
        String str9;
        String str10;
        int i;
        Integer num2;
        PoiReviewsApi.PoiReviewStatusModel status;
        PoiReviewsApi.PoiReviewContentModel content;
        Integer source;
        PoiReviewsApi.PoiReviewUserModel author;
        PoiReviewsApi.PoiReviewContentModel content2;
        String str11;
        PoiReviewsApi.PoiReviewContentModel content3;
        List<PoiReviewsApi.ImageDataModel> list;
        PoiReviewsApi.PoiReviewStatisticsModel statistics;
        Long l;
        PoiReviewsApi.PoiReviewContentModel content4;
        PoiReviewsApi.PoiReviewContentModel content5;
        PoiReviewsApi.PoiReviewUserModel author2;
        C1202300hOO c1202300hOO2 = (C1202300hOO) aCListenerS1S1401000_18.l1;
        if (c1202300hOO2.LLJZIJLIL) {
            if (!c1202300hOO2.getExpanded()) {
                C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
                C1191390h6n c1191390h6nLLLLZI = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLLLZI();
                if (c1191390h6nLLLLZI != null) {
                    str = c1191390h6nLLLLZI.enterFrom;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                C1191390h6n c1191390h6nLLLLZI2 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLLLZI();
                if (c1191390h6nLLLLZI2 == null || (str2 = c1191390h6nLLLLZI2.enterMethod) == null) {
                    str2 = "";
                }
                PoiReviewsApi.PoiReviewModel poiReviewModel = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJL;
                if (poiReviewModel == null || (reviewId = poiReviewModel.getReviewId()) == null) {
                    reviewId = "";
                }
                PoiReviewsApi.PoiReviewModel poiReviewModel2 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJL;
                if (poiReviewModel2 == null || (author2 = poiReviewModel2.getAuthor()) == null || (str3 = author2.userId) == null) {
                    str3 = "";
                }
                PoiReviewsApi.PoiReviewModel poiReviewModel3 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJL;
                if (poiReviewModel3 == null || (poiId = poiReviewModel3.getPoiId()) == null) {
                    poiId = "";
                }
                C1191390h6n c1191390h6nLLLLZI3 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLLLZI();
                if (c1191390h6nLLLLZI3 == null || (str4 = c1191390h6nLLLLZI3.collectInfo) == null) {
                    str4 = "";
                }
                PoiReviewsApi.PoiReviewModel poiReviewModel4 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJL;
                if (poiReviewModel4 != null && (content5 = poiReviewModel4.getContent()) != null) {
                    fValueOf = Float.valueOf(C1190820h5s.LIZLLL(content5));
                } else {
                    fValueOf = null;
                }
                float fLIZIZ = C1175120ggY.LIZIZ(fValueOf);
                PoiReviewsApi.PoiReviewModel poiReviewModel5 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJL;
                if (poiReviewModel5 != null && (content4 = poiReviewModel5.getContent()) != null) {
                    str5 = content4.text;
                } else {
                    str5 = null;
                }
                boolean zLIZ = C123100dR.LIZ(str5);
                C1191390h6n c1191390h6nLLLLZI4 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLLLZI();
                if (c1191390h6nLLLLZI4 != null) {
                    num = c1191390h6nLLLLZI4.reviewOrder;
                } else {
                    num = null;
                }
                Integer numValueOf = Integer.valueOf(C1175120ggY.LIZJ(num));
                PoiReviewsApi.PoiReviewModel poiReviewModel6 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJL;
                if (poiReviewModel6 != null && (statistics = poiReviewModel6.getStatistics()) != null && (l = statistics.likeCount) != null) {
                    iLongValue = (int) l.longValue();
                } else {
                    iLongValue = 0;
                }
                PoiReviewsApi.PoiReviewModel poiReviewModel7 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJL;
                if (poiReviewModel7 != null && (content3 = poiReviewModel7.getContent()) != null && (list = content3.images) != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                PoiReviewsApi.PoiReviewModel poiReviewModel8 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJL;
                if (poiReviewModel8 != null && (content2 = poiReviewModel8.getContent()) != null && (str11 = content2.text) != null) {
                    length = str11.length();
                } else {
                    length = 0;
                }
                PoiReviewsApi.PoiReviewModel poiReviewModel9 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJL;
                if (poiReviewModel9 != null && (author = poiReviewModel9.getAuthor()) != null) {
                    str6 = author.reviewUserSource;
                } else {
                    str6 = null;
                }
                PoiReviewsApi.PoiReviewModel poiReviewModel10 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJL;
                if (poiReviewModel10 != null && (source = poiReviewModel10.getSource()) != null) {
                    value = source.intValue();
                } else {
                    value = EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
                }
                C1191390h6n c1191390h6nLLLLZI5 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLLLZI();
                if (c1191390h6nLLLLZI5 != null) {
                    str7 = c1191390h6nLLLLZI5.logId;
                } else {
                    str7 = null;
                }
                PoiReviewsApi.PoiReviewModel poiReviewModel11 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJL;
                if (poiReviewModel11 != null && (content = poiReviewModel11.getContent()) != null) {
                    str8 = content.textLang;
                } else {
                    str8 = null;
                }
                PoiReviewsApi.PoiReviewModel poiReviewModel12 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJL;
                if (poiReviewModel12 != null) {
                    wantTranslate = poiReviewModel12.getWantTranslate();
                } else {
                    wantTranslate = false;
                }
                C1191390h6n c1191390h6nLLLLZI6 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLLLZI();
                if (c1191390h6nLLLLZI6 != null) {
                    str9 = c1191390h6nLLLLZI6.fromGroupId;
                } else {
                    str9 = null;
                }
                C1191390h6n c1191390h6nLLLLZI7 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLLLZI();
                if (c1191390h6nLLLLZI7 != null) {
                    str10 = c1191390h6nLLLLZI7.enterPosition;
                } else {
                    str10 = null;
                }
                PoiReviewsApi.PoiReviewModel poiReviewModel13 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJL;
                if (poiReviewModel13 != null && poiReviewModel13.isAnonymous()) {
                    i = 1;
                } else {
                    i = 0;
                }
                InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558360qeg.LJ((C1202300hOO) aCListenerS1S1401000_18.l1, null);
                PoiReviewsApi.PoiReviewModel poiReviewModel14 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJL;
                if (poiReviewModel14 != null && (status = poiReviewModel14.getStatus()) != null) {
                    num2 = status.status;
                } else {
                    num2 = null;
                }
                PageFinder pageFinderVia = PageFinder.via((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2);
                c1191160h6Q.getClass();
                String str12 = str;
                C1191160h6Q.LJIIJ(str12, str2, reviewId, str3, poiId, str4, fLIZIZ, zLIZ ? 1 : 0, numValueOf, iLongValue, size, length, str6, value, str7, str8, wantTranslate, str9, str10, "image_button", i, interfaceC665370Q7zLJ, 0, num2, null, pageFinderVia);
                ScrollView scrollView = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJJIJIIJIL;
                if (scrollView != null) {
                    C1189060h32.LJJII(scrollView, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
                }
                C444830HcP c444830HcP = new C444830HcP();
                c444830HcP.LJIILIIL(aCListenerS1S1401000_18.s0);
                c444830HcP.LIZIZ.LJ = C497820Jfg.LIZIZ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2);
                c444830HcP.LJII(41);
                int height = c444830HcP.LIZIZ().getHeight();
                int i2 = aCListenerS1S1401000_18.i5;
                if (height > i2) {
                    ScrollView scrollView2 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJJIJIIJIL;
                    if (scrollView2 != null) {
                        C1180060goW.LJIIIZ(i2, scrollView2);
                    }
                    ViewGroup viewGroup = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJJJJLIIL;
                    if (viewGroup != null) {
                        viewGroup.setBackground((Drawable) ((C259800zU) aCListenerS1S1401000_18.l3).element);
                    }
                } else {
                    ScrollView scrollView3 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJJIJIIJIL;
                    if (scrollView3 != null) {
                        C1180060goW.LJIIIZ(-2, scrollView3);
                    }
                    ViewGroup viewGroup2 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJJJJLIIL;
                    if (viewGroup2 != null) {
                        viewGroup2.setBackground((Drawable) ((C259800zU) aCListenerS1S1401000_18.l4).element);
                    }
                }
            } else {
                ScrollView scrollView4 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJJIJIIJIL;
                if (scrollView4 != null) {
                    C1189060h32.LJJII(scrollView4, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
                }
                ScrollView scrollView5 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJJIJIIJIL;
                if (scrollView5 != null) {
                    C1180060goW.LJIIIZ(-2, scrollView5);
                }
                ViewGroup viewGroup3 = ((PoiGalleryActivityForReviews) aCListenerS1S1401000_18.l2).LLJJJJLIIL;
                if (viewGroup3 != null) {
                    viewGroup3.setBackground((Drawable) ((C259800zU) aCListenerS1S1401000_18.l4).element);
                }
            }
            if ((view instanceof C1202300hOO) && (c1202300hOO = (C1202300hOO) view) != null) {
                c1202300hOO.setExpanded$poi_release(!((C1202300hOO) aCListenerS1S1401000_18.l1).getExpanded());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021e A[PHI: r14
      0x021e: PHI (r14v1 java.lang.String) = (r14v0 java.lang.String), (r14v4 java.lang.String) binds: [B:126:0x021a, B:83:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022b A[PHI: r22
      0x022b: PHI (r22v1 java.lang.String) = (r22v0 java.lang.String), (r22v4 java.lang.String) binds: [B:131:0x0227, B:72:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0145  */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [int] */
    /* JADX WARN: Type inference failed for: r33v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$2(Y.ACListenerS1S1401000_18 r37, android.view.View r38) {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS1S1401000_18.onClick$2(Y.ACListenerS1S1401000_18, android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS1S1401000_18(Object obj, CollectionListMainUIAssem collectionListMainUIAssem, CollectionDetail collectionDetail, int i, C1171260gaK c1171260gaK, String str, Map<String, String> map) {
        this.$t = map;
        this.l1 = obj;
        this.l2 = collectionListMainUIAssem;
        this.i5 = collectionDetail;
        this.l3 = i;
        this.s0 = c1171260gaK;
        this.l4 = str;
    }
}
