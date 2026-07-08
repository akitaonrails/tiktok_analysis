package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0OtS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", l = {469}, m = "invokeSuspend")
public final class C633760OtS extends C09AX implements InterfaceC1631620sYq<C0NVR, InterfaceC594940NVc<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1681210tqp<Object> LLILLL;
    public final /* synthetic */ C817403Hg LLILZ;
    public final /* synthetic */ float LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C633760OtS(C1681210tqp<Object> c1681210tqp, C817403Hg c817403Hg, float f, InterfaceC1364105Vn<? super C633760OtS> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c1681210tqp;
        this.LLILZ = c817403Hg;
        this.LLILZIL = f;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C817403Hg c817403Hg;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                c817403Hg = (C817403Hg) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C0NVR c0nvr = (C0NVR) this.LLILLJJLI;
            final C1681210tqp<Object> c1681210tqp = this.LLILLL;
            InterfaceC1392705cj interfaceC1392705cj = new InterfaceC1392705cj() { // from class: X.0OtT
                @Override // X.InterfaceC1392705cj
                public final float LIZJ(float f) {
                    float fLJI = c1681210tqp.LLJJJJLIIL.LJI(f);
                    float fLIZLLL = fLJI - c1681210tqp.LLJJJJLIIL.LIZLLL();
                    c0nvr.LIZ(fLJI, 0.0f);
                    return fLIZLLL;
                }
            };
            InterfaceC633750OtR interfaceC633750OtR = c1681210tqp.LLJLL;
            if (interfaceC633750OtR == null) {
                interfaceC633750OtR = null;
            }
            c817403Hg = this.LLILZ;
            float f = this.LLILZIL;
            this.LLILLJJLI = c817403Hg;
            this.LL = 1;
            obj = interfaceC633750OtR.LIZ(interfaceC1392705cj, f, this);
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        c817403Hg.element = ((Number) obj).floatValue();
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C0NVR c0nvr, InterfaceC594940NVc<Object> interfaceC594940NVc, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C633760OtS c633760OtS = new C633760OtS(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c633760OtS.LLILLJJLI = c0nvr;
        return c633760OtS.invokeSuspend(Unit.LIZ);
    }
}
