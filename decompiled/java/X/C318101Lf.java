package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Lf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.ChooseCoverCompressUtils$setImageBitmapCompressed$2", f = "ChooseCoverCompressUtils.kt", l = {127}, m = "invokeSuspend")
public final class C318101Lf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ImageView LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<Bitmap, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C318101Lf(ImageView imageView, String str, Function1<? super Bitmap, Unit> function1, InterfaceC1364105Vn<? super C318101Lf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = imageView;
        this.LLILLL = str;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318101Lf(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("ChooseCoverCompressUtils@c033.setImageBitmapCompressed$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                ImageView imageView = this.LLILLJJLI;
                String str = this.LLILLL;
                C118300cf c118300cf = new C118300cf();
                c118300cf.element = imageView.getWidth();
                C118300cf c118300cf2 = new C118300cf();
                int height = imageView.getHeight();
                c118300cf2.element = height;
                if (c118300cf.element <= 0 || height <= 0) {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    int i2 = layoutParams.width;
                    if (i2 <= 0) {
                        i2 = 360;
                    }
                    c118300cf.element = i2;
                    int i3 = layoutParams.height;
                    if (i3 <= 0) {
                        i3 = 540;
                    }
                    c118300cf2.element = i3;
                }
                C1DFB c1dfb = C0PEM.LIZJ;
                C318201Lg c318201Lg = new C318201Lg(str, c118300cf, c118300cf2, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c318201Lg);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ChooseCoverCompressUtils@c033.setImageBitmapCompressed$2");
                    return objLJFF;
                }
            }
            c098200Yq = (Bitmap) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Function1<Bitmap, Unit> function1 = this.LLILZ;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            function1.invoke((Bitmap) c098200Yq);
        } else {
            function1.invoke(null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChooseCoverCompressUtils@c033.setImageBitmapCompressed$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
