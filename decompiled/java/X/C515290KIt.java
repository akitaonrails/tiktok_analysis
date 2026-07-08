package X;

import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515290KIt extends C09AY implements Function1<SubscribeUserInfoResponse, Unit> {
    public final /* synthetic */ SubPackagePageAssemVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C515290KIt(SubPackagePageAssemVM subPackagePageAssemVM) {
        super(1);
        this.LL = subPackagePageAssemVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SubscribeUserInfoResponse subscribeUserInfoResponse) {
        this.LL.setState(new C0KIX());
        return Unit.LIZ;
    }
}
