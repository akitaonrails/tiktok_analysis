package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.xtab.XTabESportsHighlightCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104240eqE extends C09AY implements Function1<C20248814Kw, Unit> {
    public final /* synthetic */ C1104210eqB LL;
    public final /* synthetic */ XTabESportsHighlightCard LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1104240eqE(C1104210eqB c1104210eqB, XTabESportsHighlightCard xTabESportsHighlightCard) {
        super(1);
        this.LL = c1104210eqB;
        this.LLILLJJLI = xTabESportsHighlightCard;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20248814Kw c20248814Kw) {
        C20248814Kw c20248814Kw2 = c20248814Kw;
        c20248814Kw2.LIZ = new C1104230eqD(this.LL);
        c20248814Kw2.LIZIZ(new C1885480zAI(this.LL, this.LLILLJJLI));
        return Unit.LIZ;
    }
}
