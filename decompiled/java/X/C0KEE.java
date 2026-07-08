package X;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubUpdowngradePackageFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.UpDowngradePackageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KEE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KEE extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubUpdowngradePackageFragment LL;
    public final /* synthetic */ Observer<C0KIP> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KEE(SubUpdowngradePackageFragment subUpdowngradePackageFragment, C0KCB c0kcb) {
        super(0);
        this.LL = subUpdowngradePackageFragment;
        this.LLILLJJLI = c0kcb;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableLiveData<C0KIP> mutableLiveData;
        UpDowngradePackageViewModel upDowngradePackageViewModel = this.LL.LLILLJJLI;
        if (upDowngradePackageViewModel != null && (mutableLiveData = upDowngradePackageViewModel.LLJ) != null) {
            mutableLiveData.removeObserver(this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
