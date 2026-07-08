package X;

import com.ss.android.ugc.gamora.recorder.toolbar.refactory.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mlX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.toolbar.refactory.RecordToolbarLogicComponent$dispatchLongPressed$1", f = "RecordToolbarLogicComponent.kt", l = {428}, m = "invokeSuspend")
public final class C1408850mlX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ d LLILLJJLI;
    public final /* synthetic */ InterfaceC1651320t4c<?> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408850mlX(d dVar, InterfaceC1651320t4c<?> interfaceC1651320t4c, InterfaceC1364105Vn<? super C1408850mlX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dVar;
        this.LLILLL = interfaceC1651320t4c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408850mlX(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordToolbarLogicComponent@a637.dispatchLongPressed$1");
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
            C05YC<C375830EoP<InterfaceC1651320t4c<?>>> c05yc = this.LLILLJJLI.LLJL;
            C375830EoP<InterfaceC1651320t4c<?>> c375830EoP = new C375830EoP<>(this.LLILLL);
            this.LL = 1;
            if (c05yc.emit(c375830EoP, this) == objLJFF) {
                C1C7U.LIZIZ("RecordToolbarLogicComponent@a637.dispatchLongPressed$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordToolbarLogicComponent@a637.dispatchLongPressed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
