package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.setting.view.fragment.SubSpaceSettingFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jl4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501160Jl4 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubSpaceSettingFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C501160Jl4(SubSpaceSettingFragment subSpaceSettingFragment) {
        super(1);
        this.LL = subSpaceSettingFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        SubSpaceSettingFragment subSpaceSettingFragment = this.LL;
        assembler.RQ2(subSpaceSettingFragment, new C501170Jl5(subSpaceSettingFragment));
        return Unit.LIZ;
    }
}
