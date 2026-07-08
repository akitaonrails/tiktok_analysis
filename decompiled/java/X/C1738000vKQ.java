package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vKQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.preupload.logic.AmeEffectPrepareLogic$prepare$2$cost$1$1", f = "AmeEffectPrepareLogic.kt", l = {75}, m = "invokeSuspend")
public final class C1738000vKQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1737970vKN LLILLJJLI;
    public final /* synthetic */ C1737870vKD LLILLL;
    public final /* synthetic */ InterfaceC1738210vKl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1738000vKQ(C1737970vKN c1737970vKN, C1737870vKD c1737870vKD, InterfaceC1738210vKl interfaceC1738210vKl, InterfaceC1364105Vn<? super C1738000vKQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1737970vKN;
        this.LLILLL = c1737870vKD;
        this.LLILZ = interfaceC1738210vKl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1738000vKQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AmeEffectPrepareLogic@b7d3.prepare$2$cost$1$1");
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
            C1737970vKN c1737970vKN = this.LLILLJJLI;
            C1737870vKD c1737870vKD = this.LLILLL;
            InterfaceC1738210vKl interfaceC1738210vKl = this.LLILZ;
            this.LL = 1;
            c1737970vKN.getClass();
            Object objLJ = C2296808zG.LJ(new C1738020vKS(c1737970vKN, c1737870vKD, interfaceC1738210vKl, null), this);
            if (objLJ != C099R.LJFF()) {
                objLJ = Unit.LIZ;
            }
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("AmeEffectPrepareLogic@b7d3.prepare$2$cost$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AmeEffectPrepareLogic@b7d3.prepare$2$cost$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
