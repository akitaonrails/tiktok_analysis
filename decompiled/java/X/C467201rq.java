package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01rq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxPanelKt$TuxPanelContentSheetImpl$1$1$4", f = "TuxPanel.kt", l = {}, m = "invokeSuspend")
public final class C467201rq extends C09AX implements Function2<Float, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Function1<Float, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C467201rq(Function1<? super Float, Unit> function1, InterfaceC1364105Vn<? super C467201rq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C467201rq c467201rq = new C467201rq(this.LLILLJJLI, interfaceC1364105Vn);
        c467201rq.LL = obj;
        return c467201rq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TuxPanelKt@b49d.TuxPanelContentSheetImpl$1$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Float f = (Float) this.LL;
        if (f == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TuxPanelKt@b49d.TuxPanelContentSheetImpl$1$1$4");
            return unit;
        }
        this.LLILLJJLI.invoke(C2286608xc.LIZLLL(f.floatValue() * 0.5f));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TuxPanelKt@b49d.TuxPanelContentSheetImpl$1$1$4");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Float f, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(f, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
