package X;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09I0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.StickerResizeHelperKt$resizePropImagesAsync$1$2", f = "StickerResizeHelper.kt", l = {}, m = "invokeSuspend")
public final class C09I0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C1621190sI1> LL;
    public final /* synthetic */ List<Bitmap> LLILLJJLI;
    public final /* synthetic */ Function2<C09I6, List<Bitmap>, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09I0(List<C1621190sI1> list, List<Bitmap> list2, Function2<? super C09I6, ? super List<Bitmap>, Unit> function2, InterfaceC1364105Vn<? super C09I0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09I0(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerResizeHelperKt@f54d.resizePropImagesAsync$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.size() == this.LLILLJJLI.size()) {
            this.LLILLL.invoke(C09I6.COMPLETE, this.LLILLJJLI);
        } else {
            this.LLILLL.invoke(C09I6.ERROR, this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerResizeHelperKt@f54d.resizePropImagesAsync$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
