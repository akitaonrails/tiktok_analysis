package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ChO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.creative.common.api.camera.IMEffectsBridge$slideSlipEffectAdapter$1$onEffectClicked$1", f = "IMEffectsBridge.kt", l = {1376}, m = "invokeSuspend")
public final class C320520ChO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1627290sRr LLILLJJLI;
    public final /* synthetic */ C320530ChP LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320520ChO(C1627290sRr c1627290sRr, C320530ChP c320530ChP, InterfaceC1364105Vn<? super C320520ChO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1627290sRr;
        this.LLILLL = c320530ChP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320520ChO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMEffectsBridge@97a.slideSlipEffectAdapter$1$onEffectClicked$1");
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
            C05YC<C320530ChP> c05yc = this.LLILLJJLI.LLJJLIIIJLLLLLLLZ;
            C320530ChP c320530ChP = this.LLILLL;
            this.LL = 1;
            if (c05yc.emit(c320530ChP, this) == objLJFF) {
                C1C7U.LIZIZ("IMEffectsBridge@97a.slideSlipEffectAdapter$1$onEffectClicked$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMEffectsBridge@97a.slideSlipEffectAdapter$1$onEffectClicked$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
