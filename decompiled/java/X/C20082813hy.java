package X;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13hy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {814}, m = "invokeSuspend")
public final class C20082813hy extends C09AX implements Function2<C112R, InterfaceC1364105Vn<? super Unit>, Object> {
    public C20082713hx LL;
    public C238400w2 LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C20082713hx LLILZLL;
    public final /* synthetic */ C238400w2 LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20082813hy(C20082713hx c20082713hx, C238400w2 c238400w2, long j, InterfaceC1364105Vn<? super C20082813hy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c20082713hx;
        this.LLIZ = c238400w2;
        this.LLIZLLLIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20082813hy c20082813hy = new C20082813hy(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c20082813hy.LLILZIL = obj;
        return c20082813hy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final C20082713hx c20082713hx;
        C238400w2 c238400w2;
        long j;
        float fLIZJ;
        C20082713hx c20082713hx2;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                j = this.LLILLL;
                c238400w2 = this.LLILLJJLI;
                c20082713hx = this.LL;
                c20082713hx2 = (C20082713hx) this.LLILZIL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C112R c112r = (C112R) this.LLILZIL;
            c20082713hx = this.LLILZLL;
            InterfaceC1392705cj interfaceC1392705cj = new InterfaceC1392705cj() { // from class: X.13i1
                @Override // X.InterfaceC1392705cj
                public final float LIZJ(float f) {
                    if (Math.abs(f) != 0.0f) {
                        C20082713hx c20082713hx3 = c20082713hx;
                        if ((f > 0.0f && !c20082713hx3.LIZ.LIZJ()) || ((f < 0.0f && !c20082713hx3.LIZ.LIZLLL()) || !c20082713hx3.LJI.invoke().booleanValue())) {
                            throw new CancellationException() { // from class: X.13i6
                                public static final int $stable = 0;

                                @Override // java.lang.Throwable
                                public Throwable fillInStackTrace() {
                                    setStackTrace(C20083713i7.LIZ);
                                    return this;
                                }
                            };
                        }
                    }
                    C20082713hx c20082713hx4 = c20082713hx;
                    return c20082713hx4.LIZLLL(c20082713hx4.LJI(c112r.LIZ(2, c20082713hx4.LJ(c20082713hx4.LJII(f)))));
                }
            };
            c238400w2 = this.LLIZ;
            long j2 = this.LLIZLLLIL;
            InterfaceC633750OtR interfaceC633750OtR = c20082713hx.LIZJ;
            j = c238400w2.element;
            if (c20082713hx.LIZLLL == EnumC1684030tvN.Horizontal) {
                fLIZJ = C1395705dD.LIZIZ(j2);
            } else {
                fLIZJ = C1395705dD.LIZJ(j2);
            }
            float fLIZLLL = c20082713hx.LIZLLL(fLIZJ);
            this.LLILZIL = c20082713hx;
            this.LL = c20082713hx;
            this.LLILLJJLI = c238400w2;
            this.LLILLL = j;
            this.LLILZ = 1;
            obj = interfaceC633750OtR.LIZ(interfaceC1392705cj, fLIZLLL, this);
            if (obj == objLJFF) {
                return objLJFF;
            }
            c20082713hx2 = c20082713hx;
        }
        float fLIZLLL2 = c20082713hx2.LIZLLL(((Number) obj).floatValue());
        float f = 0.0f;
        if (c20082713hx.LIZLLL == EnumC1684030tvN.Horizontal) {
            i2 = 2;
        } else {
            f = fLIZLLL2;
            fLIZLLL2 = 0.0f;
        }
        c238400w2.element = C1395705dD.LIZ(fLIZLLL2, f, i2, j);
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C112R c112r, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c112r, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
