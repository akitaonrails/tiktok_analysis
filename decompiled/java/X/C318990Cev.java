package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.interactioncard.viewmodel.InteractionCardViewModel;
import com.ss.android.ugc.aweme.im.service.service.IDMGeckoCommonChannelManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.interactioncard.viewmodel.InteractionCardViewModel$observeGeckoResources$1", f = "InteractionCardViewModel.kt", l = {212}, m = "invokeSuspend")
public final class C318990Cev extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InteractionCardViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318990Cev(InteractionCardViewModel interactionCardViewModel, InterfaceC1364105Vn<? super C318990Cev> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interactionCardViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318990Cev(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0951 anonymousClass0951LJFF;
        C1C7U.LIZ("InteractionCardViewModel@87d.observeGeckoResources$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IDMGeckoCommonChannelManager iDMGeckoCommonChannelManager = (IDMGeckoCommonChannelManager) PluggableExtentionKt.pluggableSpiForReal(IDMGeckoCommonChannelManager.class);
            if (iDMGeckoCommonChannelManager != null && (anonymousClass0951LJFF = iDMGeckoCommonChannelManager.LJFF()) != null) {
                AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 0);
                this.LL = 1;
                if (anonymousClass0951LJFF.collect(agS295S0100000_14, this) == objLJFF) {
                    C1C7U.LIZIZ("InteractionCardViewModel@87d.observeGeckoResources$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("InteractionCardViewModel@87d.observeGeckoResources$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
