package X;

import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KHc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514860KHc extends C09AY implements Function1<String, LiveData<SubscribeUserInfoResponse>> {
    public final /* synthetic */ PackagePageViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514860KHc(PackagePageViewModel packagePageViewModel) {
        super(1);
        this.LL = packagePageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final LiveData<SubscribeUserInfoResponse> invoke(String str) {
        return this.LL.LL.LIZ(str, new C515590KJx());
    }
}
