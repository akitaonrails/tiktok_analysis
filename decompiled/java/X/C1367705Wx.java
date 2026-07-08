package X;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Wx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.qrcode.compose.QrCodePageComposeKt$GeckoImageBackground$2$1", f = "QrCodePageCompose.kt", l = {}, m = "invokeSuspend")
public final class C1367705Wx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C05P0<Bitmap> LLILLJJLI;
    public final /* synthetic */ C05P0<Bitmap> LLILLL;
    public final /* synthetic */ C05P0<Bitmap> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1367705Wx(int i, C05P0<Bitmap> c05p0, C05P0<Bitmap> c05p02, C05P0<Bitmap> c05p03, InterfaceC1364105Vn<? super C1367705Wx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = c05p0;
        this.LLILLL = c05p02;
        this.LLILZ = c05p03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1367705Wx(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        WeakReference<Bitmap> weakReference;
        C1C7U.LIZ("QrCodePageComposeKt@a83a.GeckoImageBackground$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmapLIZIZ = C1669890tYZ.LIZIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LL);
        if (bitmapLIZIZ != null) {
            weakReference = new WeakReference<>(bitmapLIZIZ);
        } else {
            weakReference = null;
        }
        C1383110m61.LIZ = weakReference;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QrCodePageComposeKt@a83a.GeckoImageBackground$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
