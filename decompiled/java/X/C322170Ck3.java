package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ck3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.ColorExtractionComponentImpl$performWorkV2$totalWorkTime$1$colorResult$1", f = "ColorExtractionComponent.kt", l = {}, m = "invokeSuspend")
public final class C322170Ck3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public final /* synthetic */ C0D1M LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C322170Ck3(C0D1M c0d1m, String str, Bitmap bitmap, InterfaceC1364105Vn<? super C322170Ck3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0d1m;
        this.LLILLJJLI = str;
        this.LLILLL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322170Ck3(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ColorExtractionComponentImpl@edcb.performWorkV2$totalWorkTime$1$colorResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer numW1 = this.LL.W1(this.LLILLJJLI, this.LLILLL);
        C1C7U.LIZIZ("ColorExtractionComponentImpl@edcb.performWorkV2$totalWorkTime$1$colorResult$1");
        return numW1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
