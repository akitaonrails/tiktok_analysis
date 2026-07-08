package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0EyA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.core.handler.GenAIEffectI2VHandler$startTask$1", f = "GenAIEffectI2VHandler.kt", l = {29}, m = "invokeSuspend")
public final class C381880EyA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C382050EyR LLILLJJLI;
    public final /* synthetic */ C381600Exi LLILLL;
    public final /* synthetic */ InterfaceC382380Eyy LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381880EyA(C382050EyR c382050EyR, C381600Exi c381600Exi, InterfaceC382380Eyy interfaceC382380Eyy, InterfaceC1364105Vn<? super C381880EyA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c382050EyR;
        this.LLILLL = c381600Exi;
        this.LLILZ = interfaceC382380Eyy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C381880EyA(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C382180Eye c382180Eye;
        Object objLJIIIIZZ = obj;
        C1C7U.LIZ("GenAIEffectI2VHandler@edfc.startTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIIIIZZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIIIIZZ);
            InterfaceC381790Ey1 interfaceC381790Ey1 = this.LLILLJJLI.LIZJ;
            C381600Exi c381600Exi = this.LLILLL;
            EnumC381960EyI enumC381960EyI = c381600Exi.LIZJ;
            if (enumC381960EyI == null && ((c382180Eye = c381600Exi.LJIJI) == null || (enumC381960EyI = c382180Eye.LJIIJJI) == null)) {
                enumC381960EyI = EnumC381960EyI.EDITOR_PRO;
            }
            C382000EyM c382000EyM = new C382000EyM(null, null, enumC381960EyI, null, null, null, c381600Exi.LJIJI, 57);
            C381910EyD c381910EyD = new C381910EyD(this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            objLJIIIIZZ = interfaceC381790Ey1.LJIIIIZZ(c382000EyM, AFwS234S0000000_5.get$arr$(565), c381910EyD, this);
            if (objLJIIIIZZ == objLJFF) {
                C1C7U.LIZIZ("GenAIEffectI2VHandler@edfc.startTask$1");
                return objLJFF;
            }
        }
        C382300Eyq c382300Eyq = (C382300Eyq) objLJIIIIZZ;
        if (c382300Eyq == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GenAIEffectI2VHandler@edfc.startTask$1");
            return unit;
        }
        if (a0.LJJJIL(c382300Eyq.LIZ)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("GenAIEffectI2VHandler@edfc.startTask$1");
            return unit2;
        }
        this.LLILZ.onStart();
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("GenAIEffectI2VHandler@edfc.startTask$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
