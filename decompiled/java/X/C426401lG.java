package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01lG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentContentAssem$loadLatestMessages$1", f = "CommerceAgentContentAssem.kt", l = {437, 418, 423}, m = "invokeSuspend")
public final class C426401lG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommerceAgentContentAssem LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C426401lG(CommerceAgentContentAssem commerceAgentContentAssem, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C426401lG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commerceAgentContentAssem;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C426401lG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceAgentContentAssem@6426.loadLatestMessages$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C426301lF c426301lF = new C426301lF(this.LLILLL, null);
                this.LL = 3;
                obj = C23250099c.LJI(this, abstractC2238408pq, c426301lF);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CommerceAgentContentAssem@6426.loadLatestMessages$1");
                    return objLJFF;
                }
            }
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C155000ia.LIZIZ(obj);
                        this.LLILLJJLI.LLJZIJLIL = false;
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("CommerceAgentContentAssem@6426.loadLatestMessages$1");
                        return unit;
                    }
                    C155000ia.LIZIZ(obj);
                    this.LLILLJJLI.LLJZIJLIL = false;
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("CommerceAgentContentAssem@6426.loadLatestMessages$1");
                    return unit2;
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                CommerceAgentContentAssem commerceAgentContentAssem = this.LLILLJJLI;
                this.LL = 1;
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                ((AbstractC329610Cw3) commerceAgentContentAssem.hp().LLILZLL.getValue()).onLoadLatest(c2252611DEt, true);
                Object objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("CommerceAgentContentAssem@6426.loadLatestMessages$1");
                    return objLJFF;
                }
            }
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C426201lE c426201lE = new C426201lE(this.LLILLL, null);
            this.LL = 2;
            obj = C23250099c.LJI(this, abstractC2238408pq2, c426201lE);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommerceAgentContentAssem@6426.loadLatestMessages$1");
                return objLJFF;
            }
            this.LLILLJJLI.LLJZIJLIL = false;
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("CommerceAgentContentAssem@6426.loadLatestMessages$1");
            return unit22;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LLJZIJLIL = false;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
