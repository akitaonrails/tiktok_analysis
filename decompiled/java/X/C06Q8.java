package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Q8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFloatingViewKt$ScreenShotImageView$3$1$1$1", f = "ScreenShotFloatingView.kt", l = {}, m = "invokeSuspend")
public final class C06Q8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C05P0<Bitmap> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06Q8(String str, C05P0<Bitmap> c05p0, InterfaceC1364105Vn<? super C06Q8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06Q8(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScreenShotFloatingViewKt@774f.ScreenShotImageView$3$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.setValue(BitmapFactory.decodeFile(this.LL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScreenShotFloatingViewKt@774f.ScreenShotImageView$3$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
