package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0NVX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", l = {1344}, m = "invokeSuspend")
public final class C0NVX extends C09AX implements InterfaceC1631630sYr<C0NVR, InterfaceC594940NVc<Object>, Object, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ C0NVR LLILLJJLI;
    public /* synthetic */ InterfaceC594940NVc LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C594920NVa<Object> LLILZIL;
    public final /* synthetic */ InterfaceC1677030tk5<Float> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NVX(C594920NVa<Object> c594920NVa, InterfaceC1677030tk5<Float> interfaceC1677030tk5, InterfaceC1364105Vn<? super C0NVX> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILZIL = c594920NVa;
        this.LLILZLL = interfaceC1677030tk5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            C0NVR c0nvr = this.LLILLJJLI;
            InterfaceC594940NVc interfaceC594940NVc = this.LLILLL;
            Object obj2 = this.LLILZ;
            C594920NVa<Object> c594920NVa = this.LLILZIL;
            float fLIZIZ = ((C13FI) c594920NVa.LJIIJ).LIZIZ();
            InterfaceC1677030tk5<Float> interfaceC1677030tk5 = this.LLILZLL;
            this.LLILLJJLI = null;
            this.LLILLL = null;
            this.LL = 1;
            if (C1677950tlZ.LIZIZ(c594920NVa, fLIZIZ, c0nvr, interfaceC594940NVc, obj2, interfaceC1677030tk5, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(C0NVR c0nvr, InterfaceC594940NVc<Object> interfaceC594940NVc, Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C0NVX c0nvx = new C0NVX(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0nvx.LLILLJJLI = c0nvr;
        c0nvx.LLILLL = interfaceC594940NVc;
        c0nvx.LLILZ = obj;
        return c0nvx.invokeSuspend(Unit.LIZ);
    }
}
