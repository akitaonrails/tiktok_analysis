package X;

import androidx.fragment.app.SAFTikTokFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.19CL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19CL extends C09AY implements Function0<C19DL> {
    public final /* synthetic */ SAFTikTokFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19CL(SAFTikTokFragment sAFTikTokFragment) {
        super(0);
        this.LL = sAFTikTokFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C19DL invoke() {
        SAFTikTokFragment sAFTikTokFragment = this.LL;
        if (sAFTikTokFragment.LLILZ.LJJII == null) {
            return null;
        }
        return new C19DL(new AwS576S0100000_32(sAFTikTokFragment, 5));
    }
}
