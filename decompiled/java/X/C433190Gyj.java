package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem$loadBg$1$2$onCompleted$1$3", f = "PoiHeaderTopVideosAssem.kt", l = {}, m = "invokeSuspend")
public final class C433190Gyj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Integer LL;
    public final /* synthetic */ PoiHeaderTopVideosAssem LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433190Gyj(Integer num, PoiHeaderTopVideosAssem poiHeaderTopVideosAssem, Bitmap bitmap, Context context, InterfaceC1364105Vn<? super C433190Gyj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = num;
        this.LLILLJJLI = poiHeaderTopVideosAssem;
        this.LLILLL = bitmap;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433190Gyj(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiHeaderTopVideosAssem@28c.loadBg$1$2$onCompleted$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer num = this.LL;
        if (num == null) {
            SmartImageView smartImageView = this.LLILLJJLI.LLJJJIL;
            if (smartImageView != null) {
                smartImageView.setImageBitmap(this.LLILLL);
            }
        } else {
            Drawable[] drawableArr = {new BitmapDrawable(this.LLILZ.getResources(), this.LLILLL), new ColorDrawable(C2441009hQ.LJIIL(num.intValue(), 153))};
            SmartImageView smartImageView2 = this.LLILLJJLI.LLJJJIL;
            if (smartImageView2 != null) {
                smartImageView2.setImageDrawable(new LayerDrawable(drawableArr));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiHeaderTopVideosAssem@28c.loadBg$1$2$onCompleted$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
