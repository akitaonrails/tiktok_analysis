package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0NVQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
public final class C0NVQ extends C09AX implements InterfaceC1631630sYr<C0NVR, InterfaceC594940NVc<Object>, Object, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ C0NVR LL;
    public /* synthetic */ InterfaceC594940NVc LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C0NVQ(InterfaceC1364105Vn<? super C0NVQ> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0NVR c0nvr = this.LL;
        float fLIZLLL = this.LLILLJJLI.LIZLLL(this.LLILLL);
        if (!Float.isNaN(fLIZLLL)) {
            c0nvr.LIZ(fLIZLLL, 0.0f);
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(C0NVR c0nvr, InterfaceC594940NVc<Object> interfaceC594940NVc, Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C0NVQ c0nvq = new C0NVQ(interfaceC1364105Vn);
        c0nvq.LL = c0nvr;
        c0nvq.LLILLJJLI = interfaceC594940NVc;
        c0nvq.LLILLL = obj;
        return c0nvq.invokeSuspend(Unit.LIZ);
    }
}
