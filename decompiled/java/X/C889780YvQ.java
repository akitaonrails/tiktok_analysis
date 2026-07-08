package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.profile.business.effect.EffectProfileListViewModel;
import com.ss.android.ugc.profile.business.effect.userlevel.TTAppMarkBadgeViewedReq;
import com.ss.android.ugc.profile.business.effect.userlevel.TTAppMarkBadgeViewedResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YvQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.EffectProfileListViewModel$markBadgeViewed$1", f = "EffectProfileListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C889780YvQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EffectProfileListViewModel LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C889780YvQ(EffectProfileListViewModel effectProfileListViewModel, int i, InterfaceC1364105Vn<? super C889780YvQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = effectProfileListViewModel;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C889780YvQ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("EffectProfileListViewModel@8e3d.markBadgeViewed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC889770YvP abstractC889770YvP = (AbstractC889770YvP) this.LL.LLJJI.getValue();
        int i = this.LLILLJJLI;
        C0Z65 c0z65 = (C0Z65) abstractC889770YvP.LIZJ.getValue();
        c0z65.getClass();
        try {
            C0X52<TTAppMarkBadgeViewedResp> c0x52Execute = c0z65.LIZ.markBadgeViewed(new TTAppMarkBadgeViewedReq(i)).execute();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("markBadgeViewed, httpCode ");
            sbLIZ.append(c0x52Execute.LIZ.LIZIZ);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("EffectUserBadgeRepo", C2188811AlT.LIZIZ(sbLIZ));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            ALog.e("EffectUserBadgeRepo", "markBadgeViewed failed ", thM5exceptionOrNullimpl);
            if (thM5exceptionOrNullimpl instanceof C1494690ozz) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("markBadgeViewed statusCode ");
                sbLIZ2.append(((C1494690ozz) thM5exceptionOrNullimpl).getStatusCode());
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("EffectUserBadgeRepo", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectProfileListViewModel@8e3d.markBadgeViewed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
