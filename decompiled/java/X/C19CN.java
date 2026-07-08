package X;

import androidx.fragment.app.SAFTikTokFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.19CN, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19CN extends C09AY implements Function1<C19CP, Unit> {
    public final /* synthetic */ SAFTikTokFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19CN(SAFTikTokFragment sAFTikTokFragment) {
        super(1);
        this.LL = sAFTikTokFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C19CP c19cp) {
        c19cp.LJJIJIL(this.LL);
        return Unit.LIZ;
    }
}
