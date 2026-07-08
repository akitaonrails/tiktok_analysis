package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.ScrollablePackageContentAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TagInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KG9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KG9 extends C09AY implements Function2<UIAssem, SubscriptionProductDetailWithTemplateInfo, Unit> {
    public final /* synthetic */ ScrollablePackageContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KG9(ScrollablePackageContentAssem scrollablePackageContentAssem) {
        super(2);
        this.LL = scrollablePackageContentAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo) {
        String str;
        String strLIZ;
        int i;
        TemplateInfo templateInfo;
        TemplateInfo templateInfo2;
        TagInfo tagInfo;
        List<String> list;
        OfferInfo offerInfo;
        TemplateInfo templateInfo3;
        SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo2 = subscriptionProductDetailWithTemplateInfo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Selected product id: ");
        TemplateInfo templateInfo4 = null;
        if (subscriptionProductDetailWithTemplateInfo2 != null && (templateInfo3 = subscriptionProductDetailWithTemplateInfo2.getTemplateInfo()) != null) {
            str = templateInfo3.iapId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("SubPackageNative", C2188811AlT.LIZIZ(sbLIZ));
        ScrollablePackageContentAssem scrollablePackageContentAssem = this.LL;
        System.currentTimeMillis();
        scrollablePackageContentAssem.getClass();
        ScrollablePackageContentAssem scrollablePackageContentAssem2 = this.LL;
        Boolean bool = scrollablePackageContentAssem2.LLJJJIL;
        if (bool == null) {
            scrollablePackageContentAssem2.LLJJJIL = Boolean.FALSE;
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            this.LL.LLJJJIL = Boolean.TRUE;
        }
        if (subscriptionProductDetailWithTemplateInfo2 != null) {
            templateInfo4 = subscriptionProductDetailWithTemplateInfo2.getTemplateInfo();
        }
        boolean zLJIILJJIL = C513940KDo.LJIILJJIL(templateInfo4);
        SubPackagePageAssemVM subPackagePageAssemVMIp = this.LL.ip();
        Boolean boolValueOf = Boolean.valueOf(zLJIILJJIL);
        boolean zLJIIL = false;
        if (subscriptionProductDetailWithTemplateInfo2 == null || (templateInfo2 = subscriptionProductDetailWithTemplateInfo2.getTemplateInfo()) == null || (tagInfo = templateInfo2.tagInfo) == null || (list = tagInfo.promotionTermDesc) == null || list.size() <= 0) {
            strLIZ = "";
        } else {
            TemplateInfo templateInfo5 = subscriptionProductDetailWithTemplateInfo2.getTemplateInfo();
            if (templateInfo5 != null && (offerInfo = templateInfo5.offerInfo) != null) {
                strLIZ = C513990KDt.LIZ(offerInfo, subscriptionProductDetailWithTemplateInfo2.getSubscriptionProductDetail());
            } else {
                strLIZ = (String) ListProtector.get(list, 0);
            }
            if (strLIZ == null) {
                strLIZ = "";
            }
        }
        if (subscriptionProductDetailWithTemplateInfo2 != null && (templateInfo = subscriptionProductDetailWithTemplateInfo2.getTemplateInfo()) != null) {
            i = templateInfo.renewalPeriod;
        } else {
            i = 1;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (subscriptionProductDetailWithTemplateInfo2 != null) {
            zLJIIL = C513940KDo.LJIIL(subscriptionProductDetailWithTemplateInfo2);
        }
        SubPackagePageAssemVM.wQ2(subPackagePageAssemVMIp, null, boolValueOf, strLIZ, null, null, numValueOf, Boolean.valueOf(zLJIIL), C513900KDk.LJI(subscriptionProductDetailWithTemplateInfo2), null, 1139);
        return Unit.LIZ;
    }
}
