package X;

import android.graphics.Bitmap;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem$loadBg$1$2$onCompleted$1$2", f = "PoiHeaderTopVideosAssem.kt", l = {}, m = "invokeSuspend")
public final class C433200Gyk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PoiHeaderTopVideosAssem LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433200Gyk(PoiHeaderTopVideosAssem poiHeaderTopVideosAssem, Bitmap bitmap, InterfaceC1364105Vn<? super C433200Gyk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = poiHeaderTopVideosAssem;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433200Gyk(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("PoiHeaderTopVideosAssem@28c.loadBg$1$2$onCompleted$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SmartImageView smartImageView = this.LL.LLJJJIL;
        if (smartImageView != null) {
            smartImageView.setImageBitmap(this.LLILLJJLI);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("PoiHeaderTopVideosAssem@28c.loadBg$1$2$onCompleted$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
