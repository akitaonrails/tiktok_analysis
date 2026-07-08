package X;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingDialogNew;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.statistic.SubOnlyStatisticsEnhanceViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493950JYr extends C09AY implements Function0<SubOnlyStatisticsEnhanceViewModel> {
    public final /* synthetic */ SubOnlyLiveSettingDialogNew LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493950JYr(SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew) {
        super(0);
        this.LL = subOnlyLiveSettingDialogNew;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.ViewModel, com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.statistic.SubOnlyStatisticsEnhanceViewModel] */
    @Override // kotlin.jvm.functions.Function0
    public final SubOnlyStatisticsEnhanceViewModel invoke() {
        return ViewModelProviders.of(this.LL, new ViewModelProvider.NewInstanceFactory()).get(SubOnlyStatisticsEnhanceViewModel.class);
    }
}
