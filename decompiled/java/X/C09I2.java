package X;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09I2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.StickerResizeHelperKt$resizePropImagesAsync$1$3", f = "StickerResizeHelper.kt", l = {}, m = "invokeSuspend")
public final class C09I2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function2<C09I6, List<Bitmap>, Unit> LL;
    public final /* synthetic */ List<Bitmap> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09I2(List list, InterfaceC1364105Vn interfaceC1364105Vn, Function2 function2) {
        super(2, interfaceC1364105Vn);
        this.LL = function2;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09I2(this.LLILLJJLI, interfaceC1364105Vn, this.LL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerResizeHelperKt@f54d.resizePropImagesAsync$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(C09I6.ERROR, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerResizeHelperKt@f54d.resizePropImagesAsync$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
