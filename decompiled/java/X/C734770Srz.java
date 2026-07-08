package X;

import Y.AgS292S0100000_11;
import com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.service.IPNSProtectionDataLayerServiceFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0Srz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel$onPrepared$1", f = "FeedRightBtnBaseViewModel.kt", l = {92}, m = "invokeSuspend")
public final class C734770Srz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FeedRightBtnBaseViewModel<S> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C734770Srz(FeedRightBtnBaseViewModel<S> feedRightBtnBaseViewModel, InterfaceC1364105Vn<? super C734770Srz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = feedRightBtnBaseViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C734770Srz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C15Y9 c15y9LIZJ;
        C1C7U.LIZ("FeedRightBtnBaseViewModel@1f96.onPrepared$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IPNSProtectionDataLayerServiceFactory iPNSProtectionDataLayerServiceFactory = (IPNSProtectionDataLayerServiceFactory) PluggableExtentionKt.pluggableSpi$default(IPNSProtectionDataLayerServiceFactory.class, false, false, false, 14, null);
            if (iPNSProtectionDataLayerServiceFactory != null && (c15y9LIZJ = iPNSProtectionDataLayerServiceFactory.LIZJ()) != null) {
                b bVarLJ = c15y9LIZJ.LJ(EnumC20536615Xo.FP_ENGAGEMENT_COUNT_SETTINGS_COUNT);
                AgS292S0100000_11 agS292S0100000_11 = new AgS292S0100000_11(this.LLILLJJLI, 5);
                this.LL = 1;
                if (bVarLJ.collect(agS292S0100000_11, this) == objLJFF) {
                    C1C7U.LIZIZ("FeedRightBtnBaseViewModel@1f96.onPrepared$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedRightBtnBaseViewModel@1f96.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
