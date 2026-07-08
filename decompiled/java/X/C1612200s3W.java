package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.model.PurchaseCategory;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel;
import com.ss.android.ugc.aweme.series.seriesdetail.assem.SeriesDetailDescriptionAssem;
import com.ss.android.ugc.aweme.service.MiniDramaPaymentService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0s3W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final /* synthetic */ class C1612200s3W extends C2217421BqW implements Function1<C1613010s4p, Unit> {
    public C1612200s3W(Object obj) {
        super(1, obj, SeriesDetailDescriptionAssem.class, "onPurchaseOptionPurchaseClick", "onPurchaseOptionPurchaseClick(Lcom/ss/android/ugc/aweme/model/EpisodePurchaseParams;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1613010s4p c1613010s4p) {
        CollectionDetailModel collectionDetailModelHo;
        boolean z;
        boolean z2;
        String str;
        String uid;
        C1613010s4p c1613010s4p2 = c1613010s4p;
        SeriesDetailDescriptionAssem seriesDetailDescriptionAssem = (SeriesDetailDescriptionAssem) this.receiver;
        Context context = seriesDetailDescriptionAssem.getContext();
        if (context != null && (collectionDetailModelHo = seriesDetailDescriptionAssem.Ho()) != null) {
            C1612160s3S c1612160s3S = (C1612160s3S) seriesDetailDescriptionAssem.Oo().getState();
            C1613360s5O c1613360s5O = new C1613360s5O();
            c1613360s5O.LIZ = collectionDetailModelHo;
            String str2 = seriesDetailDescriptionAssem.Jo().LLILLJJLI;
            boolean z3 = seriesDetailDescriptionAssem.Jo().LLJJIJI;
            if (seriesDetailDescriptionAssem.Jo().LLILLL == EnumC1612760s4Q.ANCHOR) {
                z = true;
            } else {
                z = false;
            }
            long j = seriesDetailDescriptionAssem.Jo().LLIZ;
            EnumC1612690s4J enumC1612690s4J = c1613010s4p2.sourceWay;
            boolean z4 = seriesDetailDescriptionAssem.Jo().LLJJIII;
            PurchaseOption purchaseOption = c1613010s4p2.purchaseOption;
            int i = purchaseOption.numVideos;
            if (purchaseOption.purchaseCategory == PurchaseCategory.PURCHASE_CATEGORY_ENTIRE_COLLECTION) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1613360s5O.LIZIZ = new C1612830s4X(str2, z3, z, z4, true, Long.valueOf(j), enumC1612690s4J, Integer.valueOf(i), z2, false, seriesDetailDescriptionAssem.Jo().LLJJIJIIJIL, ((SeriesInnerFeedViewModel) seriesDetailDescriptionAssem.LLJJ.getValue()).xA(), c1613360s5O.LIZ, Integer.valueOf(seriesDetailDescriptionAssem.Jo().LLJJ), seriesDetailDescriptionAssem.Jo().LLJILJIL, Boolean.valueOf(seriesDetailDescriptionAssem.Jo().LLJJIJIL), Boolean.valueOf(seriesDetailDescriptionAssem.Jo().LLJJJ), seriesDetailDescriptionAssem.Jo().LLJJJIL, null, null, null, null, Boolean.FALSE, seriesDetailDescriptionAssem.Jo().LLJJJJLIIL);
            Integer num = c1612160s3S.LLJILJILJ;
            if (num != null) {
                num.intValue();
                PurchaseOption purchaseOption2 = c1613010s4p2.purchaseOption;
                MiniDramaPaymentService miniDramaPaymentService = (MiniDramaPaymentService) seriesDetailDescriptionAssem.LLJJIII.getValue();
                if (miniDramaPaymentService != null) {
                    long j2 = collectionDetailModelHo.collectionId;
                    PriceInfo priceInfo = purchaseOption2.price;
                    if (priceInfo != null) {
                        str = priceInfo.iapId;
                    } else {
                        str = null;
                    }
                    PriceInfo priceInfo2 = purchaseOption2.discountedPrice;
                    if (priceInfo2 != null) {
                        Long.valueOf(priceInfo2.diamondId);
                    }
                    PriceInfo priceInfo3 = purchaseOption2.discountedPrice;
                    PriceInfo priceInfo4 = purchaseOption2.price;
                    if (priceInfo4 != null) {
                        Long.valueOf(priceInfo4.diamondId);
                    }
                    EnumC1612760s4Q enumC1612760s4Q = seriesDetailDescriptionAssem.Jo().LLILLL;
                    EnumC1612690s4J enumC1612690s4J2 = c1613010s4p2.sourceWay;
                    SeriesCategory seriesCategory = collectionDetailModelHo.category;
                    String str3 = c1613010s4p2.groupId;
                    String str4 = seriesDetailDescriptionAssem.Jo().LLILLJJLI;
                    User user = collectionDetailModelHo.collectionCreator;
                    if (user == null || (uid = user.getUid()) == null) {
                        uid = "";
                    }
                    C1613540s5g c1613540s5gLJFF = miniDramaPaymentService.LJFF(context, j2, null, str, enumC1612760s4Q, enumC1612690s4J2, seriesCategory, str3, str4, c1613010s4p2, uid, c1613360s5O, seriesDetailDescriptionAssem.Jo().LLJJIJIIJIL, null);
                    if (c1613540s5gLJFF != null) {
                        seriesDetailDescriptionAssem.LLJILJIL.LIZ(new C1613600s5m(c1613540s5gLJFF));
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
