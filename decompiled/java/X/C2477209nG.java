package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09nG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.FaceDetectionManagerImpl$cropBitmap$2", f = "FaceDetectionManager.kt", l = {}, m = "invokeSuspend")
public final class C2477209nG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ Rect LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2477209nG(Bitmap bitmap, Rect rect, InterfaceC1364105Vn<? super C2477209nG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = rect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2477209nG(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FaceDetectionManagerImpl@fed.cropBitmap$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmap = this.LL;
        Rect rect = this.LLILLJJLI;
        int i = rect.left;
        int i2 = rect.top;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i, i2, rect.right - i, rect.bottom - i2, (Matrix) null, false);
        C1C7U.LIZIZ("FaceDetectionManagerImpl@fed.cropBitmap$2");
        return bitmapCreateBitmap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
