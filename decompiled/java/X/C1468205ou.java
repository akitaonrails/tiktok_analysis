package X;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.detail.keyframe.util.SearchThumbImageLoadUtil$loadImageFromUrlByRegion$1$imageLoadJob$1$1", f = "SearchThumbImageLoadUtil.kt", l = {213}, m = "invokeSuspend")
public final class C1468205ou extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BitmapRegionDecoder>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1468205ou(String str, InterfaceC1364105Vn<? super C1468205ou> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1468205ou(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchThumbImageLoadUtil@484c.loadImageFromUrlByRegion$1$imageLoadJob$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = C09MB.LIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchThumbImageLoadUtil@484c.loadImageFromUrlByRegion$1$imageLoadJob$1$1");
                return objLJFF;
            }
        }
        BitmapRegionDecoder bitmapRegionDecoderLIZIZ = C09MB.LIZIZ((Bitmap) obj);
        C1C7U.LIZIZ("SearchThumbImageLoadUtil@484c.loadImageFromUrlByRegion$1$imageLoadJob$1$1");
        return bitmapRegionDecoderLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BitmapRegionDecoder> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
