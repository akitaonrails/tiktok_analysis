package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514970KHn extends C09AY implements Function1<C0KIP, Unit> {
    public final /* synthetic */ SubPackagePageAssemVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514970KHn(SubPackagePageAssemVM subPackagePageAssemVM) {
        super(1);
        this.LL = subPackagePageAssemVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0KIP c0kip) {
        this.LL.setState(new C514980KHo(EnumC513810KDb.PAY_ENDED, c0kip));
        return Unit.LIZ;
    }
}
