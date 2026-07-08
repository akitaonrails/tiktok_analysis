package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.setting.view.assem.SpacePostPreviewAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.setting.view.fragment.SubSpaceSettingFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501170Jl5 extends C09AY implements Function1<C0SZ5, Unit> {
    public final /* synthetic */ SubSpaceSettingFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C501170Jl5(SubSpaceSettingFragment subSpaceSettingFragment) {
        super(1);
        this.LL = subSpaceSettingFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0SZ5 c0sz5) {
        C0SZ5 c0sz52 = c0sz5;
        c0sz52.LL = C13LE.LIZ(SpacePostPreviewAssem.class);
        c0sz52.LLILZ = C2097608Jq.LJIIJ(new Pair("super_fans_space", Boolean.valueOf(this.LL.LLILZ)));
        c0sz52.LLIZLLLIL = R.id.rpx;
        return Unit.LIZ;
    }
}
