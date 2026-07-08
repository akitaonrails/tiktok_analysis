package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vFV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734950vFV extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ GameDetailMixPageBaseFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734950vFV(GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment) {
        super(1);
        this.LL = gameDetailMixPageBaseFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        C197039127h c197039127h;
        C197039127h c197039127h2;
        boolean zBooleanValue = bool.booleanValue();
        GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment = this.LL;
        if (gameDetailMixPageBaseFragment.SR()) {
            if (zBooleanValue) {
                C16F5 c16f5 = gameDetailMixPageBaseFragment.LLJJJJJIL;
                if (c16f5 != null) {
                    C500260Jjc.LLFFF(c16f5);
                }
                C1881590z41 c1881590z41 = gameDetailMixPageBaseFragment.LLJZIJLIL;
                if (c1881590z41 != null && c1881590z41.LLJLLIL && (c197039127h2 = gameDetailMixPageBaseFragment.LLJJJJ) != null) {
                    C500260Jjc.LLFFF(c197039127h2);
                }
            } else {
                C197039127h c197039127h3 = gameDetailMixPageBaseFragment.LLJJJJ;
                if (c197039127h3 != null) {
                    C500260Jjc.LJIILLIIL(c197039127h3);
                }
                C16F5 c16f52 = gameDetailMixPageBaseFragment.LLJJJJJIL;
                if (c16f52 != null) {
                    C500260Jjc.LJIILLIIL(c16f52);
                }
            }
        } else if (zBooleanValue) {
            C16F5 c16f53 = gameDetailMixPageBaseFragment.LLJJJJJIL;
            if (c16f53 != null) {
                C500260Jjc.LLFFF(c16f53);
            }
            C1881590z41 c1881590z412 = gameDetailMixPageBaseFragment.LLJZIJLIL;
            if (c1881590z412 != null && c1881590z412.LLJLLIL && (c197039127h = gameDetailMixPageBaseFragment.LLJJJJ) != null) {
                C500260Jjc.LLFFF(c197039127h);
            }
        } else {
            C16F5 c16f54 = gameDetailMixPageBaseFragment.LLJJJJJIL;
            if (c16f54 != null) {
                C500260Jjc.LJIILIIL(c16f54);
            }
            C197039127h c197039127h4 = gameDetailMixPageBaseFragment.LLJJJJ;
            if (c197039127h4 != null) {
                C500260Jjc.LJIILIIL(c197039127h4);
            }
        }
        return Unit.LIZ;
    }
}
