package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import dmt.av.video.SingleImageCoverBitmapData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MlU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.photo.processor.OptimizeTakePhotoProcessor$onProcess$2$11", f = "OptimizeTakePhotoProcessor.kt", l = {}, m = "invokeSuspend")
public final class C577860MlU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C577840MlS LLILLL;
    public final /* synthetic */ CanvasVideoData LLILZ;
    public final /* synthetic */ SingleImageCoverBitmapData LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C577860MlU(Function0<Unit> function0, boolean z, C577840MlS c577840MlS, CanvasVideoData canvasVideoData, SingleImageCoverBitmapData singleImageCoverBitmapData, InterfaceC1364105Vn<? super C577860MlU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
        this.LLILLJJLI = z;
        this.LLILLL = c577840MlS;
        this.LLILZ = canvasVideoData;
        this.LLILZIL = singleImageCoverBitmapData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C577860MlU(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("OptimizeTakePhotoProcessor@e73a.onProcess$2$11");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke();
        if (C0BMN.LIZ() && this.LLILLJJLI) {
            C577670MlB c577670MlB = C577670MlB.LIZ;
            C577800MlO c577800MlO = new C577800MlO(this.LLILLL.LIZ, this.LLILZ, this.LLILZIL);
            c577670MlB.getClass();
            C577670MlB.LIZ(c577800MlO);
        } else {
            C577670MlB c577670MlB2 = C577670MlB.LIZ;
            C577710MlF c577710MlF = this.LLILLL.LIZ;
            CanvasVideoData canvasVideoData = this.LLILZ;
            SingleImageCoverBitmapData singleImageCoverBitmapData = this.LLILZIL;
            c577670MlB2.getClass();
            C577670MlB.LJ(c577710MlF, canvasVideoData, singleImageCoverBitmapData);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OptimizeTakePhotoProcessor@e73a.onProcess$2$11");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
