package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.fragment.SubOnlySpacePostTopicFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jlz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501730Jlz extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubOnlySpacePostTopicFragment LL;
    public final /* synthetic */ RecyclerView LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C501730Jlz(SubOnlySpacePostTopicFragment subOnlySpacePostTopicFragment, RecyclerView recyclerView) {
        super(1);
        this.LL = subOnlySpacePostTopicFragment;
        this.LLILLJJLI = recyclerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.QQ2(this.LL, new C501740Jm0(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
