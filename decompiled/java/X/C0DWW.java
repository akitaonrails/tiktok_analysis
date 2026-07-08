package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DWW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DWW extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ ShortVideoContext LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ MyEffectsViewModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DWW(C19EG c19eg, ShortVideoContext shortVideoContext, Effect effect, int i, int i2, MyEffectsViewModel myEffectsViewModel) {
        super(1);
        this.LL = c19eg;
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = effect;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = myEffectsViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        C345120Dfy.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        return Unit.LIZ;
    }
}
