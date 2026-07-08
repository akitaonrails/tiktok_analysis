package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS28S0000100_10;
import njp.a;

/* JADX INFO: renamed from: X.0QhP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.screenshot.ScreenshotPopupView$bindImage$2", f = "ScreenshotPopupView.kt", l = {260}, m = "invokeSuspend")
public final class C677250QhP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ C677230QhN LLILLL;
    public final /* synthetic */ PhotoSearchEnterParams LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677250QhP(Bitmap bitmap, C677230QhN c677230QhN, PhotoSearchEnterParams photoSearchEnterParams, long j, Function0<Unit> function0, InterfaceC1364105Vn<? super C677250QhP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bitmap;
        this.LLILLL = c677230QhN;
        this.LLILZ = photoSearchEnterParams;
        this.LLILZIL = j;
        this.LLILZLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C677250QhP(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("ScreenshotPopupView@8294.bindImage$2");
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
            Bitmap bitmap = this.LLILLJJLI;
            int i2 = this.LLILLL.LLILZ;
            int i3 = i2 * 3;
            int i4 = i2 * 3;
            Bitmap bitmap2 = null;
            Object obj2 = null;
            if (!bitmap.isRecycled()) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (width > i3 || height > i4) {
                    float fMax = Math.max(i3 / width, i4 / height);
                    try {
                        Matrix matrix = new Matrix();
                        matrix.postScale(fMax, fMax);
                        c098200Yq = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                        obj2 = c098200Yq;
                    }
                    bitmap = (Bitmap) obj2;
                }
                bitmap2 = bitmap;
            }
            PhotoSearchEnterParams photoSearchEnterParams = this.LLILZ;
            if (photoSearchEnterParams != null) {
                C675840Qf8.LIZIZ(photoSearchEnterParams, new AwS28S0000100_10(this.LLILZIL, 2));
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C677240QhO c677240QhO = new C677240QhO(bitmap2, this.LLILLL, this.LLILZ, this.LLILZLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c677240QhO) == objLJFF) {
                C1C7U.LIZIZ("ScreenshotPopupView@8294.bindImage$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScreenshotPopupView@8294.bindImage$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
