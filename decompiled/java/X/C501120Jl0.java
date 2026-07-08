package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.setting.view.fragment.SubSpaceSettingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jl0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501120Jl0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubSpaceSettingFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C501120Jl0(SubSpaceSettingFragment subSpaceSettingFragment) {
        super(0);
        this.LL = subSpaceSettingFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((C491870JQr) this.LL.LLJI.getValue()).LIZ();
        this.LL.RR();
        return Unit.LIZ;
    }
}
