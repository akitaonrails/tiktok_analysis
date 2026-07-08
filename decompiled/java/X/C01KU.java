package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01KU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.portrait.cutout.preview.CutoutPreviewComponent$capturePreviewBitmap$1$1$1", f = "CutoutPreviewComponent.kt", l = {}, m = "invokeSuspend")
public final class C01KU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Bitmap, Unit> LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01KU(Bitmap bitmap, Function1 function1, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01KU(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CutoutPreviewComponent@35f0.capturePreviewBitmap$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CutoutPreviewComponent@35f0.capturePreviewBitmap$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
