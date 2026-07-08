package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.assem.EmotePollDetailAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JRL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JRL extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ EmotePollDetailAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JRL(EmotePollDetailAssem emotePollDetailAssem) {
        super(1);
        this.LL = emotePollDetailAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C0JRK());
        return Unit.LIZ;
    }
}
