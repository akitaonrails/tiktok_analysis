package X;

import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515300KIu extends C09AY implements Function1<SubscribeUserInfoResponse, Unit> {
    public final /* synthetic */ SubPackagePageAssemVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C515300KIu(SubPackagePageAssemVM subPackagePageAssemVM) {
        super(1);
        this.LL = subPackagePageAssemVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SubscribeUserInfoResponse subscribeUserInfoResponse) {
        new C515290KIt(this.LL);
        return Unit.LIZ;
    }
}
