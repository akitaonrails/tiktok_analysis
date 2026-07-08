package X;

import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.effectcreator.protocol.IAIEffectEntranceService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0DTk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339700DTk {
    public static final C339700DTk LIZ = new C339700DTk();

    public static final boolean LIZ() {
        IEffectCreatorService iEffectCreatorService;
        IAIEffectEntranceService iAIEffectEntranceServiceLJFF;
        return C0C64.LJIILLIIL().LJIIIZ(31744, "ame_enable_aigc_i2v", true, false) || !((iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null)) == null || (iAIEffectEntranceServiceLJFF = iEffectCreatorService.LJFF()) == null || !iAIEffectEntranceServiceLJFF.LIZ());
    }
}
