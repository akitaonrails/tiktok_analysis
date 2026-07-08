package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05os, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.detail.keyframe.util.SearchThumbImageLoadUtil$loadImageFromUrlByRegion$1$1$1", f = "SearchThumbImageLoadUtil.kt", l = {}, m = "invokeSuspend")
public final class C1468005os extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ImageView LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1468005os(ImageView imageView, Bitmap bitmap, InterfaceC1364105Vn<? super C1468005os> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = imageView;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1468005os(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchThumbImageLoadUtil@484c.loadImageFromUrlByRegion$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setImageBitmap(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchThumbImageLoadUtil@484c.loadImageFromUrlByRegion$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
