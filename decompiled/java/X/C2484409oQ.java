package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09oQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.liveshare.LiveShareStickerView$showLiveEndView$2$onNewResultImpl$1$1$croppedBitmap$1", f = "LiveShareStickerView.kt", l = {}, m = "invokeSuspend")
public final class C2484409oQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ C19625211qM LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ C1324720kZq LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2484409oQ(Bitmap bitmap, C1324720kZq c1324720kZq, C19625211qM c19625211qM, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19625211qM;
        this.LLILLJJLI = bitmap;
        this.LLILLL = c1324720kZq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2484409oQ(this.LLILLJJLI, this.LLILLL, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveShareStickerView@852b.showLiveEndView$2$onNewResultImpl$1$1$croppedBitmap$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19625211qM c19625211qM = this.LL;
        Bitmap bitmap = this.LLILLJJLI;
        int width = this.LLILLL.getWidth();
        int height = this.LLILLL.getHeight();
        c19625211qM.getClass();
        Bitmap bitmapCreateBitmap = null;
        if (bitmap.isRecycled()) {
            C20441214yg.LJ("LiveShareSticker", "Bitmap is recycled before scaling");
        } else {
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            if (width > 0 && height > 0 && width2 > 0 && height2 > 0) {
                float fMax = Math.max(width / width2, height / height2);
                Matrix matrix = new Matrix();
                matrix.postScale(fMax, fMax);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix, true);
                if (bitmapCreateBitmap.getWidth() > width || bitmapCreateBitmap.getHeight() > height) {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, width, height);
                }
            } else {
                C20441214yg.LJ("LiveShareSticker", "Invalid target width or height");
            }
        }
        C1C7U.LIZIZ("LiveShareStickerView@852b.showLiveEndView$2$onNewResultImpl$1$1$croppedBitmap$1");
        return bitmapCreateBitmap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
