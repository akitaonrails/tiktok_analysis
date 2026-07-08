package X;

import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JU0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JU0 extends C09AY implements Function0<DataChannel> {
    public final /* synthetic */ SubOnlyLiveSettingFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JU0(SubOnlyLiveSettingFragment subOnlyLiveSettingFragment) {
        super(0);
        this.LL = subOnlyLiveSettingFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DataChannel invoke() {
        return C0IJR.LIZ(ViewModelProviders.of(this.LL), this.LL);
    }
}
