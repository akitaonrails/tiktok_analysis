package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.fragment.NewSubSpaceFeedSheetDialogFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1143404dc extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ NewSubSpaceFeedSheetDialogFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1143404dc(NewSubSpaceFeedSheetDialogFragment newSubSpaceFeedSheetDialogFragment) {
        super(1);
        this.LL = newSubSpaceFeedSheetDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1143304db());
        return Unit.LIZ;
    }
}
