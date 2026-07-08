package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.UpDowngradePackageViewModel;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514580KGa extends C09AY implements Function1<C0KJ5, LiveData<SubscriptionProductDetailWithTemplateInfo>> {
    public final /* synthetic */ UpDowngradePackageViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514580KGa(UpDowngradePackageViewModel upDowngradePackageViewModel) {
        super(1);
        this.LL = upDowngradePackageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final LiveData<SubscriptionProductDetailWithTemplateInfo> invoke(C0KJ5 c0kj5) {
        List<SubscriptionProductDetailWithTemplateInfo> list;
        String str;
        String str2;
        C0KJ5 c0kj52 = c0kj5;
        UpDowngradePackageViewModel upDowngradePackageViewModel = this.LL;
        upDowngradePackageViewModel.getClass();
        MutableLiveData mutableLiveData = new MutableLiveData();
        C514830KGz value = upDowngradePackageViewModel.LLILLL.getValue();
        SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo = null;
        if (value != null && (list = value.LIZ) != null) {
            Iterator<SubscriptionProductDetailWithTemplateInfo> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SubscriptionProductDetailWithTemplateInfo next = it2.next();
                SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo2 = next;
                TemplateInfo templateInfo = subscriptionProductDetailWithTemplateInfo2.getTemplateInfo();
                if (templateInfo != null) {
                    str = templateInfo.iapId;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, c0kj52.LIZ)) {
                    TemplateInfo templateInfo2 = subscriptionProductDetailWithTemplateInfo2.getTemplateInfo();
                    if (templateInfo2 != null) {
                        str2 = templateInfo2.basePlanId;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, c0kj52.LIZIZ)) {
                        subscriptionProductDetailWithTemplateInfo = next;
                        break;
                    }
                }
            }
        }
        mutableLiveData.setValue(subscriptionProductDetailWithTemplateInfo);
        return mutableLiveData;
    }
}
