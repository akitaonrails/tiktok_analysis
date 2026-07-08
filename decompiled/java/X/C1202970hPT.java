package X;

import androidx.fragment.app.SAFTikTokFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hPT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202970hPT extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ SAFTikTokFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1202970hPT(SAFTikTokFragment sAFTikTokFragment) {
        super(0);
        this.LL = sAFTikTokFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.LL.ib() != null || C665300Q7s.LIZ());
    }
}
