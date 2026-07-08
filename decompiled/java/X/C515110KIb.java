package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515110KIb extends C09AY implements Function1<C514600KGc, Unit> {
    public final /* synthetic */ SubPackagePageAssemVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C515110KIb(SubPackagePageAssemVM subPackagePageAssemVM) {
        super(1);
        this.LL = subPackagePageAssemVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C514600KGc c514600KGc) {
        this.LL.setState(new C0KIV(c514600KGc));
        return Unit.LIZ;
    }
}
