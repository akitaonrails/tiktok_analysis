package X;

import androidx.fragment.app.SAFTikTokFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1997, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1997 extends C09AY implements Function1<AnonymousClass1993, Unit> {
    public final /* synthetic */ SAFTikTokFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1997(SAFTikTokFragment sAFTikTokFragment) {
        super(1);
        this.LL = sAFTikTokFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AnonymousClass1993 anonymousClass1993) {
        C1800490wxD.LIZ(this.LL, anonymousClass1993);
        return Unit.LIZ;
    }
}
