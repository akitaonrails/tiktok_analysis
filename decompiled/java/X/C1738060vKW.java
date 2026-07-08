package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vKW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.preupload.logic.AmeEffectPrepareLogic$doPrepareTask$2$1$3", f = "AmeEffectPrepareLogic.kt", l = {131}, m = "invokeSuspend")
public final class C1738060vKW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1737970vKN LLILLJJLI;
    public final /* synthetic */ C1737870vKD LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1738060vKW(C1737970vKN c1737970vKN, C1737870vKD c1737870vKD, InterfaceC1364105Vn<? super C1738060vKW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1737970vKN;
        this.LLILLL = c1737870vKD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1738060vKW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AmeEffectPrepareLogic@b7d3.doPrepareTask$2$1$3");
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
            C1737960vKM c1737960vKM = this.LLILLJJLI.LJ;
            C1737870vKD c1737870vKD = this.LLILLL;
            this.LL = 1;
            if (c1737960vKM.LIZ(c1737870vKD, this) == objLJFF) {
                C1C7U.LIZIZ("AmeEffectPrepareLogic@b7d3.doPrepareTask$2$1$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AmeEffectPrepareLogic@b7d3.doPrepareTask$2$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
