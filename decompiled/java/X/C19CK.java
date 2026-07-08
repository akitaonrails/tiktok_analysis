package X;

import androidx.fragment.app.SAFTikTokFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19CK, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19CK extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SAFTikTokFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19CK(SAFTikTokFragment sAFTikTokFragment) {
        super(0);
        this.LL = sAFTikTokFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C19CY c19cySR = this.LL.SR();
        if (c19cySR != null) {
            SAFTikTokFragment sAFTikTokFragment = this.LL;
            c19cySR.LJIIL(sAFTikTokFragment, sAFTikTokFragment.requireView(), null, false);
        }
        return Unit.LIZ;
    }
}
