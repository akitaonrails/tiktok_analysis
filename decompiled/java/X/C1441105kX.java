package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05kX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.EditTooltipLogicComponent$toolBarShowEventObserver$1$onChanged$1", f = "EditTooltipLogicComponent.kt", l = {43}, m = "invokeSuspend")
public final class C1441105kX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1654650t9z LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1441105kX(C1654650t9z c1654650t9z, InterfaceC1364105Vn<? super C1441105kX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1654650t9z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1441105kX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditTooltipLogicComponent@4562.toolBarShowEventObserver$1$onChanged$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(400L, this) == objLJFF) {
                C1C7U.LIZIZ("EditTooltipLogicComponent@4562.toolBarShowEventObserver$1$onChanged$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.H();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditTooltipLogicComponent@4562.toolBarShowEventObserver$1$onChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
