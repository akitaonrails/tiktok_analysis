package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KGZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KGZ extends C09AY implements Function1<C0KJ4, LiveData<SubscriptionProductDetailWithTemplateInfo>> {
    public final /* synthetic */ PackagePageViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KGZ(PackagePageViewModel packagePageViewModel) {
        super(1);
        this.LL = packagePageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final LiveData<SubscriptionProductDetailWithTemplateInfo> invoke(C0KJ4 c0kj4) {
        List<SubscriptionProductDetailWithTemplateInfo> list;
        String str;
        String str2;
        C0KJ4 c0kj42 = c0kj4;
        PackagePageViewModel packagePageViewModel = this.LL;
        packagePageViewModel.getClass();
        MutableLiveData mutableLiveData = new MutableLiveData();
        C514900KHg value = packagePageViewModel.LLILZIL.getValue();
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
                if (Intrinsics.LJFF(str, c0kj42.LIZ)) {
                    TemplateInfo templateInfo2 = subscriptionProductDetailWithTemplateInfo2.getTemplateInfo();
                    if (templateInfo2 != null) {
                        str2 = templateInfo2.basePlanId;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, c0kj42.LIZIZ)) {
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
