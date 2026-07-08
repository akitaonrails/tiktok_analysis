package X;

import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19DX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19DX extends C09AY implements Function0<BaseActivityViewModel> {
    public final /* synthetic */ BaseActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19DX(BaseActivity baseActivity) {
        super(0);
        this.LL = baseActivity;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.ViewModel, com.bytedance.ies.foundation.activity.BaseActivityViewModel] */
    @Override // kotlin.jvm.functions.Function0
    public final BaseActivityViewModel invoke() {
        return ViewModelProviders.of(this.LL).get(BaseActivity.viewModelClass);
    }
}
