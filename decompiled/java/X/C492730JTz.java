package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JTz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492730JTz extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubOnlyLiveSettingFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492730JTz(SubOnlyLiveSettingFragment subOnlyLiveSettingFragment) {
        super(0);
        this.LL = subOnlyLiveSettingFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LLJJJIL = false;
        return Unit.LIZ;
    }
}
