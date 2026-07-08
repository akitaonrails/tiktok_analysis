package X;

import Y.AfS172S0100000_3;
import android.app.Application;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DWU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DWU extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ Effect LL;
    public final /* synthetic */ ShortVideoContext LLILLJJLI;
    public final /* synthetic */ MyEffectsViewModel LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DWU(Effect effect, ShortVideoContext shortVideoContext, MyEffectsViewModel myEffectsViewModel, int i, int i2) {
        super(1);
        this.LL = effect;
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = myEffectsViewModel;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        C1449260noi.LJ("confirm_mobile_effect_delete", C345120Dfy.LIZ(this.LLILLJJLI, this.LL));
        MyEffectsViewModel myEffectsViewModel = this.LLILLL;
        Effect effect = this.LL;
        int i = this.LLILZ;
        myEffectsViewModel.getClass();
        Pair<Effect, Integer> pair = new Pair<>(effect, Integer.valueOf(i));
        if (myEffectsViewModel.xQ2(effect, false)) {
            myEffectsViewModel.LLILLJJLI.LIZJ(new C1625460sOu(i, null, EnumC1448980noG.UI_CLICK, effect, true));
        }
        myEffectsViewModel.LLJJJJ.setValue(pair);
        if (effect instanceof DraftEffect) {
            DraftEffect draftEffect = (DraftEffect) effect;
            IEffectCreatorService iEffectCreatorServiceEQ2 = MyEffectsViewModel.EQ2();
            if (iEffectCreatorServiceEQ2 != null) {
                if (draftEffect.getDraft().getEffectId().length() > 0) {
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(myEffectsViewModel), null, null, new C318270Cdl(draftEffect, iEffectCreatorServiceEQ2, null), 3);
                } else {
                    Application application = C0CHQ.LIZ;
                    InterfaceC318260Cdk interfaceC318260CdkDraftService = iEffectCreatorServiceEQ2.draftService();
                    if (interfaceC318260CdkDraftService != null) {
                        interfaceC318260CdkDraftService.LJIIIIZZ(application, draftEffect.getDraft().getDraftId());
                    }
                }
            }
        } else {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(myEffectsViewModel), null, null, new C318280Cdm(effect, myEffectsViewModel, pair, null), 3);
            myEffectsViewModel.LLJL.LIZ(myEffectsViewModel.LL.getStickerRepository().LJIILJJIL().LJII(EnumC1149370g11.PANEL, effect, true).LJJIIZ(new AfS172S0100000_3(effect, 75), new C09JN() { // from class: X.07xA
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("MyEffectsViewModel@4e1b.removeFavorite$2");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("un-favorite exception, ");
                    sbLIZ.append(obj);
                    C201955140j.LIZIZ("DiyProp", C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("MyEffectsViewModel@4e1b.removeFavorite$2");
                }
            }));
        }
        return Unit.LIZ;
    }
}
