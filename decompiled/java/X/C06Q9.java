package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Q9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFloatingViewKt$ScreenShotImageView$3$1$1", f = "ScreenShotFloatingView.kt", l = {150}, m = "invokeSuspend")
public final class C06Q9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C05P0<Bitmap> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06Q9(String str, C05P0<Bitmap> c05p0, InterfaceC1364105Vn<? super C06Q9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06Q9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScreenShotFloatingViewKt@774f.ScreenShotImageView$3$1$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C06Q8 c06q8 = new C06Q8(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c06q8) == objLJFF) {
                C1C7U.LIZIZ("ScreenShotFloatingViewKt@774f.ScreenShotImageView$3$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScreenShotFloatingViewKt@774f.ScreenShotImageView$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
