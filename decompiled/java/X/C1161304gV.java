package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.view.frgment.EmotePollStartDialog;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04gV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1161304gV extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ EmotePollStartDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1161304gV(EmotePollStartDialog emotePollStartDialog) {
        super(1);
        this.LL = emotePollStartDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        EmotePollStartDialog emotePollStartDialog = this.LL;
        assembler.QQ2(emotePollStartDialog, new C1161204gU(emotePollStartDialog));
        return Unit.LIZ;
    }
}
