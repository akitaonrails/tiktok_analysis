package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Li, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.ChooseCoverCompressUtils$setImageBitmapCompressed$1$result$1$1", f = "ChooseCoverCompressUtils.kt", l = {}, m = "invokeSuspend")
public final class C318401Li extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318401Li(Bitmap bitmap, C118300cf c118300cf, C118300cf c118300cf2, InterfaceC1364105Vn<? super C318401Li> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = c118300cf;
        this.LLILLL = c118300cf2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318401Li(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object c098200Yq;
        C1C7U.LIZ("ChooseCoverCompressUtils@c033.setImageBitmapCompressed$1$result$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmap = this.LL;
        int i = this.LLILLJJLI.element;
        int i2 = this.LLILLL.element;
        Object obj3 = null;
        if (bitmap != null && !bitmap.isRecycled()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            obj2 = bitmap;
            if (width > i || height > i2) {
                float fMin = Math.min(i / width, i2 / height);
                try {
                    Matrix matrix = new Matrix();
                    matrix.postScale(fMin, fMin);
                    c098200Yq = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj3 = c098200Yq;
                }
                obj2 = obj3;
            }
        } else {
            obj2 = obj3;
        }
        C1C7U.LIZIZ("ChooseCoverCompressUtils@c033.setImageBitmapCompressed$1$result$1$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
