package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.view.assem.EmotePollStartFunctionAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.view.frgment.EmotePollStartDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04gU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1161204gU extends C09AY implements Function1<C696590RUb, Unit> {
    public final /* synthetic */ EmotePollStartDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1161204gU(EmotePollStartDialog emotePollStartDialog) {
        super(1);
        this.LL = emotePollStartDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C696590RUb c696590RUb) {
        C696590RUb c696590RUb2 = c696590RUb;
        c696590RUb2.LL = C13LE.LIZ(EmotePollStartFunctionAssem.class);
        c696590RUb2.LLJ = this.LL.getView();
        return Unit.LIZ;
    }
}
