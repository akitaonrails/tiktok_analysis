package X;

import kotlin.Unit;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0tla, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", l = {1391, 1409, 1433}, m = "invokeSuspend")
public final class C1677960tla<T> extends C09AX implements InterfaceC1631630sYr<C0NVR, InterfaceC594940NVc<T>, T, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ C0NVR LLILLJJLI;
    public /* synthetic */ InterfaceC594940NVc LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C594920NVa<T> LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ InterfaceC1677030tk5<Float> LLIZ;
    public final /* synthetic */ C817403Hg LLIZLLLIL;
    public final /* synthetic */ InterfaceC1677940tlY<Float> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1677960tla(C594920NVa<T> c594920NVa, float f, InterfaceC1677030tk5<Float> interfaceC1677030tk5, C817403Hg c817403Hg, InterfaceC1677940tlY<Float> interfaceC1677940tlY, InterfaceC1364105Vn<? super C1677960tla> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILZIL = c594920NVa;
        this.LLILZLL = f;
        this.LLIZ = interfaceC1677030tk5;
        this.LLIZLLLIL = c817403Hg;
        this.LLJ = interfaceC1677940tlY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        float fLIZLLL;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(obj);
                        this.LLIZLLLIL.element = 0.0f;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                }
            } else {
                C155000ia.LIZIZ(obj);
                this.LLIZLLLIL.element = 0.0f;
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0NVR c0nvr = this.LLILLJJLI;
            InterfaceC594940NVc interfaceC594940NVc = this.LLILLL;
            Object obj2 = this.LLILZ;
            float fLIZLLL2 = interfaceC594940NVc.LIZLLL(obj2);
            if (!Float.isNaN(fLIZLLL2)) {
                C817403Hg c817403Hg = new C817403Hg();
                if (Float.isNaN(this.LLILZIL.LIZLLL())) {
                    fLIZLLL = 0.0f;
                } else {
                    fLIZLLL = this.LLILZIL.LIZLLL();
                }
                c817403Hg.element = fLIZLLL;
                if (fLIZLLL != fLIZLLL2) {
                    float f = this.LLILZLL;
                    if ((fLIZLLL2 - fLIZLLL) * f >= 0.0f && f != 0.0f) {
                        float fLIZ = C1677880tlS.LIZ(this.LLJ, fLIZLLL, f);
                        float f2 = this.LLILZLL;
                        if (f2 <= 0.0f ? fLIZ <= fLIZLLL2 : fLIZ >= fLIZLLL2) {
                            C1677580tky c1677580tkyLIZ = C1677590tkz.LIZ(c817403Hg.element, f2, 28);
                            InterfaceC1677940tlY<Float> interfaceC1677940tlY = this.LLJ;
                            C1677990tld c1677990tld = new C1677990tld(fLIZLLL2, c817403Hg, c0nvr, this.LLIZLLLIL);
                            this.LLILLJJLI = null;
                            this.LLILLL = null;
                            this.LL = 2;
                            if (C1677810tlL.LIZLLL(c1677580tkyLIZ, interfaceC1677940tlY, false, c1677990tld, this) == objLJFF) {
                                return objLJFF;
                            }
                        } else {
                            C594920NVa<T> c594920NVa = this.LLILZIL;
                            InterfaceC1677030tk5<Float> interfaceC1677030tk5 = this.LLIZ;
                            this.LLILLJJLI = null;
                            this.LLILLL = null;
                            this.LL = 3;
                            if (C1677950tlZ.LIZIZ(c594920NVa, f2, c0nvr, interfaceC594940NVc, obj2, interfaceC1677030tk5, this) == objLJFF) {
                                return objLJFF;
                            }
                            this.LLIZLLLIL.element = 0.0f;
                        }
                    } else {
                        C594920NVa<T> c594920NVa2 = this.LLILZIL;
                        InterfaceC1677030tk5<Float> interfaceC1677030tk52 = this.LLIZ;
                        this.LLILLJJLI = null;
                        this.LLILLL = null;
                        this.LL = 1;
                        if (C1677950tlZ.LIZIZ(c594920NVa2, f, c0nvr, interfaceC594940NVc, obj2, interfaceC1677030tk52, this) == objLJFF) {
                            return objLJFF;
                        }
                        this.LLIZLLLIL.element = 0.0f;
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(C0NVR c0nvr, Object obj, Object obj2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1677960tla c1677960tla = new C1677960tla(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1677960tla.LLILLJJLI = c0nvr;
        c1677960tla.LLILLL = (InterfaceC594940NVc) obj;
        c1677960tla.LLILZ = obj2;
        return c1677960tla.invokeSuspend(Unit.LIZ);
    }
}
