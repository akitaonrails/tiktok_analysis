package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import dmt.av.video.SingleImageCoverBitmapData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MmU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.shooting.PhotoProcessor$enterEditPageAfterImageCapture$7", f = "PhotoProcessor.kt", l = {}, m = "invokeSuspend")
public final class C578480MmU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C578810Mn1 LL;
    public final /* synthetic */ C577710MlF LLILLJJLI;
    public final /* synthetic */ CanvasVideoData LLILLL;
    public final /* synthetic */ SingleImageCoverBitmapData LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C578480MmU(C578810Mn1 c578810Mn1, C577710MlF c577710MlF, CanvasVideoData canvasVideoData, SingleImageCoverBitmapData singleImageCoverBitmapData, InterfaceC1364105Vn<? super C578480MmU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c578810Mn1;
        this.LLILLJJLI = c577710MlF;
        this.LLILLL = canvasVideoData;
        this.LLILZ = singleImageCoverBitmapData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C578480MmU(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoProcessor@9c21.enterEditPageAfterImageCapture$7");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C578810Mn1 c578810Mn1 = this.LL;
        C577710MlF c577710MlF = this.LLILLJJLI;
        CanvasVideoData canvasVideoData = this.LLILLL;
        SingleImageCoverBitmapData singleImageCoverBitmapData = this.LLILZ;
        ((C1656610tD9) c578810Mn1.LLILZLL.getValue(c578810Mn1, C578810Mn1.LLJILJIL[3])).TV0();
        C0CHQ.LIZ().LJJJJJ().photoCanvasGoEditPage(c577710MlF, canvasVideoData, singleImageCoverBitmapData);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoProcessor@9c21.enterEditPageAfterImageCapture$7");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
