package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.middle.ai.repo.EcSearchMiddleAICacheRepo$updateGuessData$1", f = "EcSearchMiddleAICacheRepo.kt", l = {}, m = "invokeSuspend")
public final class C674250QcZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C674270Qcb LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C674250QcZ(C674270Qcb c674270Qcb, String str, InterfaceC1364105Vn<? super C674250QcZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c674270Qcb;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C674250QcZ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcSearchMiddleAICacheRepo@3a42.updateGuessData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C674290Qcd c674290Qcd = this.LL.LIZIZ;
        if (c674290Qcd != null) {
            try {
                c674290Qcd.LIZJ.storeString(c674290Qcd.LIZIZ, this.LLILLJJLI);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchMiddleAICacheRepo@3a42.updateGuessData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
