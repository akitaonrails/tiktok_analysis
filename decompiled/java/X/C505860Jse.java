package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.fragment.SubSpaceFeedDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jse, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505860Jse extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubSpaceFeedDialogFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C505860Jse(SubSpaceFeedDialogFragment subSpaceFeedDialogFragment) {
        super(0);
        this.LL = subSpaceFeedDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.dismissAllowingStateLoss();
        return Unit.LIZ;
    }
}
