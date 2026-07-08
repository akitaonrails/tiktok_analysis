package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05nU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.PhotoSwapEducationScene$onViewCreated$1$1$1$1", f = "PhotoSwapEducationScene.kt", l = {65}, m = "invokeSuspend")
public final class C1459405nU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ImageView LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1459405nU(ImageView imageView, Bitmap bitmap, InterfaceC1364105Vn<? super C1459405nU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = imageView;
        this.LLILLL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1459405nU(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PhotoSwapEducationScene@d244.onViewCreated$1$1$1$1");
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
            C1459505nV c1459505nV = new C1459505nV(this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1459505nV);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PhotoSwapEducationScene@d244.onViewCreated$1$1$1$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.setImageBitmap((Bitmap) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoSwapEducationScene@d244.onViewCreated$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
