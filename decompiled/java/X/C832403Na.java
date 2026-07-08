package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.OspAddressCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.policy.UserTrustCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.bonus.SeaBonusCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.span.SpanCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.summary.SummaryCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.addnote.SeaOneStepAddNoteCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.gift.SeaOneStepGiftCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.waistbanner.SeaSkuWaistBannerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.UnreachableExpendCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.UnreachableHeadCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.UnreachableSkuCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.USPackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.counter.SeaSkuCounterCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.image.SeaSkuImageSpecCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.skeleton.SeaSkuSkeletonCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.text.SeaSkuTextSpecCell;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.03Na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C832403Na {
    public static final void LIZIZ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return;
        }
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SeaSkuImageSpecCell.class, SeaSkuTextSpecCell.class, SeaSkuSkeletonCell.class, SeaSkuWaistBannerCell.class, SeaSkuCounterCell.class, SeaOneStepAddNoteCell.class, SeaOneStepGiftCell.class, SeaBonusCell.class, SpanCell.class, OspAddressCell.class, UnreachableExpendCell.class, UnreachableHeadCell.class, UnreachableSkuCell.class, PaymentInfoCell2.class, PlatformDiscountsCell.class, SummaryCell.class, UserTrustCell.class);
    }

    public static final List<String> LIZJ(Integer num) {
        int iLJIIJJI;
        EnumC969503qf.DEFAULT.getTemplate();
        if (num != null) {
            iLJIIJJI = num.intValue();
        } else {
            iLJIIJJI = AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(null), "order_submit", null, null, 12);
        }
        if (iLJIIJJI == EnumC969503qf.US_OSP_V1.getTemplate()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(AnonymousClass0310.class.getName());
            arrayList.add(AnonymousClass0311.class.getName());
            arrayList.add(C719502rR.class.getName());
            arrayList.add(C719302rP.class.getName());
            arrayList.add(C752402wk.class.getName());
            arrayList.add(C752802wo.class.getName());
            arrayList.add(C755502xF.class.getName());
            arrayList.add(AnonymousClass0316.class.getName());
            arrayList.add(C755202xC.class.getName());
            arrayList.add(C7813033j.class.getName());
            arrayList.add(C031F.class.getName());
            arrayList.add(USPackedSku.class.getName());
            arrayList.add(C031A.class.getName());
            arrayList.add(C754002x0.class.getName());
            arrayList.add(AnonymousClass0319.class.getName());
            arrayList.add(C7811033h.class.getName());
            arrayList.add(C723202s2.class.getName());
            arrayList.add(C757502xZ.class.getName());
            arrayList.add(C721002rg.class.getName());
            arrayList.add(C720702rd.class.getName());
            arrayList.add(C755902xJ.class.getName());
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(AnonymousClass0376.class.getName());
        arrayList2.add(C7812033i.class.getName());
        arrayList2.add(C031E.class.getName());
        arrayList2.add(PackedSku.class.getName());
        arrayList2.add(C7768031q.class.getName());
        arrayList2.add(C754002x0.class.getName());
        arrayList2.add(C720002rW.class.getName());
        arrayList2.add(C722302rt.class.getName());
        arrayList2.add(C752702wn.class.getName());
        arrayList2.add(C7811033h.class.getName());
        arrayList2.add(C719202rO.class.getName());
        arrayList2.add(C7734030i.class.getName());
        arrayList2.add(C742102v5.class.getName());
        arrayList2.add(C752402wk.class.getName());
        arrayList2.add(C719402rQ.class.getName());
        arrayList2.add(C757602xa.class.getName());
        return arrayList2;
    }

    public static final List LIZ(Integer num, List list, boolean z) {
        boolean zLIZ;
        List<String> listLIZJ;
        if (z) {
            zLIZ = C963303pf.LIZIZ();
        } else {
            zLIZ = C963303pf.LIZ();
        }
        if (zLIZ) {
            C832503Nb.LIZ.getClass();
            listLIZJ = C832503Nb.LIZIZ(num);
        } else {
            listLIZJ = LIZJ(num);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (listLIZJ.contains(obj.getClass().getName()) && (obj instanceof InterfaceC1891350zJl)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
