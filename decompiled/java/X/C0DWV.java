package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DWV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DWV extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ Effect LL;
    public final /* synthetic */ ShortVideoContext LLILLJJLI;
    public final /* synthetic */ MyEffectsViewModel LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DWV(Effect effect, ShortVideoContext shortVideoContext, MyEffectsViewModel myEffectsViewModel, int i, int i2) {
        super(1);
        this.LL = effect;
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = myEffectsViewModel;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LJ(2131833762, new C0DWU(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL));
        c1397620mTQ2.LJII(2131833775, null);
        return Unit.LIZ;
    }
}
