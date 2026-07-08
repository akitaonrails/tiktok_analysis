package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Hv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.resize.StickerBitmapResizeHelperKt$resizeStickerBitmap$1$1", f = "StickerBitmapResizeHelper.kt", l = {}, m = "invokeSuspend")
public final class C2347709Hv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<int[]> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C21356918hz LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2347709Hv(C259800zU<int[]> c259800zU, boolean z, C21356918hz c21356918hz, Context context, String str, InterfaceC1364105Vn<? super C2347709Hv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = z;
        this.LLILLL = c21356918hz;
        this.LLILZ = context;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2347709Hv(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [T, int[]] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerBitmapResizeHelperKt@959a.resizeStickerBitmap$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU<int[]> c259800zU = this.LL;
        boolean z = this.LLILLJJLI;
        int defaultHeight = this.LLILLL.LJ.getPl().getDefaultHeight();
        int defaultWidth = this.LLILLL.LJ.getPl().getDefaultWidth();
        Context context = this.LLILZ;
        String str = this.LLILZIL;
        int[] iArr = this.LL.element;
        C2347809Hw.LIZ(z, defaultHeight, defaultWidth, context, str, iArr);
        c259800zU.element = iArr;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerBitmapResizeHelperKt@959a.resizeStickerBitmap$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
