package X;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.statistic.SubOnlyStatisticsEnhanceViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JYD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JYD extends C09AY implements Function0<SubOnlyStatisticsEnhanceViewModel> {
    public final /* synthetic */ SubOnlyLiveSettingFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JYD(SubOnlyLiveSettingFragment subOnlyLiveSettingFragment) {
        super(0);
        this.LL = subOnlyLiveSettingFragment;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.ViewModel, com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.statistic.SubOnlyStatisticsEnhanceViewModel] */
    @Override // kotlin.jvm.functions.Function0
    public final SubOnlyStatisticsEnhanceViewModel invoke() {
        return ViewModelProviders.of(this.LL, new ViewModelProvider.NewInstanceFactory()).get(SubOnlyStatisticsEnhanceViewModel.class);
    }
}
