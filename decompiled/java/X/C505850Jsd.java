package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.fragment.NewSubSpaceFeedSheetDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jsd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505850Jsd extends C09AY implements Function0<Unit> {
    public final /* synthetic */ NewSubSpaceFeedSheetDialogFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C505850Jsd(NewSubSpaceFeedSheetDialogFragment newSubSpaceFeedSheetDialogFragment) {
        super(0);
        this.LL = newSubSpaceFeedSheetDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.close(1);
        return Unit.LIZ;
    }
}
