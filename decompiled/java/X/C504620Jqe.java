package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.fragment.SubSpaceFeedFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504620Jqe extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubSpaceFeedFragment LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504620Jqe(SubSpaceFeedFragment subSpaceFeedFragment, View view) {
        super(1);
        this.LL = subSpaceFeedFragment;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.QQ2(this.LL, new C504630Jqf(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
