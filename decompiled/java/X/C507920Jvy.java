package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.activity.assem.SubSpaceActivityContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jvy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507920Jvy extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubSpaceActivityContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507920Jvy(SubSpaceActivityContentAssem subSpaceActivityContentAssem) {
        super(0);
        this.LL = subSpaceActivityContentAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.kp("click");
        return Unit.LIZ;
    }
}
