package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.view.assem.EmotePollStartAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04dE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1141004dE extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ EmotePollStartAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1141004dE(EmotePollStartAssem emotePollStartAssem) {
        super(1);
        this.LL = emotePollStartAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1140904dD());
        return Unit.LIZ;
    }
}
