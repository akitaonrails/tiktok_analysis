package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01jU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.EffectBarWidgetComponent$observeEffectSelectStateToShowBottomWidget$1$1", f = "EffectBarWidgetComponent.kt", l = {168}, m = "invokeSuspend")
public final class C415401jU extends C09AX implements Function2<InterfaceC346701Wf<? super InterfaceC461401qu>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C415401jU(InterfaceC1364105Vn<? super C415401jU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C415401jU c415401jU = new C415401jU(interfaceC1364105Vn);
        c415401jU.LLILLJJLI = obj;
        return c415401jU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectBarWidgetComponent@c8e.observeEffectSelectStateToShowBottomWidget$1$1");
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
            InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C460601qm c460601qm = C460601qm.LIZ;
            this.LL = 1;
            if (interfaceC346701Wf.emit(c460601qm, this) == objLJFF) {
                C1C7U.LIZIZ("EffectBarWidgetComponent@c8e.observeEffectSelectStateToShowBottomWidget$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectBarWidgetComponent@c8e.observeEffectSelectStateToShowBottomWidget$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super InterfaceC461401qu> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
