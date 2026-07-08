package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS307S0300000_30;
import njp.a;

/* JADX INFO: renamed from: X.13i2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1024}, m = "invokeSuspend")
public final class C20083213i2 extends C09AX implements Function2<C112R, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C20082713hx LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C817403Hg LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20083213i2(C20082713hx c20082713hx, long j, C817403Hg c817403Hg, InterfaceC1364105Vn<? super C20083213i2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c20082713hx;
        this.LLILZ = j;
        this.LLILZIL = c817403Hg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20083213i2 c20083213i2 = new C20083213i2(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c20083213i2.LLILLJJLI = obj;
        return c20083213i2;
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
            C112R c112r = (C112R) this.LLILLJJLI;
            float fLJI = this.LLILLL.LJI(this.LLILZ);
            AwS307S0300000_30 awS307S0300000_30 = new AwS307S0300000_30(this.LLILZIL, this.LLILLL, c112r, 3);
            this.LL = 1;
            if (C1677810tlL.LIZ(0.0f, fLJI, 0.0f, C1671550tbF.LIZJ(0.0f, 0.0f, null, 7), awS307S0300000_30, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C112R c112r, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c112r, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
