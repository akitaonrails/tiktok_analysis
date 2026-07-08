package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.fragment.EmotePollDetailPageFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1162504gh extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ EmotePollDetailPageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1162504gh(EmotePollDetailPageFragment emotePollDetailPageFragment) {
        super(1);
        this.LL = emotePollDetailPageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1162404gg());
        return Unit.LIZ;
    }
}
