package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KIr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515270KIr extends C09AY implements Function1<AbstractC515310KIv, Unit> {
    public final /* synthetic */ PackagePageViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C515270KIr(PackagePageViewModel packagePageViewModel) {
        super(1);
        this.LL = packagePageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC515310KIv abstractC515310KIv) {
        PackagePageViewModel packagePageViewModel = this.LL;
        packagePageViewModel.LLILLL = false;
        if (abstractC515310KIv instanceof C515410KJf) {
            packagePageViewModel.LLILZ = true;
        } else if ((abstractC515310KIv instanceof C515390KJd) || (abstractC515310KIv instanceof C515370KJb)) {
            packagePageViewModel.LLILZ = false;
        }
        return Unit.LIZ;
    }
}
