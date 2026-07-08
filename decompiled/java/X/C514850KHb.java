package X;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackageMultiMonthFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KHb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514850KHb extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubPackageMultiMonthFragment LL;
    public final /* synthetic */ Observer<C0KIP> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514850KHb(SubPackageMultiMonthFragment subPackageMultiMonthFragment, C0KGM c0kgm) {
        super(0);
        this.LL = subPackageMultiMonthFragment;
        this.LLILLJJLI = c0kgm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableLiveData<C0KIP> mutableLiveData;
        PackagePageViewModel packagePageViewModel = this.LL.LLILLJJLI;
        if (packagePageViewModel != null && (mutableLiveData = packagePageViewModel.LLJI) != null) {
            mutableLiveData.removeObserver(this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
