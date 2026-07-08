package X;

import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoPanelState;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0skh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638970skh extends C09AY implements Function1<EffectInfoPanelState, EffectInfoPanelState> {
    public final /* synthetic */ EffectInfoViewModel LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1638970skh(EffectInfoViewModel effectInfoViewModel, Effect effect, String str, String str2) {
        super(1);
        this.LL = effectInfoViewModel;
        this.LLILLJJLI = effect;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final EffectInfoPanelState invoke(EffectInfoPanelState effectInfoPanelState) {
        boolean zLJIJJLI;
        EffectInfoPanelState effectInfoPanelState2 = effectInfoPanelState;
        InterfaceC1628970sUZ interfaceC1628970sUZ = this.LL.LLJILJILJ;
        if (interfaceC1628970sUZ != null) {
            zLJIJJLI = interfaceC1628970sUZ.LJIJJLI(this.LLILLJJLI);
        } else {
            zLJIJJLI = false;
        }
        return effectInfoPanelState2.copy(this.LLILLJJLI, this.LLILLL, this.LLILZ, zLJIJJLI, !this.LL.rR2(this.LLILLJJLI), !this.LL.sR2(this.LLILLJJLI), !C0CHQ.LIZ().getAccountService().LIZ(), false, true, new C11A0());
    }
}
