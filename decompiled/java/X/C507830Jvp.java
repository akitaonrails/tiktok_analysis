package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.assem.DiscordPrivilegeAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Jvp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507830Jvp extends C09AY implements Function2<UIAssem, C291001Au<? extends AbstractC510000JzK>, Unit> {
    public final /* synthetic */ DiscordPrivilegeAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507830Jvp(DiscordPrivilegeAssem discordPrivilegeAssem) {
        super(2);
        this.LL = discordPrivilegeAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends AbstractC510000JzK> c291001Au) {
        AbstractC510000JzK abstractC510000JzK;
        C497950Jft c497950Jft;
        C291001Au<? extends AbstractC510000JzK> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (abstractC510000JzK = (AbstractC510000JzK) c291001Au2.LIZ) != null) {
            DiscordPrivilegeAssem discordPrivilegeAssem = this.LL;
            if ((abstractC510000JzK instanceof C509170Jxz) && (c497950Jft = discordPrivilegeAssem.LLJJI) != null) {
                c497950Jft.I5(new C507750Jvh(((C509170Jxz) abstractC510000JzK).LIZ));
            }
        }
        return Unit.LIZ;
    }
}
