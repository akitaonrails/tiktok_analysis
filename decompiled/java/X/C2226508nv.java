package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mention.api.QuickMentionCheckApi;
import com.ss.android.ugc.aweme.mention.api.QuickMentionCheckResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08nv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.service.MentionRiskController$quickMentionRisk$1", f = "MentionRiskController.kt", l = {74, 76}, m = "invokeSuspend")
public final class C2226508nv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C2226508nv(InterfaceC1364105Vn<? super C2226508nv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2226508nv c2226508nv = new C2226508nv(interfaceC1364105Vn);
        c2226508nv.LLILLJJLI = obj;
        return c2226508nv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Exception exc;
        C1C7U.LIZ("MentionRiskController@8dc9.quickMentionRisk$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MentionRiskController@8dc9.quickMentionRisk$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            QuickMentionCheckApi quickMentionCheckApi = QuickMentionCheckApi.LIZIZ;
            this.LL = 1;
            obj = quickMentionCheckApi.quickMentionCheck(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MentionRiskController@8dc9.quickMentionRisk$1");
                return objLJFF;
            }
        }
        c098200Yq = (QuickMentionCheckResponse) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl instanceof Exception) {
            exc = (Exception) thM5exceptionOrNullimpl;
        } else {
            exc = null;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C2226608nw c2226608nw = new C2226608nw(exc, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c2226608nw) == objLJFF) {
            C1C7U.LIZIZ("MentionRiskController@8dc9.quickMentionRisk$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MentionRiskController@8dc9.quickMentionRisk$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
