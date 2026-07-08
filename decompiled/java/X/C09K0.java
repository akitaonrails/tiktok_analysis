package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09K0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.image.ImageHeaderModule$updateCoverWithCoverText$3", f = "ImageHeaderModule.kt", l = {1921}, m = "invokeSuspend")
public final class C09K0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<Bitmap> LLILLJJLI;
    public final /* synthetic */ C214848196g LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09K0(C214848196g c214848196g, String str, InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c214848196g;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09K0(this.LLILLL, this.LLILZ, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageHeaderModule@1844.updateCoverWithCoverText$3");
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
            C09K1 c09k1 = new C09K1(this.LLILLL, this.LLILZ, null, this.LLILLJJLI);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c09k1) == objLJFF) {
                C1C7U.LIZIZ("ImageHeaderModule@1844.updateCoverWithCoverText$3");
                return objLJFF;
            }
        }
        Bitmap bitmap = this.LLILLJJLI.element;
        if (bitmap != null) {
            C214848196g c214848196g = this.LLILLL;
            c214848196g.LJIILJJIL(c214848196g.LIZ, bitmap, true, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageHeaderModule@1844.updateCoverWithCoverText$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
