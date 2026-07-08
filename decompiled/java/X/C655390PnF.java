package X;

import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.ugc.aweme.commercialize.search.brandzone.data.BrandZoneCard;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.BrandZoneCardStruct;
import com.ss.android.ugc.aweme.feed.model.search.SearchInflowMultiAdCardStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SingleLive;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0PnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655390PnF {
    public static final List<AbstractC622580ObQ> LIZLLL(List<? extends SearchMixFeed> list) {
        AbstractC622580ObQ abstractC622580ObQ;
        final Aweme aweme;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (SearchMixFeed searchMixFeed : list) {
            int feedType = searchMixFeed.getFeedType();
            if (feedType != 62) {
                if (feedType != 65280) {
                    if (feedType != 65465) {
                        final Aweme aweme2 = searchMixFeed.getAweme();
                        final String strValueOf = String.valueOf(searchMixFeed.getFeedType());
                        abstractC622580ObQ = new AbstractC622580ObQ(aweme2, strValueOf) { // from class: X.0OdO
                        };
                    } else {
                        abstractC622580ObQ = new AbstractC622580ObQ(String.valueOf(searchMixFeed.getFeedType())) { // from class: X.0OdM
                        };
                    }
                } else {
                    Aweme aweme3 = searchMixFeed.getAweme();
                    if (aweme3 != null && AwemeExtKt.isPhotoMode(aweme3)) {
                        final Aweme aweme4 = searchMixFeed.getAweme();
                        abstractC622580ObQ = new AbstractC622580ObQ(aweme4) { // from class: X.0OdL
                            {
                                String aid;
                                super(aweme4, (aweme4 == null || (aid = aweme4.getAid()) == null) ? "" : aid, "photo");
                            }
                        };
                    } else {
                        final Aweme aweme5 = searchMixFeed.getAweme();
                        abstractC622580ObQ = new AbstractC622580ObQ(aweme5) { // from class: X.0OdK
                            {
                                String aid;
                                super(aweme5, (aweme5 == null || (aid = aweme5.getAid()) == null) ? "" : aid, "video");
                            }
                        };
                    }
                }
            } else {
                SingleLive singleLive = searchMixFeed.singleLive;
                if (singleLive != null) {
                    aweme = singleLive.aweme;
                    Aweme aweme6 = singleLive.aweme;
                    if (aweme6 == null || (aid = aweme6.getAid()) == null) {
                    }
                    abstractC622580ObQ = new AbstractC622580ObQ(aweme, aid) { // from class: X.0OdN
                    };
                } else {
                    aweme = null;
                }
                final String aid = "";
                abstractC622580ObQ = new AbstractC622580ObQ(aweme, aid) { // from class: X.0OdN
                };
            }
            arrayList.add(abstractC622580ObQ);
        }
        return arrayList;
    }

    public static final C0PF9 LJFF(RecyclerView.ViewHolder viewHolder) {
        AbstractC21673619ry adapter;
        AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry;
        C0PVB c0pvb;
        RecyclerView recyclerView;
        ViewParent parent = viewHolder.itemView.getParent();
        if ((parent instanceof RecyclerView) && (recyclerView = (RecyclerView) parent) != null) {
            adapter = recyclerView.getAdapter();
        } else {
            adapter = null;
        }
        if ((adapter instanceof C0PVB) && (c0pvb = (C0PVB) adapter) != null) {
            abstractC21673619ry = c0pvb.LL;
        } else {
            abstractC21673619ry = null;
        }
        if (!(abstractC21673619ry instanceof C0PF9)) {
            return null;
        }
        return (C0PF9) abstractC21673619ry;
    }

    public static final AbstractC655400PnG LIZ(SearchMixFeed searchMixFeed, C0PK8 c0pk8) {
        BrandZoneCardStruct brandZoneCardStruct;
        LinkedHashMap<String, List<Aweme>> dynamicAwemeMaps;
        int i = C0PK9.LIZ[c0pk8.ordinal()];
        if (i != 1) {
            String str = "";
            if (i != 2) {
                AwemeRawAd rawAdData = null;
                if (i != 3) {
                    return null;
                }
                BrandZoneCard brandZoneCard = searchMixFeed.brandZoneCard;
                if (brandZoneCard != null && (dynamicAwemeMaps = brandZoneCard.getDynamicAwemeMaps()) != null && !dynamicAwemeMaps.isEmpty()) {
                    brandZoneCardStruct = new BrandZoneCardStruct(null, null);
                    brandZoneCardStruct.setDynamicAwemeMaps(dynamicAwemeMaps);
                    BrandZoneCard brandZoneCard2 = searchMixFeed.brandZoneCard;
                    if (brandZoneCard2 != null) {
                        rawAdData = brandZoneCard2.getRawAdData();
                    }
                    brandZoneCardStruct.setRawAdData(rawAdData);
                } else {
                    brandZoneCardStruct = null;
                }
                String providerDocIdStr = searchMixFeed.getProviderDocIdStr();
                if (providerDocIdStr == null) {
                    providerDocIdStr = "";
                }
                String requestId = searchMixFeed.getRequestId();
                if (requestId != null) {
                    str = requestId;
                }
                return new C655420PnI(brandZoneCardStruct, providerDocIdStr, str, Integer.valueOf(searchMixFeed.getFeedType()), LIZIZ(searchMixFeed, c0pk8));
            }
            SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct = searchMixFeed.multiAdCard;
            String providerDocIdStr2 = searchMixFeed.getProviderDocIdStr();
            if (providerDocIdStr2 == null) {
                providerDocIdStr2 = "";
            }
            String requestId2 = searchMixFeed.getRequestId();
            if (requestId2 != null) {
                str = requestId2;
            }
            return new C655430PnJ(searchInflowMultiAdCardStruct, providerDocIdStr2, str, Integer.valueOf(searchMixFeed.getFeedType()), LIZIZ(searchMixFeed, c0pk8));
        }
        return new C655410PnH(searchMixFeed.getAweme(), LIZIZ(searchMixFeed, c0pk8));
    }

    public static final String LIZIZ(SearchMixFeed searchMixFeed, C0PK8 c0pk8) {
        String aid;
        int i = C0PK9.LIZ[c0pk8.ordinal()];
        String str = "";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    String providerDocIdStr = searchMixFeed.getProviderDocIdStr();
                    if (providerDocIdStr != null) {
                        str = providerDocIdStr;
                    }
                    sbLIZ.append(str);
                    sbLIZ.append(searchMixFeed.getRequestId());
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("brand_");
                String providerDocIdStr2 = searchMixFeed.getProviderDocIdStr();
                if (providerDocIdStr2 != null) {
                    str = providerDocIdStr2;
                }
                sbLIZ2.append(str);
                sbLIZ2.append(searchMixFeed.getRequestId());
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            String providerDocIdStr3 = searchMixFeed.getProviderDocIdStr();
            if (providerDocIdStr3 != null) {
                str = providerDocIdStr3;
            }
            sbLIZ3.append(str);
            sbLIZ3.append(searchMixFeed.getRequestId());
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        Aweme aweme = searchMixFeed.getAweme();
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return "";
        }
        return aid;
    }

    public static final String LIZJ(int i, Aweme aweme) {
        String aid;
        AwemeRawAd awemeRawAd;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Integer numValueOf = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append('_');
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            numValueOf = Integer.valueOf(awemeRawAd.getRit());
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append('_');
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(com.ss.android.ugc.aweme.feed.model.Aweme r16, java.lang.String r17, android.view.View r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19) {
        /*
            r14 = r16
            if (r14 != 0) goto L5
            return
        L5:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r14.getAwemeRawAd()
            if (r0 == 0) goto Lc4
            boolean r1 = X.C1010120cOQ.LJJIIZI(r0)
            r0 = 1
            if (r1 != r0) goto Lc4
        L12:
            r3 = 0
            r2 = r17
            if (r0 == 0) goto L84
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r14.getAwemeRawAd()
            if (r0 == 0) goto L33
            com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel r0 = r0.getSearchAdInfo()
            if (r0 == 0) goto L33
            java.util.List<com.ss.android.ugc.aweme.search.ecom.data.Product> r0 = r0.productsInfo
            if (r0 == 0) goto L33
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.search.ecom.data.Product r0 = (com.ss.android.ugc.aweme.search.ecom.data.Product) r0
            if (r0 == 0) goto L33
            java.lang.String r4 = r0.title
            if (r4 != 0) goto L37
        L33:
            java.lang.String r4 = r14.getDesc()
        L37:
            java.lang.String r7 = r14.getAid()
            java.lang.String r9 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r14)
            com.ss.android.ugc.aweme.feed.model.Video r0 = r14.getVideo()
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getCover()
            if (r0 == 0) goto L75
            r3 = r0
        L4c:
            boolean r0 = X.C0Q9J.LIZ
            java.util.List r5 = X.C684120QsU.LIZLLL(r2)
            X.0Qr2 r1 = new X.0Qr2
            r6 = 0
            r10 = 0
            r17 = 515920(0x7df50, float:7.22958E-40)
            r8 = r6
            r11 = r10
            r12 = r10
            r13 = r10
            r15 = r6
            r16 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L63:
            kotlin.jvm.internal.AwS624S0100000_10 r3 = new kotlin.jvm.internal.AwS624S0100000_10
            r0 = 129(0x81, float:1.81E-43)
            r4 = r19
            r3.<init>(r4, r0)
            r5 = 4
            r0 = r18
            r1 = r1
            r2 = r10
            X.C684120QsU.LIZIZ(r0, r1, r2, r3, r4, r5)
            return
        L75:
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r14.getPhotoModeImageInfo()
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r0 = r0.getImagePostCover()
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r0.displayImageNoWatermark
            goto L4c
        L84:
            java.lang.String r4 = r14.getDesc()
            java.lang.String r7 = r14.getAid()
            java.lang.String r9 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r14)
            com.ss.android.ugc.aweme.feed.model.Video r0 = r14.getVideo()
            if (r0 == 0) goto Lb5
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getCover()
            if (r0 == 0) goto Lb5
            r3 = r0
        L9d:
            boolean r0 = X.C0Q9J.LIZ
            java.util.List r5 = X.C684120QsU.LIZLLL(r2)
            X.0Qr2 r1 = new X.0Qr2
            r6 = 0
            r10 = 0
            r17 = 515920(0x7df50, float:7.22958E-40)
            r8 = r6
            r11 = r10
            r12 = r10
            r13 = r10
            r15 = r6
            r16 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L63
        Lb5:
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r14.getPhotoModeImageInfo()
            if (r0 == 0) goto L9d
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r0 = r0.getImagePostCover()
            if (r0 == 0) goto L9d
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r0.displayImageNoWatermark
            goto L9d
        Lc4:
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C655390PnF.LJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, android.view.View, kotlin.jvm.functions.Function0):void");
    }
}
