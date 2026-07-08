package X;

import android.graphics.Bitmap;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QhO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.screenshot.ScreenshotPopupView$bindImage$2$2", f = "ScreenshotPopupView.kt", l = {}, m = "invokeSuspend")
public final class C677240QhO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ C677230QhN LLILLJJLI;
    public final /* synthetic */ PhotoSearchEnterParams LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677240QhO(Bitmap bitmap, C677230QhN c677230QhN, PhotoSearchEnterParams photoSearchEnterParams, Function0<Unit> function0, InterfaceC1364105Vn<? super C677240QhO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = c677230QhN;
        this.LLILLL = photoSearchEnterParams;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C677240QhO(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScreenshotPopupView@8294.bindImage$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmap = this.LL;
        if (bitmap != null && !bitmap.isRecycled()) {
            SmartImageView screenshotImage = this.LLILLJJLI.getScreenshotImage();
            if (screenshotImage != null) {
                screenshotImage.setImageBitmap(this.LL);
            }
            this.LLILLJJLI.LIZJ(this.LLILLL);
        } else {
            this.LLILZ.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScreenshotPopupView@8294.bindImage$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
