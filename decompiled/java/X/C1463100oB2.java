package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0oB2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsLogicComponent$initObserver$3$1", f = "EditAdjustClipsLogicComponent.kt", l = {646}, m = "invokeSuspend")
public final class C1463100oB2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1463020oAu LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1463100oB2(C1463020oAu c1463020oAu, InterfaceC1364105Vn<? super C1463100oB2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1463020oAu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1463100oB2(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditAdjustClipsLogicComponent@7a41.initObserver$3$1");
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
            long jLongValue = ((Number) C0B9V.LIZ.getValue()).longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("EditAdjustClipsLogicComponent@7a41.initObserver$3$1");
                return objLJFF;
            }
        }
        C557050Lt1 c557050Lt1 = this.LLILLJJLI.LLLLLJLJLL;
        if (c557050Lt1 != null) {
            Boolean.valueOf(c557050Lt1.LIZ(false, true));
            C1463050oAx c1463050oAx = this.LLILLJJLI.LLLLJI;
            if (c1463050oAx == null) {
                c1463050oAx = null;
            }
            c1463050oAx.LIZIZ.LLILLL(false, true, true, true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditAdjustClipsLogicComponent@7a41.initObserver$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
