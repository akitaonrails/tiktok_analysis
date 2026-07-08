package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean.EcSearchAIHistoryWord;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.middle.ai.repo.EcSearchMiddleAICacheRepo$syncLocalHistoryWords$1", f = "EcSearchMiddleAICacheRepo.kt", l = {}, m = "invokeSuspend")
public final class C674260Qca extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C674270Qcb LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C674260Qca(C674270Qcb c674270Qcb, InterfaceC1364105Vn<? super C674260Qca> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c674270Qcb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C674260Qca(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("EcSearchMiddleAICacheRepo@3a42.syncLocalHistoryWords$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C674270Qcb c674270Qcb = this.LL;
        C674290Qcd c674290Qcd = c674270Qcb.LIZIZ;
        if (c674290Qcd != null) {
            List<EcSearchAIHistoryWord> list = c674270Qcb.LIZJ;
            try {
                C1227904rF.LIZ.getClass();
                String strLJIILLIIL = C1227904rF.LIZLLL().LJIILLIIL(list, c674290Qcd.LIZLLL);
                if (strLJIILLIIL != null) {
                    c674290Qcd.LIZJ.storeString(c674290Qcd.LIZ, strLJIILLIIL);
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchMiddleAICacheRepo@3a42.syncLocalHistoryWords$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
