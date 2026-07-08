package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.ecommerce.arch.EComSearchBffResp;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qhb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.capability.MixNetworkAbility$streamResultHandler$1$1", f = "MixNetworkAbility.kt", l = {89, 96}, m = "invokeSuspend")
public final class C677370Qhb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1422405hW LLILLJJLI;
    public final /* synthetic */ C677390Qhd LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677370Qhb(C1422405hW c1422405hW, C677390Qhd c677390Qhd, InterfaceC1364105Vn<? super C677370Qhb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1422405hW;
        this.LLILLL = c677390Qhd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C677370Qhb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String imprId;
        n nVar;
        C1C7U.LIZ("MixNetworkAbility@fff1.streamResultHandler$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1 || i == 2) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                SearchApiResult searchApiResult = new SearchApiResult();
                C1422405hW c1422405hW = this.LLILLJJLI;
                LogPbBean logPbBean = new LogPbBean();
                com.ss.android.ugc.aweme.ecommerce.arch.LogPbBean logPbBean2 = c1422405hW.LJII;
                if (logPbBean2 == null || (imprId = logPbBean2.getImprId()) == null) {
                    imprId = "";
                }
                logPbBean.setImprId(imprId);
                searchApiResult.logPb = logPbBean;
                EComSearchBffResp eComSearchBffResp = c1422405hW.LIZ;
                if (eComSearchBffResp != null && (nVar = eComSearchBffResp.globalDoodleConfig) != null) {
                    try {
                        C1227904rF.LIZ.getClass();
                        searchApiResult.globalDoodleConfig = (GlobalDoodleConfig) C1227904rF.LIZ(nVar, GlobalDoodleConfig.class);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C677360Qha c677360Qha = new C677360Qha(this.LLILLL, searchApiResult, this.LLILLJJLI, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c677360Qha) == objLJFF) {
                    C1C7U.LIZIZ("MixNetworkAbility@fff1.streamResultHandler$1$1");
                    return objLJFF;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (C132600ey.LIZ()) {
                C1DFH c1dfh2 = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
                C677380Qhc c677380Qhc = new C677380Qhc(this.LLILLL, th2, null);
                this.LL = 2;
                if (C23250099c.LJI(this, abstractC2238408pq2, c677380Qhc) == objLJFF) {
                    C1C7U.LIZIZ("MixNetworkAbility@fff1.streamResultHandler$1$1");
                    return objLJFF;
                }
            } else {
                C2286608xc.LJ(Log.e("streamResultHandler error", th2.toString()));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixNetworkAbility@fff1.streamResultHandler$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
