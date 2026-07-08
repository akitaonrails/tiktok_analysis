package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05nV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.PhotoSwapEducationScene$onViewCreated$1$1$1$1$blurredBitmap$1", f = "PhotoSwapEducationScene.kt", l = {}, m = "invokeSuspend")
public final class C1459505nV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ Bitmap LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1459505nV(Bitmap bitmap, InterfaceC1364105Vn<? super C1459505nV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1459505nV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoSwapEducationScene@d244.onViewCreated$1$1$1$1$blurredBitmap$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmapLIZ = C1100070ejV.LIZ(Bitmap.createBitmap(this.LL, 0, Math.max((this.LL.getHeight() - this.LL.getWidth()) / 2, 0), this.LL.getWidth(), Math.min(this.LL.getWidth(), this.LL.getHeight())), 1.0f, 25.0f, true);
        C1C7U.LIZIZ("PhotoSwapEducationScene@d244.onViewCreated$1$1$1$1$blurredBitmap$1");
        return bitmapLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
