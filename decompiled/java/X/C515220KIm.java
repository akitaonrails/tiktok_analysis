package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KIm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515220KIm extends C09AY implements Function1<AbstractC515310KIv, Unit> {
    public final /* synthetic */ SubPackagePageAssemVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C515220KIm(SubPackagePageAssemVM subPackagePageAssemVM) {
        super(1);
        this.LL = subPackagePageAssemVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC515310KIv abstractC515310KIv) {
        SubPackagePageAssemVM subPackagePageAssemVM = this.LL;
        subPackagePageAssemVM.LL = false;
        if (abstractC515310KIv instanceof C515410KJf) {
            subPackagePageAssemVM.LLILLJJLI = true;
        } else if ((abstractC515310KIv instanceof C515390KJd) || (abstractC515310KIv instanceof C515370KJb)) {
            subPackagePageAssemVM.LLILLJJLI = false;
        }
        return Unit.LIZ;
    }
}
