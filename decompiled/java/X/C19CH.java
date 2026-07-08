package X;

import android.os.Bundle;
import androidx.fragment.app.SAFTikTokFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.19CH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19CH extends C09AY implements Function1<C19CP, Unit> {
    public final /* synthetic */ SAFTikTokFragment LL;
    public final /* synthetic */ Bundle LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19CH(SAFTikTokFragment sAFTikTokFragment, Bundle bundle) {
        super(1);
        this.LL = sAFTikTokFragment;
        this.LLILLJJLI = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C19CP c19cp) {
        c19cp.LJJJIL(this.LL, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
