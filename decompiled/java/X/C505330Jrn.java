package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.NewSubSpaceDetailSheetDialogFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jrn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505330Jrn extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ NewSubSpaceDetailSheetDialogFragment LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C505330Jrn(NewSubSpaceDetailSheetDialogFragment newSubSpaceDetailSheetDialogFragment, View view) {
        super(1);
        this.LL = newSubSpaceDetailSheetDialogFragment;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.QQ2(this.LL, new C505340Jro(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
