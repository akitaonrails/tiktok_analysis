package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504380JqG extends C09AY implements Function0<C504450JqN> {
    public final /* synthetic */ SubSpaceFeedVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504380JqG(SubSpaceFeedVM subSpaceFeedVM) {
        super(0);
        this.LL = subSpaceFeedVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C504450JqN invoke() {
        return new C504450JqN(this.LL.vQ2());
    }
}
